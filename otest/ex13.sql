drop table ex13;
		create table ex13(
			num number primary key,
			name varchar2(9)
		);
		--시퀀스
		--다음수 호출: 시퀀스명.nextval
		--현재까지 카운트: 시퀀스명.currval
		--start with 수: 수부터 시작
		--increment by 수: 수만큼 증가
		drop sequence ex13_seq;
		create sequence ex13_seq start with 100 increment by 10;