drop table student;

create table student(
	num number,
	name varchar2(15),
	kor number(3),
	eng number(3),
	math number(3)
);


insert into student values(1,'test1',90,80,70);
insert into student values(2,'test2',90,80,70);
insert into student values(3,'test3',90,80,70);

select * from STUDENT;