--인자는 3개이상, 홀수갯수로
select empno,ename
	,decode(deptno,
		10,'서울',
		20,'인천',
		30,'수원',
		40,'성남') as 지역명
from emp;
