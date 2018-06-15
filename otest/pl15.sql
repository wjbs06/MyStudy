create or replace function pl15
(no emp.empno%type)
--out 불가 in 만 가능

--리턴 오직 하나만 리턴,반드시 리턴 값이 있음
	return emp.ename%type
--is 앞에서 ; 금지
is
	dat date;
	name emp.ename%type;
begin
	--select sysdate into dat from dual;
	--내부에서 insert, update, delete 불가
	--update emp set ename='test' where empno=no;
	select ename into name from emp where empno=no;
	--리턴 값은 위에서 선언한 리턴의 타입과 일치
	return name;
end;
/