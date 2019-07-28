/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:02:06
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `classify`
-- ----------------------------
DROP TABLE IF EXISTS `classify`;
CREATE TABLE `classify` (
  `cid` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类id（主键）',
  `cname` varchar(10) DEFAULT NULL COMMENT '分类名称',
  `cactivity` varchar(10) NOT NULL COMMENT '所属活动',
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of classify
-- ----------------------------
