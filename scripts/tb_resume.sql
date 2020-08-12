/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80019
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 80019
File Encoding         : 65001

Date: 2020-08-13 00:48:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_resume
-- ----------------------------
DROP TABLE IF EXISTS `tb_resume`;
CREATE TABLE `tb_resume` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(30) DEFAULT NULL,
  `mobile` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of tb_resume
-- ----------------------------
INSERT INTO `tb_resume` VALUES ('1', '张三', '133333333');
INSERT INTO `tb_resume` VALUES ('2', '李四', '155555556');
INSERT INTO `tb_resume` VALUES ('3', '旺旺', '134444444');
