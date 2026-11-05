# Write your MySQL query statement below
Select u.name, Sum(amount) As balance
From Transactions t
Inner Join Users u
On t.account = u.account
Group By u.name
Having Sum(amount) > 10000