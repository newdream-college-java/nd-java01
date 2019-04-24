创建数据库j01
create database j01;
创建用户名为stuDBA，密码为stu的用户
create user 'stuDBA'@'localhost' identified by 'stu'
授权all privileges 
grant all privileges on *.* to 'stuDBA'@'localhost' identified by 'stu'  with grant option;
删除select，update的权限
revoke update,select on *.* from 'stuDBA'@'localhost';
==============================================================================================================
查询学生字段
desc studentinfo;
给表格赋值
insert into studentinfo values(null,'22','东方不败',20,'男','430231313131','2007-3-10','湖南湘潭',null),
															(null,'33','小李飞车',18,'男','430213131313','2007-3-2','广东佛山',null),
															(null,'44','樱桃肉丸子',18,'女','4300123123123','2007-3-6','长沙市岳麓区',null);
更改火云邪神和小李飞车的班级ID  SClassID
update studentinfo set SClassID=1 where stuID in(1,6);

更改东方不败，樱桃丸子的班级ID
update studentinfo set SClassID=2 where stuID in(5,7);
单独查看
select * from studentinfo where stuID=1;
select * from studentinfo where stuID in(1,6);
查询表格所有信息
select * from studentinfo;
==============================================================================================================
查询班级字段
desc classinfo;
给表赋值
insert into classinfo(ClassID,Classint,CTeacherID) values(1,'07034',2);
insert into classinfo(ClassID,Classint,CTeacherID) values(2,'07038',1);

查询表格所有信息
select * from classinfo;
==============================================================================================================
查询班主任字段
desc teacherinfo;

查询表格所有信息
select * from teacherinfo;

==============================================================================================================
查询字段
desc StudentExam;
创建表
create table StudentExam(
	ExamID int not null  primary key auto_increment comment '本条记录编号',
	Examint varchar(32) not null comment '本次考试代号',
	EStuID int not null comment '学员信息ID，外键，引用StudentInfo表的主键StuID',
	ExamSubject varchar(20) not null comment '本次考试课程名称',
	ExamResult int comment '学员成绩，取值范围在0-100分之间'
)
添加数据
insert into StudentExam values(null,'S1-2007070801',1,'SQL',80),(null,'S1-2007070802',1,'Java',56),
															(null,'S1-2007070803',5,'SQL',90),(null,'S1-2007070806',5,'Java',80),
															(null,'S1-2007070804',6,'SQL',95),(null,'S1-2007070807',6,'Java',80),
															(null,'S1-2007070805',7,'SQL',80),(null,'S1-2007070808',7,'Java',90);
查询表所有数据
select * from StudentExam;
