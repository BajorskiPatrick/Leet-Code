-- Write your PostgreSQL query statement below

select
    q.query_name,
    round(avg(q.rating::numeric / q.position), 2) as "quality",
    round(((count(*) filter (where q.rating < 3))::numeric / count(*)) * 100, 2) as "poor_query_percentage"
from queries q
group by q.query_name;