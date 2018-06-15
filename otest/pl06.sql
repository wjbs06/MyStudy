--while 반복문
declare
	num number :=0;
begin
	while(num<4) loop
		dbms_output.put_line('반복:'||num);
		num := num+1;
	end loop;
end;
/