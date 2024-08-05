CREATE OR REPLACE FUNCTION HasSufficientBalance (
    p_account_id IN Accounts.AccountID%TYPE,
    p_amount IN NUMBER
) RETURN BOOLEAN IS
    v_balance Accounts.Balance%TYPE;
BEGIN
    -- Retrieve the balance of the specified account
    SELECT Balance INTO v_balance
    FROM Accounts
    WHERE AccountID = p_account_id;
    
    -- Check if the account has at least the specified amount
    IF v_balance >= p_amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        -- If no account is found with the specified ID, return FALSE
        RETURN FALSE;
    WHEN OTHERS THEN
        -- Handle any other unexpected errors
        DBMS_OUTPUT.PUT_LINE('Error in HasSufficientBalance: ' || SQLERRM);
        RETURN FALSE;
END HasSufficientBalance;
/
DECLARE
    v_sufficient_balance BOOLEAN;
BEGIN
    v_sufficient_balance := HasSufficientBalance(10, 500);
    IF v_sufficient_balance THEN
        DBMS_OUTPUT.PUT_LINE('The account has sufficient balance.');
    ELSE
        DBMS_OUTPUT.PUT_LINE('The account does not have sufficient balance.');
    END IF;
END;
/