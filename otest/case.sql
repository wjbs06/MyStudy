select empno,ename,
	case when deptno=10 then '서울'
		when deptno=20 then '인천'
		when deptno=30 then '수원'
		when deptno=40 then '성남'
	end as 지역명
from emp;