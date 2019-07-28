/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:02:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `indent`
-- ----------------------------
DROP TABLE IF EXISTS `indent`;
CREATE TABLE `indent` (
  `iid` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id（主键）',
  `uid` int(11) NOT NULL COMMENT '用户id（外键）',
  `trip_mode` varchar(10) NOT NULL COMMENT '出行方式',
  `pid` varchar(20) NOT NULL COMMENT '产品id（外键）',
  `quantity` datetime NOT NULL COMMENT '购买数量',
  `istatus` datetime NOT NULL COMMENT '交易状态',
  PRIMARY KEY (`iid`),
  KEY `wj7` (`uid`),
  CONSTRAINT `wj7` FOREIGN KEY (`uid`) REFERENCES `users` (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of indent
-- ----------------------------
