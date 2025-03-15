# Write your MySQL query statement below
select name , COALESCE(SUM(distance), 0) as travelled_distance  
from users s left join rides r on s.id=r.user_id
 group by user_id 
 order by travelled_distance desc , name ; 