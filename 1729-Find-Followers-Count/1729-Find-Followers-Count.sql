-- Write your PostgreSQL query statement below

select f.user_id, count(*) as "followers_count"
from followers f
group by f.user_id
order by f.user_id asc;