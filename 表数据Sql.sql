/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50525
Source Host           : 127.0.0.1:3306
Source Database       : parentchildnetwork

Target Server Type    : MYSQL
Target Server Version : 50525
File Encoding         : 65001

Date: 2019-06-25 16:32:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for pcn_activity_introduction
-- ----------------------------
DROP TABLE IF EXISTS `pcn_activity_introduction`;
CREATE TABLE `pcn_activity_introduction` (
  `pcnai_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '活动介绍ID',
  `pcnai_pctid` int(11) NOT NULL COMMENT '亲子主题ID',
  `pcnai_content` varchar(500) NOT NULL COMMENT '活动介绍内容',
  `pcnai_imgurl` varchar(100) NOT NULL COMMENT '活动介绍图片路径',
  PRIMARY KEY (`pcnai_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pcn_activity_introduction
-- ----------------------------
INSERT INTO `pcn_activity_introduction` VALUES ('1', '1', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('2', '2', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('3', '3', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('4', '4', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('5', '5', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('6', '6', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('7', '7', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('8', '8', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('9', '9', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('10', '10', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('11', '11', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('12', '12', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('13', '13', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('14', '14', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('15', '15', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('16', '16', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('17', '17', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('18', '18', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('19', '19', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('20', '20', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('21', '21', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('22', '22', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('23', '23', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('24', '24', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('25', '25', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('26', '26', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('27', '27', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('28', '28', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('29', '29', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('30', '30', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('31', '31', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('32', '32', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('33', '33', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('34', '34', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('35', '35', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('36', '36', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('37', '37', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('38', '38', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('39', '39', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('40', '40', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('41', '41', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('42', '42', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('43', '43', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('44', '44', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('45', '45', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('46', '46', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('47', '47', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('48', '48', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('49', '49', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('50', '50', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('51', '51', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('52', '52', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('53', '53', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('54', '54', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('55', '55', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('56', '56', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('57', '57', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('58', '58', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('59', '59', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('60', '60', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('61', '61', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('62', '62', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('63', '63', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('64', '64', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('65', '65', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('66', '66', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('67', '67', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('68', '68', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('69', '69', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('70', '70', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('71', '71', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('72', '72', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('73', '73', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('74', '74', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('75', '75', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('76', '76', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('77', '77', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('78', '78', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('79', '79', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('80', '80', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('81', '81', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('82', '82', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('83', '83', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('84', '84', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('85', '85', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('86', '86', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('87', '87', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('88', '88', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('89', '89', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('90', '90', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('91', '91', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('92', '92', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('93', '93', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('94', '94', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('95', '95', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('96', '96', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('97', '97', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('98', '98', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('99', '99', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('100', '100', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('101', '101', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('102', '102', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('103', '103', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('104', '104', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('105', '105', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_activity_introduction` VALUES ('106', '106', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');

-- ----------------------------
-- Table structure for pcn_expense_standard
-- ----------------------------
DROP TABLE IF EXISTS `pcn_expense_standard`;
CREATE TABLE `pcn_expense_standard` (
  `pcnes_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '收费标准ID',
  `pcnes_pctid` int(11) DEFAULT NULL COMMENT '亲子主题ID',
  `pcnes_content` varchar(500) DEFAULT NULL COMMENT '收费标准内容',
  `pcnes_imgurl` varchar(500) DEFAULT NULL COMMENT '收费标准图片路径',
  PRIMARY KEY (`pcnes_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pcn_expense_standard
-- ----------------------------
INSERT INTO `pcn_expense_standard` VALUES ('1', '1', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('2', '2', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('3', '3', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('4', '4', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('5', '5', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('6', '6', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('7', '7', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('8', '8', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('9', '9', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('10', '10', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('11', '11', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('12', '12', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('13', '13', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('14', '14', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('15', '15', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('16', '16', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('17', '17', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('18', '18', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('19', '19', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('20', '20', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('21', '21', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('22', '22', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('23', '23', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('24', '24', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('25', '25', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('26', '26', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('27', '27', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('28', '28', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('29', '29', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('30', '30', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('31', '31', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('32', '32', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('33', '33', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('34', '34', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('35', '35', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('36', '36', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('37', '37', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('38', '38', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('39', '39', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('40', '40', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('41', '41', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('42', '42', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('43', '43', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('44', '44', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('45', '45', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('46', '46', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('47', '47', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('48', '48', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('49', '49', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('50', '50', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('51', '51', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('52', '52', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('53', '53', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('54', '54', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('55', '55', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('56', '56', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('57', '57', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('58', '58', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('59', '59', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('60', '60', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('61', '61', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('62', '62', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('63', '63', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('64', '64', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('65', '65', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('66', '66', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('67', '67', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('68', '68', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('69', '69', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('70', '70', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('71', '71', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('72', '72', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('73', '73', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('74', '74', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('75', '75', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('76', '76', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('77', '77', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('78', '78', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('79', '79', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('80', '80', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('81', '81', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('82', '82', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('83', '83', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('84', '84', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('85', '85', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('86', '86', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('87', '87', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('88', '88', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('89', '89', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('90', '90', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('91', '91', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('92', '92', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('93', '93', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('94', '94', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('95', '95', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('96', '96', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('97', '97', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('98', '98', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('99', '99', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('100', '100', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('101', '101', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('102', '102', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('103', '103', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('104', '104', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('105', '105', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_expense_standard` VALUES ('106', '106', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');

-- ----------------------------
-- Table structure for pcn_goods_spec
-- ----------------------------
DROP TABLE IF EXISTS `pcn_goods_spec`;
CREATE TABLE `pcn_goods_spec` (
  `pcngs_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '规格id',
  `pcngs_name` varchar(30) DEFAULT NULL COMMENT '规格名称',
  PRIMARY KEY (`pcngs_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pcn_goods_spec
-- ----------------------------
INSERT INTO `pcn_goods_spec` VALUES ('1', '一大一小');
INSERT INTO `pcn_goods_spec` VALUES ('2', '成人');
INSERT INTO `pcn_goods_spec` VALUES ('3', '儿童');
INSERT INTO `pcn_goods_spec` VALUES ('4', '门店价');

-- ----------------------------
-- Table structure for pcn_goods_spec_value
-- ----------------------------
DROP TABLE IF EXISTS `pcn_goods_spec_value`;
CREATE TABLE `pcn_goods_spec_value` (
  `pcngsv_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '属性值ID',
  `pcngsv_pctid` int(11) DEFAULT NULL COMMENT '主题id',
  `pvngsv_pcnttid` int(11) DEFAULT NULL COMMENT '类型id',
  `pcngsv_gsid` int(11) DEFAULT NULL COMMENT '规格ID',
  `pcngsv_value` int(11) DEFAULT NULL COMMENT '属性值',
  PRIMARY KEY (`pcngsv_id`)
) ENGINE=InnoDB AUTO_INCREMENT=267 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pcn_goods_spec_value
-- ----------------------------
INSERT INTO `pcn_goods_spec_value` VALUES ('1', '1', '1', '1', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('2', '1', '1', '2', '90');
INSERT INTO `pcn_goods_spec_value` VALUES ('3', '1', '1', '3', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('4', '2', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('5', '2', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('6', '2', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('7', '3', '1', '1', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('8', '3', '1', '2', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('9', '3', '1', '3', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('10', '4', '1', '1', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('11', '4', '1', '2', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('12', '4', '1', '3', '50');
INSERT INTO `pcn_goods_spec_value` VALUES ('13', '5', '1', '1', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('14', '5', '1', '2', '90');
INSERT INTO `pcn_goods_spec_value` VALUES ('15', '5', '1', '3', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('16', '6', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('17', '6', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('18', '6', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('19', '7', '1', '1', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('20', '7', '1', '2', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('21', '7', '1', '3', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('22', '8', '1', '1', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('23', '8', '1', '2', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('24', '8', '1', '3', '50');
INSERT INTO `pcn_goods_spec_value` VALUES ('25', '9', '1', '1', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('26', '9', '1', '2', '90');
INSERT INTO `pcn_goods_spec_value` VALUES ('27', '9', '1', '3', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('28', '10', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('29', '10', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('30', '10', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('31', '11', '1', '1', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('32', '11', '1', '2', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('33', '11', '1', '3', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('34', '12', '1', '1', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('35', '12', '1', '2', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('36', '12', '1', '3', '50');
INSERT INTO `pcn_goods_spec_value` VALUES ('37', '13', '1', '1', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('38', '13', '1', '2', '90');
INSERT INTO `pcn_goods_spec_value` VALUES ('39', '13', '1', '3', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('40', '14', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('41', '14', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('42', '14', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('43', '15', '1', '1', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('44', '15', '1', '2', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('45', '15', '1', '3', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('46', '16', '1', '1', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('47', '16', '1', '2', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('48', '16', '1', '3', '50');
INSERT INTO `pcn_goods_spec_value` VALUES ('49', '17', '1', '1', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('50', '17', '1', '2', '90');
INSERT INTO `pcn_goods_spec_value` VALUES ('51', '17', '1', '3', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('52', '18', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('53', '18', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('54', '18', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('55', '19', '1', '1', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('56', '19', '1', '2', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('57', '19', '1', '3', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('58', '20', '1', '1', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('59', '20', '1', '2', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('60', '20', '1', '3', '50');
INSERT INTO `pcn_goods_spec_value` VALUES ('61', '21', '1', '1', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('62', '21', '1', '2', '90');
INSERT INTO `pcn_goods_spec_value` VALUES ('63', '21', '1', '3', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('64', '22', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('65', '22', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('66', '22', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('67', '23', '1', '1', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('68', '23', '1', '2', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('69', '23', '1', '3', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('70', '24', '1', '1', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('71', '24', '1', '2', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('72', '24', '1', '3', '50');
INSERT INTO `pcn_goods_spec_value` VALUES ('73', '25', '1', '1', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('74', '25', '1', '2', '90');
INSERT INTO `pcn_goods_spec_value` VALUES ('75', '25', '1', '3', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('76', '26', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('77', '26', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('78', '26', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('79', '27', '1', '1', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('80', '27', '1', '2', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('81', '27', '1', '3', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('82', '28', '1', '1', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('83', '28', '1', '2', '70');
INSERT INTO `pcn_goods_spec_value` VALUES ('84', '28', '1', '3', '50');
INSERT INTO `pcn_goods_spec_value` VALUES ('85', '29', '1', '1', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('86', '29', '1', '2', '60');
INSERT INTO `pcn_goods_spec_value` VALUES ('87', '29', '1', '3', '40');
INSERT INTO `pcn_goods_spec_value` VALUES ('88', '30', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('89', '30', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('90', '30', '3', '4', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('91', '31', '3', '2', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('92', '31', '3', '3', '110');
INSERT INTO `pcn_goods_spec_value` VALUES ('93', '31', '3', '4', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('94', '32', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('95', '32', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('96', '32', '3', '4', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('97', '33', '3', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('98', '33', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('99', '33', '3', '4', '170');
INSERT INTO `pcn_goods_spec_value` VALUES ('100', '34', '3', '2', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('101', '34', '3', '3', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('102', '34', '3', '4', '260');
INSERT INTO `pcn_goods_spec_value` VALUES ('103', '35', '3', '2', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('104', '35', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('105', '35', '3', '4', '190');
INSERT INTO `pcn_goods_spec_value` VALUES ('106', '36', '3', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('107', '36', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('108', '36', '3', '4', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('109', '37', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('110', '37', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('111', '37', '3', '4', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('112', '38', '3', '2', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('113', '38', '3', '3', '110');
INSERT INTO `pcn_goods_spec_value` VALUES ('114', '38', '3', '4', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('115', '39', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('116', '39', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('117', '39', '3', '4', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('118', '40', '3', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('119', '40', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('120', '40', '3', '4', '170');
INSERT INTO `pcn_goods_spec_value` VALUES ('121', '41', '3', '2', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('122', '41', '3', '3', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('123', '41', '3', '4', '260');
INSERT INTO `pcn_goods_spec_value` VALUES ('124', '42', '3', '2', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('125', '42', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('126', '42', '3', '4', '190');
INSERT INTO `pcn_goods_spec_value` VALUES ('127', '43', '3', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('128', '43', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('129', '43', '3', '4', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('130', '44', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('131', '44', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('132', '44', '3', '4', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('133', '45', '3', '2', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('134', '45', '3', '3', '110');
INSERT INTO `pcn_goods_spec_value` VALUES ('135', '45', '3', '4', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('136', '46', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('137', '46', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('138', '46', '3', '4', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('139', '47', '3', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('140', '47', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('141', '47', '3', '4', '170');
INSERT INTO `pcn_goods_spec_value` VALUES ('142', '48', '3', '2', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('143', '48', '3', '3', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('144', '48', '3', '4', '260');
INSERT INTO `pcn_goods_spec_value` VALUES ('145', '49', '3', '2', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('146', '49', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('147', '49', '3', '4', '190');
INSERT INTO `pcn_goods_spec_value` VALUES ('148', '50', '3', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('149', '50', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('150', '50', '3', '4', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('151', '51', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('152', '51', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('153', '51', '3', '4', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('154', '52', '3', '2', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('155', '52', '3', '3', '110');
INSERT INTO `pcn_goods_spec_value` VALUES ('156', '52', '3', '4', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('157', '53', '3', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('158', '53', '3', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('159', '53', '3', '4', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('160', '54', '3', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('161', '54', '3', '3', '120');
INSERT INTO `pcn_goods_spec_value` VALUES ('162', '54', '3', '4', '170');
INSERT INTO `pcn_goods_spec_value` VALUES ('163', '55', '2', '2', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('164', '55', '2', '3', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('165', '56', '2', '2', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('166', '56', '2', '3', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('167', '57', '2', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('168', '57', '2', '3', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('169', '58', '2', '2', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('170', '58', '2', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('171', '59', '2', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('172', '59', '2', '3', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('173', '60', '2', '2', '170');
INSERT INTO `pcn_goods_spec_value` VALUES ('174', '60', '2', '3', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('175', '61', '2', '2', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('176', '61', '2', '3', '110');
INSERT INTO `pcn_goods_spec_value` VALUES ('177', '62', '2', '2', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('178', '62', '2', '3', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('179', '63', '2', '2', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('180', '63', '2', '3', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('181', '64', '2', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('182', '64', '2', '3', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('183', '65', '2', '2', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('184', '65', '2', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('185', '66', '2', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('186', '66', '2', '3', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('187', '67', '2', '2', '170');
INSERT INTO `pcn_goods_spec_value` VALUES ('188', '67', '2', '3', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('189', '68', '2', '2', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('190', '68', '2', '3', '110');
INSERT INTO `pcn_goods_spec_value` VALUES ('191', '69', '2', '2', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('192', '69', '2', '3', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('193', '70', '2', '2', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('194', '70', '2', '3', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('195', '71', '2', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('196', '71', '2', '3', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('197', '72', '2', '2', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('198', '72', '2', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('199', '73', '2', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('200', '73', '2', '3', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('201', '74', '2', '2', '170');
INSERT INTO `pcn_goods_spec_value` VALUES ('202', '74', '2', '3', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('203', '75', '2', '2', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('204', '75', '2', '3', '110');
INSERT INTO `pcn_goods_spec_value` VALUES ('205', '76', '2', '2', '200');
INSERT INTO `pcn_goods_spec_value` VALUES ('206', '76', '2', '3', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('207', '77', '2', '2', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('208', '77', '2', '3', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('209', '78', '2', '2', '140');
INSERT INTO `pcn_goods_spec_value` VALUES ('210', '78', '2', '3', '130');
INSERT INTO `pcn_goods_spec_value` VALUES ('211', '79', '2', '2', '220');
INSERT INTO `pcn_goods_spec_value` VALUES ('212', '79', '2', '3', '160');
INSERT INTO `pcn_goods_spec_value` VALUES ('213', '80', '2', '2', '180');
INSERT INTO `pcn_goods_spec_value` VALUES ('214', '80', '2', '3', '150');
INSERT INTO `pcn_goods_spec_value` VALUES ('215', '81', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('216', '81', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('217', '82', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('218', '82', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('219', '83', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('220', '83', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('221', '84', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('222', '84', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('223', '85', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('224', '85', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('225', '86', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('226', '86', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('227', '87', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('228', '87', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('229', '88', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('230', '88', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('231', '89', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('232', '89', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('233', '90', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('234', '90', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('235', '91', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('236', '91', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('237', '92', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('238', '92', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('239', '93', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('240', '93', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('241', '94', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('242', '94', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('243', '95', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('244', '95', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('245', '96', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('246', '96', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('247', '97', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('248', '97', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('249', '98', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('250', '98', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('251', '99', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('252', '99', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('253', '100', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('254', '100', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('255', '101', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('256', '101', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('257', '102', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('258', '102', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('259', '103', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('260', '103', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('261', '104', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('262', '104', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('263', '105', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('264', '105', '2', '3', '80');
INSERT INTO `pcn_goods_spec_value` VALUES ('265', '106', '2', '2', '100');
INSERT INTO `pcn_goods_spec_value` VALUES ('266', '106', '2', '3', '80');

-- ----------------------------
-- Table structure for pcn_indent
-- ----------------------------
DROP TABLE IF EXISTS `pcn_indent`;
CREATE TABLE `pcn_indent` (
  `pcni_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id（主键）',
  `pcnu_id` int(11) NOT NULL COMMENT '用户id（外键）',
  `pcni_order_number` varchar(20) NOT NULL COMMENT '订单号',
  `pcni_actual_payment` int(11) NOT NULL COMMENT '实付款',
  `pcni_transaction_status` int(11) NOT NULL COMMENT '交易状态 1.完成 2.未完成 ',
  `pcni_time` datetime NOT NULL COMMENT '订单时间',
  PRIMARY KEY (`pcni_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pcn_indent
-- ----------------------------
INSERT INTO `pcn_indent` VALUES ('1', '1', '1234567891', '1000', '1', '2019-05-27 00:00:00');
INSERT INTO `pcn_indent` VALUES ('2', '2', '1234567892', '800', '2', '2019-05-28 00:00:00');
INSERT INTO `pcn_indent` VALUES ('3', '3', '1234567893', '100', '2', '2019-05-25 00:00:00');
INSERT INTO `pcn_indent` VALUES ('4', '4', '1234567894', '900', '1', '2019-05-26 00:00:00');
INSERT INTO `pcn_indent` VALUES ('5', '5', '1234567895', '90', '1', '2019-05-29 00:00:00');
INSERT INTO `pcn_indent` VALUES ('6', '6', '1234567896', '300', '1', '2019-05-30 00:00:00');
INSERT INTO `pcn_indent` VALUES ('7', '7', '1234567897', '500', '1', '2019-05-22 00:00:00');
INSERT INTO `pcn_indent` VALUES ('8', '8', '1234567898', '400', '1', '2019-05-23 00:00:00');
INSERT INTO `pcn_indent` VALUES ('9', '9', '1234567899', '150', '1', '2019-05-25 00:00:00');
INSERT INTO `pcn_indent` VALUES ('10', '10', '12345678910', '250', '2', '2019-05-28 00:00:00');
INSERT INTO `pcn_indent` VALUES ('11', '1', '1324567891', '600', '1', '2019-06-19 15:19:07');

-- ----------------------------
-- Table structure for pcn_parent_child_theme
-- ----------------------------
DROP TABLE IF EXISTS `pcn_parent_child_theme`;
CREATE TABLE `pcn_parent_child_theme` (
  `pcnpct_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主题id（主键）',
  `pcnpct_theme_name` varchar(10) NOT NULL COMMENT '主题名称',
  `pcnpct_start_time` date DEFAULT NULL COMMENT '开始时间',
  `pcnpct_end_time` date DEFAULT NULL COMMENT '结束时间',
  `pcnpct_status` int(11) NOT NULL COMMENT '状态（1进行中2已关闭）',
  `pcnpct_site` varchar(50) NOT NULL COMMENT '地址',
  `pcnpct_merchant_activity` int(11) NOT NULL COMMENT '商家活动（1户外亲子2室内亲子3亲子diy4农家乐采摘5儿童剧）',
  `pcnpct_show` int(11) NOT NULL COMMENT '是否展示 1.是0.否',
  `pcnpct_recommend` int(11) NOT NULL COMMENT '是否推荐 1.是 0.否 ',
  `pcnpct_ranking_list` int(11) NOT NULL COMMENT '排行（0不排行，1排行）',
  `pcntt_id` int(11) NOT NULL COMMENT '亲子主题类型id（1亲子活动2亲子旅游3票务）',
  `pcnpct_reason` varchar(20) NOT NULL COMMENT '推荐理由',
  `pcnpct_trip_mode` int(11) NOT NULL COMMENT '出行方式 （1自驾2跟团）',
  `pcnpct_travel_days` int(11) NOT NULL COMMENT '出行日 （1一日游2二日游3周边游4国内游5境外游）',
  `pcnpct_img_url` varchar(50) NOT NULL COMMENT '商品主图路径',
  PRIMARY KEY (`pcnpct_id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pcn_parent_child_theme
-- ----------------------------
INSERT INTO `pcn_parent_child_theme` VALUES ('1', '镜子迷宫', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '1', '好玩', '1', '1', 'Picture/tupian (1).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('2', '儿童木工坊', '2019-06-14', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '1', '好玩', '1', '1', 'Picture/tupian (2).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('3', '陶泥DIY', '2019-02-01', '2019-05-01', '0', '湖南长沙天心区区五一广场', '1', '1', '1', '0', '1', '好玩', '2', '2', 'Picture/tupian (3).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('4', '儿童职业体验馆', '2019-06-14', '2019-09-01', '1', '湖南长沙雨花区区铁道学院', '2', '1', '1', '1', '1', '好玩', '2', '3', 'Picture/tupian (4).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('5', '镜子迷宫', '2019-06-14', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '0', '1', '好玩', '2', '1', 'Picture/tupian (5).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('6', '儿童木工坊', '2019-06-14', '2019-09-01', '1', '湖南长沙天心区五一广场', '5', '1', '1', '1', '1', '好玩', '1', '2', 'Picture/tupian (6).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('7', '陶泥DIY', '2019-06-14', '2019-09-01', '1', '湖南长沙岳麓区湖南大学', '5', '1', '1', '0', '1', '好玩', '2', '2', 'Picture/tupian (7).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('8', '儿童职业体验馆', '2019-02-01', '2019-05-01', '0', '湖南长沙望城区王府井', '1', '1', '1', '1', '1', '好玩', '1', '1', 'Picture/tupian (8).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('9', '镜子迷宫', '2019-06-19', '2019-09-01', '1', '湖南长沙天心区区五一广场', '2', '1', '1', '0', '1', '好玩', '1', '3', 'Picture/tupian (9).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('10', '儿童木工坊', '2019-06-19', '2019-09-01', '1', '湖南长沙雨花区区铁道学院', '2', '1', '0', '0', '1', '好玩', '1', '4', 'Picture/tupian (10).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('11', '陶泥DIY', '2019-06-19', '2019-09-01', '1', '湖南长沙岳麓区湖南大学', '2', '1', '0', '0', '1', '好玩', '2', '4', 'Picture/tupian (11).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('12', '儿童职业体验馆', '2019-05-12', '2019-06-18', '0', '湖南长沙岳麓区湖南大学', '2', '1', '0', '1', '1', '好玩', '2', '2', 'Picture/tupian (12).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('13', '镜子迷宫', '2019-06-19', '2019-09-01', '1', '湖南长沙雨花区区铁道学院', '5', '1', '0', '0', '1', '好玩', '2', '2', 'Picture/tupian (13).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('14', '儿童木工坊', '2019-06-19', '2019-09-01', '1', '湖南长沙望城区王府井', '5', '1', '0', '0', '1', '好玩', '2', '1', 'Picture/tupian (14).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('15', '陶泥DIY', '2019-02-01', '2019-09-01', '1', '湖南长沙天心区区五一广场', '3', '1', '0', '0', '1', '好玩', '2', '1', 'Picture/tupian (15).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('16', '儿童职业体验馆', '2019-02-01', '2019-09-01', '1', '湖南长沙雨花区区铁道学院', '3', '1', '0', '0', '1', '好玩', '2', '2', 'Picture/tupian (16).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('17', '镜子迷宫', '2019-02-01', '2019-09-01', '1', '湖南长沙望城区王府井', '3', '1', '0', '0', '1', '好玩', '2', '3', 'Picture/tupian (17).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('18', '儿童木工坊', '2019-02-01', '2019-09-01', '1', '湖南长沙天心区区五一广场', '3', '1', '0', '1', '1', '好玩', '2', '1', 'Picture/tupian (18).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('19', '陶泥DIY', '2019-02-01', '2019-05-01', '0', '湖南长沙雨花区区铁道学院', '3', '1', '0', '0', '1', '好玩', '2', '2', 'Picture/tupian (19).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('20', '儿童职业体验馆', '2019-06-10', '2019-07-01', '1', '湖南长沙望城区王府井', '3', '1', '0', '0', '1', '好玩', '2', '2', 'Picture/tupian (20).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('21', '镜子迷宫', '2019-02-01', '2019-05-01', '0', '湖南长沙岳麓区湖南大学', '4', '1', '0', '0', '1', '好玩', '1', '1', 'Picture/tupian (21).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('22', '儿童木工坊', '2019-02-01', '2019-05-01', '0', '湖南长沙天心区区五一广场', '5', '1', '1', '0', '1', '好玩', '1', '3', 'Picture/tupian (22).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('23', '陶泥DIY', '2019-02-01', '2019-09-01', '1', '湖南长沙星沙区区五一广场', '5', '1', '0', '0', '1', '好玩', '2', '4', 'Picture/tupian (23).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('24', '儿童职业体验馆', '2019-02-01', '2019-09-01', '1', '湖南长沙星沙区区五一广场', '4', '1', '1', '0', '1', '好玩', '2', '4', 'Picture/tupian (24).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('25', '镜子迷宫', '2019-02-01', '2019-09-01', '1', '湖南长沙星沙区区五一广场', '4', '1', '1', '0', '1', '好玩', '2', '2', 'Picture/tupian (25).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('26', '儿童木工坊', '2019-02-01', '2019-09-01', '1', '湖南长沙星沙区区五一广场', '4', '1', '1', '0', '1', '好玩', '2', '2', 'Picture/tupian (26).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('27', '陶泥DIY', '2019-02-01', '2019-09-01', '1', '湖南长沙星沙区区五一广场', '1', '1', '1', '1', '1', '好玩', '1', '1', 'Picture/tupian (27).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('28', '儿童职业体验馆', '2019-06-12', '2019-09-01', '1', '湖南长沙星沙区区五一广场', '1', '1', '1', '1', '1', '好玩', '1', '3', 'Picture/tupian (28).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('29', '镜子迷宫', '2019-06-12', '2019-08-01', '1', '湖南长沙望城区汽车西站', '3', '1', '0', '0', '1', '好玩', '2', '5', 'Picture/tupian (29).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('30', '深圳欢乐谷门票', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '0', '1', '1', '3', '还行', '1', '5', 'Picture/tupian (30).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('31', '东部华侨城门票', '2019-06-07', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '0', '1', '1', '3', '还行', '1', '2', 'Picture/tupian (31).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('32', '广州长隆欢乐世界门票', '2019-02-01', '2019-05-01', '0', '湖南长沙天心区区五一广场', '1', '0', '1', '0', '3', '还行', '2', '2', 'Picture/tupian (32).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('33', '广州长隆水上乐园门票', '2019-06-07', '2019-09-01', '1', '湖南长沙雨花区区铁道学院', '2', '0', '1', '1', '3', '还行', '2', '1', 'Picture/tupian (33).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('34', '上海迪士尼乐园门票', '2019-06-07', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '0', '1', '0', '3', '还行', '2', '1', 'Picture/tupian (34).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('35', '香港海洋公园门票', '2019-06-07', '2019-09-01', '1', '湖南长沙天心区五一广场', '5', '0', '1', '1', '3', '还行', '1', '2', 'Picture/tupian (35).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('36', '芜湖方特欢乐世界门票', '2019-06-07', '2019-09-01', '1', '湖南长沙岳麓区湖南大学', '5', '0', '1', '0', '3', '还行', '2', '3', 'Picture/tupian (36).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('37', '潍坊富华游乐园门票', '2019-02-01', '2019-05-01', '0', '湖南长沙望城区王府井', '1', '0', '1', '1', '3', '还行', '1', '1', 'Picture/tupian (37).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('38', '深圳欢乐谷门票', '2019-06-12', '2019-09-01', '1', '湖南长沙天心区区五一广场', '2', '0', '1', '0', '3', '还行', '1', '2', 'Picture/tupian (38).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('39', '东部华侨城门票', '2019-06-12', '2019-09-01', '1', '湖南长沙雨花区区铁道学院', '2', '0', '0', '0', '3', '还行', '1', '2', 'Picture/tupian (39).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('40', '广州长隆欢乐世界门票', '2019-06-12', '2019-09-01', '1', '湖南长沙岳麓区湖南大学', '2', '0', '0', '0', '3', '还行', '2', '1', 'Picture/tupian (40).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('41', '广州长隆水上乐园门票', '2019-06-12', '2019-09-01', '1', '湖南长沙岳麓区湖南大学', '2', '0', '0', '1', '3', '还行', '2', '3', 'Picture/tupian (41).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('42', '上海迪士尼乐园门票', '2019-06-12', '2019-09-01', '1', '湖南长沙雨花区区铁道学院', '5', '0', '0', '0', '3', '还行', '2', '4', 'Picture/tupian (42).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('43', '香港海洋公园门票', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '5', '0', '0', '0', '3', '还行', '2', '4', 'Picture/tupian (43).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('44', '芜湖方特欢乐世界门票', '2019-02-01', '2019-05-01', '0', '湖南长沙天心区区五一广场', '3', '0', '0', '0', '3', '还行', '2', '2', 'Picture/tupian (44).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('45', '潍坊富华游乐园门票', '2019-02-01', '2019-05-01', '1', '湖南长沙雨花区区铁道学院', '3', '0', '0', '0', '3', '还行', '2', '2', 'Picture/tupian (45).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('46', '游乐园', '2019-02-01', '2019-05-01', '1', '湖南长沙望城区王府井', '3', '0', '0', '0', '3', '还行', '2', '1', 'Picture/tupian (46).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('47', '深圳欢乐谷门票', '2019-02-01', '2019-05-01', '1', '湖南长沙天心区区五一广场', '3', '0', '0', '1', '3', '还行', '2', '3', 'Picture/tupian (47).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('48', '东部华侨城门票', '2019-02-01', '2019-05-01', '1', '湖南长沙雨花区区铁道学院', '3', '0', '0', '0', '3', '还行', '2', '5', 'Picture/tupian (48).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('49', '广州长隆欢乐世界门票', '2019-06-10', '2019-07-01', '1', '湖南长沙望城区王府井', '3', '0', '0', '0', '3', '还行', '2', '5', 'Picture/tupian (49).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('50', '广州长隆水上乐园门票', '2019-02-01', '2019-05-01', '1', '湖南长沙岳麓区湖南大学', '4', '0', '0', '0', '3', '还行', '1', '2', 'Picture/tupian (50).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('51', '上海迪士尼乐园门票', '2019-02-01', '2019-05-01', '1', '湖南长沙天心区区五一广场', '5', '0', '1', '0', '3', '还行', '1', '2', 'Picture/tupian (51).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('52', '香港海洋公园门票', '2019-02-01', '2019-05-01', '1', '湖南长沙星沙区区五一广场', '5', '0', '0', '0', '3', '还行', '2', '1', 'Picture/tupian (52).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('53', '芜湖方特欢乐世界门票', '2019-02-01', '2019-05-01', '1', '湖南长沙星沙区区五一广场', '4', '0', '1', '0', '3', '还行', '2', '1', 'Picture/tupian (53).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('54', '潍坊富华游乐园门票', '2019-02-01', '2019-05-01', '1', '湖南长沙星沙区区五一广场', '4', '0', '1', '0', '3', '还行', '2', '2', 'Picture/tupian (54).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('55', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '3', 'Picture/tupian (55).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('56', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (56).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('57', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (57).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('58', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (58).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('59', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (59).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('60', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (60).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('61', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (61).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('62', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '3', 'Picture/tupian (62).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('63', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (63).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('64', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('65', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('66', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('67', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('68', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('69', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('70', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('71', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('72', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('73', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (73).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('74', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '3', 'Picture/tupian (74).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('75', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (75).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('76', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (76).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('77', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (77).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('78', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (78).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('79', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (79).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('80', '少林足球', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (80).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('81', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '3', 'Picture/tupian (55).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('82', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (56).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('83', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (57).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('84', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (58).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('85', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (59).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('86', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (60).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('87', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (61).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('88', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '3', 'Picture/tupian (62).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('89', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (63).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('90', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('91', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('92', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('93', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('94', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('95', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('96', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '4', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('97', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('98', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('99', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (73).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('100', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '3', 'Picture/tupian (74).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('101', '西双版纳', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (75).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('102', '昆明', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '5', 'Picture/tupian (76).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('103', '大理', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (77).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('104', '拉萨', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (78).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('105', '迪士尼乐园', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '1', 'Picture/tupian (79).jpg');
INSERT INTO `pcn_parent_child_theme` VALUES ('106', '少林足球', '2019-06-12', '2019-09-01', '1', '湖南长沙望城区王府井', '1', '1', '1', '1', '2', '好玩', '1', '2', 'Picture/tupian (80).jpg');

-- ----------------------------
-- Table structure for pcn_particulars
-- ----------------------------
DROP TABLE IF EXISTS `pcn_particulars`;
CREATE TABLE `pcn_particulars` (
  `pcnpt_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单详情ID（主键）',
  `pcni_id` int(11) NOT NULL COMMENT '订单id',
  `pcngs_id` int(11) NOT NULL COMMENT '''规格id',
  `pcnpct_id` int(11) NOT NULL COMMENT '亲子主题id',
  `pcnpt_quantity` int(11) NOT NULL COMMENT '数量',
  `pcnpt_linkman_name` varchar(10) NOT NULL COMMENT '联系人姓名',
  `pcnpt_linkman_number` varchar(20) NOT NULL COMMENT '联系人手机号',
  `pcnpt_remark` varchar(10) DEFAULT NULL COMMENT '备注',
  `pcnpt_order_amount` int(11) NOT NULL COMMENT '订单金额',
  PRIMARY KEY (`pcnpt_id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pcn_particulars
-- ----------------------------
INSERT INTO `pcn_particulars` VALUES ('1', '1', '1', '1', '2', '辉', '1313456311', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('2', '2', '2', '2', '5', '辉', '1313456316', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('3', '3', '3', '3', '6', '辉', '1313456312', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('4', '4', '1', '4', '8', '辉', '1313426313', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('5', '5', '3', '5', '5', '辉', '1313456316', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('6', '6', '2', '6', '1', '辉', '1313456353', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('7', '7', '4', '7', '3', '辉', '1313456366', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('8', '8', '1', '8', '5', '辉', '1313456377', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('9', '9', '2', '9', '2', '辉', '1313456388', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('10', '10', '3', '10', '9', '辉', '1313456399', '无', '50');
INSERT INTO `pcn_particulars` VALUES ('11', '1', '2', '1', '2', '辉', '1313456311', '无', '60');
INSERT INTO `pcn_particulars` VALUES ('12', '11', '1', '1', '2', '斌', '13513134569', '无', '340');
INSERT INTO `pcn_particulars` VALUES ('13', '11', '2', '1', '3', '斌', '13513134569', '无', '260');

-- ----------------------------
-- Table structure for pcn_theme_image
-- ----------------------------
DROP TABLE IF EXISTS `pcn_theme_image`;
CREATE TABLE `pcn_theme_image` (
  `pcnti_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '亲子主题图片id（主键）',
  `pcnid_pctid` int(11) NOT NULL COMMENT '亲子主题id',
  `pcnti_image_path` varchar(50) NOT NULL COMMENT '图片路径',
  PRIMARY KEY (`pcnti_id`)
) ENGINE=InnoDB AUTO_INCREMENT=397 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pcn_theme_image
-- ----------------------------
INSERT INTO `pcn_theme_image` VALUES ('1', '1', 'Picture/tupian (1).jpg');
INSERT INTO `pcn_theme_image` VALUES ('2', '1', 'Picture/tupian (1).jpg');
INSERT INTO `pcn_theme_image` VALUES ('3', '1', 'Picture/tupian (1).jpg');
INSERT INTO `pcn_theme_image` VALUES ('4', '2', 'Picture/tupian (2).jpg');
INSERT INTO `pcn_theme_image` VALUES ('5', '2', 'Picture/tupian (2).jpg');
INSERT INTO `pcn_theme_image` VALUES ('6', '2', 'Picture/tupian (2).jpg');
INSERT INTO `pcn_theme_image` VALUES ('7', '3', 'Picture/tupian (3).jpg');
INSERT INTO `pcn_theme_image` VALUES ('8', '3', 'Picture/tupian (3).jpg');
INSERT INTO `pcn_theme_image` VALUES ('9', '3', 'Picture/tupian (3).jpg');
INSERT INTO `pcn_theme_image` VALUES ('10', '4', 'Picture/tupian (4).jpg');
INSERT INTO `pcn_theme_image` VALUES ('11', '4', 'Picture/tupian (4).jpg');
INSERT INTO `pcn_theme_image` VALUES ('12', '4', 'Picture/tupian (4).jpg');
INSERT INTO `pcn_theme_image` VALUES ('13', '5', 'Picture/tupian (5).jpg');
INSERT INTO `pcn_theme_image` VALUES ('14', '5', 'Picture/tupian (5).jpg');
INSERT INTO `pcn_theme_image` VALUES ('15', '5', 'Picture/tupian (5).jpg');
INSERT INTO `pcn_theme_image` VALUES ('16', '6', 'Picture/tupian (6).jpg');
INSERT INTO `pcn_theme_image` VALUES ('17', '6', 'Picture/tupian (6).jpg');
INSERT INTO `pcn_theme_image` VALUES ('18', '6', 'Picture/tupian (6).jpg');
INSERT INTO `pcn_theme_image` VALUES ('19', '7', 'Picture/tupian (7).jpg');
INSERT INTO `pcn_theme_image` VALUES ('20', '7', 'Picture/tupian (7).jpg');
INSERT INTO `pcn_theme_image` VALUES ('21', '7', 'Picture/tupian (7).jpg');
INSERT INTO `pcn_theme_image` VALUES ('22', '8', 'Picture/tupian (8).jpg');
INSERT INTO `pcn_theme_image` VALUES ('23', '8', 'Picture/tupian (8).jpg');
INSERT INTO `pcn_theme_image` VALUES ('24', '8', 'Picture/tupian (8).jpg');
INSERT INTO `pcn_theme_image` VALUES ('25', '9', 'Picture/tupian (9).jpg');
INSERT INTO `pcn_theme_image` VALUES ('26', '9', 'Picture/tupian (9).jpg');
INSERT INTO `pcn_theme_image` VALUES ('27', '9', 'Picture/tupian (9).jpg');
INSERT INTO `pcn_theme_image` VALUES ('28', '10', 'Picture/tupian (10).jpg');
INSERT INTO `pcn_theme_image` VALUES ('29', '10', 'Picture/tupian (10).jpg');
INSERT INTO `pcn_theme_image` VALUES ('30', '10', 'Picture/tupian (10).jpg');
INSERT INTO `pcn_theme_image` VALUES ('31', '11', 'Picture/tupian (11).jpg');
INSERT INTO `pcn_theme_image` VALUES ('32', '11', 'Picture/tupian (11).jpg');
INSERT INTO `pcn_theme_image` VALUES ('33', '11', 'Picture/tupian (11).jpg');
INSERT INTO `pcn_theme_image` VALUES ('34', '12', 'Picture/tupian (12).jpg');
INSERT INTO `pcn_theme_image` VALUES ('35', '12', 'Picture/tupian (12).jpg');
INSERT INTO `pcn_theme_image` VALUES ('36', '12', 'Picture/tupian (12).jpg');
INSERT INTO `pcn_theme_image` VALUES ('37', '13', 'Picture/tupian (13).jpg');
INSERT INTO `pcn_theme_image` VALUES ('38', '13', 'Picture/tupian (13).jpg');
INSERT INTO `pcn_theme_image` VALUES ('39', '13', 'Picture/tupian (13).jpg');
INSERT INTO `pcn_theme_image` VALUES ('40', '14', 'Picture/tupian (14).jpg');
INSERT INTO `pcn_theme_image` VALUES ('41', '14', 'Picture/tupian (14).jpg');
INSERT INTO `pcn_theme_image` VALUES ('42', '14', 'Picture/tupian (14).jpg');
INSERT INTO `pcn_theme_image` VALUES ('43', '15', 'Picture/tupian (15).jpg');
INSERT INTO `pcn_theme_image` VALUES ('44', '15', 'Picture/tupian (15).jpg');
INSERT INTO `pcn_theme_image` VALUES ('45', '15', 'Picture/tupian (15).jpg');
INSERT INTO `pcn_theme_image` VALUES ('46', '16', 'Picture/tupian (16).jpg');
INSERT INTO `pcn_theme_image` VALUES ('47', '16', 'Picture/tupian (16).jpg');
INSERT INTO `pcn_theme_image` VALUES ('48', '16', 'Picture/tupian (16).jpg');
INSERT INTO `pcn_theme_image` VALUES ('49', '17', 'Picture/tupian (17).jpg');
INSERT INTO `pcn_theme_image` VALUES ('50', '17', 'Picture/tupian (17).jpg');
INSERT INTO `pcn_theme_image` VALUES ('51', '17', 'Picture/tupian (17).jpg');
INSERT INTO `pcn_theme_image` VALUES ('52', '18', 'Picture/tupian (18).jpg');
INSERT INTO `pcn_theme_image` VALUES ('53', '18', 'Picture/tupian (18).jpg');
INSERT INTO `pcn_theme_image` VALUES ('54', '18', 'Picture/tupian (18).jpg');
INSERT INTO `pcn_theme_image` VALUES ('55', '19', 'Picture/tupian (19).jpg');
INSERT INTO `pcn_theme_image` VALUES ('56', '19', 'Picture/tupian (19).jpg');
INSERT INTO `pcn_theme_image` VALUES ('57', '19', 'Picture/tupian (19).jpg');
INSERT INTO `pcn_theme_image` VALUES ('58', '20', 'Picture/tupian (20).jpg');
INSERT INTO `pcn_theme_image` VALUES ('59', '20', 'Picture/tupian (20).jpg');
INSERT INTO `pcn_theme_image` VALUES ('60', '20', 'Picture/tupian (20).jpg');
INSERT INTO `pcn_theme_image` VALUES ('61', '21', 'Picture/tupian (21).jpg');
INSERT INTO `pcn_theme_image` VALUES ('62', '21', 'Picture/tupian (21).jpg');
INSERT INTO `pcn_theme_image` VALUES ('63', '21', 'Picture/tupian (21).jpg');
INSERT INTO `pcn_theme_image` VALUES ('64', '22', 'Picture/tupian (22).jpg');
INSERT INTO `pcn_theme_image` VALUES ('65', '22', 'Picture/tupian (22).jpg');
INSERT INTO `pcn_theme_image` VALUES ('66', '22', 'Picture/tupian (22).jpg');
INSERT INTO `pcn_theme_image` VALUES ('67', '23', 'Picture/tupian (23).jpg');
INSERT INTO `pcn_theme_image` VALUES ('68', '23', 'Picture/tupian (23).jpg');
INSERT INTO `pcn_theme_image` VALUES ('69', '23', 'Picture/tupian (23).jpg');
INSERT INTO `pcn_theme_image` VALUES ('70', '24', 'Picture/tupian (24).jpg');
INSERT INTO `pcn_theme_image` VALUES ('71', '24', 'Picture/tupian (24).jpg');
INSERT INTO `pcn_theme_image` VALUES ('72', '24', 'Picture/tupian (24).jpg');
INSERT INTO `pcn_theme_image` VALUES ('73', '25', 'Picture/tupian (25).jpg');
INSERT INTO `pcn_theme_image` VALUES ('74', '25', 'Picture/tupian (25).jpg');
INSERT INTO `pcn_theme_image` VALUES ('75', '25', 'Picture/tupian (25).jpg');
INSERT INTO `pcn_theme_image` VALUES ('76', '26', 'Picture/tupian (26).jpg');
INSERT INTO `pcn_theme_image` VALUES ('77', '26', 'Picture/tupian (26).jpg');
INSERT INTO `pcn_theme_image` VALUES ('78', '26', 'Picture/tupian (26).jpg');
INSERT INTO `pcn_theme_image` VALUES ('79', '27', 'Picture/tupian (27).jpg');
INSERT INTO `pcn_theme_image` VALUES ('80', '27', 'Picture/tupian (27).jpg');
INSERT INTO `pcn_theme_image` VALUES ('81', '27', 'Picture/tupian (27).jpg');
INSERT INTO `pcn_theme_image` VALUES ('82', '28', 'Picture/tupian (28).jpg');
INSERT INTO `pcn_theme_image` VALUES ('83', '28', 'Picture/tupian (28).jpg');
INSERT INTO `pcn_theme_image` VALUES ('84', '28', 'Picture/tupian (28).jpg');
INSERT INTO `pcn_theme_image` VALUES ('85', '29', 'Picture/tupian (29).jpg');
INSERT INTO `pcn_theme_image` VALUES ('86', '29', 'Picture/tupian (29).jpg');
INSERT INTO `pcn_theme_image` VALUES ('87', '29', 'Picture/tupian (29).jpg');
INSERT INTO `pcn_theme_image` VALUES ('88', '30', 'Picture/tupian (30).jpg');
INSERT INTO `pcn_theme_image` VALUES ('89', '30', 'Picture/tupian (30).jpg');
INSERT INTO `pcn_theme_image` VALUES ('90', '30', 'Picture/tupian (30).jpg');
INSERT INTO `pcn_theme_image` VALUES ('91', '31', 'Picture/tupian (31).jpg');
INSERT INTO `pcn_theme_image` VALUES ('92', '31', 'Picture/tupian (31).jpg');
INSERT INTO `pcn_theme_image` VALUES ('93', '31', 'Picture/tupian (31).jpg');
INSERT INTO `pcn_theme_image` VALUES ('94', '32', 'Picture/tupian (32).jpg');
INSERT INTO `pcn_theme_image` VALUES ('95', '32', 'Picture/tupian (32).jpg');
INSERT INTO `pcn_theme_image` VALUES ('96', '32', 'Picture/tupian (32).jpg');
INSERT INTO `pcn_theme_image` VALUES ('97', '33', 'Picture/tupian (33).jpg');
INSERT INTO `pcn_theme_image` VALUES ('98', '33', 'Picture/tupian (33).jpg');
INSERT INTO `pcn_theme_image` VALUES ('99', '33', 'Picture/tupian (33).jpg');
INSERT INTO `pcn_theme_image` VALUES ('100', '34', 'Picture/tupian (34).jpg');
INSERT INTO `pcn_theme_image` VALUES ('101', '34', 'Picture/tupian (34).jpg');
INSERT INTO `pcn_theme_image` VALUES ('102', '34', 'Picture/tupian (34).jpg');
INSERT INTO `pcn_theme_image` VALUES ('103', '35', 'Picture/tupian (35).jpg');
INSERT INTO `pcn_theme_image` VALUES ('104', '35', 'Picture/tupian (35).jpg');
INSERT INTO `pcn_theme_image` VALUES ('105', '35', 'Picture/tupian (35).jpg');
INSERT INTO `pcn_theme_image` VALUES ('106', '36', 'Picture/tupian (36).jpg');
INSERT INTO `pcn_theme_image` VALUES ('107', '36', 'Picture/tupian (36).jpg');
INSERT INTO `pcn_theme_image` VALUES ('108', '36', 'Picture/tupian (36).jpg');
INSERT INTO `pcn_theme_image` VALUES ('109', '37', 'Picture/tupian (37).jpg');
INSERT INTO `pcn_theme_image` VALUES ('110', '37', 'Picture/tupian (37).jpg');
INSERT INTO `pcn_theme_image` VALUES ('111', '37', 'Picture/tupian (37).jpg');
INSERT INTO `pcn_theme_image` VALUES ('112', '38', 'Picture/tupian (38).jpg');
INSERT INTO `pcn_theme_image` VALUES ('113', '38', 'Picture/tupian (38).jpg');
INSERT INTO `pcn_theme_image` VALUES ('114', '38', 'Picture/tupian (38).jpg');
INSERT INTO `pcn_theme_image` VALUES ('115', '39', 'Picture/tupian (39).jpg');
INSERT INTO `pcn_theme_image` VALUES ('116', '39', 'Picture/tupian (39).jpg');
INSERT INTO `pcn_theme_image` VALUES ('117', '39', 'Picture/tupian (39).jpg');
INSERT INTO `pcn_theme_image` VALUES ('118', '40', 'Picture/tupian (40).jpg');
INSERT INTO `pcn_theme_image` VALUES ('119', '40', 'Picture/tupian (40).jpg');
INSERT INTO `pcn_theme_image` VALUES ('120', '40', 'Picture/tupian (40).jpg');
INSERT INTO `pcn_theme_image` VALUES ('121', '41', 'Picture/tupian (41).jpg');
INSERT INTO `pcn_theme_image` VALUES ('122', '41', 'Picture/tupian (41).jpg');
INSERT INTO `pcn_theme_image` VALUES ('123', '41', 'Picture/tupian (41).jpg');
INSERT INTO `pcn_theme_image` VALUES ('124', '42', 'Picture/tupian (42).jpg');
INSERT INTO `pcn_theme_image` VALUES ('125', '42', 'Picture/tupian (42).jpg');
INSERT INTO `pcn_theme_image` VALUES ('126', '42', 'Picture/tupian (42).jpg');
INSERT INTO `pcn_theme_image` VALUES ('127', '43', 'Picture/tupian (43).jpg');
INSERT INTO `pcn_theme_image` VALUES ('128', '43', 'Picture/tupian (43).jpg');
INSERT INTO `pcn_theme_image` VALUES ('129', '43', 'Picture/tupian (43).jpg');
INSERT INTO `pcn_theme_image` VALUES ('130', '44', 'Picture/tupian (44).jpg');
INSERT INTO `pcn_theme_image` VALUES ('131', '44', 'Picture/tupian (44).jpg');
INSERT INTO `pcn_theme_image` VALUES ('132', '44', 'Picture/tupian (44).jpg');
INSERT INTO `pcn_theme_image` VALUES ('133', '45', 'Picture/tupian (45).jpg');
INSERT INTO `pcn_theme_image` VALUES ('134', '45', 'Picture/tupian (45).jpg');
INSERT INTO `pcn_theme_image` VALUES ('135', '45', 'Picture/tupian (45).jpg');
INSERT INTO `pcn_theme_image` VALUES ('136', '46', 'Picture/tupian (46).jpg');
INSERT INTO `pcn_theme_image` VALUES ('137', '46', 'Picture/tupian (46).jpg');
INSERT INTO `pcn_theme_image` VALUES ('138', '46', 'Picture/tupian (46).jpg');
INSERT INTO `pcn_theme_image` VALUES ('139', '47', 'Picture/tupian (47).jpg');
INSERT INTO `pcn_theme_image` VALUES ('140', '47', 'Picture/tupian (47).jpg');
INSERT INTO `pcn_theme_image` VALUES ('141', '47', 'Picture/tupian (47).jpg');
INSERT INTO `pcn_theme_image` VALUES ('142', '48', 'Picture/tupian (48).jpg');
INSERT INTO `pcn_theme_image` VALUES ('143', '48', 'Picture/tupian (48).jpg');
INSERT INTO `pcn_theme_image` VALUES ('144', '48', 'Picture/tupian (48).jpg');
INSERT INTO `pcn_theme_image` VALUES ('145', '49', 'Picture/tupian (49).jpg');
INSERT INTO `pcn_theme_image` VALUES ('146', '49', 'Picture/tupian (49).jpg');
INSERT INTO `pcn_theme_image` VALUES ('147', '49', 'Picture/tupian (49).jpg');
INSERT INTO `pcn_theme_image` VALUES ('148', '50', 'Picture/tupian (50).jpg');
INSERT INTO `pcn_theme_image` VALUES ('149', '50', 'Picture/tupian (50).jpg');
INSERT INTO `pcn_theme_image` VALUES ('150', '50', 'Picture/tupian (50).jpg');
INSERT INTO `pcn_theme_image` VALUES ('151', '51', 'Picture/tupian (51).jpg');
INSERT INTO `pcn_theme_image` VALUES ('152', '51', 'Picture/tupian (51).jpg');
INSERT INTO `pcn_theme_image` VALUES ('153', '51', 'Picture/tupian (51).jpg');
INSERT INTO `pcn_theme_image` VALUES ('154', '52', 'Picture/tupian (52).jpg');
INSERT INTO `pcn_theme_image` VALUES ('155', '52', 'Picture/tupian (52).jpg');
INSERT INTO `pcn_theme_image` VALUES ('156', '52', 'Picture/tupian (52).jpg');
INSERT INTO `pcn_theme_image` VALUES ('157', '53', 'Picture/tupian (53).jpg');
INSERT INTO `pcn_theme_image` VALUES ('158', '53', 'Picture/tupian (53).jpg');
INSERT INTO `pcn_theme_image` VALUES ('159', '53', 'Picture/tupian (53).jpg');
INSERT INTO `pcn_theme_image` VALUES ('160', '54', 'Picture/tupian (54).jpg');
INSERT INTO `pcn_theme_image` VALUES ('161', '54', 'Picture/tupian (54).jpg');
INSERT INTO `pcn_theme_image` VALUES ('162', '54', 'Picture/tupian (54).jpg');
INSERT INTO `pcn_theme_image` VALUES ('181', '55', 'Picture/tupian (55).jpg');
INSERT INTO `pcn_theme_image` VALUES ('182', '55', 'Picture/tupian (55).jpg');
INSERT INTO `pcn_theme_image` VALUES ('183', '55', 'Picture/tupian (55).jpg');
INSERT INTO `pcn_theme_image` VALUES ('184', '56', 'Picture/tupian (56).jpg');
INSERT INTO `pcn_theme_image` VALUES ('185', '56', 'Picture/tupian (56).jpg');
INSERT INTO `pcn_theme_image` VALUES ('186', '56', 'Picture/tupian (56).jpg');
INSERT INTO `pcn_theme_image` VALUES ('187', '57', 'Picture/tupian (57).jpg');
INSERT INTO `pcn_theme_image` VALUES ('188', '57', 'Picture/tupian (57).jpg');
INSERT INTO `pcn_theme_image` VALUES ('189', '57', 'Picture/tupian (57).jpg');
INSERT INTO `pcn_theme_image` VALUES ('190', '58', 'Picture/tupian (58).jpg');
INSERT INTO `pcn_theme_image` VALUES ('191', '58', 'Picture/tupian (58).jpg');
INSERT INTO `pcn_theme_image` VALUES ('192', '58', 'Picture/tupian (58).jpg');
INSERT INTO `pcn_theme_image` VALUES ('193', '59', 'Picture/tupian (59).jpg');
INSERT INTO `pcn_theme_image` VALUES ('194', '59', 'Picture/tupian (59).jpg');
INSERT INTO `pcn_theme_image` VALUES ('195', '59', 'Picture/tupian (59).jpg');
INSERT INTO `pcn_theme_image` VALUES ('196', '60', 'Picture/tupian (60).jpg');
INSERT INTO `pcn_theme_image` VALUES ('197', '60', 'Picture/tupian (60).jpg');
INSERT INTO `pcn_theme_image` VALUES ('198', '60', 'Picture/tupian (60).jpg');
INSERT INTO `pcn_theme_image` VALUES ('199', '61', 'Picture/tupian (61).jpg');
INSERT INTO `pcn_theme_image` VALUES ('200', '61', 'Picture/tupian (61).jpg');
INSERT INTO `pcn_theme_image` VALUES ('201', '61', 'Picture/tupian (61).jpg');
INSERT INTO `pcn_theme_image` VALUES ('202', '62', 'Picture/tupian (62).jpg');
INSERT INTO `pcn_theme_image` VALUES ('203', '62', 'Picture/tupian (62).jpg');
INSERT INTO `pcn_theme_image` VALUES ('204', '62', 'Picture/tupian (62).jpg');
INSERT INTO `pcn_theme_image` VALUES ('205', '63', 'Picture/tupian (63).jpg');
INSERT INTO `pcn_theme_image` VALUES ('206', '63', 'Picture/tupian (63).jpg');
INSERT INTO `pcn_theme_image` VALUES ('207', '63', 'Picture/tupian (63).jpg');
INSERT INTO `pcn_theme_image` VALUES ('208', '64', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('209', '64', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('210', '64', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('211', '65', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('212', '65', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('213', '65', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('214', '66', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('215', '66', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('216', '66', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('217', '67', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('218', '67', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('219', '67', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('220', '68', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('221', '68', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('222', '68', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('223', '69', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('224', '69', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('225', '69', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('226', '70', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('227', '70', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('228', '70', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('229', '71', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('230', '71', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('231', '71', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('232', '72', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('233', '72', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('234', '72', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('235', '73', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('236', '73', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('237', '73', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('238', '74', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('239', '74', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('240', '74', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('241', '75', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('242', '75', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('243', '75', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('244', '76', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('245', '76', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('246', '76', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('247', '77', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('248', '77', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('249', '77', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('250', '78', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('251', '78', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('252', '78', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('253', '79', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('254', '79', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('255', '79', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('256', '80', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('257', '80', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('258', '80', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('259', '81', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('260', '81', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('261', '81', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('262', '82', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('263', '82', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('264', '82', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('265', '83', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('266', '83', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('267', '83', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('268', '84', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('269', '84', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('270', '84', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('271', '85', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('272', '85', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('273', '85', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('274', '86', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('275', '86', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('276', '86', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('277', '87', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('278', '87', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('279', '87', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('280', '88', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('281', '88', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('282', '88', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('283', '89', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('284', '89', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('285', '89', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('286', '90', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('287', '90', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('288', '90', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('289', '91', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('290', '91', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('291', '91', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('292', '92', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('293', '92', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('294', '92', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('295', '93', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('296', '93', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('297', '93', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('298', '94', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('299', '94', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('300', '94', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('301', '95', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('302', '95', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('303', '95', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('304', '96', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('305', '96', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('306', '96', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('307', '97', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('308', '97', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('309', '97', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('310', '98', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('311', '98', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('312', '98', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('313', '99', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('314', '99', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('315', '99', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('316', '100', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('317', '100', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('318', '100', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('319', '101', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('320', '101', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('321', '101', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('322', '102', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('323', '102', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('324', '102', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('325', '103', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('326', '103', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('327', '103', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('328', '104', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('329', '104', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('330', '104', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('331', '105', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('332', '105', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('333', '105', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('334', '106', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('335', '106', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('336', '106', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('337', '107', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('338', '107', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('339', '107', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('340', '108', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('341', '108', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('342', '108', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('343', '109', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('344', '109', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('345', '109', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('346', '110', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('347', '110', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('348', '110', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('349', '111', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('350', '111', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('351', '111', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('352', '112', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('353', '112', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('354', '112', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('355', '113', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('356', '113', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('357', '113', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('358', '114', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('359', '114', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('360', '114', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('361', '115', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('362', '115', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('363', '115', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('364', '116', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('365', '116', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('366', '116', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('367', '117', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('368', '117', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('369', '117', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('370', '118', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('371', '118', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('372', '118', 'Picture/tupian (67).jpg');
INSERT INTO `pcn_theme_image` VALUES ('373', '119', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('374', '119', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('375', '119', 'Picture/tupian (68).jpg');
INSERT INTO `pcn_theme_image` VALUES ('376', '120', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('377', '120', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('378', '120', 'Picture/tupian (69).jpg');
INSERT INTO `pcn_theme_image` VALUES ('379', '121', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('380', '121', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('381', '121', 'Picture/tupian (70).jpg');
INSERT INTO `pcn_theme_image` VALUES ('382', '122', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('383', '122', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('384', '122', 'Picture/tupian (71).jpg');
INSERT INTO `pcn_theme_image` VALUES ('385', '123', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('386', '123', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('387', '123', 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES ('388', '124', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('389', '124', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('390', '124', 'Picture/tupian (64).jpg');
INSERT INTO `pcn_theme_image` VALUES ('391', '125', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('392', '125', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('393', '125', 'Picture/tupian (65).jpg');
INSERT INTO `pcn_theme_image` VALUES ('394', '126', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('395', '126', 'Picture/tupian (66).jpg');
INSERT INTO `pcn_theme_image` VALUES ('396', '126', 'Picture/tupian (66).jpg');

-- ----------------------------
-- Table structure for pcn_traffic_route
-- ----------------------------
DROP TABLE IF EXISTS `pcn_traffic_route`;
CREATE TABLE `pcn_traffic_route` (
  `pcntr_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '交通路线ID',
  `pcntr_pctid` int(11) DEFAULT NULL COMMENT '亲子主题ID',
  `pcntr_content` varchar(500) DEFAULT NULL COMMENT '交通路线内容',
  `pcntr_imgurl` varchar(100) DEFAULT NULL COMMENT '交通路线图片路径',
  PRIMARY KEY (`pcntr_id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pcn_traffic_route
-- ----------------------------
INSERT INTO `pcn_traffic_route` VALUES ('1', '1', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('2', '2', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('3', '3', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('4', '4', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('5', '5', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('6', '6', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('7', '7', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('8', '8', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('9', '9', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('10', '10', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('11', '11', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('12', '12', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('13', '13', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('14', '14', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('15', '15', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('16', '16', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('17', '17', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('18', '18', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('19', '19', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('20', '20', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('21', '21', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('22', '22', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('23', '23', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('24', '24', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('25', '25', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('26', '26', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('27', '27', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('28', '28', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('29', '29', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('30', '30', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('31', '31', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('32', '32', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('33', '33', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('34', '34', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('35', '35', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('36', '36', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('37', '37', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('38', '38', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('39', '39', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('40', '40', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('41', '41', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('42', '42', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('43', '43', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('44', '44', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('45', '45', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('46', '46', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('47', '47', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('48', '48', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('49', '49', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('50', '50', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('51', '51', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('52', '52', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('53', '53', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('54', '54', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('55', '55', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('56', '56', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('57', '57', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('58', '58', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('59', '59', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('60', '60', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('61', '61', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('62', '62', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('63', '63', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('64', '64', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('65', '65', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('66', '66', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('67', '67', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('68', '68', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('69', '69', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('70', '70', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('71', '71', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('72', '72', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('73', '73', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('74', '74', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('75', '75', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('76', '76', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('77', '77', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('78', '78', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('79', '79', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('80', '80', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('81', '81', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('82', '82', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('83', '83', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('84', '84', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('85', '85', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('86', '86', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('87', '87', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('88', '88', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('89', '89', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('90', '90', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('91', '91', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('92', '92', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('93', '93', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('94', '94', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('95', '95', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('96', '96', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('97', '97', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('98', '98', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('99', '99', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('100', '100', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('101', '101', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('102', '102', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('103', '103', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('104', '104', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('105', '105', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('106', '106', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('107', '107', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('108', '108', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('109', '109', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('110', '110', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('111', '111', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('112', '112', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('113', '113', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('114', '114', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('115', '115', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('116', '116', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('117', '117', '人生就像不停在用的铅笔，开始很尖，但慢慢地就磨得圆滑了。不过，太过圆滑了也不好，那就意味着差不多该挨削了。所以幸福是修来的，不是求来的。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('118', '118', '人生的路那是要靠自己去行走，做一个温暖的人。很多人事的变迁，虽然你无法左右，只能随缘。但你要知道人活着，就挺好，别一辈子都跟自己较劲，我们不知道，生命中剩下的光阴还有多少。平平淡淡的活着就是宇宙间最大的幸福。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('119', '119', '世上的任何事情都是多面的，总有一些不如意的事，风雨之后还会有彩虹。人都是会改变的，有些人选择改变环境，有些人选择被环境改变。很多时候你无法改变的时候，我们只好选择，在里面找到让自己快乐的力量。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('120', '120', '带奋斗一起飞翔，因为有了它，让我拥有理智之思;我才使过去的失误不再重演到今天的影片里;我才能使过去的成功在人生中继续升华;我才能真正收获金秋丰硕的果实，品味人生的快乐。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('121', '121', '地球上有77亿人，204个国家，809个岛屿。两个人遇见概率是2920万之ー，幸运如我，在最好的时光，刚好遇见了你!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('122', '122', '生活已经这么的闹心，为何不自找开心:伤心一点不好受，所以别哭泣;烦心一点不好过，所以别压抑。怎样活着是一道难题，开心快乐要靠自己;怎样经历没人能帮你，是难是易要靠自己!', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('123', '123', '总有一些时光，要在过去后，才会发现它已深深刻在记忆中。多年后，某个灯下的晚上，暮然想起，会静静微笑。那些人，已在时光的河流中乘舟而去，消失了踪迹，心中，却流淌着跨越了时光河的温暖，永不消逝。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('124', '124', '要学会调整情绪，凡事尽量往好的方面想。很多人遇到一些难以解决的事情时，就会很多抱怨，很烦躁，结果因为把握不好情绪，往往将简单的事情复杂化，复杂的事情变得更难。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('125', '125', '人生不会太圆满，我们要摆正心态面对酸甜苦辣。人生是一场醒悟，不要昨天，不要明天，只要今天。活在当下，放眼未来。人生是一种态度，心静自然天地宽。不一样的你我，不一样的心态，不一样的人生。', 'Picture/hd-n_07.jpg');
INSERT INTO `pcn_traffic_route` VALUES ('126', '126', '人生也许不尽完美，正因为不完美，我们才需要不断地努力创造努力奋斗。时间就是生命，所以我们必须珍惜宝贵的生命，执着地守候生命中每一个必经的十字路口。', 'Picture/hd-n_07.jpg');

-- ----------------------------
-- Table structure for pcn_type
-- ----------------------------
DROP TABLE IF EXISTS `pcn_type`;
CREATE TABLE `pcn_type` (
  `pcntp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '类型id',
  `pcntp_name` varchar(255) NOT NULL COMMENT '类型名称',
  PRIMARY KEY (`pcntp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of pcn_type
-- ----------------------------
INSERT INTO `pcn_type` VALUES ('1', '亲子活动');
INSERT INTO `pcn_type` VALUES ('2', '亲子旅游');
INSERT INTO `pcn_type` VALUES ('3', '票务');

-- ----------------------------
-- Table structure for pcn_user
-- ----------------------------
DROP TABLE IF EXISTS `pcn_user`;
CREATE TABLE `pcn_user` (
  `pcnu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID（主键）',
  `pcnu_name` varchar(10) NOT NULL COMMENT '用户名',
  `pcnu_password` varchar(20) NOT NULL COMMENT '密码',
  `pcnu_email` varchar(20) NOT NULL COMMENT '邮箱',
  `pcnu_number` varchar(20) NOT NULL COMMENT '手机号码',
  `pcnu_site` varchar(50) NOT NULL COMMENT '地址',
  `QQ` varchar(20) NOT NULL COMMENT 'QQ',
  `bbsex` int(11) NOT NULL COMMENT '宝宝性别 1.男 2.女',
  `bbname` varchar(20) NOT NULL COMMENT '宝宝姓名',
  PRIMARY KEY (`pcnu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pcn_user
-- ----------------------------
INSERT INTO `pcn_user` VALUES ('1', '用户1', '1', '134567@qq.com', '13543434624', '湖南', '113471264', '1', '宝宝1');
INSERT INTO `pcn_user` VALUES ('2', '用户2', '13', '123@qq.com', '123456789101', '北京', '113471264', '2', '宝宝2');
INSERT INTO `pcn_user` VALUES ('3', '用户3', '13', '123@qq.com', '123456789101', '湖南', '113471264', '1', '宝宝3');
INSERT INTO `pcn_user` VALUES ('4', '用户4', '14', '123@qq.com', '123456789101', '湖北', '113471264', '2', '宝宝4');
INSERT INTO `pcn_user` VALUES ('5', '用户5', '15', '123@qq.com', '123456789101', '湖南', '113471264', '1', '宝宝5');
INSERT INTO `pcn_user` VALUES ('6', '用户6', '16', '123@qq.com', '123456789101', '广东', '113471264', '1', '宝宝6');
INSERT INTO `pcn_user` VALUES ('7', '用户7', '17', '123@qq.com', '123456789101', '湖南', '113471264', '2', '宝宝7');
INSERT INTO `pcn_user` VALUES ('8', '用户8', '18', '123@qq.com', '123456789101', '广西', '113471264', '1', '宝宝8');
INSERT INTO `pcn_user` VALUES ('9', '用户9', '19', '123@qq.com', '123456789101', '湖南', '113471264', '2', '宝宝9');
INSERT INTO `pcn_user` VALUES ('10', '55', '10', '123@qq.com', '123456789101', '湖南', '113471264', '2', '宝宝10');
INSERT INTO `pcn_user` VALUES ('11', '陈辉', 'as123', '9227@163.com', '111111111111', '五一广场', '1236547', '2', '杨斌');
INSERT INTO `pcn_user` VALUES ('12', '陈辉', 'as123', '9227@163.com', '111111111111', '五一广场', '1236547', '2', '杨斌');
INSERT INTO `pcn_user` VALUES ('13', '陈辉', 'as123', '9227@163.com', '111111111111', '五一广场', '1236547', '2', '杨斌');
INSERT INTO `pcn_user` VALUES ('14', 'sb123', '123456', '992007@qq.com', '18173483391', '河南省', '9920071', '1', '杨斌');
INSERT INTO `pcn_user` VALUES ('15', 'sb123s', '111111', '992007@qq.com', '18173483391', '河南省', '9920071', '1', '杨斌');
INSERT INTO `pcn_user` VALUES ('16', 'yhhhhh5555', 'yhhhhh5555', '8240@qq.com', '15211105357', '湖南省', '862456', '1', 'gaahahah');
INSERT INTO `pcn_user` VALUES ('17', 'sb123', '123456', '9920071@qq.com', '13511001555', '海南省', '862456', '1', 'gaahahah');
INSERT INTO `pcn_user` VALUES ('18', 'asd123', '123456', '9920071@qq.com', '13573483397', '湖南省', '862456', '1', 'gaahahah');
INSERT INTO `pcn_user` VALUES ('19', 'asd123', '123456', '9920071@qq.com', '13573483397', '湖南省', '862456', '1', 'gaahahah');
INSERT INTO `pcn_user` VALUES ('20', 'asd123', '123456', '9920071@qq.com', '13573483397', '湖南省', '862456', '1', 'gaahahah');

-- ----------------------------
-- Procedure structure for test
-- ----------------------------
DROP PROCEDURE IF EXISTS `test`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test`()
BEGIN
 DECLARE a INT DEFAULT 73;
 WHILE a  <= 126 DO
INSERT INTO `pcn_theme_image` VALUES (null, a, 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES (null, a, 'Picture/tupian (72).jpg');
INSERT INTO `pcn_theme_image` VALUES (null, a, 'Picture/tupian (72).jpg');
 SET  a = a + 1; 
 END WHILE;
 end
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for test_insert
-- ----------------------------
DROP PROCEDURE IF EXISTS `test_insert`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `test_insert`()
BEGIN 
DECLARE a INT DEFAULT 1; 
DECLARE b INT DEFAULT 1; 
WHILE (a <= 29) DO 
	if b<4 then
			insert into pcn_goods_spu_spec(pcngss_pctid,pcngss_gsid) values(a,b);
			set b=b+1;
	elseif b>=4 then
			insert into pcn_goods_spu_spec(pcngss_pctid,pcngss_gsid) values(a,null);
		SET a = a + 1;  
		SET b =1; 
	end if;
END WHILE; 
commit; 
END
;;
DELIMITER ;

-- ----------------------------
-- Procedure structure for tinsert
-- ----------------------------
DROP PROCEDURE IF EXISTS `tinsert`;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `tinsert`()
BEGIN 
DECLARE a INT DEFAULT 8; 
WHILE (a <= 29) DO 
-- repeat 
insert into pcn_goods_spu_spec(pcngss_pctid) values(a); 

SET a = a + 1; 
-- select a; 



END WHILE; 
commit; 
END
;;
DELIMITER ;
