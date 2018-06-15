--loop반복문
declare 
	num number;
begin
	num := 0;
	loop
		num := num+1;
		dbms_output.put_line('반복:'||num);
		if(num=5) then exit;
		end if;
	end loop;
end;
/