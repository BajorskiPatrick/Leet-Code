-- Write your PostgreSQL query statement below

with cte as (
    select
        q.turn,
        (select sum(q2.weight) from queue q2 where q2.turn <= q.turn) as "sum_weight"
    from queue q
)

select q.person_name
from queue q
where q.turn = (select c.turn from cte c where c.sum_weight <= 1000
                order by c.sum_weight desc limit 1)