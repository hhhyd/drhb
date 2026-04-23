-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('统计信息', '3', '1', 'statistics', 'system/statistics/index', 1, 0, 'C', '0', '0', 'system:statistics:list', '#', 'admin', sysdate(), '', null, '统计信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('统计信息查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:statistics:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('统计信息新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:statistics:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('统计信息修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:statistics:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('统计信息删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:statistics:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('统计信息导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:statistics:export',       '#', 'admin', sysdate(), '', null, '');
-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖省区域', '3', '1', 'province', 'system/province/index', 1, 0, 'C', '0', '0', 'system:province:list', '#', 'admin', sysdate(), '', null, '系统网格覆盖省区域菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖省区域查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:province:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖省区域新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:province:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖省区域修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:province:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖省区域删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:province:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖省区域导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:province:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖市区域', '3', '1', 'city', 'system/city/index', 1, 0, 'C', '0', '0', 'system:city:list', '#', 'admin', sysdate(), '', null, '系统网格覆盖市区域菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖市区域查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:city:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖市区域新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:city:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖市区域修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:city:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖市区域删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:city:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('系统网格覆盖市区域导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:city:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('AQI检测网格员详细信息', '3', '1', 'inspector', 'system/inspector/index', 1, 0, 'C', '0', '0', 'system:inspector:list', '#', 'admin', sysdate(), '', null, 'AQI检测网格员详细信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('AQI检测网格员详细信息查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:inspector:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('AQI检测网格员详细信息新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:inspector:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('AQI检测网格员详细信息修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:inspector:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('AQI检测网格员详细信息删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:inspector:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('AQI检测网格员详细信息导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:inspector:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('空气质量指数级别', '3', '1', 'aqi', 'system/aqi/index', 1, 0, 'C', '0', '0', 'system:aqi:list', '#', 'admin', sysdate(), '', null, '空气质量指数级别菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('空气质量指数级别查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:aqi:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('空气质量指数级别新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:aqi:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('空气质量指数级别修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:aqi:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('空气质量指数级别删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:aqi:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('空气质量指数级别导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:aqi:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('监督员-网格员多对多关联', '3', '1', 'rel', 'system/rel/index', 1, 0, 'C', '0', '0', 'system:rel:list', '#', 'admin', sysdate(), '', null, '监督员-网格员多对多关联菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('监督员-网格员多对多关联查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:rel:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('监督员-网格员多对多关联新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:rel:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('监督员-网格员多对多关联修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:rel:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('监督员-网格员多对多关联删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:rel:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('监督员-网格员多对多关联导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:rel:export',       '#', 'admin', sysdate(), '', null, '');

-- 菜单 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公众监督员详细信息', '3', '1', 'supervisor', 'system/supervisor/index', 1, 0, 'C', '0', '0', 'system:supervisor:list', '#', 'admin', sysdate(), '', null, '公众监督员详细信息菜单');

-- 按钮父菜单ID
SELECT @parentId := LAST_INSERT_ID();

-- 按钮 SQL
insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公众监督员详细信息查询', @parentId, '1',  '#', '', 1, 0, 'F', '0', '0', 'system:supervisor:query',        '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公众监督员详细信息新增', @parentId, '2',  '#', '', 1, 0, 'F', '0', '0', 'system:supervisor:add',          '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公众监督员详细信息修改', @parentId, '3',  '#', '', 1, 0, 'F', '0', '0', 'system:supervisor:edit',         '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公众监督员详细信息删除', @parentId, '4',  '#', '', 1, 0, 'F', '0', '0', 'system:supervisor:remove',       '#', 'admin', sysdate(), '', null, '');

insert into sys_menu (menu_name, parent_id, order_num, path, component, is_frame, is_cache, menu_type, visible, status, perms, icon, create_by, create_time, update_by, update_time, remark)
values('公众监督员详细信息导出', @parentId, '5',  '#', '', 1, 0, 'F', '0', '0', 'system:supervisor:export',       '#', 'admin', sysdate(), '', null, '');