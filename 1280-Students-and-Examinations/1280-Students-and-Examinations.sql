select s.student_id, s.student_name, sub.subject_name, coalesce(count(e.student_id), 0) as "attended_exams"
from students s
         cross join subjects sub
         left join examinations e on (
    s.student_id = e.student_id and sub.subject_name = e.subject_name
    )
group by s.student_id, s.student_name, sub.subject_name
order by 1, 3;