/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : xm

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-05 21:03:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `pid` int(11) NOT NULL AUTO_INCREMENT COMMENT '产品ID（主键）',
  `pitem_price` varchar(10) NOT NULL COMMENT '项目价格',
  `pname` varchar(10) NOT NULL COMMENT '项目名称',
  `cid` int(11) NOT NULL COMMENT '分类id（外键）',
  `priceid` int(11) NOT NULL COMMENT '价格ID',
  PRIMARY KEY (`pid`),
  KEY `wj1` (`cid`),
  KEY `wj2` (`priceid`),
  CONSTRAINT `wj1` FOREIGN KEY (`cid`) REFERENCES `classify` (`cid`),
  CONSTRAINT `wj2` FOREIGN KEY (`priceid`) REFERENCES `price` (`priceid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product
-- ----------------------------
