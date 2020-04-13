-- MySQL dump 10.13  Distrib 5.7.29, for Linux (x86_64)
--
-- Host: localhost    Database: BBS
-- ------------------------------------------------------
-- Server version	5.7.29-0ubuntu0.18.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `login_log`
--

DROP TABLE IF EXISTS `login_log`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '日志id',
  `user_id` int(11) NOT NULL COMMENT '用户id',
  `login_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '登陆时间',
  `ip` varchar(30) NOT NULL COMMENT '登陆IP',
  `device` varchar(200) DEFAULT NULL COMMENT '设备',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=81 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_log`
--

LOCK TABLES `login_log` WRITE;
/*!40000 ALTER TABLE `login_log` DISABLE KEYS */;
/*!40000 ALTER TABLE `login_log` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reply`
--

DROP TABLE IF EXISTS `reply`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reply` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '回复id',
  `topic_id` int(11) NOT NULL COMMENT '主题id',
  `reply_user_id` int(11) NOT NULL COMMENT '用户id',
  `content` text NOT NULL COMMENT '回复内容',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `device` varchar(20) DEFAULT NULL COMMENT '设备',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=98 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reply`
--

LOCK TABLES `reply` WRITE;
/*!40000 ALTER TABLE `reply` DISABLE KEYS */;
INSERT INTO `reply` VALUES (97,21,10,'我来咯','2019-06-17 16:06:16','2019-06-17 16:06:16',NULL),(96,21,10,'啦啦啦啦啦','2019-06-17 16:06:07','2019-06-17 16:06:07',NULL),(95,23,11,'乌拉乌拉','2019-06-17 06:30:14','2019-06-17 06:30:14',NULL),(94,22,10,'嘿嘿嘿','2019-06-17 06:12:48','2019-06-17 06:12:48',NULL),(93,18,11,'啦啦啦','2019-06-17 06:08:52','2019-06-17 06:08:52',NULL),(92,17,11,'https://blog.csdn.net/JYL1159131237/article/details/92613716','2019-06-17 06:08:09','2019-06-17 06:08:09',NULL),(91,17,11,'这次及时做了归纳，还是很有必要的','2019-06-17 06:07:58','2019-06-17 06:07:58',NULL),(90,17,11,'明明解决过好几次这个问题了呢','2019-06-17 06:07:35','2019-06-17 06:07:35',NULL),(89,16,10,'哈哈哈','2019-06-17 05:44:21','2019-06-17 05:44:21',NULL),(88,16,10,'我去','2019-06-17 05:44:14','2019-06-17 05:44:14',NULL),(87,16,10,'é¢','2019-06-17 05:42:25','2019-06-17 05:42:25',NULL),(86,16,10,'ååå','2019-06-17 05:39:43','2019-06-17 05:39:43',NULL),(85,16,10,'6666','2019-06-17 05:39:29','2019-06-17 05:39:29',NULL),(84,16,10,'é¢','2019-06-17 05:38:25','2019-06-17 05:38:25',NULL);
/*!40000 ALTER TABLE `reply` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tab`
--

DROP TABLE IF EXISTS `tab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tab` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '板块id',
  `tab_name` varchar(50) NOT NULL COMMENT '板块名',
  `tab_name_en` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tab`
--

LOCK TABLES `tab` WRITE;
/*!40000 ALTER TABLE `tab` DISABLE KEYS */;
INSERT INTO `tab` VALUES (1,'技术','tech'),(2,'好玩','play'),(3,'生活','creative'),(4,'游戏','jobs'),(5,'交易','deals');
/*!40000 ALTER TABLE `tab` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `topic`
--

DROP TABLE IF EXISTS `topic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `topic` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '帖子ID',
  `user_id` int(11) NOT NULL COMMENT '发帖人id',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后更新时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `content` text CHARACTER SET utf8 NOT NULL COMMENT '内容',
  `click` int(11) NOT NULL DEFAULT '0' COMMENT '点击量',
  `tab_id` tinyint(4) NOT NULL COMMENT '发布板块',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `topic`
--

LOCK TABLES `topic` WRITE;
/*!40000 ALTER TABLE `topic` DISABLE KEYS */;
INSERT INTO `topic` VALUES (21,12,'2019-06-17 06:11:23','2019-06-17 16:06:16','有人来一起吃鸡嘛？？？','带躺！',7,4),(22,10,'2019-06-17 06:12:42','2019-06-17 16:05:51','明天就是618了呢','买买买！',5,3),(23,10,'2019-06-17 06:13:08','2020-04-13 04:28:14','之前的数据都没有了呢','５５５５',17,1),(20,12,'2019-06-17 06:10:28','2020-04-13 04:28:10','SSM和SSH框架','嘿嘿嘿',1,1),(19,11,'2019-06-17 06:09:20','2019-06-17 06:30:40','这段时间好忙呀','对啊',3,4),(18,11,'2019-06-17 06:08:45','2019-06-17 06:08:52','www.jingyile.cn','时刻不忘宣传',2,2),(17,11,'2019-06-17 06:07:12','2019-06-17 06:30:44','终于不乱码了','乱码真麻烦．．．',6,1),(16,10,'2019-06-17 05:35:08','2020-04-13 04:28:18','乱码','又乱码了',14,1);
/*!40000 ALTER TABLE `topic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户唯一ID',
  `username` varchar(30) NOT NULL COMMENT '用户名',
  `password` varchar(50) NOT NULL COMMENT '密码',
  `email` varchar(50) DEFAULT NULL COMMENT '邮箱',
  `phone_num` varchar(15) DEFAULT NULL COMMENT '手机号',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `credit` int(11) NOT NULL COMMENT '积分',
  `avatar` varchar(100) DEFAULT NULL COMMENT '头像url',
  `type` tinyint(4) NOT NULL DEFAULT '0' COMMENT '用户类型,0为普通用户,1为管理员',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (14,'jinglele0','A5AF80FED510251A4A6F4AC9FDB75A0F','1159131237@qq.com','8617865569671','2020-04-13 04:27:52','2020-04-13 04:27:52',0,'/img/avatar/avatar-default-2.png',0),(12,'admin','E10ADC3949BA59ABBE56E057F20F883E','326226@qq.com','86111','2019-06-17 06:09:44','2019-06-17 06:09:44',0,'/img/avatar/avatar-default-5.png',0),(11,'jingyile','A5AF80FED510251A4A6F4AC9FDB75A0F','115911237@qq.com','86222','2019-06-17 05:34:48','2019-06-17 05:34:48',0,'/img/avatar/avatar-default-8.png',0),(10,'jinglele','A5AF80FED510251A4A6F4AC9FDB75A0F','2464887322@qq.com','86336336','2019-06-17 05:34:37','2019-06-17 05:34:37',0,'/img/avatar/avatar-default-10.png',0);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-13 12:34:04
