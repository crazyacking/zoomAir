/*
SQLyog Professional v12.08 (64 bit)
MySQL - 5.6.11-log : Database - test
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `test`;

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `name` varchar(50) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `isbn` varchar(30) DEFAULT NULL,
  `author` varchar(50) DEFAULT NULL,
  `createdTime` date DEFAULT NULL,
  `expired` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `book` */

insert  into `book`(`name`,`price`,`isbn`,`author`,`createdTime`,`expired`) values ('《想念你的日子》',38,'56487-F012-E012345','张小娴','2015-10-26',1),('《匆匆那年》',200,'4568-FB78-EB36-HJ69','Charles','2015-10-26',1),('《Java 入门到精通》',200,'4328-FG58-EF66-KL68','Yang Henry','2015-10-26',1),('《钢铁是怎样炼成的》',13.2,'9787561348567','奥斯特洛夫斯基','2015-10-26',1),('《Spring 从入门到精通》',150,'3356-VB75-EF36-CF00','Tomcas','2015-10-26',1);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
