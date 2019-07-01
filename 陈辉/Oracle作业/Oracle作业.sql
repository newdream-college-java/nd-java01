--4
SELECT SNAME,SSEX,CLASS FROM STUDENT;
--5
SELECT DISTINCT DEPART FROM TEACHER;
--6
SELECT * FROM SCORE WHERE DEGREE BETWEEN 60 AND 80;
--7
SELECT * FROM SCORE WHERE DEGREE IN(85,86,88);
--8
SELECT * FROM STUDENT WHERE CLASS=1 OR SSEX='女';
--9
select * from score ORDER BY CNO ASC,DEGREE DESC
--10
select COUNT(*) from STUDENT WHERE CLASS = 2;
--11
select sno,cno from score WHERE DEGREE = (select max(DEGREE) from SCORE);
--12
select AVG(degree),cno from score GROUP BY cno
--13
select COUNT(sno),AVG(DEGREE) from score  WHERE CNO LIKE '3%' GROUP BY cno HAVING COUNT(sno)>=5
--14
select sno from score where DEGREE BETWEEN 70 and 90
--15
select sname,cno,degree from STUDENT,SCORE WHERE STUDENT.sno=SCORE.sno GROUP BY sname
--16
select sname from student WHERE SSEX=(select SSEX from STUDENT WHERE SNAME = '小辉') and CLASS=(select class from STUDENT WHERE SNAME = '小辉') and SNAME !='小辉';
--17
select * from score where cno=(select cno from COURSE WHERE CNAME = 'java') and sno in (select sno from STUDENT where SSEX='男');
--18
select TNAME,DEPART from TEACHER
--19
select * from score where cno =(select cno from COURSE WHERE CNAME ='java')
--20
select * from score a where sno in(select sno from score GROUP BY sno HAVING COUNT(cno)>1) and DEGREE<(select MAX(DEGREE) from 
SCORE b where a.cno=b.cno)