-- 增加班级表
CREATE TABLE `Classinfo` (
  `ClassID` int(11) NOT NULL auto_increment COMMENT '本条记录编号',
  `Classint` varchar(20) NOT NULL COMMENT '班级编号',
  `CteacherID` int(11) NOT NULL COMMENT '班主任ID',
  `ClassGrade` varchar(2) NOT NULL COMMENT '班级所在年级',
  PRIMARY KEY (`ClassID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 增加学生表
CREATE TABLE studentinfo (
  `StuId` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT '本条记录编号 ',
  `Stuint` varchar(10) NOT NULL COMMENT '学号 ',
  `StuName` varchar(32) NOT NULL COMMENT '姓名 ',
  `StuAge` int(11) DEFAULT NULL COMMENT '年龄 ',
  `StuSex` varchar(2) NOT NULL COMMENT '性别 ',
  `StuCard` varchar(20) COMMENT '学员身份证号码 ',
  `StuJoinTime` date NOT NULL COMMENT '学员入学时间 ',
  `StuAddress` varchar(50) COMMENT '学员家庭住址 ',
  `SClassID` int(11) COMMENT '学员所在班级ID '
) ENGINE=InnoDB DEFAULT CHARSET=utf8; 
-- 根据StuID来修改SClassID的值
UPDATE studentinfo set SClassID=1 WHERE StuId IN(1,3);
UPDATE studentinfo set SClassID=2 WHERE StuId IN(2,4)
-- 增加班主任表
CREATE TABLE `Teacherinfo` (
  `TeacherID` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号 ',
  `TeacherName` varchar(20) NOT NULL COMMENT '班主任姓名',
  `TeacherTel` varchar(20) DEFAULT NULL COMMENT '班主任电话',
  `TeacherEmail` varchar(20) DEFAULT NULL COMMENT '班主任电子邮箱',
  PRIMARY KEY (`TeacherID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `studentinfo` VALUES (null,'001','火云邪神','18','男','430126199112165817','2007-03-01','长沙市开福区',NULL), (null,'002','东方不败','20','男','430165885942563598','2007-03-10','湖南湘潭',NULL), (NULL,'003','小李飞车','18','男','430115264855962359','2007-03-02','广东佛山',NULL), (NULL,'004','樱桃肉丸子','18','女','430226594852364487','2007-03-14','长沙市岳麓区',NULL);
INSERT INTO `teacherinfo` VALUES (NULL,'唐三藏','13907311119','tsz@yahoo.com'), (NULL,'擎天柱','13945682215','qtz@yahoo.com');

-- 学员成绩表
CREATE TABLE StudentExam(
ExamID int NOT NULL PRIMARY KEY auto_increment COMMENT '本条记录编号',
Examint VARCHAR(32) NOT NULL COMMENT '本次考试代号',
EStuID INT NOT NULL COMMENT '学员信息ID',
ExamSubject VARCHAR (20) not NULL COMMENT '本次考试课程名称',
ExamResult INT COMMENT '学员成绩'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 从班主任信息中查找班主任‘擎天柱’的ID
SELECT TeacherID FROM teacherinfo WHERE TeacherName='擎天柱';
INSERT INTO classinfo VALUES(NULL,07034,2,'S1');
-- 从班主任信息中查找班主任‘唐三藏’的ID
SELECT TeacherID FROM teacherinfo WHERE TeacherName='唐三藏';
INSERT INTO classinfo VALUES(NULL,07038,1,'S1');

-- 查找学员ID
select StuID FROM studentinfo WHERE StuName='火云邪神';
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',1,'SQL',80)
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',1,'Java',56)
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',2,'SQL',89)
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',2,'Java',97)
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',3,'SQL',70)
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',3,'Java',88)
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',4,'SQL',80)
INSERT INTO studentexam(Examint,EStuID,ExamSubject,ExamResult) VALUES ('S1_2007070801',4,'Java',90)


-- 东方不败没参加考试，删除成绩
DELETE FROM studentExam where EStuID=2;


