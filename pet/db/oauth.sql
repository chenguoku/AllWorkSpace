/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.20-log : Database - zozo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zozo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `zozo`;

/*Table structure for table `oauth_client_details` */

DROP TABLE IF EXISTS `oauth_client_details`;

CREATE TABLE `oauth_client_details` (
  `client_id` varchar(48) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '客户端id',
  `resource_ids` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '资源id',
  `client_secret` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '客户端密匙',
  `scope` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '范围',
  `authorized_grant_types` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '授权类型',
  `web_server_redirect_uri` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '回调地址',
  `authorities` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '认证',
  `access_token_validity` int(11) DEFAULT NULL COMMENT 'access_token有效时间',
  `refresh_token_validity` int(11) DEFAULT NULL COMMENT 'refresh_token有效时间',
  `additional_information` varchar(4096) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '额外信息',
  `autoapprove` varchar(256) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '自动批准',
  `creator` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建人',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '更新人',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  `del_flag` tinyint(1) DEFAULT '0' COMMENT '删除标记（默认为0未删除，1已删除）',
  `version` bigint(11) DEFAULT '0' COMMENT '乐观锁',
  PRIMARY KEY (`client_id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci ROW_FORMAT=COMPACT COMMENT='认证表';

/*Data for the table `oauth_client_details` */

insert  into `oauth_client_details`(`client_id`,`resource_ids`,`client_secret`,`scope`,`authorized_grant_types`,`web_server_redirect_uri`,`authorities`,`access_token_validity`,`refresh_token_validity`,`additional_information`,`autoapprove`,`creator`,`create_date`,`updater`,`update_date`,`del_flag`,`version`) values ('client',NULL,'secret','all','password','https://www.baidu1.com','ROLE_CLIENT',360000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,0),('ZOZO',NULL,'AppSecret','all','password','https://www.baidu1.com','ROLE_CLIENT',360000,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0,0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
