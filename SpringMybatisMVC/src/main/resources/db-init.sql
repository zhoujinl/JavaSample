DROP TABLE IF EXISTS `user_t`;

CREATE TABLE `user_t` (
  `number` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(40) NOT NULL,
  `age` int(4) NOT NULL,
 `department` varchar(255) NOT NULL,
  PRIMARY KEY (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_t` */

insert  into `user_t`(`number`,`name`,`age`,`department`) values (1,'小花',24,'测试部');
insert  into `user_t`(`number`,`name`,`age`,`department`) values (2,'小白',24,'开发部');