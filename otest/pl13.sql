declare
	myrow emp%rowtype;
	--커서 선언
	cursor c is select empno,ename from emp;
begin
	--커서 오픈
	open c;
	--커서 패치;
	loop
	fetch c into myrow.empno,myrow.ename;

	exit when c%notfound;

	dbms_output.put_line('empno='||myrow.empno);
	dbms_output.put_line('ename='||myrow.ename);
	end loop;
	close c;
end;
/