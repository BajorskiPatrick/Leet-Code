-- Write your PostgreSQL query statement below

select s.product_id, s.year as "first_year", s.quantity, s.price
from sales s
where (s.product_id, s.year) in (
    select s2.product_id, min(s2.year)
    from sales s2
    group by s2.product_id
);