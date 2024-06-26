-- 09_Join.sql

SELECT * FROM EMP;
SELECT * FROM DEPT;

CREATE TABLE EMP2 AS SELECT ENAME, DEPTNO FROM EMP WHERE JOB = 'SALESMAN';
SELECT * FROM EMP2;

-- 1. 사원명이 SCOTT인 사원의 부서명을 알고 싶을 때
SELECT DEPTNO FROM EMP WHERE ENAME = 'SCOTT';		--20
SELECT DNAME FROM DEPT WHERE DEPTNO = 20;			--RESEARCH
--서브쿼리 사용-----------------------
SELECT DNAME FROM DEPT WHERE DEPTNO = (SELECT DEPTNO FROM EMP WHERE ENAME='SCOTT');

--JOIN
-- 두개 이상의 테이블에 나뉘져 있는 관련 데이터들을 하나의 테이블로 모아서 조회하고자 할 때 사용하는 명령

-- CROSS JOIN : 두개 이상의 테이블이 조인
	-- 가장 최악의 결과를 얻는 조인

SELECT * FROM EMP2, DEPT;

-- EQUI JOIN : 조인 대상이 되는 두 테이블에서 공통적으로 존재하는 칼럼의 값이 일치하는 행을 연결하여 결과를 생성

SELECT * 
FROM EMP2, DEPT 
WHERE EMP2.DEPTNO = DEPT.DEPTNO;

SELECT * FROM EMP2 A, DEPT B WHERE A.DEPTNO = B.DEPTNO;

SELECT * FROM EMP, DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO;

-- RENTLIST의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되, 도서의 제목을 도서번호 옆에 출력하시오.
SELECT RENT_DATE, BNUM, SUBJECT, MNUM, DISCOUNT FROM RENTLIST A, BOOKLIST B WHERE A.BNUM = B.BOOKNUM;

-- RENTLIST의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되, 회원의 이름을 대여회원번호 옆에 출력하시오.
SELECT RENT_DATE, BNUM, MNUM, MEMBERNAME,DISCOUNT FROM RENTLIST A, MEMBERLIST b WHERE A.MNUM = B.MEMBERNUM; 

-- RENTLIST의 대여일자, 대여도서번호, 대여회원번호, 할인금액을 출력하되, 도서의 제목, 회원이름을 도서번호와 회원번호 옆에 출력하세요.
SELECT A.RENT_DATE, A.BNUM, B.SUBJECT, A.MNUM, C.MEMBERNAME, A.DISCOUNT, B.OUTPRICE - A.DISCOUNT AS "매출액" FROM RENTLIST A, BOOKLIST B, MEMBERLIST C WHERE A.BNUM = B.BOOKNUM AND A.MNUM = C.MEMBERNUM;


-- NON-EQUI JOIN : 
-- 동일 컬럼이 없어서 다른 조건을 사용하여 조인
-- 조인 조건에 특정 범위 내에 있는지를 조사하기 위해 조건절에 조인 조건을 '=' 연산자 이외의 비교
SELECT * FROM EMP;
SELECT * FROM SALGRADE;

SELECT A.ENAME, A.SAL, B.GRADE
FROM EMP A, SALGRADE B
WHERE A.SAL BETWEEN B.LOSAL AND B.HISAL;


--OUTER JOIN : 
-- 조인 조건에 만족하지 못해서 해당 결과를 출력 시에 누락이 되는 문제점이 발생할 때 해당 레코드를 출력하는 코인
SELECT A.BOOKNUM, A.SUBJECT, B.RENT_DATE FROM BOOKLIST A, RENTLIST B 
WHERE A.BOOKNUM = B.BNUM(+);

--EMP 테이블에는 DEPTNO가 40인 레코드가 하나도 없다. 그래서 조인된 결과에는 40번 부서의 이름도, LOC도 표시가 안된다. 
SELECT * FROM EMP A, DEPT B
WHERE A.DEPTNO(+) = B.DEPTNO;

-- ANSI JOIN
SELECT A.ENAME, B.DNAME
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO;

-- ANSI INNER JOIN 표현 방식
-- #1
SELECT ENAME, DNAME
FROM EMP INNER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO;

-- #2		(서로 비교되는 필드명이 동일한 경우만 사용)
SELECT ENAME, DNAME
FROM EMP INNER JOIN DEPT USING(DEPTNO);


-- ANSI OUTER JOIN 표현 방식 
SELECT * FROM EMP RIGHT OUTER JOIN DEPT ON EMP.DEPTNO = DEPT.DEPTNO;

SELECT * FROM RENTLIST RIGHT OUTER JOIN BOOKLIST ON RENTLIST.BNUM = BOOKLIST.BOOKNUM;


