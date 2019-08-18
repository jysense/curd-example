CREATE DATABASE `curd-example`;

USE `curd-example`;

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(10) DEFAULT NULL COMMENT '–’√˚',
  `age` int(2) DEFAULT NULL COMMENT 'ƒÍ¡‰',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;