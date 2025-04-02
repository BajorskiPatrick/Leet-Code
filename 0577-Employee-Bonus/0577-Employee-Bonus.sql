select e.name, b.bonus
from employee e
         left join bonus b using(empId)
where b.bonus is null or b.bonus < 1000;