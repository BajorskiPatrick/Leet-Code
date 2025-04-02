select c.class
from courses c
group by c.class
having count(*) >= 5;