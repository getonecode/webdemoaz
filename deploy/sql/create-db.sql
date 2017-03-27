DROP DATABASE IF EXISTS `webdemoaz`;
CREATE DATABASE `webdemoaz` default charset=utf8 ;
use `webdemoaz`;


delete from mysql.user where User = 'webdemoaz_user';
grant all on `webdemoaz`.* to 'webdemoaz_user'@'%' identified by 'webdemoaz_pwd';
grant all on `webdemoaz`.* to 'webdemoaz_user'@'localhost' identified by 'webdemoaz_pwd';
flush privileges;