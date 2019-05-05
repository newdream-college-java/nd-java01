use j01
练习二：
5、
select stuname,stusex,stuage,sclasssid from student_info where dayname(stujointime)='Thursday'
6、
select * from student_info where datediff(curdate(),stujointime) > datediff(curdate(),'2007-3-10')
7、
select *,length(stuname) from student_info
8、
select * from student_info where substring(stucard,9,2)='89'
9、
UPDATE teacherinfo set teacheremail=replace(teacheremail,'yahoo','accp')
10、
select SUBSTRING_INDEX(SUBSTRING_INDEX(teacheremail,'@',-1),'.',1) from teacherinfo
11、
select replace('   爱你  要你  我  爱  你   ',' ','')
12、
select *,length(stucard)-length(replace(stucard,'1','')) from student_info
13、
select floor(-58.9)
14、
select ceiling(78.8)
15、
select mod(64,7)
16、
select *,date_format(stujointime,'%Y年%m月%d日') from student_info
17、
select date_format(now(),'%H时%i:%S')
18、
select * from student_info where year(stujointime) < 2007

练习三：
6、
select examsubject,avg(examresult) from studentexam GROUP BY examsubject
7、
select sclasssid,min(stuage) from student_info group by sclasssid
8、
select *,count(estuid) from studentexam where examresult<60 group by estuid
9、
select *,sum(examresult) from studentexam  group by estuid having sum(examresult)>140
10、
select stusex,avg(stuage) from student_info group by stusex
11、
select examsubject,avg(examresult) from studentexam group by examsubject having avg(examresult)>=80
12、
select c.classid,sum(e.examresult) from classinfo c,student_info s,studentexam e,teacherinfo f where c.classid=s.sclasssid and c.cteacherid=f.techerid and s.stuid=e.estuid group by f.techername
13、
select month(stujointime),avg(examresult) from student_info,studentexam GROUP BY estuid