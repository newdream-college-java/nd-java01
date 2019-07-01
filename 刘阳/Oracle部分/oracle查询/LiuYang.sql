-- 4查询student表中记录
select * from student;

-- 5查询不重复depart列
select distinct depart from teacher;

-- 6查询60到80的记录
SELECT * FROM score where degree>60 and degree<80;

-- 7查询成绩为85,86或88的记录
SELECT * FROM score where degree=85 or degree between 86 and 88;

-- 8、查询Student表中“95031”班或性别为“女”的同学记录。
SELECT * FROM STUDENT WHERE CLASS=1 OR SSEX='女';
-- 9、以Cno升序、Degree降序查询Score表的所有记录。
select * from score ORDER BY CNO ASC,DEGREE DESC
-- 10.查询Score表中的最高分的学生学号和课程号。（子查询或者排序）
select COUNT(*) from STUDENT WHERE CLASS = 2;
-- 11、查询Score表中的最高分的学生学号和课程号。
select sno,cno from score WHERE DEGREE = (select max(DEGREE) from SCORE);
-- 12、查询每门课的平均成绩。
select AVG(degree),cno from score GROUP BY cno
-- 13、查询Score表中至少有5名学生选修的并以2开头的课程的平均分数。
select COUNT(sno),AVG(DEGREE) from score  WHERE CNO LIKE '2%' GROUP BY cno HAVING COUNT(sno)>=2
-- 14、查询分数大于70，小于90的Sno列。
select sno from score where DEGREE BETWEEN 70 and 90
-- 15、查询所有学生的Sname、Cno和Degree列。
select sname,cno,degree from STUDENT,SCORE WHERE STUDENT.sno=SCORE.sno GROUP BY sname
-- 16、查询和“刘阳”同性别并同班的同学Sname.
select sname from student WHERE SSEX=(select SSEX from STUDENT WHERE SNAME = '刘阳') and CLASS=(select class from STUDENT WHERE SNAME = '刘阳') and SNAME !='刘阳';
--17、查询所有选修“语文”课程的“男”同学的成绩表。
select * from score where cno=(select cno from COURSE WHERE CNAME = '语文') and sno in (select sno from STUDENT where SSEX='男');
-- 18、查询所有任课教师的Tname和Depart.
select TNAME,DEPART from TEACHER
-- 19、查询出“计算机系“教师所教课程的成绩表。
select * from score where cno =(select cno from COURSE WHERE CNAME ='java')
-- 20、查询score中选学多门课程的同学中分数为非最高分成绩的记录。
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno)