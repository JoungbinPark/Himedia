--10_VIEW.SQL

/* 오라클 - 뷰(VIEW)
	물리적인 테이블에 근거한 논리적인 '가상 테이블' -> 저장되어 있는 SELECT문
	가상이란 단어는 실질적으로 데이터를 저장하지 않고 있기 때문에 붙었다. 
	테이블이란 단어는 실질적으로 데이터를 저장하고 있지 않더라고 사용계정자는 마치 테이블을 저장한 것과 동일하게 뷰를 사용할 수 있다
	뷰는 기본테이블에서 파생된 객체로서 기본테이블에 대한 하나의 쿼리문임
	실제 테이블에 저장된 데이터를 뷰를 통해 볼 수 있도록 함
	사용자는 주어진 뷰를 통해 기본테이블에 제한적으로 접근한다.
	뷰를 생성하기 위해서는 실질적으로 데이터를 저장하고 있는 물리적인 테이블이 존재해야 하는데 이 테이블을 기본테이블이라 한다.  
*/

-- 뷰 생성 방법
CREATE OR REPLACE VIEW 뷰이름 AS SELECT ~

CREATE OR REPLACE VIEW EMPINFO AS
SELECT A.EMPNO, A.ENAME, A.DEPTNO, B.DNAME, B.LOC
FROM EMP A, DEPT B
WHERE A.DEPTNO = B.DEPTNO;

SELECT * FROM EMPINFO;

-- RENTLIST, MEMBERLIST, BOOKLISET가 조인된 결과를 REPORT라는 이름의 뷰로 생성하시오
-- 대여일자, 대여도서번호, 제목, 대여회원번호, 회원명, 매출액(OUTPRICE-DISCOUNT)


CREATE OR REPLACE VIEW REPORT AS 
SELECT A.RENT_DATE AS 대여일자, A.BNUM AS 도서번호, B.SUBJECT AS 도서제목, 
	A.MNUM AS 회원번호, C.MEMBERNAME AS 회원명, OUTPRICE-DISCOUNT AS "매출액" 
FROM RENTLIST A, BOOKLIST B, MEMBERLIST C
WHERE A.BNUM = B.BOOKNUM AND A.MNUM = C.MEMBERNUM;

SELECT * FROM REPORT;
