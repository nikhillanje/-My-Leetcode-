# Write your MySQL query statement below
Select sell_date , Count(Distinct product) As num_sold,
Group_Concat(Distinct product Order By product) As Products
From Activities
Group By sell_date
Order By sell_date