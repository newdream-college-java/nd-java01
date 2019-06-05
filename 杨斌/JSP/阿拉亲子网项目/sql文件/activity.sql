/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:01:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `activity`
-- ----------------------------
DROP TABLE IF EXISTS `activity`;
CREATE TABLE `activity` (
  `aid` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动id（主键）',
  `atheme` varchar(10) NOT NULL COMMENT '活动主题',
  `astatus` varchar(20) NOT NULL COMMENT '活动状态',
  `aarea` varchar(20) NOT NULL COMMENT '活动区域',
  `atime` datetime NOT NULL COMMENT '活动时间',
  `pid` int(11) NOT NULL COMMENT '产品ID（外键）',
  PRIMARY KEY (`aid`),
  KEY `wj3` (`pid`),
  CONSTRAINT `wj3` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of activity
-- ----------------------------
