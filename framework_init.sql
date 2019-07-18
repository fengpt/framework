
DROP TABLE IF EXISTS `f_user`;

CREATE TABLE `f_user` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '用户名',
  `username_cn` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '中文用户名',
  `password` varchar(64) CHARACTER SET utf8 DEFAULT NULL COMMENT '密码',
  `remark` varchar(128) CHARACTER SET utf8 DEFAULT NULL COMMENT '备注',
  `is_del` int(1) DEFAULT '0' COMMENT '是否已删除 0-未删除；1-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户信息表';

LOCK TABLES `f_user` WRITE;

INSERT INTO `f_user` (`id`, `username`, `username_cn`, `password`, `remark`, `is_del`, `create_time`, `update_time`)
VALUES
    (1,'boyle','测试用户boyle',NULL,'测试用户',0,NULL,NULL),
    (2,'curie','测试用户curie',NULL,'测试用户',0,NULL,'2018-09-17 15:49:54');

UNLOCK TABLES;

DROP TABLE IF EXISTS `f_role`;

CREATE TABLE `f_role` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `role_name` varchar(48) CHARACTER SET utf8 DEFAULT NULL COMMENT '角色名称',
  `role_code` varchar(48) CHARACTER SET utf8 DEFAULT NULL COMMENT '角色代码',
  `remark` varchar(128) CHARACTER SET utf8 DEFAULT NULL COMMENT '角色描述',
  `is_del` int(1) DEFAULT '0' COMMENT '是否已删除 0-未删除；1-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色信息表';

LOCK TABLES `f_role` WRITE;

INSERT INTO `f_role` (`id`, `role_name`, `role_code`, `remark`, `is_del`, `create_time`, `update_time`)
VALUES
    (1,'管理员','admin','管理员角色',0,NULL,NULL);

UNLOCK TABLES;

DROP TABLE IF EXISTS `f_authority`;

CREATE TABLE `f_authority` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `biz_id` varchar(64) DEFAULT NULL COMMENT '业务id(格式：4位一级，如：00010002)',
  `auth_name` varchar(48) DEFAULT NULL COMMENT '名称',
  `auth_value` varchar(256) DEFAULT NULL COMMENT '权限内容',
  `auth_type` int(4) DEFAULT NULL COMMENT '权限类型 1-菜单, ...',
  `remark` varchar(128) DEFAULT NULL COMMENT '权限描述',
  `is_del` int(1) DEFAULT '0' COMMENT '是否已删除 0-未删除；1-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='权限信息表';

LOCK TABLES `f_authority` WRITE;

INSERT INTO `f_authority` (`id`, `biz_id`, `auth_name`, `auth_value`, `auth_type`, `remark`, `is_del`, `create_time`, `update_time`)
VALUES
    (1,'0001','测试1','/menu/menu1',1,'测试菜单1',0,NULL,'2018-09-17 15:32:37'),
    (2,'0002','测试2','/menu/menu2',1,'测试菜单2',0,NULL,'2018-09-17 15:33:28'),
    (3,'00010001','测试11','/menu/menu11',1,'测试菜单11',0,NULL,'2018-09-17 15:33:41')
    (4,'0003','获取用户权限','/user/getUserMenus',1,'获取用户权限',0,NULL,'2018-09-17 15:33:41');

UNLOCK TABLES;


DROP TABLE IF EXISTS `f_role_authority`;

CREATE TABLE `f_role_authority` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `role_id` int(20) DEFAULT NULL COMMENT '角色id',
  `authority_id` int(20) DEFAULT NULL COMMENT '权限id',
  `is_del` int(1) DEFAULT '0' COMMENT '是否已删除 0-未删除；1-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='角色权限表';

LOCK TABLES `f_role_authority` WRITE;

INSERT INTO `f_role_authority` (`id`, `role_id`, `authority_id`, `is_del`, `create_time`, `update_time`)
VALUES
    (1,1,1,0,NULL,'2018-09-17 15:34:44'),
    (2,1,2,0,NULL,'2018-09-17 15:34:47'),
    (3,1,3,0,NULL,'2018-09-17 15:34:48'),
    (4,1,4,0,NULL,'2018-09-17 15:34:48');

UNLOCK TABLES;


DROP TABLE IF EXISTS `f_user_role`;

CREATE TABLE `f_user_role` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(20) DEFAULT NULL COMMENT '用户id',
  `role_id` int(20) DEFAULT NULL COMMENT '角色id',
  `is_del` int(1) DEFAULT '0' COMMENT '是否已删除 0-未删除；1-已删除',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户角色表';

LOCK TABLES `f_user_role` WRITE;

INSERT INTO `f_user_role` (`id`, `user_id`, `role_id`, `is_del`, `create_time`, `update_time`)
VALUES
    (1,1,1,0,NULL,NULL),
    (2,2,1,0,NULL,NULL);

UNLOCK TABLES;


DROP TABLE IF EXISTS `sample`;

CREATE TABLE `sample` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `s_name` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `s_price` decimal(9,2) DEFAULT NULL,
  `s_json` varchar(450) CHARACTER SET utf8 DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='测试表';

LOCK TABLES `sample` WRITE;

INSERT INTO `sample` (`id`, `s_name`, `s_price`, `s_json`, `create_time`, `update_time`)
VALUES
    (1,'123',2.00,'{\"name\":\"1\"}',NULL,NULL);

UNLOCK TABLES;

