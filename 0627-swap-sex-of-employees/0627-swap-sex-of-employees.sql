# Write your MySQL query statement below
Update Salary 
Set sex = Case When sex = 'f' Then 'm'
               When sex = 'm' Then 'f'
               End;