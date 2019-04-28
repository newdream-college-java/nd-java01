use test;
select * from 
1、查询所有学员从入学到今天，一共度过了多少天
select *, DATEDIFF(CURDATE(),e.stujointime) as '一共度过了多少天' from studentinfo e;
2、查询你的出生日期到现在相隔的年数（月数/12）
select floor(DATEDIFF(CURDATE(),'1998-04-28')/365);
3、查询每月2号入学的学员信息
select * from studentinfo e where dayofmonth(e.stujointime)=2;
4、查询周末入学的学员
select * from studentinfo e where dayname(e.stujointime)='Sunday';
5、查询所有学员的毕业日期，假定按每个学员入学1年半之后毕业。
select *，date_add(e.stujointime,interval 18 month) '毕业日期' from studentinfo e;
#练习三
1、查询所有学员的平均年龄（要求保留两位小数）
select truncate(avg(stuage),2) from studentinfo;
2、查询所有考试的总成绩
select sum(examresult) from studentexam;
3、查询sql考试的最低分数
select min(ExamResult) from studentexam where ExamSubject='sql';
4、查询java考试成绩最高的学员姓名
select stuname from studentinfo a,studentexam b where a.stuid=b.estuid and b.examsubject='java' and b.examresult=(select max(examresult) from studentexam where examsubject='java');
5、查询学员'火云邪神'一共参加了几次考试
select count(s.estuid) from studentexam s,studentinfo i where s.estuid=i.stuid and i.stuname='火云邪神';
