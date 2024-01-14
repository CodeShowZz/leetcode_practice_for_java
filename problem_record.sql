/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50740
Source Host           : localhost:3306
Source Database       : solve_problem_record

Target Server Type    : MYSQL
Target Server Version : 50740
File Encoding         : 65001

Date: 2024-01-14 15:52:35
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
) ENGINE=InnoDB AUTO_INCREMENT=157 DEFAULT CHARSET=utf8mb4;

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
INSERT INTO `problem_record` VALUES ('73', 'leetcode', '121.买卖股票的最佳时机', '简单', '3', '3', '2023-12-18 18:45:42', '2023-12-21 00:57:41', null, '掌握');
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
INSERT INTO `problem_record` VALUES ('107', '算法', '4.归并排序', '简单', '1', '1', '2023-12-20 05:07:33', '2023-12-21 00:55:34', '', '掌握');
INSERT INTO `problem_record` VALUES ('108', '算法', '5.堆排序', '简单', '1', '1', '2023-12-20 05:07:33', '2023-12-21 00:55:35', '', '掌握');
INSERT INTO `problem_record` VALUES ('109', '算法', '6.快速排序', '简单', '1', '1', '2023-12-20 05:07:34', '2023-12-21 00:55:36', '', '掌握');
INSERT INTO `problem_record` VALUES ('110', '算法', '7.跳表', '简单', '1', '1', '2023-12-20 05:09:16', '2023-12-21 00:55:39', '', '掌握');
INSERT INTO `problem_record` VALUES ('111', 'redis', '1.SDS', '简单', '1', '1', '2023-12-20 05:09:37', '2023-12-21 00:55:45', '', '了解');
INSERT INTO `problem_record` VALUES ('112', 'redis', '2.Redis字典实现原理', '中等', '1', '1', '2023-12-20 05:11:01', '2023-12-21 00:55:48', '', '了解');
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
INSERT INTO `problem_record` VALUES ('134', 'leetcode', '287. 寻找重复数\r\n', '中等', '3', '0', '2023-12-31 20:07:40', '2024-01-14 02:32:50', '', '掌握');
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
INSERT INTO `problem_record` VALUES ('148', 'leetcode', '560. 和为 K 的子数组', '中等', '3', '0', '2024-01-11 22:02:48', '2024-01-14 13:48:21', '', '掌握');
INSERT INTO `problem_record` VALUES ('149', 'leetcode', '581. 最短无序连续子数组', '中等', '2', '1', '2024-01-11 22:02:48', '2024-01-14 14:06:52', '', '掌握');
INSERT INTO `problem_record` VALUES ('150', 'leetcode', '621. 任务调度器', '中等', '2', '1', '2024-01-11 22:03:17', '2024-01-14 14:12:39', '', '掌握');
INSERT INTO `problem_record` VALUES ('151', 'leetcode', '647. 回文子串', '中等', '1', '0', '2024-01-11 22:03:42', '2024-01-11 22:03:49', '', '掌握');
INSERT INTO `problem_record` VALUES ('152', 'leetcode', '739. 每日温度', '中等', '1', '0', '2024-01-11 22:03:53', '2024-01-11 22:04:02', '', '掌握');
INSERT INTO `problem_record` VALUES ('153', 'leetcode', '42. 接雨水', '困难', '1', '0', '2024-01-11 22:04:17', '2024-01-11 22:04:26', '', '掌握');
INSERT INTO `problem_record` VALUES ('154', 'leetcode', '239. 滑动窗口最大值', '困难', '1', '0', '2024-01-13 17:57:25', '2024-01-14 02:48:06', '', '掌握');
INSERT INTO `problem_record` VALUES ('155', 'leetcode', '312. 戳气球', '困难', '1', '0', '2024-01-14 01:55:18', '2024-01-14 02:48:04', '', '掌握');
INSERT INTO `problem_record` VALUES ('156', 'leetcode', '85.最大矩形', '困难', '1', '0', '2024-01-14 15:52:03', '2024-01-14 15:52:22', '', '掌握');
