/*
 Navicat MySQL Data Transfer

 Source Server         : climber
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : book

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 15/04/2022 01:39:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for book_detail
-- ----------------------------
DROP TABLE IF EXISTS `book_detail`;
CREATE TABLE `book_detail`  (
  `id` int(0) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '图书编号',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '书名',
  `author` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '作者',
  `press` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '出版社',
  `inventory` int(0) UNSIGNED NOT NULL COMMENT '库存',
  `pub_time` datetime(0) NOT NULL COMMENT '出版时间',
  `price` decimal(6, 2) NOT NULL COMMENT '单价',
  `is_available` tinyint(0) UNSIGNED NOT NULL DEFAULT 1 COMMENT '是否可借阅',
  `is_borrowed` tinyint(0) UNSIGNED NOT NULL DEFAULT 0 COMMENT '是否被借阅',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of book_detail
-- ----------------------------
INSERT INTO `book_detail` VALUES (8, '西游记', '吴承恩', '浙江大学出版社', 4, '2022-04-14 23:12:55', 0.50, 1, 0);

SET FOREIGN_KEY_CHECKS = 1;
