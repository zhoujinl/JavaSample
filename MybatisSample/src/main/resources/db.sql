CREATE TABLE user (
  id   INT,
  name VARCHAR(255) NOT NULL,
  age  INT,
  PRIMARY KEY (id)
)
  ENGINE = INNODB
  DEFAULT CHARSET = utf8;

 CREATE TABLE book (
   id   INT PRIMARY KEY AUTO_INCREMENT ,
   name VARCHAR(255) NOT NULL,
   price  INT
 )AUTO_INCREMENT=100
   ENGINE = INNODB
   DEFAULT CHARSET = utf8;

 CREATE TABLE pod (
   id   INT PRIMARY KEY AUTO_INCREMENT ,
   name VARCHAR(255) NOT NULL
 )AUTO_INCREMENT=100
   ENGINE = INNODB
   DEFAULT CHARSET = utf8;