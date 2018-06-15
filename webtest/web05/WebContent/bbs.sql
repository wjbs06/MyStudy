--사내 게시판
create table BBS_USER(
	sabun number primary key,
	name varchar2(12) not null
);

create table BBS(
	num number primary key,
	sabun number references BBS_USER(sabun),	
	nalja date default sysdate,
	sub varchar2(30) default '제목없음',
	content varchar2(1024)
);

create sequence bbs_seq;

insert into BBS_USER values(1111,'user1');

delete from bbs where num=1;
insert into BBS values(bbs_seq.nextval,1111,sysdate,'test1','test111');
insert into BBS values(bbs_seq.nextval,1111,sysdate,'test2','test222');
insert into BBS values(bbs_seq.nextval,1111,sysdate,'test3','test333');
select * from BBS_USER;

delete from BBS_USER where sabun=4444;
delete from BBS where num>3;

--글번호,제목,날짜 글쓴이
--select num,name,nalja,sabun from bbs;

SELECT NUM,SUB,NALJA,(SELECT NAME FROM BBS_USER B WHERE B.SABUN=A.SABUN) FROM BBS A;

SELECT B.NUM,B.SUB,B.NALJA,A.NAME FROM BBS_USER A INNER JOIN BBS B ON A.SABUN=B.SABUN ORDER BY NUM DESC;

SELECT A.NUM,A.SUB,A.NALJA,B.NAME FROM BBS A,BBS_USER B WHERE A.SABUN=B.SABUN;

SELECT NUM,SUB,NALJA,NAME FROM BBS NATURAL JOIN BBS_USER;


