declare
	type mytype is record(
		empno emp.empno%type,
		ename emp.ename%type
	);
	one_record mytype;
begin
	select empno,ename into one_record from emp where empno=7839;
	dbms_output.put_line('사번:'||one_record.empno);
	dbms_output.put_line('이름:'||one_record.ename);
end;
/