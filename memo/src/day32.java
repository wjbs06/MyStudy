
public class day32 {

	/*
	 * 
	 * db 
	 * 서브쿼리
	 * select * from (select dname,loc from dept);
	 * select * from emp inner join dept on emp.deptno=dept.deptno;
	 * select deptno,dname,loc,(select sysdate from dual) from dept;
	 * select empno,ename from emp where sal>(select avg(sal) from emp);
	 * select empno,ename from emp where empno in(select empno from emp where sal<1800);
	 * 
	 * 테이블 복사
	 * create table 테이블명 as (select 컬럼명 from 테이블명);
	 * create table copydept2 as(select deptno,loc from dept);
	 * create table copydept5 as(select * from dept where 1<0);
	 * where false 로 하면 값들은 복사 안됨
	 * insert into copydept5 (select * from dept); 결과를 삽입할수도 있음
	 * 
	 * update copydept5 set loc=(select loc from dept where deptno=50) where deptno=60;
	 * 
	 * insert into copudept5 values((select max(deptno)+10 from dept),'비트홍대','서울');
	 * 
	 * 
	 * 	drop table ex13;
		create table ex13(
			num number primary key,
			name varchar2(9)
		);
		--시퀀스
		--다음수 호출: 시퀀스명.nextval
		--현재까지 카운트: 시퀀스명.currval
		--start with 수: 수부터 시작
		--increment by 수: 수만큼 증가
		--maxvalue 수: 최대값
		--minvalue 수: 최소값
		-- cycle || nocycle : 맥스이후 순환default nocycle
		-- cache || nocache : default 2
		drop sequence ex13_seq;
		create sequence ex13_seq 
		start with 100 
		increment by 10 
		maxvalue 150
		cycle
		nocache;
		
	 * 
	 * insert into ex13 values(ex13_seq.nextval,'text1');
	 * commit; 트랜잭션실행
	 * 
	 * 유저생성
	 * create user class06 identified by user06;
	 * grant create session to class06;
	 * greant create table to class06;
	 * 
	 * alter user calss06 quota 1m on USERS;
	 * 
	 * savepoint sv1; 
	 * rollback to sv1;
	 * 
	 * create view view_dept as select * from dept;
	 * select empno,ename,loc from emp inner join dept on emp.deptno=dept.deptno)
	 * select view view as (위내용));/제대로 못적음
	 * 
	 * create view view_dept2 as(select * from dept) with read only;
	 * 
	 * distinct 중복 제거
	 * 
	 * create or replace view view_dept as (select * from dept where dname like '%A%');
	 * create or replace view view_dept2 as (select * from dept where dname like '%A%');
	 * 없으면 생성 있으면 대체
	 * 
	 * create force view view_dept2 as (select * from dept);
	 * 
	 * index 데이터가 많을때 빠르게 찾는 방법
	 * select * from ex08 where tel='02';
	 * 
	 * set serveroutput on; 서버에서 output을 막은것을 품
	 * pl01
	 * declare
			--변수의 선언
			num number(3);
			name varchar2(9);
		begin
			--실행문
			num := 1234;
			name := '한글로';
			dbms_output.put_line('hello oracle'||num||name);
		end;
		/
	 * 
	 * 
	 * pl02
	 * declare
			num number;
			name varchar2(30);
		begin
			select empno,ename into num,name from emp where empno=7839;
			dbms_output.put_line('사번'||num);
			dbms_output.put_line('이름'||name);
		end;
		/
	 * 
	 * pl03
	 * declare
			type mytype is record(
				empno emp.empno%type,
				ename emp.ename%type
			);
			one_record mytype;
		begin
			select empno,ename into one_record from emp where empno=7839;
			dbms_output.put_line('사번:'||one_record.empno);
			dbms_output.put_line('이름:'||one_record.ename);
		end;
		/
	 * 
	 * 
	 * pl04
	 * --if조건문
		declare
			num number(1);
		begin
			num :=1;
			if(num=1) then dbms_output.put_line('num=1');
			--end if;
			elsif(num=2) then dbms_output.put_line('num=2');
			elsif(num=3) then dbms_output.put_line('num=3');
			else dbms_output.put_line('1~3값이 아닙니다');	
			end if;
			
		end;
		/
	 * 
	 * 
	 * pl05
	 * --loop반복문
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
	 * 
	 * 
	 * pl06
	 * --while 반복문
		declare
			num number :=0;
		begin
			while(num<4) loop
				dbms_output.put_line('반복:'||num);
				num := num+1;
			end loop;
		end;
		/
	 * 
	 * 
	 * pl07
	 * --for 문
		declare
		begin
			for num in 1..5 loop
				dbms_output.put_line('num:'||num);
			end loop;
		end;
		/
	 * 
	 * 
	 * pl09
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
	 * 
	 * 
	 * pl10
	 * 
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
	 * 
	 * start pl10.sql
	 * execute func01(5)
	 * exec func01(2)
	 * 
	 * 1. 사원의 이름과 급여와 입사일자만을 출력하는 sql
	 * select ename, sal, hiredate from emp;
	 * 2. 급여를 3000이상 받는 사원의 직원번호와 이름
	 * select empno, ename from emp where sal>=3000;
	 * 3. emp중에서 부서번호가 10번인 사원에 관한 모든정보만 출력
	 * select * from emp where deptno=10;
	 * 4. emp중에서 급여가 2000미만이 되는 사원의 정보 중에서 
	 * 사번과 이름,급여를 출력
	 * select empno, ename, sal from emp where sal<2000;
	 * 5.이름이 MILLER인 사람의 사원번호와 사원명과 직급을 출력
	 * select empno,ename,job from emp where ename='MILLER';
	 * 6. 사원번호가 7844이거나 7654이거나 7521인 사원
	 * select ename from emp where empno in(7844,7654,7521);
	 * 7. 급여가 1000에서 3000 사이에 있는 사원
	 * select ename from emp where sal between 1000 and 3000;
	 * 8. 급여가 1500과 2500 사이인 사원의 사번, 이름, 급여를 출력
	 * select empno,ename,sal from emp where sal between 1500 and 2500;
	 * 9. 이름에 A를 포함하지 않은 사원의 사번, 이름을 출력
	 * select empno,ename from emp where ename not like '%A%';
	 * 10. emp중에 보너스 협의가 안된사람은 연봉을 10%인상하는 결과
	 * 	이름,연봉,보너스,인상액,연봉+인상액
	 * select ename,sal,comm,sal*0.1 as 인상액,sal+(sal*0.1) from emp where comm is null;
	 * 11. 사번이 짝수인 사원의 이름과 job을 출력
	 * select ename,job from emp where mod(empno,2)=0;
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
	}

}
