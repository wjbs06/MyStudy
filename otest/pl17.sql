create or replace package pl17
is
	procedure proc1;
	procedure proc2(no emp.empno%type);
end;
/
create or replace package body pl17
is
------------------------------------------
	procedure proc1
	is
	begin
		dbms_output.put_line('proc1 ½ÇÇà1');
	end;
-----------------------------------------------
	procedure proc2(
		no emp.empno%type
	)
	is
		mylow emp%rowtype;
	begin
		select empno,job into mylow.ename,mylow.job from emp where empno=no;
		dbms_output.put_line('ename='||mylow.ename);
		dbms_output.put_line('job='||mylow.job);
	end;
end;
/