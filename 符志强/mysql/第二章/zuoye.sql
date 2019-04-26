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
-- Table structure for table `biao`
--

DROP TABLE IF EXISTS `biao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `biao` (
  `Stuint` int(3) NOT NULL AUTO_INCREMENT,
  `StuName` varchar(20) NOT NULL COMMENT '学生名字',
  `StuAge` tinyint(3) DEFAULT NULL COMMENT '学生的年龄',
  `StuSex` varchar(4) DEFAULT NULL COMMENT '学生的性别',
  `StuCard` varchar(18) DEFAULT NULL COMMENT '学生的身份证号码',
  `StuJoinTime` date DEFAULT NULL COMMENT '入学日期',
  `StuAddress` varchar(4) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`Stuint`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biao`
--

LOCK TABLES `biao` WRITE;
/*!40000 ALTER TABLE `biao` DISABLE KEYS */;
INSERT INTO `biao` VALUES (1,'鱼',0,'女','123456789987654321','1999-09-09','长沙'),(2,'鱼',0,'女','123456789987654321','1999-09-09','长沙'),(3,'鱼',0,'女','123456789987654321','1999-09-09','长沙');
/*!40000 ALTER TABLE `biao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `biao1`
--

DROP TABLE IF EXISTS `biao1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `biao1` (
  `Stuint` int(3) NOT NULL AUTO_INCREMENT,
  `StuName` varchar(20) NOT NULL COMMENT '学生名字',
  `StuAge` tinyint(3) DEFAULT NULL COMMENT '学生的年龄',
  `StuSex` varchar(4) DEFAULT NULL COMMENT '学生的性别',
  `StuCard` varchar(18) DEFAULT NULL COMMENT '学生的身份证号码',
  `StuJoinTime` date DEFAULT NULL COMMENT '入学日期',
  `StuAddress` varchar(20) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`Stuint`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `biao1`
--

LOCK TABLES `biao1` WRITE;
/*!40000 ALTER TABLE `biao1` DISABLE KEYS */;
/*!40000 ALTER TABLE `biao1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `classinfo`
--

DROP TABLE IF EXISTS `classinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `classinfo` (
  `classid` int(11) NOT NULL AUTO_INCREMENT,
  `classint` varchar(20) NOT NULL,
  `classcherid` int(11) NOT NULL,
  `classgrade` varchar(2) NOT NULL,
  PRIMARY KEY (`classid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classinfo`
--

LOCK TABLES `classinfo` WRITE;
/*!40000 ALTER TABLE `classinfo` DISABLE KEYS */;
INSERT INTO `classinfo` VALUES (1,'7034',2,'S1'),(2,'7038',1,'S1');
/*!40000 ALTER TABLE `classinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studeninfo`
--

DROP TABLE IF EXISTS `studeninfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studeninfo` (
  `StuID` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号',
  `Stuint` varchar(10) NOT NULL COMMENT '学员学号',
  `StuName` varchar(32) NOT NULL COMMENT '学员姓名',
  `StuAge` int(11) DEFAULT NULL COMMENT '学员年龄，必须在16-35岁之间',
  `StuSex` varchar(2) NOT NULL COMMENT '学员性别，默认为‘男’，取值范围在‘男’或‘女’之间',
  `StuGard` varchar(20) DEFAULT NULL COMMENT '学员身份证号码',
  `StuJoinTime` date NOT NULL COMMENT '学员入学时间',
  `StuAddress` varchar(50) DEFAULT NULL COMMENT '学员家庭住址',
  `SClassID` int(11) DEFAULT NULL COMMENT '学员所在班级ID，外键，引用ClassInfo表的主键ClassID',
  PRIMARY KEY (`StuID`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studeninfo`
--

LOCK TABLES `studeninfo` WRITE;
/*!40000 ALTER TABLE `studeninfo` DISABLE KEYS */;
INSERT INTO `studeninfo` VALUES (1,'001','火云邪神',18,'男','430105198905022032','2007-03-01','长沙市开福区',1),(2,'002','东方不败',20,'男','430104198703012011','2007-03-10','湖南湘潭',2),(3,'003','小李飞车',18,'男','420106198912064044','2007-03-02','广东佛山',1),(4,'004','樱桃肉丸子',18,'女','420106198908061085','2007-03-06','长沙市岳麓区',2);
/*!40000 ALTER TABLE `studeninfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentexam`
--

DROP TABLE IF EXISTS `studentexam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentexam` (
  `ExamID` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号',
  `Examint` varchar(32) NOT NULL COMMENT '本次考试代号',
  `EStuID` int(11) NOT NULL COMMENT '学员信息ID，外键，引用StudentInfo表的主键StuID',
  `ExamSubject` varchar(20) NOT NULL COMMENT '本次考试课程名称',
  `ExamResult` int(11) DEFAULT NULL COMMENT '学员成绩，取值范围在0-100分之间',
  PRIMARY KEY (`ExamID`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentexam`
--

LOCK TABLES `studentexam` WRITE;
/*!40000 ALTER TABLE `studentexam` DISABLE KEYS */;
INSERT INTO `studentexam` VALUES (1,'S1_2007070801',1,'SQL',80),(2,'S1_2007070801',1,'Java',56),(3,'S1_2007070801',3,'SQL',90),(4,'S1_2007070801',3,'Java',80),(5,'S1_2007070801',4,'SQL',95),(6,'S1_2007070801',4,'Java',80);
/*!40000 ALTER TABLE `studentexam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `studentinfo`
--

DROP TABLE IF EXISTS `studentinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `studentinfo` (
  `Stuint` int(3) NOT NULL AUTO_INCREMENT,
  `StuName` varchar(20) NOT NULL COMMENT '学生名字',
  `StuAge` tinyint(3) DEFAULT NULL COMMENT '学生的年龄',
  `StuSex` varchar(4) DEFAULT NULL COMMENT '学生的性别',
  `StuCard` varchar(18) DEFAULT NULL COMMENT '学生的身份证号码',
  `StuJoinTime` date DEFAULT NULL COMMENT '入学日期',
  `StuAddress` varchar(20) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (`Stuint`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentinfo`
--

LOCK TABLES `studentinfo` WRITE;
/*!40000 ALTER TABLE `studentinfo` DISABLE KEYS */;
/*!40000 ALTER TABLE `studentinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacherinfo`
--

DROP TABLE IF EXISTS `teacherinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacherinfo` (
  `TeacherID` int(11) NOT NULL AUTO_INCREMENT COMMENT '本条记录编号',
  `TeacherName` varchar(20) NOT NULL COMMENT '班主任姓名',
  `TeacherTel` varchar(20) DEFAULT NULL COMMENT '班主任电话',
  `TeacherEmail` varchar(20) DEFAULT NULL COMMENT '班主任电子邮箱，邮箱必须含有‘@’符号',
  PRIMARY KEY (`TeacherID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacherinfo`
--

LOCK TABLES `teacherinfo` WRITE;
/*!40000 ALTER TABLE `teacherinfo` DISABLE KEYS */;
INSERT INTO `teacherinfo` VALUES (1,'唐三藏','13907311119','tsz@yahoo.com'),(2,'擎天柱','13907315200','qtz@yahoo.com');
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

-- Dump completed on 2019-04-24  9:59:16
