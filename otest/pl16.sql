--create [or replace] trigger 트리거명
--언제 [befor | after] 무엇이 [insert | update | delete ] on 테이블명
create or replace trigger pl16
	after insert or update on ex16		
begin
	dbms_output.put_line('새로운 라인 생성');
end;
/