create or replace procedure pl12(
	num in emp.empno%type,
	var_ename out emp.ename%type,
	var_job out emp.job%type
)
is
	
begin
	select ename,job into var_ename,var_job from emp where empno=num;

end;
/