/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80012
Source Host           : localhost:3306
Source Database       : food_consumption_manager

Target Server Type    : MYSQL
Target Server Version : 80012
File Encoding         : 65001

Date: 2020-07-10 18:26:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for canteen
-- ----------------------------
DROP TABLE IF EXISTS `canteen`;
CREATE TABLE `canteen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `daySales` varchar(255) DEFAULT NULL,
  `workerNumber` varchar(10) DEFAULT NULL,
  `info` varchar(255) DEFAULT NULL,
  `openTime` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of canteen
-- ----------------------------
INSERT INTO `canteen` VALUES ('1', '一食堂', '50000', '40', '西华大学一食堂，位于西华大学中心位置', '早上6点-晚上9点');
INSERT INTO `canteen` VALUES ('2', '二食堂', '48000', '39', '西华大学二食堂，位于西华大学中心位置', '早上6点-晚上9点');
INSERT INTO `canteen` VALUES ('3', '三食堂', '80000', '50', '西华大学三食堂，位于西华大学中心位置', '早上6点-晚上9点');
INSERT INTO `canteen` VALUES ('4', '四食堂', '48000', '35', '西华大学四食堂，位于西华大学中心位置', '早上6点-晚上9点');

-- ----------------------------
-- Table structure for food
-- ----------------------------
DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `pay` varchar(255) DEFAULT NULL,
  `canteen` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of food
-- ----------------------------
INSERT INTO `food` VALUES ('1', '红烧茄子', '素菜类', '10', '一食堂');
INSERT INTO `food` VALUES ('2', '西红柿炒鸡蛋', '素菜类', '10', '一食堂');
INSERT INTO `food` VALUES ('3', '土豆丝', '素菜类', '8', '一食堂');
INSERT INTO `food` VALUES ('4', '手撕包菜', '素菜类', '8', '一食堂');
INSERT INTO `food` VALUES ('5', '素什锦', '素菜类', '8', '一食堂');
INSERT INTO `food` VALUES ('6', '红烧鱼', '荤菜类', '25', '二食堂');
INSERT INTO `food` VALUES ('7', '回锅肉', '荤菜类', '18', '二食堂');
INSERT INTO `food` VALUES ('8', '鱼香肉丝', '荤菜类', '18', '二食堂');
INSERT INTO `food` VALUES ('9', '辣子鸡', '荤菜类', '20', '二食堂');
INSERT INTO `food` VALUES ('10', '水煮肉片', '荤菜类', '20', '三食堂');
INSERT INTO `food` VALUES ('11', '紫菜蛋花汤', '汤类', '8', '三食堂');
INSERT INTO `food` VALUES ('12', '三鲜汤', '汤类', '8', '三食堂');
INSERT INTO `food` VALUES ('13', '黄瓜皮蛋汤', '汤类', '8', '四食堂');
INSERT INTO `food` VALUES ('14', '大骨汤', '汤类', '18', '四食堂');
INSERT INTO `food` VALUES ('16', '辣子鸡丁', '荤菜类', '25', '三食堂');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `isManager` int(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '123', '123', '1');
INSERT INTO `user` VALUES ('2', 'bryant', 'bryant', '0');
INSERT INTO `user` VALUES ('3', 'wangyu', '123', '0');
INSERT INTO `user` VALUES ('5', 'wang', '123', '1');
