CREATE OR REPLACE PROCEDURE SafeTransferFunds (
    FRMAID IN Accounts.AccountID%TYPE,
    TOAID IN Accounts.AccountID%TYPE,
    PAMT IN NUMBER
) AS
    VFBAL Accounts.Balance%TYPE;
    VTOBAL Accounts.Balance%TYPE;
    insufficient_funds EXCEPTION;
BEGIN
    -- Select balances
    SELECT Balance INTO VFBAL
    FROM Accounts 
    WHERE AccountID = FRMAID
    FOR UPDATE;
    
    SELECT Balance INTO VTOBAL
    FROM Accounts 
    WHERE AccountID = TOAID
    FOR UPDATE;
    
    -- Check for sufficient funds
    IF PAMT > VFBAL THEN
        RAISE insufficient_funds;
    ELSE
        -- Perform the transfer
        UPDATE Accounts
        SET Balance = VFBAL - PAMT
        WHERE AccountID = FRMAID;
        
        UPDATE Accounts
        SET Balance = VTOBAL + PAMT
        WHERE AccountID = TOAID;
        
        COMMIT;
    END IF;

EXCEPTION
    WHEN insufficient_funds THEN
        DBMS_OUTPUT.PUT_LINE('Insufficient funds!!');
        ROLLBACK;
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('An unexpected error occurred: ' || SQLERRM);
        ROLLBACK;
END SafeTransferFunds;
/


DECLARE 
	A NUMBER:=&A;
	B NUMBER:=&B;
	C NUMBER:=&C;
BEGIN
	SafeTransferFunds(A,B,C);
END;
/
	