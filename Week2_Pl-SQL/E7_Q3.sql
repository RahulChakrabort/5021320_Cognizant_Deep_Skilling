CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(
        p_CustomerID IN Accounts.CustomerID%TYPE,
        p_AccountType IN Accounts.AccountType%TYPE,
        p_InitialBalance IN Accounts.Balance%TYPE
    );

    PROCEDURE CloseAccount(
        p_AccountID IN Accounts.AccountID%TYPE
    );

    FUNCTION GetTotalBalance(
        p_CustomerID IN Accounts.CustomerID%TYPE
    ) RETURN Accounts.Balance%TYPE;
END AccountOperations;
/


CREATE OR REPLACE PACKAGE BODY AccountOperations AS

    -- Procedure to open a new account
    PROCEDURE OpenAccount(
        p_CustomerID IN Accounts.CustomerID%TYPE,
        p_AccountType IN Accounts.AccountType%TYPE,
        p_InitialBalance IN Accounts.Balance%TYPE
    ) IS
    BEGIN
        INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (Accounts_SEQ.NEXTVAL, p_CustomerID, p_AccountType, p_InitialBalance, SYSDATE);
    EXCEPTION
        WHEN OTHERS THEN
            RAISE_APPLICATION_ERROR(-20001, 'Error while opening new account: ' || SQLERRM);
    END OpenAccount;

    -- Procedure to close an account
    PROCEDURE CloseAccount(
        p_AccountID IN Accounts.AccountID%TYPE
    ) IS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = p_AccountID;
    EXCEPTION
        WHEN OTHERS THEN
            RAISE_APPLICATION_ERROR(-20002, 'Error while closing account: ' || SQLERRM);
    END CloseAccount;

    -- Function to get the total balance of a customer across all accounts
    FUNCTION GetTotalBalance(
        p_CustomerID IN Accounts.CustomerID%TYPE
    ) RETURN Accounts.Balance%TYPE IS
        v_TotalBalance Accounts.Balance%TYPE := 0;
    BEGIN
        SELECT SUM(Balance) INTO v_TotalBalance
        FROM Accounts
        WHERE CustomerID = p_CustomerID;

        RETURN v_TotalBalance;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RETURN 0;
        WHEN OTHERS THEN
            RAISE_APPLICATION_ERROR(-20003, 'Error while getting total balance: ' || SQLERRM);
    END GetTotalBalance;

END AccountOperations;
/



	
