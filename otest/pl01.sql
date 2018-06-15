declare
	--변수의 선언
	num number(3);
	name varchar2(9);
begin
	--실행문
	num := 123;
	name := '한글로';
	dbms_output.put_line('hello oracle'||num||name);
end;
/