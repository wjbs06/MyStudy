
public class day31 {

	/*
	 * db
	 * 스키마 출력 desc emp;
	 * select instr('java','a',2,2) from dual;  /찾을값/시작값/(중복시)몇번째
	 * select ename from emp where ename like'____';
	 * select ename from emp from where length(ename)=4;
	 * select ename from emp where instr(ename,'N')=length(ename);
	 * select lpad('oracle',20,'#') from dual;
	 * select rpad('oracle',20,'#') from dual;
	 * select rpad(lpad(1000,20/2,'#'),20,'#') from dual;
	 * select '                 abc            'from dual;
	 * select trim('      abc         ') from dual;
	 * select trim('a' from 'aaaaaaabbbbccccccaaaaaaaaa') from dual;
	 * select trim('#' from '#########1000#########') from dual;
	 * select sysdate from dual;
 	 * select sysdate - hiredate from emp;
	 * select trunc(sysdate - hiredate),sysdate,hiredate from emp;
	 * select sysdate+100 from dual;
	 * select add_months(sysdate,3) from dual;
	 * select next_day(sysdate,'월요일') from dual;
	 * select next_day(sysdate,1) from dual; /1은 월
	 * select next_day(sysdate,7) from dual;/ 7은 일
	 * select trunc(sysdate,'month')from dual; 달의 초
	 * select trunc(sysdate,'year')from dual; 년의 초
	 * select to_char(sysdate,'month mm dy hh:mi:ss')from dual;
	 * select to_char(sysdate,'hh:mi:ss')from dual;
	 * select to_char(sysdate,'pm hh:mi:ss')from dual;
	 * select to_date(20180808,'YYYYMMDD')-syksdate from dual;
	 * select to_date(20180808,'YYYY-MM-DD')-sysdate from dual;
	 * select ename,to_char(sal,'0,000') from emp; 0으로 표시
	 * select ename,to_char(sal,'9,999') from emp; 없으면 무표시
	 * select ename,to_char(sal,'s9,999.99') from emp; s는 부호 
	 * select to_number('$1,234','$9,999')+1 from dual;
	 * select to_char(3.145,'L9,999,999.99') from dual;
	 * select ename,sal,comm,sal+nvl(comm,0) as 총수령액 from emp;
	 * select deptno,nvl(loc,'미정') from dept;
	 * 
	 * select empno,ename
		,decode(deptno,
			10,'서울',
			20,'인천',
			30,'수원',
			40,'성남') as 지역명
		from emp;
	 * 
	 * decode(컬럼,case1,value1,...) --인자는 3개이상, 홀수갯수로
	 * 
	 * select empno,ename,
			case when deptno=10 then '서울'
				when deptno=20 then '인천'
				when deptno=30 then '수원'
				when deptno=40 then '성남'
			end as 지역명
		from emp;
	 * 
	 * 
	 * select ename,job,sal,decode(job,'CLERK',
	 * sal*1.05,'SALESMAN',sal*1.1,'MANAGER',sal*1.15,
	 * 'ANALYST',sal*1.2) as 인상후금액 from emp;
	 * 
	 * create talbe 테이블명(컬럼명 자료형,,ㅣ);
	 * 숫자(최대38~40) number,number(자릿수),number(길이,소수점길이);
	 * 문자(1~2000byte) char(길이),varchar2(길이)
	 * 날짜(시간) date
	 * rlxk
	 * long문자(varchar:~2gb)
	 * lob(바이너리데이터:~2gb)
	 * 
	 * select tname from tab; 가지고 있는 테이블 조회
	 * 
	 * alter table ex06 add(nalja date); 스키마 추가
	 * alter table ex06 add(num1 number,num2 number);스키마 추가 
	 * alter table ex06 drop column num2; 컬럼 삭제
	 * alter table ex06 modify(nalja number);  타입 변경
	 * 
	 * unique 값중복불가
	 * create table ex02(
		num number unique,
		name varchar2(30) unique
		);
	 * 
	 * 
	 * drop table ex03;
		create table ex03(
		num number unique not null,
		name varchar2(30) unique not null
		);
		insert into ex03 values(1,'test1');
		insert into ex03 values(2,'test2');
		insert into ex03 values(3,'test3');
		insert into ex03 values(4,'test4');
		insert into ex03 values(5,'test5');
		select * from ex03
		;
	 * 
	 * 
	 drop table ex04;
		create table ex04(
		--num number primary key,
		num number constraint ex04_num_pk primary key,
		name varchar2(9) not null unique
		);
	 * 
	 * 
	 * 오라클 primay key - 테이블당 1개 유일
	 * 제약조건명명규칙
	 * constraint 클래스명_컬럼명_어떤제약조건(pk,nn,u,fk)
	 * 
	 * alter table ex04 disable constraint ex04_num_pk;
	 * alter table ex04 enable constraint ex04_num_pk;
	 * ALTER TABLE ex04 ADD CONSTRAINT ex04_num_pk PRIMARY KEY(num);
	 * 
	 * 
	 * --부모테이블
		create table ex08(
		num number primary key,
		loc verchar2(6),
		tel varchar2(13)
		);
		insert into ex08 values(1,'서울','02');
		insert into ex08 values(2,'부산','042');
		insert into ex08 values(3,'대구','032');
	 * 
	 * 
		--자식 테이블
		create table ex09(
		sabun number primary key,
		name varchar2(9) not null,
		--num number references ex08(num)
		num number constraint ex09_num_fk references ex08(num)
		);
	 * 
	 * 
	 * 
	 * drop table ex10;
		create table ex10(
			num number default 0,
			sub varchar2(30) default '제목없음',
			nalja date
		);
	 * 
	 * drop table ex10;
		create table ex10(
			num number,
			gender varchar2(3) check(gender in ('남','여'),
			nalja date default sysdate
		);
	 * 
	 * 
	 * select * from emp,dept where emp.deptno=dept.deptno;
	 * select A.ename,B.loc from emp A,dept B where A.deptno=B.deptno;
	 * select A.ename,B.loc from emp A,dept B where A.deptno=B.deptno and A.ename='SMITH';
	 * select A.ename,B.loc from emp A,dept B where A.deptno=B.deptno(+);
	 * select * from emp A,emp B where A.mgr=B.empno;
	 * select A.ename 사원명,B.ename 사수 from emp A,emp B where A.mgr=B.empno;
	 * select * from emp cross join dept; 크로스 조인 표준
	 * select * from emp inner join dept on emp.deptno=dept.deptno;
	 * select * from emp A natural join dept B where ename='SMITH';
	 *
	 * select * from ex11 natural join ex12; 공통을 기준 전부
	 * select * from ex11 inner join ex12 on ex11.num=ex12.num;
	 * select * from ex11 ,ex12 where ex11.num=ex12.num(+); outer join
	 * select * from ex11 left outer join ex12 on ex11.num=ex12.num;
	 * select * from ex11 right outer join ex12 on ex11.num=ex12.num;
	 * 
	 * select * from ex11 right outer join ex12 on ex11.num=ex12.num where ex11.num is null;
	 * select * from ex11 left outer join ex12 on ex11.num=ex12.num where ex12.num is null;
	 * 
	 * select * from ex11 full outer join ex12 on ex11.num=ex12.num;
	 * select * from ex11 full outer join ex12 on ex11.num=ex12.num where ex12.num is null or ex11.num is null;
	 * 
	 * select * from ex11 full outer join ex12 using(num);
	 * 
	 * 
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
