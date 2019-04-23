/*
MySQL Backup
Source Server Version: 5.5.25
Source Database: j01
Date: 2019/4/23 17:21:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
--  Table structure for `classinfo`
-- ----------------------------
DROP TABLE IF EXISTS `classinfo`;
CREATE TABLE `classinfo` (
  `CLASSID` int(11) NOT NULL COMMENT '本条记录编号',
  `classint` varchar(20) NOT NULL COMMENT '班级编号',
  `cteacherID` int(11) NOT NULL COMMENT '班主任ID',
  `ClassGrade` varchar(2) NOT NULL COMMENT '班级所在年级',
  PRIMARY KEY (`CLASSID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `studentinfo`
-- ----------------------------
DROP TABLE IF EXISTS `studentinfo`;
CREATE TABLE `studentinfo` (
  `StuId` int(11) NOT NULL,
  `Stuint` varchar(10) NOT NULL,
  `StuName` varchar(32) NOT NULL,
  `StuAge` int(11) DEFAULT NULL,
  `StuSex` varchar(2) NOT NULL,
  `StuCard` varchar(20) DEFAULT NULL,
  `StuJoinTime` date NOT NULL,
  `StuAddress` varchar(50) DEFAULT NULL,
  `SClassID` int(11) DEFAULT NULL,
  PRIMARY KEY (`StuId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `teacherinfo`
-- ----------------------------
DROP TABLE IF EXISTS `teacherinfo`;
CREATE TABLE `teacherinfo` (
  `teacherID` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号 ',
  `teacherName` varchar(20) NOT NULL COMMENT '班主任姓名',
  `teacherTel` varchar(20) DEFAULT NULL COMMENT '班主任电话',
  `teacherEmail` varchar(20) DEFAULT NULL COMMENT '班主任电子邮箱',
  PRIMARY KEY (`teacherID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Records 
-- ----------------------------
INSERT INTO `studentinfo` VALUES ('1','1','火云邪神','18','男','430126199112165817','2007-03-01','长沙市开福区',NULL), ('2','2','东方不败','20','男','430165885942563598','2007-03-10','湖南湘潭',NULL), ('3','3','小李飞车','18','男','430115264855962359','2007-03-02','广东佛山',NULL), ('4','4','樱桃肉丸子','18','女','430226594852364487','2007-03-14','长沙市岳麓区',NULL);
INSERT INTO `teacherinfo` VALUES ('1','唐三藏','13907311119','tsz@yahoo.com'), ('2','擎天柱','13945682215','qtz@yahoo.com');
