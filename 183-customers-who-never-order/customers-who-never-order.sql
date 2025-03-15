# Write your MySQL query statement below
select name as customers from customers c left join orders o on c.id=o.customerid where  customerid is null;