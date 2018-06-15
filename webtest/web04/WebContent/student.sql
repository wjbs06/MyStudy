drop table student;

create table student(
	num	number primary key,
	name varchar2(12) not null,
	kor number(3),
	eng number(3),
	math number(3)
);

insert into STUDENT values(1,'test1',80,70,60);
insert into STUDENT values(2,'test2',88,77,66);
insert into STUDENT values(3,'test3',77,66,55);
insert into STUDENT values(4,'test4',66,55,44);
commit;
select * from STUDENT;

