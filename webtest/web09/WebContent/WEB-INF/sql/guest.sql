delete from GUEST;

select * from GUEST;

delete from guest where sabun=1111;

select * from guest order by sabun desc;

select rownum as rn,sabun,name from (select * from guest order by sabun desc);
--p1 rownum 1~10
select rownum as rn,sabun,name from (select * from guest order by sabun desc) where rownum>=1 and rownum<=10;
--p2 rownum 11~20
select * from (select rownum as rn,sabun,name from (select * from guest order by sabun desc)) where rownum>=11 and rownum<=20;
select * from (select rownum as rn,sabun,name from (select * from guest order by sabun desc)) where rn between 11 and 20;
--p3 rownum 21~30

select rownum from (select rownum from guest);
