-- auto Generated on 2022-05-14
-- DROP TABLE IF EXISTS role_user;
CREATE TABLE role_user(
                          id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
                          user_id BIGINT (15) NOT NULL DEFAULT -1 COMMENT '用户id',
                          role_i_d INT (11) NOT NULL DEFAULT -1 COMMENT '角色id',
                          remark VARCHAR (50) NOT NULL DEFAULT '' COMMENT '备注',
                          PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'role_user';

-- auto Generated on 2022-05-14
-- DROP TABLE IF EXISTS role_menu;
CREATE TABLE role_menu(
                          id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
                          role_id INT (11) NOT NULL DEFAULT -1 COMMENT '角色id',
                          menu_id INT (11) NOT NULL DEFAULT -1 COMMENT '权限id',
                          remark VARCHAR (50) NOT NULL DEFAULT '' COMMENT '备注',
                          PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'role_menu';

-- auto Generated on 2022-05-14
-- DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`(
                       id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT 'id',
                       `name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '角色名',
                       remark VARCHAR (255) NOT NULL DEFAULT '' COMMENT '备注',
                       PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '角色信息表';

-- auto Generated on 2022-05-14
-- DROP TABLE IF EXISTS menu;
CREATE TABLE menu(
                     id INT (11) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
                     p_id INT (11) NOT NULL DEFAULT -1 COMMENT '父级id',
                     title VARCHAR (50) NOT NULL DEFAULT '' COMMENT '菜单名称',
                     href VARCHAR (50) NOT NULL DEFAULT '' COMMENT '地址',
                     icon VARCHAR (50) NOT NULL DEFAULT '' COMMENT '图标',
                     `type` INT (11) NOT NULL DEFAULT -1 COMMENT '菜单类型',
                     order_num INT (11) NOT NULL DEFAULT -1 COMMENT '排序代码',
                     PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'menu';

-- auto Generated on 2022-05-14
-- DROP TABLE IF EXISTS dict;
CREATE TABLE dict(
                     id INT (11) NOT NULL AUTO_INCREMENT COMMENT 'id',
                     `name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '字典名称',
                     type_code VARCHAR (50) NOT NULL DEFAULT '' COMMENT '类型代码',
                     `value` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '字典值',
                     order_num INT (11) NOT NULL DEFAULT -1 COMMENT '排序代码',
                     remark VARCHAR (50) NOT NULL DEFAULT '' COMMENT '备注',
                     PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT 'dict';
