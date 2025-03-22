# Write your MySQL query statement below
select teacher_id, count( distinct subject_id) as cnt from teacher  group by teacher_id ;
-- having dept_id limit 1;