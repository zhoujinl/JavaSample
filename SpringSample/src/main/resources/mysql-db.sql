# test.Student
CREATE TABLE Student(
  ID   INT NOT NULL AUTO_INCREMENT,
  NAME VARCHAR(20) NOT NULL,
  AGE  INT NOT NULL,
  PRIMARY KEY (ID)
);

# test SID 是 Student 表的外键。
CREATE TABLE Marks(
  SID INT NOT NULL,
  MARKS  INT NOT NULL,
  YEAR   INT NOT NULL
);

# 创建存储过程
DELIMITER $$
DROP PROCEDURE IF EXISTS `TEST`.`getRecord` $$
CREATE PROCEDURE `TEST`.`getRecord` (
  IN in_id INTEGER,
  OUT out_name VARCHAR(20),
  OUT out_age  INTEGER)
  BEGIN
    SELECT name, age
    INTO out_name, out_age
    FROM Student where id = in_id;
  END $$
DELIMITER ;

