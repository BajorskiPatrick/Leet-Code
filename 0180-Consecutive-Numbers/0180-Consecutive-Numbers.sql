select distinct l1.num as "ConsecutiveNums"
from logs l1
         left join logs l2 on (l1.id + 1 = l2.id and l1.num = l2.num)
         left join logs l3 on (l2.id + 1 = l3.id and l2.num = l3.num)
where l3.id is not null;