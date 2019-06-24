/*
Navicat MySQL Data Transfer

Source Server         : localhost02
Source Server Version : 50525
Source Host           : localhost:3306
Source Database       : easybuy

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-23 19:05:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `departmen_store`
-- ----------------------------
DROP TABLE IF EXISTS `departmen_store`;
CREATE TABLE `departmen_store` (
  `name` varchar(255) DEFAULT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of departmen_store
-- ----------------------------
INSERT INTO `departmen_store` VALUES ('运动健康', '1');
INSERT INTO `departmen_store` VALUES ('服装', '2');
INSERT INTO `departmen_store` VALUES ('家居', '3');
INSERT INTO `departmen_store` VALUES ('美妆', '4');
INSERT INTO `departmen_store` VALUES ('母婴', '5');
INSERT INTO `departmen_store` VALUES ('食品', '6');
INSERT INTO `departmen_store` VALUES ('手机数码', '7');
INSERT INTO `departmen_store` VALUES ('家居首饰', '8');
INSERT INTO `departmen_store` VALUES ('手表饰品', '9');

-- ----------------------------
-- Table structure for `good_list`
-- ----------------------------
DROP TABLE IF EXISTS `good_list`;
CREATE TABLE `good_list` (
  `picture_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `picture_path` varchar(200) DEFAULT NULL,
  `picture_title` varchar(100) DEFAULT NULL,
  `picture_price` double DEFAULT NULL,
  `picture_type` int(11) DEFAULT NULL,
  `product_view_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`picture_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of good_list
-- ----------------------------
INSERT INTO `good_list` VALUES ('1', 'images/product/1.jpg', '法国德菲丝松露精品巧克力500g/盒', '108', '1', '3');
INSERT INTO `good_list` VALUES ('2', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '1', '2');
INSERT INTO `good_list` VALUES ('3', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '2', '7');
INSERT INTO `good_list` VALUES ('4', 'images/product/4.jpg', '联想笔记本电脑 高速独立显存', '4199', '2', '9');
INSERT INTO `good_list` VALUES ('5', 'images/product/5.jpg', '法姿韩版显瘦彩边时尚牛仔铅笔裤', '49', '3', '1');
INSERT INTO `good_list` VALUES ('6', 'images/product/6.jpg', 'Genius925纯银施华洛世奇水晶吊坠', '69.9', '3', '2');
INSERT INTO `good_list` VALUES ('7', 'images/product/7.jpg', '利仁2018M福满堂电饼铛 好用实惠', '268', '4', '6');
INSERT INTO `good_list` VALUES ('8', 'images/product/8.jpg', '达派高档拉杆箱20寸 经典款式', '198', '4', '5');
INSERT INTO `good_list` VALUES ('9', 'images/product/9.jpg', '爱国者MP4 全屏触摸多格式播放 4G', '289', '5', '8');
INSERT INTO `good_list` VALUES ('10', 'images/product/10.jpg', '多美滋金装金盾3阶段幼儿配方奶粉', '186', '5', '4');
INSERT INTO `good_list` VALUES ('11', 'images/product/1.jpg', '法国德菲丝松露精品巧克力500g/盒', '108', '6', '3');
INSERT INTO `good_list` VALUES ('12', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '6', '2');
INSERT INTO `good_list` VALUES ('13', 'images/product/1.jpg', '法国德菲丝松露精品巧克力500g/盒', '108', '7', '3');
INSERT INTO `good_list` VALUES ('14', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '7', '2');
INSERT INTO `good_list` VALUES ('15', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '6', '2');
INSERT INTO `good_list` VALUES ('16', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '6', '2');
INSERT INTO `good_list` VALUES ('17', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '5', '2');
INSERT INTO `good_list` VALUES ('18', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '5', '2');
INSERT INTO `good_list` VALUES ('19', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '4', '2');
INSERT INTO `good_list` VALUES ('20', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '4', '2');
INSERT INTO `good_list` VALUES ('21', 'images/product/2.jpg', '乐扣普通型保鲜盒圣诞7件套', '69.9', '3', '2');
INSERT INTO `good_list` VALUES ('22', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('23', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '2', '7');
INSERT INTO `good_list` VALUES ('24', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '2', '7');
INSERT INTO `good_list` VALUES ('25', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('26', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('27', 'images/product/1.jpg', '法国德菲丝松露精品巧克力500g/盒', '108', '7', '3');
INSERT INTO `good_list` VALUES ('28', 'images/product/9.jpg', '爱国者MP4 全屏触摸多格式播放 4', '69.9', '7', '2');
INSERT INTO `good_list` VALUES ('29', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '3', '7');
INSERT INTO `good_list` VALUES ('30', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('31', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('32', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('33', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('34', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('35', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('36', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');
INSERT INTO `good_list` VALUES ('37', 'images/product/3.jpg', '欧珀莱均衡保湿四件套', '279', '1', '7');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT,
  `message_content` varchar(100) DEFAULT NULL,
  `message_nickname` varchar(15) DEFAULT NULL,
  `message_time` datetime DEFAULT NULL,
  `message_state` int(11) DEFAULT NULL,
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------

-- ----------------------------
-- Table structure for `news_information`
-- ----------------------------
DROP TABLE IF EXISTS `news_information`;
CREATE TABLE `news_information` (
  `news_title` varchar(10) DEFAULT NULL,
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_information` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_information
-- ----------------------------
INSERT INTO `news_information` VALUES ('抢钱了', '1', 'news-view.jsp');
INSERT INTO `news_information` VALUES ('有钱了', '2', 'news-view.jsp');
INSERT INTO `news_information` VALUES ('花钱了', '3', 'news-view.jsp');
INSERT INTO `news_information` VALUES ('又没钱了', '4', 'news-view.jsp');
INSERT INTO `news_information` VALUES ('再抢', '5', 'news-view.jsp');
INSERT INTO `news_information` VALUES ('再花', '6', 'news-view.jsp');

-- ----------------------------
-- Table structure for `news_view`
-- ----------------------------
DROP TABLE IF EXISTS `news_view`;
CREATE TABLE `news_view` (
  `news_id` int(11) NOT NULL AUTO_INCREMENT,
  `news_title` varchar(20) DEFAULT NULL,
  `news_content` varchar(100) DEFAULT NULL,
  `news_time` datetime DEFAULT NULL,
  PRIMARY KEY (`news_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news_view
-- ----------------------------
INSERT INTO `news_view` VALUES ('1', '抢钱了', '家里没钱，又没本事赚不到钱,只好抢钱', '2019-06-17 14:08:11');
INSERT INTO `news_view` VALUES ('2', '有钱了', '抢到钱了，所以就有钱了', '2019-05-29 14:08:07');
INSERT INTO `news_view` VALUES ('3', '花钱了', '抢到钱了，那就花钱去新梦想培训', '2019-04-20 14:07:57');
INSERT INTO `news_view` VALUES ('4', '又没钱了', '培训要交钱，所以又没钱了', '2019-03-19 14:07:50');
INSERT INTO `news_view` VALUES ('5', '再抢', '钱没了，培训还没学完，又要生活费，只好又抢', '2019-02-04 14:07:42');
INSERT INTO `news_view` VALUES ('6', '再花', '这次，不花了，存着吧', '2019-01-01 14:07:28');

-- ----------------------------
-- Table structure for `order`
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_number` int(11) NOT NULL,
  `shipping_address` varchar(200) NOT NULL COMMENT '发货地址',
  `order_person` varchar(15) NOT NULL,
  `order_state` int(11) NOT NULL,
  `order_time` datetime NOT NULL,
  `order_goods` varchar(255) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order
-- ----------------------------

-- ----------------------------
-- Table structure for `order_info`
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `order_info_id` int(11) NOT NULL AUTO_INCREMENT,
  `order_info_good_id` int(11) NOT NULL,
  `order_info_good_amount` int(11) NOT NULL,
  `order_info_good_price` int(11) NOT NULL,
  PRIMARY KEY (`order_info_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------

-- ----------------------------
-- Table structure for `picture_music`
-- ----------------------------
DROP TABLE IF EXISTS `picture_music`;
CREATE TABLE `picture_music` (
  `Select_Goods_type` varchar(255) DEFAULT NULL,
  `Select_Goods_type_Id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`Select_Goods_type_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture_music
-- ----------------------------
INSERT INTO `picture_music` VALUES ('图书', '1');
INSERT INTO `picture_music` VALUES ('音乐', '2');

-- ----------------------------
-- Table structure for `product_view`
-- ----------------------------
DROP TABLE IF EXISTS `product_view`;
CREATE TABLE `product_view` (
  `product_view_id` int(11) NOT NULL AUTO_INCREMENT,
  `product_view_name` varchar(255) DEFAULT NULL,
  `product_view_price` double DEFAULT NULL,
  `product_view_store` int(11) DEFAULT NULL,
  `product_view_picture` varchar(255) DEFAULT NULL,
  `product_view_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`product_view_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of product_view
-- ----------------------------
INSERT INTO `product_view` VALUES ('1', '法姿韩版显瘦彩边时尚牛仔铅笔裤', '49', '10', 'images/product/5.jpg', '好东西');
INSERT INTO `product_view` VALUES ('2', '乐扣普通型保鲜盒圣诞7件套', '69.9', '5', 'images/product/2.jpg', '好东西');
INSERT INTO `product_view` VALUES ('3', '法国德菲丝松露精品巧克力500g/盒', '108', '4', 'images/product/1.jpg', '好东西');
INSERT INTO `product_view` VALUES ('4', '多美滋金装金盾3阶段幼儿配方奶粉', '186', '2', 'images/product/10.jpg', '好东西');
INSERT INTO `product_view` VALUES ('5', '达派高档拉杆箱20寸 经典款式', '198', '6', 'images/product/8.jpg', '好东西');
INSERT INTO `product_view` VALUES ('6', '利仁2018M福满堂电饼铛 好用实惠', '268', '3', 'images/product/7.jpg', '好东西');
INSERT INTO `product_view` VALUES ('7', '欧珀莱均衡保湿四件套', '279', '2', 'images/product/3.jpg', '好东西');
INSERT INTO `product_view` VALUES ('8', '爱国者MP4 全屏触摸多格式播放 4G', '289', '4', 'images/product/9.jpg', '好东西');
INSERT INTO `product_view` VALUES ('9', '联想笔记本电脑 高速独立显存', '4199', '4', 'images/product/4.jpg', '好东西');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_name` varchar(10) DEFAULT NULL,
  `user_account` varchar(20) DEFAULT NULL,
  `user_password` varchar(15) DEFAULT NULL,
  `user_sex` int(11) DEFAULT NULL,
  `user_birthday` datetime DEFAULT NULL,
  `user_id_card` int(30) DEFAULT NULL,
  `user_email` varchar(20) DEFAULT NULL,
  `user_phone` int(11) DEFAULT NULL,
  `user_address` varchar(60) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'lyg', 'lyg', '123456', '1', null, null, null, null, null);
INSERT INTO `user` VALUES ('2', 'lyg1', 'lyg1', '123456', '1', null, null, null, null, null);
INSERT INTO `user` VALUES ('3', 'ds', 'asdadsa', '213', '2', null, null, null, null, null);
INSERT INTO `user` VALUES ('4', 'ds', 'lyg', '123', '3', null, null, null, null, null);
INSERT INTO `user` VALUES ('5', '23', 'lyg', '231', '1', null, null, null, null, null);
INSERT INTO `user` VALUES ('6', '23', 'lyg', null, '1', null, null, null, null, null);
INSERT INTO `user` VALUES ('7', 'lyg1996', 'lyg1996', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('8', '123', '1996', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('9', '12311', '199611', null, null, null, null, null, null, null);
INSERT INTO `user` VALUES ('10', 'zhsa', 'zhas', 'asd', '2', '1999-11-01 00:00:00', '0', '12313', '21313', '12313');
INSERT INTO `user` VALUES ('11', 'lllll', 'llll', '123', '2', '1999-11-01 00:00:00', '0', '123132', '1231321', '1231');
INSERT INTO `user` VALUES ('12', 'asd', 'asd', '123', '2', '2000-11-01 00:00:00', '0', '123', '123', '123');
INSERT INTO `user` VALUES ('13', '123', '132', '123', '2', '2018-12-31 00:00:00', '0', '123', '123', '123');
INSERT INTO `user` VALUES ('14', 'lgu', 'lgu', '123', '2', '1990-04-19 00:00:00', '0', '123', '123', '123');
INSERT INTO `user` VALUES ('15', 'ad', 'asd', '123', '2', '2018-12-31 00:00:00', '0', '123', '123', '123');
