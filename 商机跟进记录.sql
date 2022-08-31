/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 8.0.20 : Database - huike
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`huike` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `huike`;

/*Table structure for table `tb_business_track_record` */

DROP TABLE IF EXISTS `tb_business_track_record`;

CREATE TABLE `tb_business_track_record` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '任务id',
  `business_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '商机id',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '跟进人',
  `key_items` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '沟通重点',
  `record` varchar(512) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '沟通纪要',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '跟进时间',
  `track_status` char(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '跟进状态',
  `next_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8460 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='商机跟进记录';

/*Data for the table `tb_business_track_record` */

insert  into `tb_business_track_record`(`id`,`business_id`,`create_by`,`key_items`,`record`,`create_time`,`track_status`,`next_time`) values 
(8444,'3463','lisi',NULL,'用户不感兴趣','2022-05-25 01:36:10',NULL,NULL),
(8445,'3460','lisi',NULL,'用户已报名其他机构','2022-05-25 01:36:20',NULL,NULL),
(8446,'3459','lisi',NULL,'学费不满意','2022-05-25 01:36:29',NULL,NULL),
(8447,'3458','lisi',NULL,'用户已报名其他机构','2022-05-25 01:36:37',NULL,NULL),
(8448,'3456','lisi1',NULL,'用户不感兴趣','2022-05-25 01:37:26',NULL,NULL),
(8449,'3450','lisi1',NULL,'用户不感兴趣','2022-05-25 01:37:39',NULL,NULL),
(8450,'3455','lisi1','2,4,6','111','2022-05-25 01:38:06','1','2022-05-26 12:00:00'),
(8451,'3454','lisi1','5,3,1','111','2022-05-25 01:38:39','1','2022-05-25 12:00:00'),
(8452,'3466','lisi','4,2','111','2022-05-25 01:39:16','1','2022-05-26 12:00:00'),
(8453,'3465','lisi','1,3,5','1111','2022-05-25 01:40:41','1','2022-05-26 12:00:00'),
(8454,'3464','lisi','5,3,2','1111','2022-05-25 01:41:05','1','2022-05-26 12:00:00'),
(8455,'3462','lisi','2,3,5','11111','2022-05-25 01:41:51','1','2022-05-26 12:00:00'),
(8456,'3468','lisi','3,4','1111','2022-05-25 01:42:44','1','2022-05-26 12:00:00'),
(8457,'3467','lisi',NULL,'用户不感兴趣','2022-05-25 01:42:53',NULL,NULL),
(8458,'3453','lisi1','5,2,1','1111','2022-05-25 01:43:56','1','2022-05-26 12:00:00'),
(8459,'3452','lisi1','3,5,7','11111','2022-05-25 01:44:45','1','2022-05-26 12:00:00');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
