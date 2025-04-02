-- Write your PostgreSQL query statement below

select r.contest_id, round((count(*)::numeric / (select count(*) from users)) * 100, 2) as "percentage"
from register r
group by r.contest_id
order by 2 desc, 1 asc;