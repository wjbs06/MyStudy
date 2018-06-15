select ename,job,sal,decode(job,'CLERK',sal*1.05,'SALESMAN',sal*1.1,'MANAGER',sal*1.15,'ANALYST',sal*1.2) as 인상후금액 from emp;

