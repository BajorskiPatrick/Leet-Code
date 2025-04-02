select
    round(count(*)::numeric / (select count(distinct a3.player_id) from activity a3) , 2) as "fraction"
from (
         select a.player_id
         from activity a
         group by a.player_id
         having min(a.event_date) + 1 in (
             select a2.event_date
             from activity a2
             where a2.player_id = a.player_id
         )
     ) as b;