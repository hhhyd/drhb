/*
 Navicat Premium Dump SQL（合并版 + 防重复判断）

 Source Server         : 本机数据库
 Source Server Type    : MySQL
 Source Server Version : 80044 (8.0.44)
 Source Host           : 127.0.0.1:3306
 Source Schema         : lnut

 Date: 23/04/2026
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ==================== sys_role_menu ====================

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
                                 `role_id` bigint NOT NULL COMMENT '角色ID',
                                 `menu_id` bigint NOT NULL COMMENT '菜单ID',
                                 PRIMARY KEY (`role_id`, `menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '角色和菜单关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_role_menu（防重复）
-- ----------------------------
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 2);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 3);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 4);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 100);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 101);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 102);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 103);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 104);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 105);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 106);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 107);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 108);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 109);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 110);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 111);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 112);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 113);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 114);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 115);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 116);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 117);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 500);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 501);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1000);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1001);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1002);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1003);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1004);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1005);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1006);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1007);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1008);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1009);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1010);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1011);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1012);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1013);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1014);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1015);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1016);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1017);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1018);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1019);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1020);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1021);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1022);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1023);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1024);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1025);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1026);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1027);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1028);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1029);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1030);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1031);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1032);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1033);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1034);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1035);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1036);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1037);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1038);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1039);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1040);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1041);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1042);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1043);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1044);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1045);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1046);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1047);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1048);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1049);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1050);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1051);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1052);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1053);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1054);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1055);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1056);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1057);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1058);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1059);
INSERT IGNORE INTO `sys_role_menu` VALUES (2, 1060);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 3);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2048);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2049);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2050);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2051);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2052);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2053);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2054);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2055);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2056);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2057);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2058);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2059);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2060);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2061);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2065);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2066);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2067);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2071);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2072);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2073);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2074);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2075);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2076);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2077);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2078);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2079);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2080);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2081);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2082);
INSERT IGNORE INTO `sys_role_menu` VALUES (100, 2083);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 3);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2048);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2049);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2054);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2055);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2060);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2061);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2062);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2063);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2064);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2065);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2066);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2067);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2068);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2069);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2070);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2071);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2072);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2073);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2074);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2075);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2076);
INSERT IGNORE INTO `sys_role_menu` VALUES (101, 2077);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 3);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2048);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2049);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2052);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2054);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2055);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2059);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2060);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2061);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2066);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2067);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2071);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2072);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2073);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2074);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2075);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2076);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2077);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2078);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2079);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2080);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2081);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2082);
INSERT IGNORE INTO `sys_role_menu` VALUES (102, 2083);

-- ==================== sys_user ====================

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
                            `user_id` bigint NOT NULL AUTO_INCREMENT COMMENT '用户ID',
                            `dept_id` bigint NULL DEFAULT NULL COMMENT '部门ID',
                            `user_name` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户账号',
                            `nick_name` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户昵称',
                            `user_type` varchar(2) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '00' COMMENT '用户类型（00系统用户）',
                            `email` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '' COMMENT '用户邮箱',
                            `phonenumber` varchar(11) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '' COMMENT '手机号码',
                            `sex` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '0' COMMENT '用户性别（0男 1女 2未知）',
                            `avatar` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '' COMMENT '头像地址',
                            `password` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '' COMMENT '密码',
                            `status` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '0' COMMENT '账号状态（0正常 1停用）',
                            `del_flag` char(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '0' COMMENT '删除标志（0代表存在 2代表删除）',
                            `login_ip` varchar(128) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '' COMMENT '最后登录IP',
                            `login_date` datetime NULL DEFAULT NULL COMMENT '最后登录时间',
                            `pwd_update_date` datetime NULL DEFAULT NULL COMMENT '密码最后更新时间',
                            `create_by` varchar(64) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '' COMMENT '创建者',
                            `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
                            `update_by` varchar(64) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '' COMMENT '更新者',
                            `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
                            `remark` varchar(500) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '备注',
                            PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 104 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user（防重复：根据 user_id 或 user_name 判断）
-- ----------------------------
INSERT IGNORE INTO `sys_user` VALUES (1, 103, 'admin', '若依', '00', 'ry@163.com', '15888888888', '1', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '0', '127.0.0.1', '2026-04-23 11:02:49', '2026-04-22 14:38:09', 'admin', '2026-04-22 14:38:09', '', NULL, '管理员');
INSERT IGNORE INTO `sys_user` VALUES (2, 105, 'ry', '若依', '00', 'ry@qq.com', '15666666666', '1', '', '$2a$10$7JB720yubVSZvUI0rEqK/.VqGOZTH.ulu33dHOiBE8ByOhJIrdAu2', '0', '0', '127.0.0.1', '2026-04-22 14:38:09', '2026-04-22 14:38:09', 'admin', '2026-04-22 14:38:09', '', NULL, '测试员');
INSERT IGNORE INTO `sys_user` VALUES (100, NULL, '公众监督员', '公众监督员', '00', '', '', '0', '', '$2a$10$RP942q26uEj18bG/sm.IkO8.KdECs6X0riuqK4oh.4cgdgvCpe2eC', '0', '2', '', NULL, NULL, 'admin', '2026-04-23 10:58:42', '', NULL, NULL);
INSERT IGNORE INTO `sys_user` VALUES (101, NULL, 'neps', '公众监督员', '00', '', '', '0', '', '$2a$10$cMC.eVfms/lF0FtNQo0AzeNak7bDFsH2nbqm3ZqVABqAje.tnQjy.', '0', '0', '127.0.0.1', '2026-04-23 10:59:45', NULL, 'admin', '2026-04-23 10:59:24', '', NULL, NULL);
INSERT IGNORE INTO `sys_user` VALUES (102, NULL, 'nepg', '网格员', '00', '', '', '0', '', '$2a$10$9RoOMpeCt28pbqm08Eewtuq9Tx5Xhv.1wy.Qu3sVreZUpSpH9DwyC', '0', '0', '', NULL, NULL, 'admin', '2026-04-23 11:01:13', '', NULL, NULL);
INSERT IGNORE INTO `sys_user` VALUES (103, NULL, 'nepm', '系统管理者', '00', '', '', '0', '', '$2a$10$oxlmq9g4Bp67Kn9GoIlTC.2qOOB5OoFlrbAPhwzoh.56JJADCA5O6', '0', '0', '127.0.0.1', '2026-04-23 11:02:27', NULL, 'admin', '2026-04-23 11:01:49', '', NULL, NULL);

-- ==================== sys_user_role ====================

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
                                 `user_id` bigint NOT NULL COMMENT '用户ID',
                                 `role_id` bigint NOT NULL COMMENT '角色ID',
                                 PRIMARY KEY (`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户和角色关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user_role（防重复）
-- ----------------------------
INSERT IGNORE INTO `sys_user_role` VALUES (1, 1);
INSERT IGNORE INTO `sys_user_role` VALUES (2, 2);
INSERT IGNORE INTO `sys_user_role` VALUES (101, 100);
INSERT IGNORE INTO `sys_user_role` VALUES (102, 101);
INSERT IGNORE INTO `sys_user_role` VALUES (103, 102);

SET FOREIGN_KEY_CHECKS = 1;