select (
       select m.num
       from myNumbers m
       group by m.num
       having count(*) = 1
       order by m.num desc
       limit 1
) as "num";