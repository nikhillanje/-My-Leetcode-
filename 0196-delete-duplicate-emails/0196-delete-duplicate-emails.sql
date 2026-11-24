# Write your MySQL query statement below
Delete p1
From Person p1 , Person p2
Where p1.email = p2.email and p1.id > p2.id
