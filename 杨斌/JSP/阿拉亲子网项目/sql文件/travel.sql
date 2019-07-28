/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:03:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `travel`
-- ----------------------------
DROP TABLE IF EXISTS `travel`;
CREATE TABLE `travel` (
  `tid` int(11) NOT NULL AUTO_INCREMENT COMMENT '旅游id（主键）',
  `ttheme` varchar(10) NOT NULL COMMENT '旅游主题',
  `tsite` varchar(20) NOT NULL COMMENT '旅游地址',
  `tduration` datetime NOT NULL COMMENT '旅游时长',
  `pid` int(11) NOT NULL COMMENT '产品ID（外键）',
  PRIMARY KEY (`tid`),
  KEY `wj4` (`pid`),
  CONSTRAINT `wj4` FOREIGN KEY (`pid`) REFERENCES `product` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of travel
-- ----------------------------
