-- Write your PostgreSQL query statement below

select a.activity_date as "day", count(distinct a.user_id) as "active_users"
from activity a
group by a.activity_date
having a.activity_date between '2019-07-27'::date - 29 and '2019-07-27'::date;