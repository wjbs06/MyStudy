
public class day33 {

	/*
	 *
		create or replace procedure pl11
		--인자선언
		--su in number 원래 생략된 in / out인자도 있다
		(su number)
		is
		--변수선언
			--num number(1);
		begin
		--실행문	
			num :=su;
			if(num =1) then
			dbms_output.put_line('num=1');
			elseif(num=2) then
			dbms_output.put_line('num=1');
			else
			dbms_output.put_line('num=1 or num=2 가 아님');
			end if;
		end;
		/
	 *
	 * @ pl11.sql
	 * execute pl11
	 *
	 *
	 *
	 *create or replace procedure pl11
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
	 *
	 * variable var_su number; 변수 선언
	 * execute pl11(:var_su); 변수 대입
	 * print var_su; 변수 출력
	 *
	 *
	 *create or replace procedure pl12(
			num in emp.empno%type,
			var_ename out emp.ename%type,
			var_job out emp.job%type
		)
		is
			
		begin
			select ename,job into var_ename,var_job from emp where empno=num;
		
		end;
		/
	 *
	 * variable var_ename varchar2(10);
	 * variable var_job varchar2(10);
	 * execute pl12(7839,:vname,:vjob);
	 *
	 *
	 *
	 *
	 *declare
			myrow emp%rowtype;
			--커서 선언
			coursor c is select empno,ename from emp where empno=7839;
		begin
			--커서 오픈
			open c;
			--커서 패치;
			fetch c into myrow.empno,myrow.ename;
			close c;
		end;
		/
	 *
	 *
		declare
			myrow emp%rowtype;
			--커서 선언
			cursor c is select empno,ename from emp;
		begin
			--커서 오픈
			open c;
			--커서 패치;
			for i in 1..5 loop
			fetch c into myrow.empno,myrow.ename;
			dbms_output.put_line('empno='||myrow.empno);
			dbms_output.put_line('ename='||myrow.ename);
			end loop;
			close c;
		end;
		/
	 *
	 *
	 *declare
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
	 *
	 *
	 *create or replace procedure pl14
		is
			i emp%rowtype;
			cursor c is select empno,ename from emp;
		begin
			for i in c loop
				dbms_output.put_line('empno='||i.empno);
				dbms_output.put_line('ename='||i.ename);
			end loop;
		end;
		/
	 *
	 *
	 *
	 *
	 *create or replace function pl15
		(no emp.empno%type)
		--out 불가 in 만 가능
		
		--리턴 오직 하나만 리턴,반드시 리턴 값이 있음
			return emp.ename%type
		--is 앞에서 ; 금지
		is
			dat date;
			name emp.ename%type;
		begin
			--select sysdate into dat from dual;
			--내부에서 insert, update, delete 불가
			--update emp set ename='test' where empno=no;
			select ename into name from emp where empno=no;
			--리턴 값은 위에서 선언한 리턴의 타입과 일치
			return name;
		end;
		/
	 *
	 *
		--create [or replace] trigger 트리거명
		--언제 [befor | after] 무엇이 [insert | update | delete ] on 테이블명
		create or replace trigger pl16
			after insert or update on ex16		
		begin
			dbms_output.put_line('새로운 라인 생성');
		end;
		/
	 *
	 *
	 *
		create or replace package pl17
		is
			procedure proc1;
			procedure proc2(no emp.empno%type);
		end;
		/
		create or replace package body pl17
		is
		------------------------------------------
			procedure proc1
			is
			begin
				dbms_output.put_line('proc1 실행1');
			end;
		-----------------------------------------------
			procedure proc2(
				no emp.empno%type
			)
			is
				mylow emp%rowtype;
			begin
				select empno,job into mylow.ename,mylow.job from emp where empno=no;
				dbms_output.put_line('ename='||mylow.ename);
				dbms_output.put_line('job='||mylow.job);
			end;
		end;
		/
	 *
	 *
	 * 앞에 rownum을 하면 순번이 나옴
	 * select rownum,empno,ename from emp;
	 * select rownum,empno,ename from emp where rownum<6;
	 * select * from (select rownum as rn,empno,ename form emp) where rn>5 and rn<11;
	 * 
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 *
	 */
	public static void main(String[] args) {
	}

}
