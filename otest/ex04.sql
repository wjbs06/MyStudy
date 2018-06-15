drop table ex04;
create table ex04(
--num number primary key,
num number constraint ex04_num_pk primary key,
name varchar2(9) not null unique
);

