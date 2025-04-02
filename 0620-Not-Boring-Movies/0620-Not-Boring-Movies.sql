-- Write your PostgreSQL query statement below

select c.id, c.movie, c.description, c.rating
from cinema c
where
    c.id % 2 != 0
and
    c.description != 'boring'
order by 4 desc;