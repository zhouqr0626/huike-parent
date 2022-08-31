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

/*Table structure for table `tb_clue_track_record` */

DROP TABLE IF EXISTS `tb_clue_track_record`;

CREATE TABLE `tb_clue_track_record` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '任务id',
  `clue_id` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '线索id',
  `create_by` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '跟进人',
  `subject` char(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '意向学科',
  `record` varchar(512) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '跟进记录',
  `level` char(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '意向等级',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '跟进时间',
  `type` char(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT '0' COMMENT '0 正常跟进记录 1 伪线索 2转商机',
  `false_reason` char(1) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '原因',
  `next_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=326 DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='线索跟进记录';

/*Data for the table `tb_clue_track_record` */

insert  into `tb_clue_track_record`(`id`,`clue_id`,`create_by`,`subject`,`record`,`level`,`create_time`,`type`,`false_reason`,`next_time`) values 
(304,'9747','zhangsan','0','111','1','2022-05-25 01:24:48','0',NULL,'2022-05-26 12:00:00'),
(305,'9746','zhangsan','0','5555','0','2022-05-25 01:25:13','0',NULL,'2022-05-26 12:00:00'),
(306,'9744','zhangsan',NULL,'121',NULL,'2022-05-25 01:25:40','1','1',NULL),
(307,'9740','zhangsan',NULL,'12121',NULL,'2022-05-25 01:26:00','1','2',NULL),
(308,'9741','zhangsan',NULL,'12121',NULL,'2022-05-25 01:26:08','1','5',NULL),
(309,'9742','zhangsan',NULL,'222',NULL,'2022-05-25 01:26:24','1','4',NULL),
(310,'9743','zhangsan',NULL,'121212',NULL,'2022-05-25 01:26:44','1','5',NULL),
(311,'9739','zhangsan','0','14','1','2022-05-25 01:27:33','0',NULL,'2022-05-26 12:00:00'),
(312,'9731','zhangsan','0','444','1','2022-05-25 01:27:53','0',NULL,'2022-05-26 12:00:00'),
(313,'9721','zhangsan','0','55555','0','2022-05-25 01:28:11','0',NULL,'2022-05-26 12:00:00'),
(314,'9746','zhangsan','0','2222','1','2022-05-25 01:28:32','0',NULL,'2022-05-26 12:00:00'),
(315,'9722','zhangsan','0','1111','1','2022-05-25 01:28:52','0',NULL,'2022-05-26 12:00:00'),
(316,'9723','zhangsan','0','121212','1','2022-05-25 01:29:19','0',NULL,'2022-05-25 12:00:00'),
(317,'9724','zhangsan',NULL,'1212',NULL,'2022-05-25 01:29:34','1','4',NULL),
(318,'9745','zhangsan1',NULL,NULL,NULL,'2022-05-25 01:30:34','1','3',NULL),
(319,'9732','zhangsan1',NULL,NULL,NULL,'2022-05-25 01:30:40','1','5',NULL),
(320,'9734','zhangsan1','1','111','2','2022-05-25 01:31:08','0',NULL,'2022-05-26 12:00:00'),
(321,'9735','zhangsan1','1','12122','1','2022-05-25 01:32:18','0',NULL,'2022-05-26 12:00:00'),
(322,'9736','zhangsan1','1','12122','1','2022-05-25 01:32:47','0',NULL,'2022-05-27 12:00:00'),
(323,'9737','zhangsan1','1','1212','1','2022-05-25 01:33:21','0',NULL,'2022-05-26 12:00:00'),
(324,'9727','zhangsan','0','zxc','1','2022-05-25 01:35:24','0',NULL,'2022-05-26 12:00:00'),
(325,'9730','zhangsan',NULL,NULL,NULL,'2022-05-25 01:35:40','1','3',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
