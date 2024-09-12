-- MySQL dump 10.13  Distrib 5.5.25, for Win64 (x86)
--
-- Host: localhost    Database: j01
-- ------------------------------------------------------
-- Server version	5.5.25

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `classinfo`
--

DROP TABLE IF EXISTS `classinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classinfo` (
  `classID` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号',
  `chassint` varchar(20) NOT NULL COMMENT '班级编号（名称）',
  `Cteacherid` int(11) NOT NULL COMMENT '班主任ID，外键，引用TeacherInfo表的主键teacherid',
  `classgrade` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`classID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classinfo`
--

LOCK TABLES `classinfo` WRITE;
/*!40000 ALTER TABLE `classinfo` DISABLE KEYS */;
INSERT INTO `classinfo` VALUES (1,'07034',2,'s1'),(2,'07038',1,'s1');
/*!40000 ALTER TABLE `classinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student_info` (
  `StuID` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号',
  `Stuint` varchar(10) NOT NULL COMMENT '学员学号',
  `StuName` varchar(32) NOT NULL COMMENT '学员姓名',
  `StuAge` int(11) DEFAULT NULL COMMENT '学院年龄，必须在16-35岁之间',
  `StuSex` varchar(2) NOT NULL COMMENT '学员性别，默认为男，取值范围在’男‘或‘女’之间',
  `StuCard` varchar(20) DEFAULT NULL COMMENT '学员身份证号码',
  `StuJoinTime` date NOT NULL COMMENT '学员入学时间',
  `StuAddress` varchar(50) DEFAULT NULL COMMENT '学员家庭地址',
  `SClasssID` int(11) DEFAULT NULL COMMENT '学员所在班级ID，外键，引用ClassInFo表的主键ClassID',
  PRIMARY KEY (`StuID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info`
--

LOCK TABLES `student_info` WRITE;
/*!40000 ALTER TABLE `student_info` DISABLE KEYS */;
INSERT INTO `student_info` VALUES (1,'001','火云邪神',18,'男','430105198905022232','2007-03-01','长沙市开福区',1),(2,'001','东方不败',18,'男','430105198905022232','2007-03-01','长沙市开福区',2),(3,'003','小李飞车',18,'男','430106198912064044','2007-03-02','广东佛山',1),(4,'004','樱桃肉丸子',18,'女','430106198908061085','2007-03-06','长沙市岳麓区',2);
/*!40000 ALTER TABLE `student_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentexam`
--

DROP TABLE IF EXISTS `studentexam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentexam` (
  `examid` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号',
  `examint` varchar(32) NOT NULL COMMENT '本次考试代号',
  `estuid` int(11) NOT NULL COMMENT '学员信息ID，外键，引用StudentInfo表的主键stuid',
  `examsubject` varchar(20) NOT NULL COMMENT '本次考试课程名称',
  `examresult` int(11) NOT NULL COMMENT '学员成绩，取值范围在0-100分之间',
  PRIMARY KEY (`examid`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentexam`
--

LOCK TABLES `studentexam` WRITE;
/*!40000 ALTER TABLE `studentexam` DISABLE KEYS */;
INSERT INTO `studentexam` VALUES (1,'S1_2007070801',1,'SQL',80),(2,'S1_2007070801',1,'JAVA',56),(3,'S1_2007070801',3,'SQL',90),(4,'S1_2007070801',3,'JAVA',80),(5,'S1_2007070801',4,'SQL',95),(6,'S1_2007070801',4,'JAVA',80),(7,'S1_2007070801',2,'SQL',95),(8,'S1_2007070801',2,'JAVA',90);
/*!40000 ALTER TABLE `studentexam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacherinfo`
--

DROP TABLE IF EXISTS `teacherinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacherinfo` (
  `techerid` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号',
  `techername` varchar(20) NOT NULL COMMENT '班主任姓名',
  `teachertel` varchar(20) DEFAULT NULL COMMENT '班主任电话',
  `teacheremail` varchar(20) DEFAULT NULL COMMENT '班主任电子邮箱，邮箱必须含有’@‘符号',
  PRIMARY KEY (`techerid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacherinfo`
--

LOCK TABLES `teacherinfo` WRITE;
/*!40000 ALTER TABLE `teacherinfo` DISABLE KEYS */;
INSERT INTO `teacherinfo` VALUES (1,'唐三藏','13907311119','tsz@yahaoo.com'),(2,'擎天柱','13907315200','qtz@yahoo.com');
/*!40000 ALTER TABLE `teacherinfo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-23 23:02:50
