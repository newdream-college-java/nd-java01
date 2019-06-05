/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:02:48
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `popularity`
-- ----------------------------
DROP TABLE IF EXISTS `popularity`;
CREATE TABLE `popularity` (
  `popularityid` int(11) NOT NULL AUTO_INCREMENT COMMENT '人气ID（主键）',
  `heat` varchar(10) NOT NULL COMMENT '热度',
  `project_name` varchar(10) NOT NULL COMMENT '项目名称',
  `pid` int(11) NOT NULL COMMENT '产品ID（外键）',
  PRIMARY KEY (`popularityid`),
  KEY `wj5` (`pid`),
  CONSTRAINT `wj5` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of popularity
-- ----------------------------
