create or replace procedure func01
(num number)
is
	--변수선언
begin
	for i in 1..num loop
		dbms_output.put_line('test'||i);
	end loop;
end;
/