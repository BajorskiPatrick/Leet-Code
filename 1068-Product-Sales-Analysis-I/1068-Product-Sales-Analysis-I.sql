-- Write your PostgreSQL query statement below

select p.product_name, s.year, s.price
from sales s
         join product p using (product_id);