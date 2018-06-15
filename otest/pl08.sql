declare
	
	
begin
	for i in (select ename,loc from dept) loop
		dbms_output.put_line('ename:'||i.ename);
		dbms_output.put_line('loc:'||i.loc);
	end loop;
end;
/