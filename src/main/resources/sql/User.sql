-- auto Generated on 2022-05-13
-- DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
	id BIGINT (15) NOT NULL AUTO_INCREMENT COMMENT '用户名',
	`name` VARCHAR (50) NOT NULL DEFAULT '' COMMENT '用户昵称',
	`type` INT (11) NOT NULL DEFAULT -1 COMMENT '用户类型',
	pass VARCHAR (50) NOT NULL DEFAULT '' COMMENT '登录密码',
	`status` INT (11) NOT NULL DEFAULT -1 COMMENT '用户状态',
	create_time DATETIME NOT NULL DEFAULT '1000-01-01 00:00:00' COMMENT '创建时间',
	PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT '用户表';