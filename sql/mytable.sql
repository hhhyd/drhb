DROP TABLE IF EXISTS `statistics`;
CREATE TABLE `statistics` (
                              `id` int NOT NULL AUTO_INCREMENT COMMENT '统计信息编号',
                              `province_id` int NOT NULL COMMENT '所属省区域编号',
                              `city_id` int NOT NULL COMMENT '所属市区域编号',
                              `address` varchar(200) NOT NULL COMMENT '反馈信息所在区域详细地址',
                              `so2_value` int NOT NULL COMMENT '空气二氧化硫浓度值（单位：μg/m3）',
                              `so2_level` int NOT NULL COMMENT '空气二氧化硫指数级别',
                              `co_value` int NOT NULL COMMENT '空气一氧化碳浓度值（单位：μg/m3）',
                              `co_level` int NOT NULL COMMENT '空气一氧化碳指数级别',
                              `spm_value` int NOT NULL COMMENT '空气悬浮颗粒物浓度值（单位：μg/m3）',
                              `spm_level` int NOT NULL COMMENT '空气PM2.5指数级别',
                              `aqi_id` int NOT NULL COMMENT '空气质量指数级别',
                              `confirm_date` varchar(20) NOT NULL COMMENT '确认日期',
                              `confirm_time` varchar(20) NOT NULL COMMENT '确认时间',
                              `gm_id` int NOT NULL COMMENT '所属网格员编号',
                              `fd_id` varchar(20) NOT NULL COMMENT '反馈者编号（公众监督员电话号码）',
                              `information` varchar(400) NOT NULL COMMENT '反馈信息描述',
                              `remarks` varchar(200) DEFAULT NULL COMMENT '备注',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=45 DEFAULT CHARSET=utf8mb3;

CREATE TABLE `eps_public_supervisor` (
                                         `supervisor_id` bigint NOT NULL AUTO_INCREMENT COMMENT '监督员ID',
                                         `user_id` bigint NOT NULL COMMENT '关联的系统用户ID',
                                         `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
                                         `phone` varchar(20) NOT NULL COMMENT '手机号（唯一标识）',
                                         `age` int DEFAULT NULL,
                                         `gender` char(1) DEFAULT NULL,
                                         `register_time` datetime DEFAULT CURRENT_TIMESTAMP,
                                         PRIMARY KEY (`supervisor_id`),
                                         UNIQUE KEY `uniq_phone` (`phone`),
                                         UNIQUE KEY `uniq_user` (`user_id`), -- 与sys_user一对一
                                         KEY `idx_user` (`user_id`)
) ENGINE=InnoDB COMMENT='公众监督员详细信息表';

CREATE TABLE `eps_grid_inspector` (
                                      `inspector_id` bigint NOT NULL AUTO_INCREMENT COMMENT '网格员ID',
                                      `user_id` bigint NOT NULL COMMENT '关联的系统用户ID',
                                      `employee_code` varchar(50) NOT NULL COMMENT '员工编码（来自HR）',
                                      `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
                                      `phone` varchar(20) DEFAULT NULL COMMENT '联系电话',
                                      `work_status` char(1) DEFAULT '1' COMMENT '工作状态（0-离线，1-在线）',
                                      `province_code` varchar(20) DEFAULT NULL COMMENT '常驻省编码',
                                      `city_code` varchar(20) DEFAULT NULL COMMENT '常驻市编码',
                                      PRIMARY KEY (`inspector_id`),
                                      UNIQUE KEY `uniq_emp_code` (`employee_code`),
                                      UNIQUE KEY `uniq_user` (`user_id`), -- 与sys_user一对一
                                      KEY `idx_region_status` (`province_code`, `city_code`, `work_status`)
) ENGINE=InnoDB COMMENT='AQI检测网格员详细信息表';

CREATE TABLE `eps_supervisor_inspector_rel` (
                                                `id` bigint NOT NULL AUTO_INCREMENT,
                                                `supervisor_id` bigint NOT NULL COMMENT '公众监督员ID',
                                                `inspector_id` bigint NOT NULL COMMENT '网格员ID',
                                                `relation_type` varchar(20) DEFAULT 'RESPONSIBLE' COMMENT '关系类型（如：主要负责-RESPONSIBLE，后备-BACKUP）',
                                                `bind_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '绑定时间',
                                                `is_active` char(1) DEFAULT '1' COMMENT '是否有效（0-否，1-是）',
                                                PRIMARY KEY (`id`),
                                                UNIQUE KEY `uniq_binding` (`supervisor_id`, `inspector_id`, `relation_type`), -- 防止重复绑定
                                                KEY `idx_supervisor` (`supervisor_id`, `is_active`),
                                                KEY `idx_inspector` (`inspector_id`, `is_active`),
                                                CONSTRAINT `fk_rel_supervisor` FOREIGN KEY (`supervisor_id`) REFERENCES `eps_public_supervisor` (`supervisor_id`),
                                                CONSTRAINT `fk_rel_inspector` FOREIGN KEY (`inspector_id`) REFERENCES `eps_grid_inspector` (`inspector_id`)
) ENGINE=InnoDB COMMENT='监督员-网格员多对多关联表';

CREATE TABLE `aqi` (
                       `aqi_id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '空气质量指数级别ID（共六级）',
                       `chinese_explain` VARCHAR(10) NOT NULL COMMENT '空气质量指数级别汉字表述',
                       `aqi_explain` VARCHAR(20) NOT NULL COMMENT '空气质量指数级别描述',
                       `color` VARCHAR(7) NOT NULL COMMENT '空气质量指数级别表示颜色',
                       `health_impact` VARCHAR(500) COMMENT '对健康影响情况',
                       `take_steps` VARCHAR(500) COMMENT '建议采取的措施',
                       `so2_min` INT NOT NULL COMMENT '本级别二氧化硫浓度最小值限值',
                       `so2_max` INT NOT NULL COMMENT '本级别二氧化硫浓度最大值限值',
                       `co_min` INT NOT NULL COMMENT '本级别一氧化碳浓度最小值限值',
                       `co_max` INT NOT NULL COMMENT '本级别一氧化碳浓度最大值限值',
                       `spm_min` INT NOT NULL COMMENT '本级别悬浮颗粒物浓度最小限值',
                       `spm_max` INT NOT NULL COMMENT '本级别悬浮颗粒物浓度最大值限值',
                       `remarks` VARCHAR(100) COMMENT '备注'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='空气质量指数级别表';

-- 系统网格覆盖省区域表 (grid_province)
CREATE TABLE `grid_province` (
                                 `province_id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '系统网格覆盖省区域编号',
                                 `province_name` VARCHAR(20) NOT NULL COMMENT '系统网格覆盖省区域名称',
                                 `province_abbr` VARCHAR(2) NOT NULL COMMENT '系统网格覆盖省区域简称',
                                 `remarks` VARCHAR(200) COMMENT '备注',
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统网格覆盖省区域表';


CREATE TABLE `grid_city` (
                             `city_id` INT PRIMARY KEY AUTO_INCREMENT COMMENT '系统网格覆盖市区域编号',
                             `city_name` VARCHAR(20) NOT NULL COMMENT '系统网格覆盖市区域名称',
                             `province_id` INT NOT NULL COMMENT '所属省区编号',
                             `remarks` VARCHAR(200) COMMENT '备注',
                             FOREIGN KEY (`province_id`) REFERENCES `grid_province`(`province_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统网格覆盖市区域表';