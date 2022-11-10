# Write your MySQL query statement below
Select distinct p1.email 
from  Person p1, Person p2
where p1.id<>p2.id AND p1.email=p2.email;