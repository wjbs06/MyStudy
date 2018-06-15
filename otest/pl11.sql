create or replace procedure pl11
--인자선언
(su out number)
is
--변수선언
	num number(1);
begin
--실행문	
	num :=7;
	su :=num+10;
end;
/