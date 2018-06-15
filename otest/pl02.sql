declare
	--num number;
	--name varchar2(30);
	num emp.empno%type;
	name emp.ename%type;
begin
	select empno,ename into num,name from emp where empno=7839;
	dbms_output.put_line('사번'||num);
	dbms_output.put_line('이름'||name);
end;
/