USE java01;
SELECT classinfo.ClassID FROM classinfo;
SELECT studentinfo.StuName from java01.studentinfo;
SELECT 1 FROM studentinfo;
SELECT * FROM studentinfo ORDER BY studentinfo.StuAge DESC;
SELECT * FROM studentinfo ORDER BY studentinfo.StuAge ASC;
SELECT 12222,studentinfo.StuAddress FROM studentinfo;
SELECT * from classinfo cl JOIN teacherinfo te in cl.CTeacherID = te.TeacherID;
SELECT * FROM studentinfo LIMIT 0;
SELECT * FROM studentinfo LIMIT 1,3;
SELECT * FROM studentinfo WHERE StuName LIKE '火%';
SELECT * FROM studentinfo WHERE StuName RLIKE '^火';
SELECT * FROM classinfo WHERE Classint LIKE '%7%';
SELECT * FROM classinfo WHERE Classint RLIKE '7+';


DESC studentinfo;
ALTER TABLE studentinfo CHANGE StuName StuName

-- 1 查询所有学员从入学到今天，一共度过了多少天。StuJoinTime
SELECT s.StuName "名字",DATEDIFF(NOW(),s.StuJoinTime) "多少天" FROM studentinfo s;
-- 2 查询你的出生日期到现在相隔的年数
SELECT DATEDIFF(NOW(),'1998-4-1')/365;
-- 3 查询每月2号入学的学员信息
SELECT *FROM studentinfo WHERE DAYOFMONTH(StuJoinTime)=2;
-- 4 查询周末入学的学员
SELECT StuName,StuSex,StuAge,SClassID FROM studentinfo WHERE (DAYOFWEEK(StuJoinTime)=7)|(DAYOFWEEK(StuJoinTime)=1);
-- 5 查询所有学员的毕业日期，假定每个学员入学的时间一年半之后将毕业
SELECT StuName,DATE_ADD(StuJoinTime,INTERVAL 18 month)FROM studentinfo;
-- 6 查询所有星期四入学的学员姓名，性别，年龄，班级编号
SELECT StuName,StuSex,StuAge,SClassID FROM studentinfo WHERE DAYNAME(StuJoinTime)='Thursday';
-- 7 查询’2007-3-10‘之前入学的学员信息
SELECT * FROM studentinfo WHERE StuJoinTime<'2007-3-10';
-- 8 查询身份证中第9位，10位为89的学员信息（要求使用字符串函数）
SELECT * FROM studentinfo WHERE SUBSTRING(StuCard,9,2)='89';
-- 9 修改班主任信息，将邮箱中的‘yahoo’替换为‘accp’
SELECT * FROM teacherinfo;
SELECT REPLACE(TeacherEmail,'yahoo','accp')from teacherinfo;
-- 10 查询所有班主任邮箱的用户名
SELECT INSTR(TeacherEmail,'@')from teacherinfo;
SELECT SUBSTRING(TeacherEmail,1,(INSTR(TeacherEmail,'@')-1))from teacherinfo;
-- 11 查询所有班主任的邮箱的所属网站
SELECT INSTR(TeacherEmail,'.')-INSTR(TeacherEmail,'@')from teacherinfo;
SELECT SUBSTRING(TeacherEmail,(INSTR(TeacherEmail,'@')+1),(INSTR(TeacherEmail,'.')-INSTR(TeacherEmail,'@')-1))from teacherinfo;
-- 12 编写查询语句去除字符串'   爱你  要你   我   爱    你'
SELECT REPLACE('   爱你  要你   我   爱    你',' ','');
-- 13 计算每个学员身份证中字符’1‘出现的次数，先算总长度，然后剪掉1 ，求出长度，总长度-长度就是1 的次数
SELECT  LENGTH(StuCard)-LENGTH(REPLACE(StuCard,'1','')) "1出现次数" FROM studentinfo;
-- 14 求小于-58.9的最大整数
SELECT FLOOR(-58.9);-- 向下取整
-- 15 求大于78.8的最大整数
SELECT CEILING(78.8);-- 向上取整
-- 16 求64除以7的余数
SELECT 64%7;
SELECT MOD(64,7);
-- 17 查询所有学员入学时间，显示格式为'2007年03月02日'
SELECT DAYOFMONTH(StuJoinTime) FROM studentinfo;
select date_format(StuJoinTime,'%Y年%m月%d日')FROM studentinfo;
-- 18 查询当前时间，要求显示格式为’22时57：37‘
select date_format(NOW(),'%h时%i:%s');
-- 19 查询2007年入学的学员信息
SELECT * FROM studentinfo WHERE date_format(StuJoinTime,'%Y')='2007';





-- 1.查询所有学员的平均年龄
SELECT ROUND(AVG(StuAge),2) FROM studentinfo;
-- 2.查询所有考试的总成绩
SELECT SUM(ExamResult) FROM studentexam;
-- 3.查询SQL考试的最低分数
SELECT MIN(ExamResult) FROM studentexam WHERE ExamSubject='SQL';
-- 4.查询Java考试成绩最高的学员姓名
SELECT MAX(ExamResult) FROM studentexam WHERE ExamSubject='Java';
-- 5.查询学员‘火云邪神’一共参加了几次考试
SELECT COUNT(Examint) FROM studentexam st JOIN  studentinfo si ON st.EStuID=si.StuID WHERE si.StuName='火云邪神';
-- 6 查询各科目的平均成绩
SELECT AVG(s.ExamResult) FROM studentexam s GROUP BY s.ExamSubject;
-- 7 查询每个班级学员的最小年龄
SELECT MIN(stu.StuAge) FROM studentinfo stu;
-- 8 查询考试不及格的人数
SELECT COUNT(stue.ExamID)FROM studentexam stue WHERE stue.ExamResult<60;
-- 9 查询各学员的总成绩，要求筛选出总成绩在140分以上的
SELECT SUM(ExamResult) FROM studentexam GROUP BY EStuID;
SELECT SUM(ExamResult) FROM studentexam WHERE (SELECT SUM(ExamResult)>140 FROM studentexam) GROUP BY EStuID;
-- 10 查询男女学员的平均年龄
SELECT StuSex,AVG(StuAge) FROM studentinfo GROUP BY StuSex;
-- 11 查询每门功课的平均分，要求显示平均分在80分以上的（包括80分）
SELECT AVG(ExamResult) FROM studentexam GROUP BY ExamSubject HAVING AVG(ExamResult)>=80;
-- 12 按班主任姓名分组，查所带班级的总成绩分（假定每个班主任只带一个班级  --- 四表连接）
-- 学生连班级 班级连教师 学生连成绩表
SELECT t.TeacherName,SUM(stue.ExamResult) 
FROM studentinfo stu,classinfo c,studentexam stue,teacherinfo t 
WHERE stu.SClassID=c.ClassID AND c.CTeacherID=t.TeacherID AND stu.StuID=stue.EStuID
GROUP BY t.TeacherID;
-- 13 统计每个月入学学员的平均成绩
SELECT AVG(stue.ExamResult)FROM studentinfo stu,studentexam stue WHERE stu.StuID=stue.EStuID GROUP BY date_format(stu.StuJoinTime,'%m');



-- 1 要求不论成绩是否，名次是连续的序号
-- 2 要求成绩相等的排位相同，名次随后跳跃
-- 3 要求成绩相等的排位相同，名次是连续的



