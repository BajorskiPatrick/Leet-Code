select distinct v.author_id as id
from Views v
where exists (
    select 1
    from Views v2
    where v2.viewer_id = v.author_id and v2.author_id = v.author_id
)
order by 1;