--자식 테이블
create table ex09(
sabun number primary key,
name varchar2(9) not null,
--num number references ex08(num)
num number constraint ex09_num_fk references ex08(num)
);