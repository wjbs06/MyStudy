--부모테이블
create table ex08(
num number primary key,
loc varchar2(6),
tel varchar2(13)
);
insert into ex08 values(1,'서울','02');
insert into ex08 values(2,'부산','042');
insert into ex08 values(3,'대구','032');