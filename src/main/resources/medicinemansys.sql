/*
Navicat MySQL Data Transfer

Source Server         : magegbi
Source Server Version : 50634
Source Host           : localhost:3306
Source Database       : medicinemansys

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2016-12-27 11:22:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_identity
-- ----------------------------
DROP TABLE IF EXISTS `t_identity`;
CREATE TABLE `t_identity` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `identityName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_identity
-- ----------------------------
INSERT INTO `t_identity` VALUES ('1', '系统管理员');
INSERT INTO `t_identity` VALUES ('2', '普通管理员');

-- ----------------------------
-- Table structure for t_inorder
-- ----------------------------
DROP TABLE IF EXISTS `t_inorder`;
CREATE TABLE `t_inorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cName` varchar(20) DEFAULT NULL,
  `eName` varchar(20) DEFAULT NULL,
  `nums` int(11) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_inorder
-- ----------------------------
INSERT INTO `t_inorder` VALUES ('1', '新康泰克氨麻美敏片', 'new Kangtaike', '20', '12', '2016-05-01 08:51:43', '1', '1');
INSERT INTO `t_inorder` VALUES ('2', '阿司匹林', 'aspirin ', '5', '6', '2016-05-01 08:52:26', '1', '1');
INSERT INTO `t_inorder` VALUES ('3', '扑热息痛', 'Paracetamol', '2', '8.5', '2016-05-01 08:58:48', '1', '2');
INSERT INTO `t_inorder` VALUES ('4', '新康泰克氨麻美敏片', 'new Kangtaike', '11', '12', '2016-11-20 20:06:34', '2', '1');
INSERT INTO `t_inorder` VALUES ('5', '新康泰克氨麻美敏片', 'new Kangtaike', '32', '12', '2016-11-20 20:26:02', '2', '1');
INSERT INTO `t_inorder` VALUES ('6', '阿莫西林', ' amoxiclin', '11', '22', '2016-11-20 20:26:25', '2', '1');
INSERT INTO `t_inorder` VALUES ('7', '999感冒灵颗粒', 'SJGML999', '10', '12', '2016-12-18 08:14:18', '1', '2');
INSERT INTO `t_inorder` VALUES ('8', '蒲地蓝消炎片', 'pudilanxiaoyanpian', '9', '6.5', '2016-12-18 08:15:15', '1', '2');
INSERT INTO `t_inorder` VALUES ('9', '达仁堂清肺消炎丸', 'qingfeixaoyanwan', '10', '120', '2016-12-18 08:19:10', '1', '2');
INSERT INTO `t_inorder` VALUES ('10', '云南白药气雾剂', 'YunnanBaiiyaoqiwuji', '10', '34.5', '2016-12-18 08:24:42', '2', '2');
INSERT INTO `t_inorder` VALUES ('11', '999感冒灵颗粒', 'SJGML999', '10', '12', '2016-12-18 09:46:49', '1', '2');
INSERT INTO `t_inorder` VALUES ('12', '999感冒灵颗粒', 'SJGML999', '100', '12', '2016-12-22 12:07:55', '1', '2');
INSERT INTO `t_inorder` VALUES ('13', '999感冒灵颗粒', 'SJGML999', '2', '12', '2016-12-22 16:02:38', '1', '2');
INSERT INTO `t_inorder` VALUES ('14', '999感冒灵颗粒', 'SJGML999', '3', '12', '2016-12-22 16:14:04', '1', '2');
INSERT INTO `t_inorder` VALUES ('15', '999感冒灵颗粒', 'SJGML999', '13', '12', '2016-12-22 18:34:02', '2', '1');
INSERT INTO `t_inorder` VALUES ('16', '999感冒灵颗粒', 'SJGML999', '3', '12', '2016-12-22 18:34:12', '2', '1');
INSERT INTO `t_inorder` VALUES ('17', '999感冒灵颗粒', 'SJGML999', '7', '12', '2016-12-22 18:34:33', '2', '2');
INSERT INTO `t_inorder` VALUES ('18', '达仁堂清肺消炎丸', 'qingfeixaoyanwan', '2', '12', '2016-12-22 18:35:19', '2', '1');
INSERT INTO `t_inorder` VALUES ('19', '白云山板蓝根颗粒', 'baiyunsanbanlangen', '55', '12', '2016-12-22 18:35:54', '2', '1');
INSERT INTO `t_inorder` VALUES ('20', '感康复方氨酚烷胺片', 'gankang', '3', '12', '2016-12-22 18:36:09', '2', '1');

-- ----------------------------
-- Table structure for t_medicine
-- ----------------------------
DROP TABLE IF EXISTS `t_medicine`;
CREATE TABLE `t_medicine` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cName` varchar(20) DEFAULT NULL,
  `eName` varchar(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `nums` int(11) DEFAULT NULL,
  `manufacturer` varchar(30) DEFAULT NULL,
  `describle` varchar(100) DEFAULT NULL,
  `productDate` date DEFAULT NULL,
  `safeDate` varchar(20) DEFAULT NULL,
  `standard` varchar(50) DEFAULT NULL,
  `typeId` int(11) DEFAULT NULL,
  `oldPrice` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_medicine
-- ----------------------------
INSERT INTO `t_medicine` VALUES ('1', '999感冒灵颗粒', 'SJGML999', '13', '210', '华润三九医药', '本品解热镇痛。用于感冒引起的头痛，发热等', '2015-11-26', '24个月', '10g*9包 袋装10克（含对乙酰氨基酚0.2克）', '1', '12.1');
INSERT INTO `t_medicine` VALUES ('2', '蒲地蓝消炎片', 'pudilanxiaoyanpian', '6.5', '48', '天津中天制药有限公司', ' 清热解毒，抗炎消肿。用于疖肿、咽炎、', '2016-11-25', '24个月', '0.3g*48片', '2', '5.4');
INSERT INTO `t_medicine` VALUES ('3', '云南白药气雾剂', 'YunnanBaiiyaoqiwuji', '34.5', '28', '云南白药集团', '云南白药气雾剂，活血散瘀，消肿止痛。', '2016-11-30', '36个月', '云南白药气雾剂每瓶重50克.', '3', '33.2');
INSERT INTO `t_medicine` VALUES ('4', '白云山消炎镇痛膏', 'xiaoyanzhentonggao', '15', '120', '广州白云山制药股份有限公司', '用于神经痛，风湿痛，肩痛，扭伤，关节痛', '2016-01-04', '24个月', '10贴/盒, 贴患处。一日1～2次', '3', '13.3');
INSERT INTO `t_medicine` VALUES ('5', '感康复方氨酚烷胺片', 'gankang', '16', '22', '吴太感康药业有限公司', '解除或改善感冒所引起的各种症状', '2016-01-20', '36个月', '每片含对乙酰氨基酚250毫克,人工牛黄10毫克', '1', '14.5');
INSERT INTO `t_medicine` VALUES ('6', '白云山板蓝根颗粒', 'baiyunsanbanlangen', '16', '99', '广州白云山和记黄埔中药', '清热解毒，凉血利咽。用于咽喉肿痛', '2016-01-16', '24个月', '每袋装3g;每袋装5g;每袋装10g', '1', '14.4');
INSERT INTO `t_medicine` VALUES ('7', '万通 感通片', 'wantonggantong', '11', '20', '通化万通药业', '采用中西结合专治普通感冒与各种流感', '2016-01-17', '36个月', '片重0.32克（含对乙酰氨基酚125毫克、盐酸金刚烷胺50毫克）', '1', '14.6');
INSERT INTO `t_medicine` VALUES ('8', '葵花 小儿感冒颗粒', 'XiaoerGanmaoKeli', '13', '60', '葵花药业', '用于小儿风热感冒发热', '2016-01-07', '36个月', '每袋装6克', '1', '9.3');
INSERT INTO `t_medicine` VALUES ('9', ' 咳露口服液', 'kelukoufuye', '35', '32', '陕西步长制药', '咳露口服液，清热，宣肺，平喘，化痰止咳', '2016-01-17', '18个月', '咳露口服液，清热，宣肺，平喘，化痰止咳', '1', '33.2');
INSERT INTO `t_medicine` VALUES ('10', '达仁堂清肺消炎丸', 'qingfeixaoyanwan', '120', '33', '达仁堂制药', '清肺化痰，止咳平喘。用于痰热阻肺，咳嗽', '2016-01-17', '24个月', '8g*6袋', '1', '33.2');
INSERT INTO `t_medicine` VALUES ('11', '123', '12', '12', '12', '12', '12', '2016-01-17', '12', '12', '1', '10.2');
INSERT INTO `t_medicine` VALUES ('13', '12', '12', '12', '12', '21', '1212', '2016-01-15', '12', '121', '2', '11.1');
INSERT INTO `t_medicine` VALUES ('14', '21', '2', '16', '23', '21', '2111', '2016-01-05', '24个月', '2', '2', '14.3');
INSERT INTO `t_medicine` VALUES ('15', '1', '12', '21', '120', '12', '12', '2016-01-13', '12', '1212', '2', '20.4');
INSERT INTO `t_medicine` VALUES ('16', '123', '123', '18', '123', '213', '123', '2016-01-15', '123', '123', '1', '17.2');

-- ----------------------------
-- Table structure for t_orderstatus
-- ----------------------------
DROP TABLE IF EXISTS `t_orderstatus`;
CREATE TABLE `t_orderstatus` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `statusName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_orderstatus
-- ----------------------------
INSERT INTO `t_orderstatus` VALUES ('1', '未批准');
INSERT INTO `t_orderstatus` VALUES ('2', '已批准');

-- ----------------------------
-- Table structure for t_sellorder
-- ----------------------------
DROP TABLE IF EXISTS `t_sellorder`;
CREATE TABLE `t_sellorder` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cName` varchar(40) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `buyNums` int(11) DEFAULT NULL,
  `totalMoney` double DEFAULT NULL,
  `createDate` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `userId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_sellorder
-- ----------------------------
INSERT INTO `t_sellorder` VALUES ('4', '新康泰克氨麻美敏片', '12', '1', '12', '2016-11-20 20:24:02', '2', '2');
INSERT INTO `t_sellorder` VALUES ('6', '阿司匹林', '6', '1', '6', '2016-11-21 07:55:45', '2', '2');
INSERT INTO `t_sellorder` VALUES ('7', '新康泰克氨麻美敏片', '12', '1', '12', '2016-11-21 09:22:05', '2', '2');
INSERT INTO `t_sellorder` VALUES ('8', '999感冒灵颗粒', '12', '2', '24', '2016-12-17 23:00:47', '1', '1');
INSERT INTO `t_sellorder` VALUES ('9', '白云山板蓝根颗粒', '16', '1', '16', '2016-12-17 23:01:14', '1', '1');
INSERT INTO `t_sellorder` VALUES ('10', '感康复方氨酚烷胺片', '16', '1', '16', '2016-12-17 23:01:57', '1', '1');
INSERT INTO `t_sellorder` VALUES ('11', ' 咳露口服液', '35', '1', '35', '2016-12-18 08:17:03', '2', '1');
INSERT INTO `t_sellorder` VALUES ('12', '白云山板蓝根颗粒', '16', '1', '16', '2016-12-18 08:21:38', '2', '3');
INSERT INTO `t_sellorder` VALUES ('13', '万通 感通片', '11', '1', '11', '2016-12-18 08:22:14', '2', '3');
INSERT INTO `t_sellorder` VALUES ('14', '万通 感通片', '11', '1', '11', '2016-12-18 08:22:29', '2', '3');
INSERT INTO `t_sellorder` VALUES ('15', '999感冒灵颗粒', '12', '1', '12', '2016-12-18 09:45:31', '1', '1');
INSERT INTO `t_sellorder` VALUES ('16', '云南白药气雾剂', '34.5', '1', '34.5', '2016-12-18 09:45:36', '1', '1');
INSERT INTO `t_sellorder` VALUES ('17', '999感冒灵颗粒', '12', '2', '24', '2016-12-22 12:08:12', '2', '1');
INSERT INTO `t_sellorder` VALUES ('18', '云南白药气雾剂', '34.5', '12', '414', '2016-12-22 12:10:21', '2', '1');
INSERT INTO `t_sellorder` VALUES ('19', '云南白药气雾剂', '34.5', '2', '69', '2016-12-22 18:07:57', '1', '2');
INSERT INTO `t_sellorder` VALUES ('20', '云南白药气雾剂', '34.5', '3', '103.5', '2016-12-23 09:58:34', '1', '1');
INSERT INTO `t_sellorder` VALUES ('21', '云南白药气雾剂', '34.5', '2', '69', '2016-12-23 09:58:55', '2', '1');

-- ----------------------------
-- Table structure for t_type
-- ----------------------------
DROP TABLE IF EXISTS `t_type`;
CREATE TABLE `t_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cTypeName` varchar(20) DEFAULT NULL,
  `eTypeName` varchar(20) DEFAULT NULL,
  `typeDesc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_type
-- ----------------------------
INSERT INTO `t_type` VALUES ('1', '感冒药', 'patulin', '主要用于治疗各种感冒以及感冒引起的症状');
INSERT INTO `t_type` VALUES ('2', '消炎药', 'NSAIDS', '主要是防止发炎的作用');
INSERT INTO `t_type` VALUES ('3', '止痛药', 'paregoric', '用于减轻身体因疾病所导致的疼痛');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL,
  `passWord` varchar(20) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `trueName` varchar(20) DEFAULT NULL,
  `sex` varchar(5) DEFAULT NULL,
  `IDCard` varchar(20) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `idenId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '1234', '1373848398@qq.com', '系统管理员', '男', '41212312120123', '123456', '辽宁省大连市软件园路8号', '1');
INSERT INTO `t_user` VALUES ('2', 'lipan', '1234', '1234567891@qq.com', 'lipan', '男', '421123121201232', '1234567', '辽宁省大连市软件园路8号', '2');
INSERT INTO `t_user` VALUES ('3', 'zhangsan', '1234', '1234567891@qq.com', '张三', '男', '42112312120123', '1234567', '辽宁省大连市软件园路8号', '2');
INSERT INTO `t_user` VALUES ('4', 'lisi', '1234', '1234567891@qq.com', '李四', '男', '42112312120123', '1234567', '辽宁省大连市软件园路8号', '2');
INSERT INTO `t_user` VALUES ('5', 'wangwu', '1234', '1234567891@qq.com', '王五', '男', '42112312120123', '1234567', '辽宁省大连市软件园路8号', '2');
INSERT INTO `t_user` VALUES ('7', 'zhaoliu', '1234', '1234567@qq.com', '赵六', '男', '421123199101011234', '1234567', '辽宁省大连市软件园路8号', '2');
