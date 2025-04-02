-- Write your PostgreSQL query statement below

with a as (
    select p2.product_id, max(p2.change_date)
    from products p2
    where p2.change_date <= '2019-08-16'::date
group by p2.product_id
    )

select p.product_id, p.new_price as "price"
from products p
where (p.product_id, p.change_date) in (select * from a)
union
select distinct p3.product_id, 10 as "price"
from products p3
where p3.product_id not in (select a.product_id from a);