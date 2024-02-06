/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50740
Source Host           : localhost:3306
Source Database       : solve_problem_record

Target Server Type    : MYSQL
Target Server Version : 50740
File Encoding         : 65001

Date: 2024-02-06 08:53:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for problem_record
-- ----------------------------
DROP TABLE IF EXISTS `problem_record`;
CREATE TABLE `problem_record` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `problem_category` varchar(100) NOT NULL DEFAULT '' COMMENT '问题分类',
  `problem_name` varchar(100) NOT NULL DEFAULT '' COMMENT '问题名称',
  `difficulty` varchar(30) NOT NULL DEFAULT '' COMMENT '难度 简单/中等/困难',
  `try_times` int(11) NOT NULL DEFAULT '0' COMMENT '尝试次数',
  `success_times` int(11) NOT NULL DEFAULT '0' COMMENT '成功次数',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `remark` varchar(255) DEFAULT '' COMMENT '备注',
  `importance` varchar(255) DEFAULT '' COMMENT '了解,理解,掌握',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=239 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of problem_record
-- ----------------------------
INSERT INTO `problem_record` VALUES ('34', 'leetcode', '1.两数之和', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('35', 'leetcode', '2.两数相加', '中等', '4', '4', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('36', 'leetcode', '3.无重复字符的最长子串', '中等', '5', '5', '2023-12-18 18:45:42', '2024-01-11 21:57:32', null, '掌握');
INSERT INTO `problem_record` VALUES ('37', 'leetcode', '5.最长回文子串', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('38', 'leetcode', '11.盛最多水的容器', '中等', '4', '4', '2023-12-18 18:45:42', '2023-12-24 03:15:17', null, '掌握');
INSERT INTO `problem_record` VALUES ('39', 'leetcode', '15.三数之和', '中等', '5', '4', '2023-12-18 18:45:42', '2023-12-24 03:21:10', null, '掌握');
INSERT INTO `problem_record` VALUES ('40', 'leetcode', '17.电话号码的字母组合', '中等', '4', '4', '2023-12-18 18:45:42', '2023-12-24 03:28:15', null, '掌握');
INSERT INTO `problem_record` VALUES ('41', 'leetcode', '19.删除链表的倒数第N个结点', '中等', '4', '4', '2023-12-18 18:45:42', '2023-12-24 03:31:17', null, '掌握');
INSERT INTO `problem_record` VALUES ('42', 'leetcode', '20.有效的括号', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 03:35:36', null, '掌握');
INSERT INTO `problem_record` VALUES ('43', 'leetcode', '21.合并两个有序链表', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 03:41:23', null, '掌握');
INSERT INTO `problem_record` VALUES ('44', 'leetcode', '22.括号生成', '中等', '5', '4', '2023-12-18 18:45:42', '2023-12-24 03:45:26', null, '掌握');
INSERT INTO `problem_record` VALUES ('45', 'leetcode', '31.下一个排列', '中等', '4', '2', '2023-12-18 18:45:42', '2023-12-24 03:50:14', null, '掌握');
INSERT INTO `problem_record` VALUES ('46', 'leetcode', '33.搜索旋转排序数组', '中等', '5', '4', '2023-12-18 18:45:42', '2023-12-24 03:59:08', null, '掌握');
INSERT INTO `problem_record` VALUES ('47', 'leetcode', '34.在排序数组中查找元素的第一个和最后一个位置', '中等', '4', '4', '2023-12-18 18:45:42', '2023-12-24 04:12:02', null, '掌握');
INSERT INTO `problem_record` VALUES ('48', 'leetcode', '35.搜索插入位置', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('49', 'leetcode', '39.组合总和', '中等', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('50', 'leetcode', '46.全排列', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('51', 'leetcode', '48.旋转图像', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('52', 'leetcode', '49.字母异位词分组', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('53', 'leetcode', '53.最大子数组和', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('54', 'leetcode', '55.跳跃游戏', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('55', 'leetcode', '56.合并区间', '中等', '2', '1', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('56', 'leetcode', '62.不同路径', '中等', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('57', 'leetcode', '64.最小路径和', '中等', '3', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('58', 'leetcode', '70.爬楼梯', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('59', 'leetcode', '72.编辑距离', '中等', '4', '1', '2023-12-18 18:45:42', '2024-01-11 21:57:51', null, '掌握');
INSERT INTO `problem_record` VALUES ('60', 'leetcode', '75.颜色分类', '中等', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('61', 'leetcode', '78.子集', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('62', 'leetcode', '79.单词搜索', '中等', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('63', 'leetcode', '94.二叉树的中序遍历', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 04:23:37', null, '掌握');
INSERT INTO `problem_record` VALUES ('64', 'leetcode', '96.不同的二叉搜索树', '中等', '4', '1', '2023-12-18 18:45:42', '2023-12-21 00:57:40', null, '掌握');
INSERT INTO `problem_record` VALUES ('65', 'leetcode', '98.验证二叉搜索树', '中等', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('66', 'leetcode', '101.对称二叉树', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 04:38:51', null, '掌握');
INSERT INTO `problem_record` VALUES ('67', 'leetcode', '102.二叉树的层序遍历', '中等', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('68', 'leetcode', '104.二叉树的最大深度', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 04:46:34', null, '掌握');
INSERT INTO `problem_record` VALUES ('69', 'leetcode', '105.从前序与中序遍历序列构造二叉树', '中等', '4', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('70', 'leetcode', '108.将有序数组转换为二叉搜索树', '简单', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('71', 'leetcode', '114.二叉树展开为链表', '中等', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('72', 'leetcode', '118.杨辉三角', '简单', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('73', 'leetcode', '121.买卖股票的最佳时机', '简单', '4', '4', '2023-12-18 18:45:42', '2024-01-20 22:27:39', null, '掌握');
INSERT INTO `problem_record` VALUES ('74', 'leetcode', '122.买卖股票的最佳时机II', '中等', '2', '1', '2023-12-18 18:45:42', '2024-01-02 22:03:02', null, '掌握');
INSERT INTO `problem_record` VALUES ('75', 'leetcode', '128.最长连续序列', '中等', '4', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('76', 'leetcode', '136.只出现一次的数字', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 05:28:42', null, '掌握');
INSERT INTO `problem_record` VALUES ('77', 'leetcode', '139.单词拆分', '中等', '3', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('78', 'leetcode', '141.环形链表', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 05:14:34', null, '掌握');
INSERT INTO `problem_record` VALUES ('79', 'leetcode', '142.环形链表II', '中等', '4', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('80', 'leetcode', '146.LRU缓存', '中等', '3', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('81', 'leetcode', '160.相交链表', '简单', '4', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('82', 'leetcode', '169.多数元素', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 05:38:10', null, '掌握');
INSERT INTO `problem_record` VALUES ('83', 'leetcode', '206.反转链表', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-24 05:52:00', null, '掌握');
INSERT INTO `problem_record` VALUES ('84', 'leetcode', '226.翻转二叉树', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('85', 'leetcode', '234.回文链表', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('86', 'leetcode', '283.移动零', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('87', 'leetcode', '338.比特位计数', '简单', '0', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('88', 'leetcode', '448.找到所有数组中消失的数字', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('89', 'leetcode', '461.汉明距离', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
INSERT INTO `problem_record` VALUES ('90', 'leetcode', '543.二叉树的直径', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-24 03:12:33', null, '掌握');
INSERT INTO `problem_record` VALUES ('91', 'leetcode', '617.合并二叉树', '简单', '2', '2', '2023-12-18 18:45:42', '2023-12-24 03:12:34', null, '掌握');
INSERT INTO `problem_record` VALUES ('92', 'jvm', '1.ParNew垃圾收集器', '简单', '1', '1', '2023-12-20 05:01:21', '2023-12-21 00:56:20', '', '了解');
INSERT INTO `problem_record` VALUES ('93', 'jvm', '2.CMS垃圾收集器', '中等', '1', '1', '2023-12-20 05:01:21', '2023-12-21 00:56:23', '', '掌握');
INSERT INTO `problem_record` VALUES ('94', 'jvm', '3.G1垃圾收集器', '困难', '1', '1', '2023-12-20 05:01:21', '2023-12-21 00:56:26', '还有很多细节没搞清楚,比如卡表,卡页,原始快照等概念', '理解');
INSERT INTO `problem_record` VALUES ('95', 'jvm', '11.JVM内存区域', '简单', '1', '1', '2023-12-20 05:01:21', '2023-12-21 00:57:05', '', '掌握');
INSERT INTO `problem_record` VALUES ('96', 'jvm', '12.四种引用', '简单', '1', '1', '2023-12-20 05:01:21', '2023-12-21 00:55:58', '', '理解');
INSERT INTO `problem_record` VALUES ('97', 'jvm', '15.垃圾回收算法', '中等', '1', '1', '2023-12-20 05:01:21', '2023-12-21 00:56:05', '', '掌握');
INSERT INTO `problem_record` VALUES ('98', 'jvm', '17.字符串常量池', '简单', '1', '1', '2023-12-20 05:01:21', '2023-12-21 00:56:08', '', '掌握');
INSERT INTO `problem_record` VALUES ('99', '设计模式', '1.简单工厂模式', '简单', '1', '1', '2023-12-20 05:05:46', '2023-12-21 00:55:30', '', '掌握');
INSERT INTO `problem_record` VALUES ('100', '设计模式', '2.策略模式', '简单', '1', '1', '2023-12-20 05:05:46', '2023-12-21 00:55:22', '', '掌握');
INSERT INTO `problem_record` VALUES ('101', '设计模式', '3.装饰模式', '简单', '1', '1', '2023-12-20 05:05:46', '2023-12-21 00:55:32', '', '掌握');
INSERT INTO `problem_record` VALUES ('104', '算法', '1.选择排序', '简单', '1', '1', '2023-12-20 05:07:33', '2023-12-21 00:55:32', '', '掌握');
INSERT INTO `problem_record` VALUES ('105', '算法', '2.冒泡排序', '简单', '1', '1', '2023-12-20 05:07:33', '2023-12-21 00:55:33', '', '掌握');
INSERT INTO `problem_record` VALUES ('106', '算法', '3.插入排序和希尔排序', '中等', '1', '1', '2023-12-20 05:07:33', '2023-12-21 00:55:34', '', '掌握');
INSERT INTO `problem_record` VALUES ('107', '算法', '4.归并排序', '简单', '2', '1', '2023-12-20 05:07:33', '2024-01-20 14:54:22', '', '掌握');
INSERT INTO `problem_record` VALUES ('108', '算法', '5.堆排序', '简单', '1', '1', '2023-12-20 05:07:33', '2023-12-21 00:55:35', '', '掌握');
INSERT INTO `problem_record` VALUES ('109', '算法', '6.快速排序', '简单', '1', '1', '2023-12-20 05:07:34', '2023-12-21 00:55:36', '', '掌握');
INSERT INTO `problem_record` VALUES ('110', '算法', '7.跳表', '简单', '1', '1', '2023-12-20 05:09:16', '2023-12-21 00:55:39', '', '掌握');
INSERT INTO `problem_record` VALUES ('111', 'redis', '1.SDS', '简单', '1', '1', '2023-12-20 05:09:37', '2024-01-26 00:32:05', '不需要复习', '了解');
INSERT INTO `problem_record` VALUES ('112', 'redis', '2.Redis字典实现原理', '中等', '1', '1', '2023-12-20 05:11:01', '2024-01-26 00:32:05', '不需要复习', '了解');
INSERT INTO `problem_record` VALUES ('115', 'leetcode', '152. 乘积最大子数组\r\n', '中等', '3', '1', '2023-12-20 23:01:36', '2024-01-14 02:06:34', '', '掌握');
INSERT INTO `problem_record` VALUES ('116', 'leetcode', '198. 打家劫舍\r\n', '中等', '2', '1', '2023-12-20 23:21:04', '2024-01-03 00:02:44', '', '掌握');
INSERT INTO `problem_record` VALUES ('117', 'jvm', '7.并发的可达性分析', '中等', '1', '1', '2023-12-20 23:21:12', '2023-12-21 01:15:53', '', '了解');
INSERT INTO `problem_record` VALUES ('118', 'jvm', '4.Java内存模型', '中等', '1', '1', '2023-12-21 00:52:44', '2023-12-21 00:53:40', '', '了解');
INSERT INTO `problem_record` VALUES ('119', 'jvm', '10.对象创建原理', '中等', '1', '1', '2023-12-21 01:10:36', '2023-12-21 01:10:36', '', '了解');
INSERT INTO `problem_record` VALUES ('120', 'jvm', '9 垃圾回收机制', '中等', '1', '1', '2023-12-21 02:26:16', '2023-12-24 03:09:12', '', '理解');
INSERT INTO `problem_record` VALUES ('122', 'leetcode', '148. 排序链表\r\n', '中等', '1', '1', '2023-12-24 05:20:42', '2023-12-24 05:21:13', '', '掌握');
INSERT INTO `problem_record` VALUES ('123', 'leetcode', '200. 岛屿数量', '中等', '2', '1', '2023-12-30 01:43:47', '2024-01-03 00:09:49', '', '掌握');
INSERT INTO `problem_record` VALUES ('124', 'leetcode', '207. 课程表\r\n', '中等', '2', '1', '2023-12-30 01:44:45', '2024-01-08 01:35:50', '', '掌握');
INSERT INTO `problem_record` VALUES ('125', 'leetcode', '208. 实现 Trie (前缀树)\r\n', '中等', '3', '2', '2023-12-30 01:45:23', '2024-01-11 21:54:32', '', '掌握');
INSERT INTO `problem_record` VALUES ('126', 'leetcode', '215. 数组中的第K个最大元素\r\n', '中等', '1', '1', '2023-12-30 01:45:35', '2024-01-08 01:35:50', '', '掌握');
INSERT INTO `problem_record` VALUES ('127', 'leetcode', '221. 最大正方形\r\n', '中等', '3', '2', '2023-12-30 01:45:55', '2024-01-11 21:57:51', '', '掌握');
INSERT INTO `problem_record` VALUES ('128', 'leetcode', '236. 二叉树的最近公共祖先\r\n', '中等', '3', '2', '2023-12-30 01:46:15', '2024-01-11 21:57:32', '', '掌握');
INSERT INTO `problem_record` VALUES ('129', 'leetcode', '240. 搜索二维矩阵 II\r\n', '中等', '2', '1', '2023-12-30 01:46:47', '2024-01-08 01:35:50', '', '掌握');
INSERT INTO `problem_record` VALUES ('130', 'leetcode', '238. 除自身以外数组的乘积\r\n', '中等', '3', '1', '2023-12-30 02:11:30', '2024-01-14 02:13:47', '', '掌握');
INSERT INTO `problem_record` VALUES ('131', 'leetcode', '347. 前 K 个高频元素\r\n', '中等', '3', '2', '2023-12-30 02:53:48', '2024-01-11 21:54:18', '', '掌握');
INSERT INTO `problem_record` VALUES ('132', 'leetcode', '279. 完全平方数\r\n', '中等', '1', '1', '2023-12-31 19:22:32', '2023-12-31 19:22:49', '', '掌握');
INSERT INTO `problem_record` VALUES ('134', 'leetcode', '287. 寻找重复数\r\n', '中等', '4', '1', '2023-12-31 20:07:40', '2024-01-20 00:56:22', '', '掌握');
INSERT INTO `problem_record` VALUES ('135', 'leetcode', '300. 最长递增子序列\r\n', '中等', '3', '2', '2023-12-31 23:58:31', '2024-01-11 21:54:32', '', '掌握');
INSERT INTO `problem_record` VALUES ('136', 'leetcode', '309. 买卖股票的最佳时机含冷冻期\r\n', '中等', '3', '2', '2024-01-01 23:24:39', '2024-01-11 21:54:32', '', '掌握');
INSERT INTO `problem_record` VALUES ('137', 'leetcode', '322. 零钱兑换\r\n', '中等', '2', '1', '2024-01-01 23:24:59', '2024-01-11 21:54:18', '', '掌握');
INSERT INTO `problem_record` VALUES ('138', 'leetcode', '394. 字符串解码\r\n', '中等', '3', '1', '2024-01-02 21:31:17', '2024-01-11 21:57:51', '', '掌握');
INSERT INTO `problem_record` VALUES ('139', 'leetcode', '399. 除法求值\r\n', '中等', '3', '1', '2024-01-02 21:31:34', '2024-01-14 02:47:53', '', '掌握');
INSERT INTO `problem_record` VALUES ('140', '设计模式', '4.代理模式', '简单', '1', '1', '2024-01-03 02:48:00', '2024-01-03 02:48:09', '', '掌握');
INSERT INTO `problem_record` VALUES ('142', 'leetcode', '406. 根据身高重建队列\r\n', '中等', '2', '1', '2024-01-04 00:21:18', '2024-01-08 01:49:06', '', '掌握');
INSERT INTO `problem_record` VALUES ('143', 'leetcode', '416. 分割等和子集\r\n', '中等', '3', '1', '2024-01-04 00:21:20', '2024-01-14 03:02:30', '', '掌握');
INSERT INTO `problem_record` VALUES ('144', 'leetcode', '337. 打家劫舍 III', '中等', '1', '1', '2024-01-11 21:57:02', '2024-01-11 21:57:09', '', '掌握');
INSERT INTO `problem_record` VALUES ('145', 'leetcode', '437. 路径总和 III', '中等', '1', '1', '2024-01-11 21:59:09', '2024-01-11 21:59:20', '', '掌握');
INSERT INTO `problem_record` VALUES ('146', 'leetcode', '494. 目标和', '中等', '2', '1', '2024-01-11 22:02:20', '2024-01-14 13:37:55', '', '掌握');
INSERT INTO `problem_record` VALUES ('147', 'leetcode', '538. 把二叉搜索树转换为累加树', '中等', '2', '1', '2024-01-11 22:02:41', '2024-01-14 13:40:59', '', '掌握');
INSERT INTO `problem_record` VALUES ('148', 'leetcode', '560. 和为 K 的子数组', '中等', '4', '1', '2024-01-11 22:02:48', '2024-01-20 01:03:40', '', '掌握');
INSERT INTO `problem_record` VALUES ('149', 'leetcode', '581. 最短无序连续子数组', '中等', '2', '1', '2024-01-11 22:02:48', '2024-01-14 14:06:52', '', '掌握');
INSERT INTO `problem_record` VALUES ('150', 'leetcode', '621. 任务调度器', '中等', '2', '1', '2024-01-11 22:03:17', '2024-01-14 14:12:39', '', '掌握');
INSERT INTO `problem_record` VALUES ('151', 'leetcode', '647. 回文子串', '中等', '2', '0', '2024-01-11 22:03:42', '2024-01-20 01:27:15', '', '掌握');
INSERT INTO `problem_record` VALUES ('152', 'leetcode', '739. 每日温度', '中等', '2', '1', '2024-01-11 22:03:53', '2024-01-20 01:34:56', '', '掌握');
INSERT INTO `problem_record` VALUES ('153', 'leetcode', '42. 接雨水', '困难', '2', '1', '2024-01-11 22:04:17', '2024-01-20 01:49:35', '', '掌握');
INSERT INTO `problem_record` VALUES ('154', 'leetcode', '239. 滑动窗口最大值', '困难', '3', '1', '2024-01-13 17:57:25', '2024-01-20 02:00:18', '', '掌握');
INSERT INTO `problem_record` VALUES ('155', 'leetcode', '312. 戳气球', '困难', '2', '1', '2024-01-14 01:55:18', '2024-01-20 00:56:22', '', '掌握');
INSERT INTO `problem_record` VALUES ('156', 'leetcode', '85.最大矩形', '困难', '2', '0', '2024-01-14 15:52:03', '2024-01-20 00:56:22', '', '掌握');
INSERT INTO `problem_record` VALUES ('157', '设计模式', '5.工厂模式', '简单', '1', '1', '2024-01-14 18:59:07', '2024-01-14 18:59:24', '', '掌握');
INSERT INTO `problem_record` VALUES ('158', 'jvm', '6 锁升级', '中等', '1', '1', '2024-01-14 19:00:34', '2024-01-14 19:00:42', '', '理解');
INSERT INTO `problem_record` VALUES ('159', 'jvm', '16.对象头', '中等', '1', '1', '2024-01-14 19:01:09', '2024-01-14 19:01:17', '', '理解');
INSERT INTO `problem_record` VALUES ('160', 'jvm', '5 查看CPU占用最高的线程', '简单', '1', '1', '2024-01-14 19:10:00', '2024-01-14 19:10:13', '', '理解');
INSERT INTO `problem_record` VALUES ('162', '设计模式', '6.原型模式', '简单', '1', '1', '2024-01-16 03:00:35', '2024-01-16 03:00:42', '', '掌握');
INSERT INTO `problem_record` VALUES ('163', '计算机网络', '1 CDN原理', '中等', '1', '1', '2024-01-16 22:15:36', '2024-01-16 22:15:42', '', '掌握');
INSERT INTO `problem_record` VALUES ('164', '并发', '1 Happen-Before', '中等', '1', '1', '2024-01-16 22:17:24', '2024-01-16 22:17:47', '', '理解');
INSERT INTO `problem_record` VALUES ('165', '并发', '2. Java线程的实现', '简单', '1', '1', '2024-01-16 22:17:55', '2024-01-16 22:18:18', '', '理解');
INSERT INTO `problem_record` VALUES ('166', '并发', '3 线程的状态', '简单', '1', '1', '2024-01-16 22:18:31', '2024-01-16 22:18:47', '', '理解');
INSERT INTO `problem_record` VALUES ('167', '并发', '4 ThreadLocal原理', '中等', '1', '1', '2024-01-16 22:18:57', '2024-01-16 22:19:04', '', '掌握');
INSERT INTO `problem_record` VALUES ('168', '计算机网络', '2 跨域', '中等', '1', '1', '2024-01-16 22:19:32', '2024-01-16 22:19:43', '', '理解');
INSERT INTO `problem_record` VALUES ('169', 'java基础', '1 重写equals需要注意的地方', '中等', '1', '0', '2024-01-16 22:20:05', '2024-01-16 22:20:10', '', '理解');
INSERT INTO `problem_record` VALUES ('170', '设计模式', '7.模板方法模式', '简单', '1', '1', '2024-01-16 22:28:47', '2024-01-16 22:28:52', '', '掌握');
INSERT INTO `problem_record` VALUES ('171', '并发', '5 volatile的原理', '简单', '1', '1', '2024-01-18 16:02:59', '2024-01-18 16:03:06', '', '掌握');
INSERT INTO `problem_record` VALUES ('172', 'jvm', '18 符号引用和直接引用', '简单', '1', '1', '2024-01-18 16:14:03', '2024-01-18 16:14:03', '', '理解');
INSERT INTO `problem_record` VALUES ('173', 'jvm', '19 双亲委派模型', '中等', '1', '1', '2024-01-18 16:48:50', '2024-01-18 16:48:52', '', '掌握');
INSERT INTO `problem_record` VALUES ('174', 'leetcode', '301. 删除无效的括号', '困难', '1', '0', '2024-01-20 13:38:21', '2024-01-20 13:38:29', '', '掌握');
INSERT INTO `problem_record` VALUES ('175', 'jvm', '14 类加载机制', '中等', '1', '1', '2024-01-20 23:45:44', '2024-01-20 23:45:51', '', '理解');
INSERT INTO `problem_record` VALUES ('176', 'jvm', '20 jstack', '简单', '1', '1', '2024-01-20 23:46:59', '2024-01-20 23:47:04', '', '掌握');
INSERT INTO `problem_record` VALUES ('177', 'mysql', '1. mysql数据存储方式', '简单', '1', '1', '2024-01-20 23:58:25', '2024-01-27 04:56:23', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('178', '计算机网络', '3 HTTP2.0', '中等', '1', '1', '2024-01-21 00:35:51', '2024-01-21 00:35:58', '', '掌握');
INSERT INTO `problem_record` VALUES ('179', '计算机网络', '4 一个HTTP请求,中间发生了什么', '简单', '1', '1', '2024-01-21 00:40:35', '2024-01-21 00:40:45', '', '掌握');
INSERT INTO `problem_record` VALUES ('180', '计算机网络', '5 HTTP0.9 1.0 1.1 2.0 3.0的区别', '简单', '1', '1', '2024-01-21 01:55:28', '2024-01-21 01:55:34', '', '掌握');
INSERT INTO `problem_record` VALUES ('181', '计算机网络', '6 DNS的原理', '中等', '1', '1', '2024-01-21 23:19:32', '2024-01-21 23:19:41', '', '掌握');
INSERT INTO `problem_record` VALUES ('182', 'MQ', '1 消息堆积解决方案', '中等', '1', '1', '2024-01-21 23:21:19', '2024-01-21 23:21:27', '', '理解');
INSERT INTO `problem_record` VALUES ('183', '并发', '6 线程池原理', '中等', '1', '1', '2024-01-22 00:04:20', '2024-01-22 00:04:28', '', '掌握');
INSERT INTO `problem_record` VALUES ('184', '并发', '7 synchronized的原理', '简单', '1', '1', '2024-01-22 00:09:16', '2024-01-22 00:09:30', '', '理解');
INSERT INTO `problem_record` VALUES ('185', '并发', '8 CAS原理', '中等', '1', '1', '2024-01-22 00:16:01', '2024-01-22 00:16:11', '', '掌握');
INSERT INTO `problem_record` VALUES ('186', '并发', '9 多生产者多消费者问题', '中等', '1', '1', '2024-01-22 00:17:23', '2024-01-22 00:17:28', '', '掌握');
INSERT INTO `problem_record` VALUES ('187', '并发', '10 Synchronized和ReentrantLock的区别', '简单', '1', '1', '2024-01-22 00:38:19', '2024-01-22 00:38:29', '', '理解');
INSERT INTO `problem_record` VALUES ('188', 'mysql', '2 MVCC原理', '中等', '1', '1', '2024-01-22 01:29:11', '2024-01-27 16:14:26', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('189', 'mysql', '3 Innodb vs myisam', '简单', '1', '1', '2024-01-22 01:29:35', '2024-01-27 16:25:43', '不需要复习', '了解');
INSERT INTO `problem_record` VALUES ('190', 'mysql', '4 mysql排序原理', '中等', '1', '1', '2024-01-22 03:35:37', '2024-01-22 03:35:37', '', '理解');
INSERT INTO `problem_record` VALUES ('191', 'mysql', '5 Shading-JDBC分片策略', '简单', '1', '1', '2024-01-22 03:39:53', '2024-01-22 03:40:02', '', '了解');
INSERT INTO `problem_record` VALUES ('192', 'mysql', '6 索引下推', '中等', '1', '1', '2024-01-22 03:47:21', '2024-01-22 03:47:26', '', '掌握');
INSERT INTO `problem_record` VALUES ('193', 'mysql', '7 count(1),count(*),count(column)的区别', '简单', '1', '1', '2024-01-22 03:50:43', '2024-01-22 03:50:57', '', '理解');
INSERT INTO `problem_record` VALUES ('194', 'java基础', '2 java异常', '简单', '1', '1', '2024-01-22 04:04:18', '2024-01-22 04:04:20', '', '掌握');
INSERT INTO `problem_record` VALUES ('195', 'redis', '3 Redis分布式锁原理', '中等', '1', '1', '2024-01-22 05:35:58', '2024-01-26 00:32:06', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('196', 'redis', '4 为什么Redis使用16384个槽', '简单', '1', '1', '2024-01-22 05:41:29', '2024-01-24 13:06:12', '不需要复习', '了解');
INSERT INTO `problem_record` VALUES ('197', 'redis', '5 Redis为什么这么快', '简单', '1', '1', '2024-01-22 21:31:56', '2024-01-26 00:32:07', '不需要复习', '了解');
INSERT INTO `problem_record` VALUES ('198', 'redis', '6 Redis IO多路复用', '简单', '1', '1', '2024-01-22 21:32:14', '2024-01-24 12:59:08', '不需要复习', '了解');
INSERT INTO `problem_record` VALUES ('199', 'redis', '7 Redis和数据库的一致性', '中等', '1', '1', '2024-01-22 21:32:32', '2024-01-26 00:32:09', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('200', 'redis', '8 Redis缓存驱逐策略', '中等', '1', '1', '2024-01-22 21:32:41', '2024-01-26 00:47:24', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('201', 'redis', '9 Redis过期键删除策略', '简单', '1', '1', '2024-01-22 21:33:10', '2024-01-25 13:10:27', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('202', 'redis', '10 缓存穿透,缓存击穿,缓存雪崩', '简单', '1', '1', '2024-01-22 21:33:26', '2024-01-26 00:56:37', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('203', 'redis', '11 持久化', '简单', '1', '1', '2024-01-22 21:33:46', '2024-01-24 12:59:19', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('204', 'redis', '12 Redis Hot key Error', '中等', '1', '1', '2024-01-22 21:33:57', '2024-01-26 00:50:55', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('205', 'mysql', '8 幻读', '简单', '1', '1', '2024-01-22 21:34:53', '2024-01-22 21:35:02', '', '掌握');
INSERT INTO `problem_record` VALUES ('206', 'mysql', '9 索引失效', '中等', '1', '1', '2024-01-22 22:02:26', '2024-01-22 22:02:33', '', '掌握');
INSERT INTO `problem_record` VALUES ('207', '算法', '8 一致性hash原理', '中等', '1', '1', '2024-01-22 22:03:51', '2024-01-22 22:03:56', '', '掌握');
INSERT INTO `problem_record` VALUES ('208', 'mysql', '10 页分裂和页合并', '中等', '1', '1', '2024-01-22 22:52:52', '2024-01-22 22:52:55', '', '掌握');
INSERT INTO `problem_record` VALUES ('209', 'mysql', '11 mysql为什么时候B+树', '中等', '1', '1', '2024-01-24 03:06:33', '2024-01-24 03:09:54', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('210', 'spring', '1 Spring中Bean的生命周期', '简单', '1', '1', '2024-01-24 03:07:44', '2024-01-24 03:09:55', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('211', 'spring', '2 Spring循环依赖', '中等', '1', '1', '2024-01-24 03:07:55', '2024-01-24 03:10:02', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('212', 'spring', '3 Spring自动配置原理', '中等', '1', '1', '2024-01-24 03:07:55', '2024-01-24 03:10:03', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('213', 'spring', '4 Spring事务实现原理', '中等', '1', '1', '2024-01-24 03:07:55', '2024-01-24 03:10:08', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('214', 'spring', '5 Spring事务失效', '中等', '1', '1', '2024-01-24 03:07:55', '2024-01-24 03:10:08', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('215', 'spring', '6 Spring事务传播机制', '中等', '1', '1', '2024-01-24 03:08:00', '2024-01-24 03:10:10', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('216', 'spring', '7 Spring MVC的执行流程', '中等', '1', '1', '2024-01-24 03:08:00', '2024-01-24 03:10:16', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('217', 'spring', '8 Filter和Intercepotr的区别', '中等', '1', '1', '2024-01-24 03:08:00', '2024-01-24 03:10:21', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('218', 'spring', '9 动态代理', '中等', '1', '1', '2024-01-24 03:09:20', '2024-01-24 03:10:24', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('219', '操作系统', '1 顺序IO和随机IO的区别', '简单', '1', '1', '2024-01-24 03:40:01', '2024-01-24 03:40:11', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('220', '操作系统', '2 IO模型', '中等', '1', '1', '2024-01-24 04:18:26', '2024-01-24 04:18:42', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('221', 'redis', '13 复制', '中等', '1', '1', '2024-01-25 13:10:36', '2024-01-26 01:18:51', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('222', 'redis', '14 集群', '中等', '1', '1', '2024-01-25 13:10:36', '2024-01-26 01:18:51', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('223', 'redis', '15 哨兵', '中等', '1', '1', '2024-01-25 13:10:53', '2024-01-26 01:18:51', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('224', '操作系统', '3 进程间通信', '中等', '1', '1', '2024-01-25 13:30:59', '2024-01-25 13:31:06', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('225', '操作系统', '4 select,poll,epoll的区别', '中等', '1', '1', '2024-01-26 03:09:36', '2024-01-26 03:09:46', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('226', '操作系统', '5 内核态和用户态的区别', '简单', '1', '1', '2024-01-26 03:21:09', '2024-01-26 03:21:17', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('227', '操作系统', '6 零拷贝', '中等', '1', '1', '2024-01-27 01:06:16', '2024-01-27 01:06:23', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('228', '算法', '9 优先级队列', '中等', '1', '1', '2024-01-27 01:12:54', '2024-01-27 01:13:02', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('229', '方案设计', '1 限流算法', '中等', '1', '1', '2024-01-27 01:21:48', '2024-01-27 01:21:54', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('230', '方案设计', '2 如何使用Redis实现一个延迟队列', '中等', '1', '1', '2024-01-27 01:22:03', '2024-01-27 01:22:12', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('231', '方案设计', '3 秒杀设计', '中等', '1', '1', '2024-01-27 01:41:44', '2024-01-27 01:41:50', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('232', 'mysql', '12 Innodb中有哪些锁', '简单', '1', '1', '2024-01-27 02:13:12', '2024-01-27 02:13:22', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('233', 'mysql', '13 如何正确的使用分页', '中等', '1', '1', '2024-01-27 02:50:08', '2024-01-27 02:50:09', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('234', 'mysql', '14 mysql复制原理', '中等', '1', '1', '2024-01-27 04:11:24', '2024-01-27 04:11:31', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('235', 'mysql', '15 explain', '中等', '1', '1', '2024-01-27 04:53:54', '2024-01-27 04:54:00', '不需要复习', '理解');
INSERT INTO `problem_record` VALUES ('236', '算法', '10 红黑树', '中等', '1', '1', '2024-01-27 16:44:48', '2024-01-27 16:45:08', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('237', '算法', '11 B树和B+树', '中等', '1', '1', '2024-01-27 17:13:46', '2024-01-27 17:14:02', '不需要复习', '掌握');
INSERT INTO `problem_record` VALUES ('238', '分布式', '1 2PC和3PC', '困难', '1', '1', '2024-01-27 17:35:57', '2024-01-27 17:36:02', '不需要复习', '理解');
