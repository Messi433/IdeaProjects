/*
 Navicat MySQL Data Transfer

 Source Server         : MySql57
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : shopping

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 02/04/2018 20:57:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(10) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `city` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `number` int(10) DEFAULT NULL,
  `picture` varbinary(500) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'messi', 'barca', '50000', '1', NULL);
INSERT INTO `user` VALUES ('2', 'ronado', 'madrid', '40000', '1', NULL);
INSERT INTO `user` VALUES ('3', 'neymar', 'paris', '22000', '1', NULL);
INSERT INTO `user` VALUES ('4', '武磊', 'shanghai', '2000', '1', NULL);

SET FOREIGN_KEY_CHECKS = 1;
