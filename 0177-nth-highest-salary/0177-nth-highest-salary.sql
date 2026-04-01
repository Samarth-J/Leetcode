CREATE FUNCTION getNthHighestSalary(N IN NUMBER) RETURN NUMBER IS
result NUMBER;
BEGIN
    /* Write your PL/SQL query statement below */
SELECT salary INTO result
    FROM (
        SELECT salary, DENSE_RANK() OVER (ORDER BY salary DESC) as rank_desc
        FROM Employee
    )
    WHERE rank_desc = N
    AND ROWNUM = 1; -- Ensures only one row is returned
    RETURN result;
END;