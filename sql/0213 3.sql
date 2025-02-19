create database Ezen;
use Ezen;
create table USER_INFO(
UI_NUM INT primary key auto_increment,
UI_NAME VARCHAR(20) not null,
UI_ID VARCHAR(20) not null,
UI_PWD VARCHAR(20) not null
);

drop table USER_INFO;

insert into USER_INFO(UI_NAME,UI_ID,UI_PWD)
VALUES('홍길동','HONG','1234')
,('김길동','KIM','1234')
,('이길동','LEE','1234');
## *는 모든 것을 뜻한다
select * from USER_INFO
where UI_NAME like '%동';
delete  from USER_INFO
where UI_NUM=2
;
use ezen;
select * from USER_INFO;


