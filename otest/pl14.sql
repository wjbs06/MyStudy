create or replace procedure pl14
is
	i emp%rowtype;
	cursor c is select empno,ename from emp;
begin
	for i in c loop
		dbms_output.put_line('empno='||i.empno);
		dbms_output.put_line('ename='||i.ename);
	end loop;
end;
/