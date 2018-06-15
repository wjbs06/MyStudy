
public class day29 {

	/*
	 * 
	 * 
	 * 리눅스에서 오라클 db를 깔려고함
	 * 
	 * unzip -q orc~~~~
	 * 
	 * yum install libaio bc flex 로 설치를 해야함
	 * 최소사양이 메모리2g라서 늘려야함
	 * 
	 * cd Disk1
	 * rpm -i  orc~~~~
	 * 
	 *  /etc/init.d/oracle-xe configure
	 *  설정 포트
	 *  설정 리스너포트
	 *  시스템의 비밀번호
	 *  부팅시 계속 킬것인지 y
	 *  
	 *   /u01/~~?~/~/~/~/bin/~.env.sh
	 * 
	 * cd /u01/app/oracle/
	 * . /u01/app/oracle/product/11.2.0/xe/bin/oracle_env.sh
	 * sqlplus
	 * connect system/oracle 입력
	 * 
	 * //////////////////////////////
	 * 안되서 윈도우에서 오라클db설치
	 * 파일 2개 받음 오라클 설치, scott
	 * 
	 * 
	 * cmd run..
	 * 
	 * 	sql 계정명/비밀번호  scott/tiger
	 * 
	 * 테이블 명세
	 * desc 테이블명;
	 * 
	 * 1.정보출력-select 문
	 * select * from 테이블명;
	 * select 컬럼명,컬럼명 from 테이블명;
	 * 컬럼 as 별칭,컬럼 as 별칭 가능
	 * select all 컬럼명 from 테이블명; 
	 * select distinct 컬럼명 from 테이블명; 중복값은 한번만 
	 * select * from 테이블명 where 조건
	 * where <> ^= != not연산자
	 * 
	 * sql에서 and 가 or보다 우선순위가 높다
	 * 
	 * in 포함
	 * like 패턴찾음 와일드% like '___D';
	 * select ename from emp where ename like '%A%';
	 * % 아무거나 0개이상 _ 아무거나 하나의 문자
	 * 
	 * null을 대체하는 is null / is not null
	 * select ename, comm from emp where com is null;
	 * null 인 값에는 숫자도 더하지 못한다.
	 * 
	 * select * from emp where 조건 order by 컬럼
	 * 
	 * select * from emp order by 컬럼명; 오름차순/
	 * select * from emp order by 컬럼명 asc/desc;/
	 * 
	 * 2. 추가insert
	 * insert into 테이블명 (컬럼,컬럼) values(값,값);
	 * insert into 테이블명 values(값,값);
	 * 
	 * 3.데이터의 삭제 delete
	 * delete from 테이블명 where 조건;
	 * 
	 * 4.데이터의 수정 update
	 * update  테이블명 set 컬럼명=값,컬럼명=값... where 조건;
	 * 
	 * 
	 * 
	 * 테이블 생성
	 * create table 테이블명(컬럼명 자료형,..);
	 * create table 테이블명(
	 * 컬럼명 자료형,
	 * 컬럼명 자료형,
	 * ...
	 * );
	 * 자료형
	 * 숫자 - number, number(자릿수),number(전체자릿수,소수점자릿수)
	 * 문자열 - char,varchar2(동적) /mysql에 varchar가 있음 오라클도 있지만 사용하지 않음
	 * 날짜 - date
	 * 
	 * truncfate table 테이블명;
	 * 테이블 잘림 포인터 잘림
	 * 
	 * drop table 테이블명;
	 * 테이블 삭제
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
