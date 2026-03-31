/* Write your PL/SQL query statement below */
select max(salary) as SecondHighestSalary
from Employee
Where salary<(select max(salary) from Employee);