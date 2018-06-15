drop table ex03;
		create table ex03(
		num number unique not null,
		name varchar2(30) unique not null
		);
		insert into ex03 values(1,'test1');
		insert into ex03 values(2,'test2');
		insert into ex03 values(3,'test3');
		insert into ex03 values(4,'test4');
		insert into ex03 values(5,'test5');
		select * from ex03;