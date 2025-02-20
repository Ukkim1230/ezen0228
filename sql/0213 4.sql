create database Ezen;
use Ezen;
create table  GAME_INFO(
GI_NUM INT AUTO_INCREMENT primary key,
GI_NAME VARCHAR(100) not null,
GI_PRICE INT not null,
GI_GENRE VARCHAR(30) not null,
GI_DESC VARCHAR(4000) ## 남는 콜론을 삭제
## GU_DESC1 CHAT(4000) 남는 콜론을 삭제하지 않고 저장
);
insert into GAME_INFO(GI_NAME,GI_PRICE,GI_GENRE,GI_DESC)
VALUES('배틀그라운드',0,'슈팅','재밌다');
select GI_NUM,GI_NAME,GI_PRICE,GI_GENRE,GI_DESC 
from GAME_INFO;
update GAME_INFO
set GI_NAME = '배틀그라운드2'
,GI_PRICE = 0
,GI_GENRE = '슈팅'
,GI_DESC = '쪽박'
where GI_NUM=1;

delete from GAME_INFO
where GI_NUM = 1;
