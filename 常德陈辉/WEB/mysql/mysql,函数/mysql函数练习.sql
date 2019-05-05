1,查询所有学员从入学到今天，一共度过了多少天
select datediff(NOW(),stujointime) from studentinfo;

2，查询你的出生日期到现在相隔的年数（月数/12）
select floor(datediff(NOW(),'1996-09-21')/365);
select ceiling(datediff(NOW(),'1996-09-21')/365);

3,查询每月2号入学的学员信息
select * from studentinfo where DAYOFMONTH(stujointime)=2;

4,查询周末入学的学员
select * from studentinfo where DAYNAME(stujointime)='Saturday' or DAYOFWEEK(stujointime)=1;

5,查询所有学员的毕业日期，假定按每个学员入学时间1年半之后将毕业。
select DATE_ADD(stujointime,INTERVAL 18 MONTH) from studentinfo;


6,查询星期四入学的学员姓名，性别，年龄，班级编号
select stuname,stuage,stusex from studentinfo where DAYOFWEEK(stujointime)=5;
select stuname,stuage,stusex from studentinfo where DAYNAME(stujointime)='thursday';

7,查询‘2007-3-10’之前入学的学员日期
select * from studentinfo where stujointime<'2007-3-10';

8，查询所有学员姓名的长度
select length(stuname) from studentinfo;

9,查询省份证中第9,10为为’89‘的学员信息
select * from studentinfo where SUBSTRING(stucard,9,2)=89;

10,修改班主任信息，将邮箱中的'yahoo'替换为'accp'
select REPLACE(teacheremail,'yahoo','accp') from teacherinfo;

11,查询班主任的邮箱的用户名
select substring(teacheremail,1,instr(teacheremail,'@')-1) from teacherinfo;

12,查询所有班主任的邮箱的所属网站
select substring(teacheremail,instr(teacheremail,'@')+1,instr(teacheremail,'.')-instr(teacheremail,'@')-1) from teacherinfo;

13,编写查询语句去掉字符串’ 爱你 要你 我 爱 你  ‘中的空格
select replace(' 爱你 要你 我 爱 你  ',' ','');

14,计算出每个学员身份证中字符’1‘出现的次数
select length(stucard)-length(replace(stucard,1,'')) from studentinfo;

15,求小于-58.9的最大整数
select FLOOR(-58.9); 

16,求大于78.8的最小整数 
select CEILING(78.8);

17,求64除以7的余数
select mod(64,7);

18,查询所有学员入学时间，要求显示格式为‘2007年03月02日’
select date_format(StuJoinTime,'%Y年%m月%d日')FROM studentinfo;

19,查询当前时间，要求显示格式为‘22时57:37’
select date_format(NOW(),'%h时%i:%s');

20,查询2007年入学的学员信息
SELECT * FROM studentinfo WHERE date_format(StuJoinTime,'%Y')='2007';








