declare
	type myarr1 is table 
		of dept.dname%type 
		index by binary_integer;
	type myarr2 is table 
		of dept.loc%type 
		index by binary_integer;
	arr1 myarr1;
	arr2 myarr2;
	cnt binary_integer :=0;
begin
	for i in (select dname,loc from dept) loop
		cnt :=cnt+1;
		arr1(cnt) := i.dname;
		arr2(cnt) := i.loc;
	end loop;
		dbms_output.put_line('dname         loc');
		dbms_output.put_line('------------------------------');
	for j in 1..cnt loop
		dbms_output.put_line(arr1(j)||'     '||arr2(j));
	end loop;
end;
/