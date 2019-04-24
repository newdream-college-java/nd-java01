-- 练习一.创建数据库
create database j01;
练习二.创建mysql用户
create user	'stuDBA'@'localhost' identified by 'stu';
grant all privileges on *.* to 'stuDBA'@localhost;
revoke select,update on *.* from 'stuDBA'@'localhost';
-- 练习三.使用stuDBA用户登录，创建如下MySQL表，切添加相应约束
-- 3.创建学员信息表
create table StudentInfo(
	StuID int primary key auto_increment comment '本条记录编号',
	Stuint varchar(10) not null comment '学员学号',
	StuName varchar(32) not null comment '学员姓名',
	StuAge int comment '学员年龄，年龄必须在16-35之间',
	StuSex varchar(2) not null default '男' comment '学员性别,默认为男，取值范围在男或女之间',
	StuCard varchar(20) comment '学员身份证号码',
	StuJoinTime date not null comment '学员入学时间',
	StuAddress varchar(50) comment '学员家庭住址',
	SClassID int comment '学员所在班级ID，外键，引用ClassInfo表的主键ClassID',
	CONSTRAINT ‘FK_SClassId’ foreign key(SClassID) references ClassInfo(ClassID) ON DELETE CASCADE ON UPDATE CASCADE
)engine=innoDB default charset='utf8';
drop table StudentInfo;
-- 2.创建班级信息表constraint 'FK_CTeacherID' foreign key('CTeacherID') REFERENCES TeacherInfo('TeacherID') on delete cascade on update cascade
create table ClassInfo(
	ClassID int primary key auto_increment comment '本条记录编号',
	Classint varchar(20) not null comment '班级名称',
	CTeacherID int not null comment '班主任ID，外键，引用TeacherInfo表的主键TeacherID',
	ClassGrade varchar(2) not null comment '班级所在年级，默认为S1，取值范围在S1，S2，Y1之间',
  CONSTRAINT FK_CTeacherID FOREIGN KEY (CTeacherID) REFERENCES teacherinfo (teacherid) ON DELETE CASCADE ON UPDATE CASCADE
)engine=innoDB default charset='utf8';
drop table ClassInfo;
-- 1.创建班主任信息表
create table TeacherInfo(
	TeacherID int primary key auto_increment comment '本条记录编号',
	TeacherName varchar(20) not null comment '班主任姓名',
	TeacherTel varchar(20) comment '班主任电话',
	TeacherEmail varchar(20) comment '班主任电子邮箱，邮箱中必须包含@符号'
)engine=innoDB default CHARSET='utf8';
drop table TeacherInfo;
desc TeacherInfo;
-- 4.添加学员成绩表
create table StudentExam(
	ExamID int primary key auto_increment comment '本条记录编号',
	Examint varchar(32) not null comment '本次考试代号',
	EStuID int not null comment '学员信息ID，外键，引用StudentIndo表的主键StuID',
	ExamSubject varchar(20) not null comment '本次考试课程名称',
	ExamResult int comment '学员成绩，取值范围在0-100之间',
	constraint FK_EStuID foreign key(EStuID) references StudentInfo(StuID) ON DELETE CASCADE ON UPDATE CASCADE
);
-- 5.添加班主任信息
select TeacherID from TeacherInfo where TeacherName='擎天柱';
insert into TeacherInfo(TeacherID,TeacherName,TeacherTel,TeacherEmail) values(null,'唐三藏','13907311119','tsz@yahoo.com'),
(null,'擎天柱','13907315200','gtz@yahoo.com');
update StudentInfo set SClassID=1 where StuName in('火云邪神','小李飞刀');
select * from StudentInfo;
select TeacherID '编号',TeacherName '姓名',TeacherTel '电话',TeacherEmail '邮箱' from TeacherInfo;
-- 6.添加班级信息
insert into ClassInfo(ClassId,Classint,CTeacherID,ClassGrade) values(null,'07034',2,'s1');
-- 7.插入学生信息
insert into StudentInfo values(null,'001','火云邪神',18,'男','43010519805022032','2007-3-1','长沙市开福市',null);
insert into StudentInfo values(null,'002','东方不败',20,'男','43010519805022011','2007-3-10','湖南湘潭',null);
insert into StudentInfo values(null,'003','小李飞刀',18,'男','430105198050244','2007-3-2','广东佛山',null);
insert into StudentInfo values(null,'004','樱桃小丸子',18,'女','43010519805022085','2007-3-6','长沙市岳麓区',null);
-- 8.录入学生成绩
desc StudentExam;
select * from StudentInfo;
insert into StudentExam values(null,'S1_2007070801',1,'SQL',80),(null,'S1_2007070801',1,'Java',56);
insert into StudentExam values(null,'S1_2007070801',2,'SQL',90),(null,'S1_2007070801',2,'Java',80);
insert into StudentExam values(null,'S1_2007070801',3,'SQL',95),(null,'S1_2007070801',3,'Java',80);
insert into StudentExam values(null,'S1_2007070801',4,'SQL',80),(null,'S1_2007070801',4,'Java',90);
select * from StudentExam;