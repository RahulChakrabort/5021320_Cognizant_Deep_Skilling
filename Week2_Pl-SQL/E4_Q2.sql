CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_loan_amount IN NUMBER,
    p_annual_interest_rate IN NUMBER,
    p_loan_duration_years IN NUMBER
) RETURN NUMBER IS
    v_monthly_interest_rate NUMBER;
    v_total_payments NUMBER;
    v_monthly_installment NUMBER;
BEGIN
    -- Calculate the monthly interest rate
    v_monthly_interest_rate := p_annual_interest_rate / 12 / 100;
    
    -- Calculate the total number of payments
    v_total_payments := p_loan_duration_years * 12;
    
    -- Calculate the monthly installment using the loan payment formula
    v_monthly_installment := (p_loan_amount * v_monthly_interest_rate * POWER(1 + v_monthly_interest_rate, v_total_payments)) / 
                             (POWER(1 + v_monthly_interest_rate, v_total_payments) - 1);
    
    -- Return the monthly installment amount
    RETURN v_monthly_installment;
EXCEPTION
    WHEN OTHERS THEN
        -- Handle any errors
        DBMS_OUTPUT.PUT_LINE('Error in CalculateMonthlyInstallment: ' || SQLERRM);
        RETURN NULL;
END CalculateMonthlyInstallment;
/

DECLARE
    v_monthly_installment NUMBER;
BEGIN
    v_monthly_installment := CalculateMonthlyInstallment(50000, 5, 15);
    DBMS_OUTPUT.PUT_LINE('Monthly Installment: ' || v_monthly_installment);
END;
/