/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:02:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `particulars`
-- ----------------------------
DROP TABLE IF EXISTS `particulars`;
CREATE TABLE `particulars` (
  `particularsid` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单ID（主键）',
  `serial_number` varchar(10) NOT NULL COMMENT '订单编号',
  `order_quantity` varchar(20) NOT NULL COMMENT '订单数量',
  `price` int(11) NOT NULL COMMENT '价格',
  `iid` int(11) NOT NULL COMMENT '订单id（外键）',
  PRIMARY KEY (`particularsid`),
  KEY `wj8` (`iid`),
  CONSTRAINT `wj8` FOREIGN KEY (`iid`) REFERENCES `indent` (`iid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of particulars
-- ----------------------------
