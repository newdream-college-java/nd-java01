/*
MySQL Backup
Source Server Version: 5.5.25
Source Database: test
Date: 2019/4/24 10:05:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `classinfo`
-- ----------------------------
DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo` (
  `ClassID` int(3) NOT NULL AUTO_INCREMENT,
  `Classint` varchar(20) NOT NULL COMMENT '班级编号',
  `CteacherID` int(11) NOT NULL COMMENT '班主任ID',
  `ClassGrade` varchar(2) NOT NULL COMMENT '班级所在年级',
  PRIMARY KEY (`ClassID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `studentexam`
-- ----------------------------
DROP TABLE IF EXISTS `studentexam`;
CREATE TABLE `studentexam` (
  `ExamID` int(11) NOT NULL AUTO_INCREMENT,
  `Examint` varchar(32) NOT NULL COMMENT '本次考试代号',
  `EStuID` int(11) NOT NULL COMMENT '学员信息ID',
  `ExamSubject` varchar(20) NOT NULL COMMENT '本次考试课程名称',
  `ExamResult` int(11) DEFAULT NULL COMMENT '员院成绩',
  PRIMARY KEY (`ExamID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `studentinfo`
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `StuID` int(3) NOT NULL AUTO_INCREMENT,
  `Stuint` varchar(10) NOT NULL COMMENT '学生学号',
  `StuName` varchar(20) NOT NULL COMMENT '学生名字',
  `StuAge` tinyint(3) DEFAULT NULL COMMENT '学生的年龄',
  `StuSex` varchar(4) NOT NULL COMMENT '学生的性别',
  `StuCard` varchar(18) DEFAULT NULL COMMENT '学生的身份证号码',
  `StuJoinTime` date NOT NULL COMMENT '入学日期',
  `StuAddress` varchar(20) DEFAULT NULL COMMENT '地址',
  `SclassID` int(11) DEFAULT NULL COMMENT '所在班级ID',
  PRIMARY KEY (`StuID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `teacherinfo`
-- ----------------------------
DROP TABLE IF EXISTS `teacherinfo`;
CREATE TABLE `teacherinfo` (
  `TeacherID` int(11) NOT NULL AUTO_INCREMENT,
  `TeacherName` varchar(20) NOT NULL COMMENT '班主任姓名',
  `TeacherTel` varchar(20) NOT NULL COMMENT '班主任电话',
  `TeacherEmail` varchar(20) NOT NULL COMMENT '班主任邮箱',
  PRIMARY KEY (`TeacherID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records 
-- ----------------------------
INSERT INTO `classinfo` VALUES ('1','7034','2','S1'), ('2','7038','1','S1');
INSERT INTO `studentexam` VALUES ('3','S1_2007070801','3','SQL','90'), ('4','S1_2007070801','3','JAVA','80'), ('5','S1_2007070801','4','SQL','95'), ('6','S1_2007070801','4','JAVA','80'), ('7','S1_2007070801','2','SQL','80'), ('8','S1_2007070801','2','JAVA','90');
INSERT INTO `studentinfo` VALUES ('1','001','火云邪神','18','男','430105198905022032','2007-03-01','长沙市开福区','7034'), ('2','002','东方不败','20','男','430104198703012011','2007-03-10','湖南湘潭','7038'), ('3','003','小李飞车','18','男','420106198912064044','2007-03-02','广东佛山','7034'), ('4','004','樱桃肉丸子','18','女','420106198908061085','2007-03-06','长沙市岳麓区','7038');
INSERT INTO `teacherinfo` VALUES ('1','唐三藏','13907311119','tsz@yahoo.com'), ('2','擎天柱','13907315200','qtz@yahoo.com');
SELECT * FROM Teacherinfo;
SELECT TeacherID,TeacherName from teacherinfo where TeacherID>1;
insert into Classinfo values(null,07034,2,'S1');
SELECT * FROM Classinfo;
SELECT * FROM Studentinfo;
UPDATE Studentinfo set SclassID='07034' where StuId=1;
UPDATE Studentinfo set SclassID='07034' where StuId=3;
SELECT * FROM Teacherinfo;
SELECT TeacherID,TeacherName from teacherinfo where TeacherID=1;
insert into Classinfo values(null,07038,1,'S1');
UPDATE Studentinfo set SclassID='07038' where StuId=2;
UPDATE Studentinfo set SclassID='07038' where StuId=4;
SELECT * FROM Studentinfo;
use test;
CREATE table StudentExam(
ExamID int primary key auto_increment,
Examint VARCHAR(32) not null comment '本次考试代号',
EStuID int not null comment '学员信息ID',
ExamSubject varchar(20) not null comment '本次考试课程名称',
ExamResult int comment '员院成绩'
)engine=innodb auto_increment=1 default charset='utf8'
SELECT * from Studentinfo where StuName='火云邪神';
insert into StudentExam VALUES(NULL,'S1_2007070801','001','SQL',80),(NULL,'S1_2007070801','001','JAVA',56);
SELECT * from Studentinfo where StuName='小李飞车';
insert into StudentExam VALUES(NULL,'S1_2007070801','003','SQL',90),(NULL,'S1_2007070801','003','JAVA',80);
SELECT * from Studentinfo where StuName='樱桃肉丸子';
insert into StudentExam VALUES(NULL,'S1_2007070801','004','SQL',95),(NULL,'S1_2007070801','004','JAVA',80);
SELECT * from Studentinfo where StuName='东方不败';
insert into StudentExam VALUES(NULL,'S1_2007070801','002','SQL',80),(NULL,'S1_2007070801','002','JAVA',90);
SELECT * FROM StudentExam;
SELECT * from Studentinfo where StuName='东方不败';
SELECT * from StudentExam where EStuID='2';
delete from StudentExam where EStuID='2';


