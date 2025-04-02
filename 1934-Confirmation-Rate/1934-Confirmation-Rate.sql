-- Write your PostgreSQL query statement below

select s.user_id, round(coalesce((count(*) filter (where c.action = 'confirmed'))::numeric / count(*), 0), 2) as "confirmation_rate"
from signups s
         left join confirmations c using(user_id)
group by s.user_id