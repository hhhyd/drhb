INSERT INTO sys_role (role_id, role_name, role_key, role_sort, data_scope, status, del_flag, create_by, create_time, update_by, update_time, remark)
VALUES (3, '决策者', 'decision_maker', 3, '1', '0', '0', 'admin', NOW(), 'admin', NOW(), '决策者角色');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('决策者可视化数据', '3', '1', 'data', 'system/data/index', 1, 0, 'C', '0', '0', 'system:data:list', '#', 'admin', sysdate(), '', null, '决策者可视化数据菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('决策者可视化数据查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:data:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('决策者可视化数据新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:data:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('决策者可视化数据修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:data:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('决策者可视化数据删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:data:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('决策者可视化数据导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:data:export',       '#', 'admin', sysdate(), '', null, '');


CREATE TABLE `nepv_decision_data` (
                                      `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
                                      `stat_type` varchar(50) NOT NULL COMMENT '统计类型',
                                      `region_code` varchar(20) DEFAULT NULL COMMENT '地区编码',
                                      `region_name` varchar(100) DEFAULT NULL COMMENT '地区名称',
                                      `stat_period` varchar(20) NOT NULL COMMENT '统计周期',
                                      `stat_date` date NOT NULL COMMENT '统计日期',
                                      `so2_exceed_count` int(11) DEFAULT 0 COMMENT 'SO2超标累计数量',
                                      `co_exceed_count` int(11) DEFAULT 0 COMMENT 'CO超标累计数量',
                                      `pm25_exceed_count` int(11) DEFAULT 0 COMMENT 'PM2.5超标累计数量',
                                      `aqi_exceed_count` int(11) DEFAULT 0 COMMENT 'AQI等级超标累计数量',
                                      `aqi_level` varchar(20) DEFAULT NULL COMMENT 'AQI指数级别',
                                      `total_detection_count` int(11) DEFAULT 0 COMMENT 'AQI检测累计总数',
                                      `good_detection_count` int(11) DEFAULT 0 COMMENT 'AQI检测良好数',
                                      `exceed_detection_count` int(11) DEFAULT 0 COMMENT 'AQI检测超标数',
                                      `coverage_rate` decimal(5,2) DEFAULT 0.00 COMMENT '覆盖率百分比',
                                      `data_value` decimal(10,2) DEFAULT 0.00 COMMENT '数据值（通用）',
                                      `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                                      `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
                                      PRIMARY KEY (`id`),
                                      KEY `idx_stat_type` (`stat_type`),
                                      KEY `idx_region_code` (`region_code`),
                                      KEY `idx_stat_date` (`stat_date`),
                                      KEY `idx_stat_period` (`stat_period`),
                                      UNIQUE KEY `uk_stat_unique` (`stat_type`, `region_code`, `stat_period`, `stat_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='决策者可视化数据表';