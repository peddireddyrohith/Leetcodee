
# Write your MySQL query statement below
with dumbo as(select *, concat(lat,' ',lon) as loc from insurance ),

dumbo1 as(select *, count(loc) over(partition by loc) as cntloc from dumbo),

dumbo2 as(select *, count(tiv_2015) over(partition by tiv_2015) as cnttiv from dumbo1)

select round(sum(case when cntloc=1 and cnttiv>1 then tiv_2016 else 0 end),2) as tiv_2016 from dumbo2