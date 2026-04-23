SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ========== 1. sys_role_menu（角色菜单关联表）==========
-- 只保留 role_id = 101, 102, 103 的记录

DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu` (
                                 `role_id` bigint NOT NULL COMMENT '角色ID',
                                 `menu_id` bigint NOT NULL COMMENT '菜单ID',
                                 PRIMARY KEY (`role_id`, `menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '角色和菜单关联表' ROW_FORMAT = Dynamic;

-- 插入角色 101（网格员）的菜单权限
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

-- 插入角色 102（系统管理员）的菜单权限
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

-- 角色 103（决策者）的菜单权限（根据需求只给统计信息）
-- 注意：需要先确认统计信息的 menu_id 是多少，暂时用 2048 和 2049 示例
INSERT IGNORE INTO `sys_role_menu` VALUES (103, 3);
INSERT IGNORE INTO `sys_role_menu` VALUES (103, 2048);
INSERT IGNORE INTO `sys_role_menu` VALUES (103, 2049);

-- ========== 2. sys_user（用户表）==========
-- 只保留 user_id = 101, 102, 103 的用户

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

-- 插入用户（如果不存在则插入）
INSERT IGNORE INTO `sys_user` VALUES (101, NULL, 'neps', '公众监督员', '00', '', '', '0', '', '$2a$10$cMC.eVfms/lF0FtNQo0AzeNak7bDFsH2nbqm3ZqVABqAje.tnQjy.', '0', '0', '127.0.0.1', '2026-04-23 10:59:45', NULL, 'admin', '2026-04-23 10:59:24', '', NULL, NULL);
INSERT IGNORE INTO `sys_user` VALUES (102, NULL, 'nepg', '网格员', '00', '', '', '0', '', '$2a$10$9RoOMpeCt28pbqm08Eewtuq9Tx5Xhv.1wy.Qu3sVreZUpSpH9DwyC', '0', '0', '', NULL, NULL, 'admin', '2026-04-23 11:01:13', '', NULL, NULL);
INSERT IGNORE INTO `sys_user` VALUES (103, NULL, 'nepm', '系统管理者', '00', '', '', '0', '', '$2a$10$oxlmq9g4Bp67Kn9GoIlTC.2qOOB5OoFlrbAPhwzoh.56JJADCA5O6', '0', '0', '127.0.0.1', '2026-04-23 11:02:27', NULL, 'admin', '2026-04-23 11:01:49', '', NULL, NULL);

-- ========== 3. sys_user_role（用户角色关联表）==========
-- 只保留 user_id = 101, 102, 103 的记录

DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
                                 `user_id` bigint NOT NULL COMMENT '用户ID',
                                 `role_id` bigint NOT NULL COMMENT '角色ID',
                                 PRIMARY KEY (`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户和角色关联表' ROW_FORMAT = Dynamic;

-- 分配角色（如果不存在则插入）
-- user_id=101（公众监督员）→ role_id=100（公众监督员角色）
-- user_id=102（网格员）→ role_id=101（网格员角色）
-- user_id=103（系统管理者）→ role_id=102（系统管理员角色）
INSERT IGNORE INTO `sys_user_role` VALUES (101, 100);
INSERT IGNORE INTO `sys_user_role` VALUES (102, 101);
INSERT IGNORE INTO `sys_user_role` VALUES (103, 102);

SET FOREIGN_KEY_CHECKS = 1;