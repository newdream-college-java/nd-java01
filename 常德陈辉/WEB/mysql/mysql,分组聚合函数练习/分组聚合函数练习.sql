1，查询所有学员的平均年龄（要求保留两位小数）
select truncate(avg(stuage),2) from studentinfo;
select round(avg(stuage),2) from studentinfo;

2，查询所有考试的总成绩
select sum(examresult) from studentexam;

3，查询SQL考试的最低分数
select min(examresult) from studentexam where examsubject='SQL';

4，查询java考试成绩最高的学员姓名
select s.stuname,t.examresult from studentinfo s join studentexam t on s.stuid=t.estuid  where t.examsubject='java' and t.examresult=(select MAX(examresult) from studentexam where examsubject='java'); 

5，查询学员‘火云邪神’一共参加了几次考试
select count(*) from studentexam s,studentinfo t where s.estuid=t.stuid and t.stuname='火云邪神';

6，查询各个科目的平均成绩
select avg(examresult) from studentexam group by examsubject;

7，查询每个班级学员的最小年龄
select MIN(stuage) from studentinfo group by sclassid;

8，查询考试不及格的人数
select count(*) from studentexam where examresult<60;

9，查询各学员的总成绩，要求筛选出总成绩在140分以上的
select SUM(examresult) from studentexam group by estuid having sum(examresult)>140;

10，查询男女学员的平均成绩
select avg(examresult) from studentexam s,studentinfo t where s.estuid=t.stuid group by t.stusex;

11，查询每门功课的平均分，要求显示平均分在80分以上的（包括80分）
select avg(examresult) from studentexam group by examsubject having avg(examresult)>80;

12，按班主任姓名分组，查所带班级的总成绩分（假定每个班主任只带一个班级）（提示：4表连接）
select SUM(examresult) from teacherinfo t join classinfo c on c.cteacherid=t.teacherid join studentinfo s on s.sclassid=c.classid join studentexam x on x.estuid=s.stuid group by teachername;

13，统计每个月入学学员的平均成绩
select AVG(examresult) from studentexam s,studentinfo t where s.estuid=t.stuid GROUP BY date_format(t.StuJoinTime,'%m'); 

























