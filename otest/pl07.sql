--for ¹®
declare
begin
	for num in 1..5 loop
		dbms_output.put_line('num:'||num);
	end loop;
end;
/