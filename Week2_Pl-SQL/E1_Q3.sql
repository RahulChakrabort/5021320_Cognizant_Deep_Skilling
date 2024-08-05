DECLARE
    CURSOR due_loans_cursor IS
        SELECT l.LoanID, l.CustomerID, l.EndDate, c.Name
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

    v_loan_id Loans.LoanID%TYPE;
    v_customer_id Loans.CustomerID%TYPE;
    v_end_date Loans.EndDate%TYPE;
    v_customer_name Customers.Name%TYPE;
    
BEGIN
    OPEN due_loans_cursor;
    LOOP
        FETCH due_loans_cursor INTO v_loan_id, v_customer_id, v_end_date, v_customer_name;
        EXIT WHEN due_loans_cursor%NOTFOUND;
        
        DBMS_OUTPUT.PUT_LINE('Reminder: Customer ' || v_customer_name || ' (CustomerID: ' || v_customer_id || ') has a loan (LoanID: ' || v_loan_id || ') due on ' || TO_CHAR(v_end_date, 'YYYY-MM-DD'));
    END LOOP;
    CLOSE due_loans_cursor;
END;
/
