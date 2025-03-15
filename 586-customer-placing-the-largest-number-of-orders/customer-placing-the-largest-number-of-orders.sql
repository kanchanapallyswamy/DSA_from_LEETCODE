SELECT customer_number 
FROM orders 
GROUP BY customer_number 
having COUNT(customer_number) order by count(customer_number) DESC 
limit 1
;
