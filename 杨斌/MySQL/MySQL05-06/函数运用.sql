use j01
#练习二
1、
select *,datediff(curdate(),e.stujointime) as "开学到现在的天数" from student_info e
2、
select floor((select datediff(curdate(),'1997-12-23')/365))
3、
SELECT * from student_info e WHERE dayofmonth(e.stujointime)=2;
4、
select * from student_info e where dayname(e.stujointime)='Sunday';
5、
select *,date_add(e.stujointime,interval 18 month) "毕业日期" from student_info e
#练习三
1、
select truncate(avg(stuage),2) from student_info e
2、
select sum(examresult) from studentexam
3、
select min(examresult) from studentexam where examsubject='sql'
4、
select max(examresult) from studentexam where examsubject='java'
5、
select count(s.estuid) from studentexam s,student_info i where s.estuid=i.stuid and i.stuname='火云邪神'
