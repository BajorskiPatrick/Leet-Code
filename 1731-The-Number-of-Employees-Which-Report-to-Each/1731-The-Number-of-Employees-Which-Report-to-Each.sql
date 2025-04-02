select
    e.reports_to as "employee_id",
    (select e2.name from employees e2 where e2.employee_id = e.reports_to) as "name",
    count(*) as "reports_count",
    round(avg(e.age)) as "average_age"
from employees e
where e.reports_to is not null
group by e.reports_to
order by 1;