-- Write your PostgreSQL query statement below

select v.customer_id, count(*) as "count_no_trans"
from visits v
         left join transactions t using(visit_id)
where t.transaction_id is null
group by v.customer_id;