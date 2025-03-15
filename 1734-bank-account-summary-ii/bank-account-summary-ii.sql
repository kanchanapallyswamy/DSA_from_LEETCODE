# Write your MySQL query statement below
select s.name,sum(amount) as balance from users s join Transactions t on s.account=t.account 
group by t.account having balance >10000