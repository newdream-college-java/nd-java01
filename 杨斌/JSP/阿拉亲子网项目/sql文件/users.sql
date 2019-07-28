/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:03:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `uid` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID（主键）',
  `uname` varchar(10) NOT NULL COMMENT '用户名',
  `upassword` varchar(20) NOT NULL COMMENT '密码',
  `uemail` varchar(20) NOT NULL COMMENT '邮箱',
  `unumber` varchar(20) NOT NULL COMMENT '手机号码',
  `usite` varchar(50) NOT NULL COMMENT '地址',
  `QQ` varchar(20) NOT NULL COMMENT 'QQ',
  `bbsex` varchar(10) NOT NULL COMMENT '宝宝性别',
  `bbname` varchar(10) NOT NULL COMMENT '宝宝姓名',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
