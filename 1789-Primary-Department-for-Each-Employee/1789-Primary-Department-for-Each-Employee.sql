-- Write your PostgreSQL query statement below

with flagY as (
    select e.employee_id, e.department_id
    from employee e
    where e.primary_flag = 'Y'
)

select e.employee_id, e.department_id
from employee e
where
    (e.employee_id, e.department_id) in (select * from flagY)
   or
    e.employee_id not in (select flagY.employee_id from flagY);