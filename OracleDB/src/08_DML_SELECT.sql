-- SELECT문(검색)
-- 가장 사용빈도수가 높은 명령어

-- 1. SCOTT 사용자가 관리하고 있는 테이블 목록
SELECT * FROM TAB;
SELECT * FROM TABS;

-- 2. 특정 테이블의 구조 조회(필드리스트/데이터 형식)
DESC BOOKLIST;		-- 커맨드 창(SQLPLUS)에서 확인 요망
DESC MEMBERLIST;	-- 커맨드 창(SQLPLUS)에서 확인 요망

-- 3. 테이블의 제약사항 조회
SELECT * FROM USER_CONSTRAINTS;
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'RENTLIST';
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'BOOKLIST';
SELECT * FROM USER_CONSTRAINTS WHERE TABLE_NAME = 'MEMBERLIST';

/* SELECT의 사용법
	SELECT 필드명 FROM 테이블명 WHERE 검색조건
	모든 필드를 한번에 지목하려면 *을 써준다
	WHERE절을 붙여 조건에 맞는 레코드만 골라내기도 한다
*/

-- 출판년도가 2020년 이후인 도서의 제목과 출판년도를 조회
SELECT SUBJECT, MAKEYEAR FROM BOOKLIST WHERE MAKEYEAR >= 2020;

SELECT * FROM BOOKLIST; --검색조건 없이 모든 필드를 다 조회해서 열람

-- 연산의 결과가 필드의 항목에 조회될 수 있습니다. 
SELECT OUTPRICE * 10 - INPRICE FROM BOOKLIST;
SELECT OUTPRICE * 10 - INPRICE AS 마진 FROM BOOKLIST;
SELECT SUBJECT AS 제목, OUTPRICE * 10 - INPRICE AS 마진 FROM BOOKLIST;
SELECT SUBJECT AS "도서 제목", OUTPRICE * 10 - INPRICE AS "10회 대여 마진" FROM BOOKLIST;
SELECT BOOKNUM ||'-'|| SUBJECT AS "BOOK INFO" FROM BOOKLIST;
-- 오라클SL에서 ||은 이어붙이기 연산

-- 중복제거 DISTINCT
SELECT BNUM AS 대여도서번호들 FROM RENTLIST;
SELECT DISTINCT BNUM AS 대여도서번호들 FROM RENTLIST;

-- 함수의 사용
SELECT AVG(INPRICE) AS 입고가격평균 FROM BOOKLIST;

-- 검색조건 : UPDATE와 DELETE에서 사용하던 WHERE와 사용방식이 동일

SELECT * FROM MEMBERLIST;

--MEMBERLIST 테이블에서 이름이 '홍'으로 시작하는 회원의 모든 정보 출력
SELECT * FROM MEMBERLIST WHERE MEMBERNAME LIKE '홍%';

--MEMBERLIST 테이블에서 1983년 이후로 태어난 회원의 모든 정보
SELECT * FROM MEMBERLIST WHERE BIRTH >='1983-01-01';

--BOOKLIST에서 제작년도가 2016년 이전이거나 입고가격(INPRICE)이 18000 이하인 도서의 모든 정보
SELECT * FROM BOOKLIST WHERE MAKEYEAR < 2016 OR INPRICE<=18000;

--BOOKLIST에서 도서 제목에 두번째 글자가 '것'인 도서 정보
SELECT * FROM BOOKLIST WHERE SUBJECT LIKE '_것%';

SELECT * FROM EMP;
SELECT * FROM DEPT;

-- IN ANY SOME ALL

-- 부서번호가 10, 20, 30 인 사원들의 모든 필드 조회
	-- 방법 #1
SELECT * FROM EMP WHERE DEPTNO = 10 OR DEPTNO = 20 OR DEPTNO = 30;

	-- 방법 #2 : 40이 아닌 값
SELECT * FROM EMP WHERE DEPTNO <> 40;	
	-- 방법 #3
SELECT * FROM EMP WHERE DEPTNO IN(10, 20, 30);

-- 1. ANY
SELECT * FROM EMP WHERE DEPTNO = ANY(10, 20, 40);
-- 괄호안에 나열된 내용 중 어느 하나라도 해당하면 검색
-- IN과 유사

-- 2. SOME - ANY와 동일
SELECT * FROM EMP WHERE DEPTNO = SOME(10, 20, 40);

-- 3. ALL
SELECT * FROM EMP WHERE DEPTNO = ALL(10, 20, 40);
-- 괄호안의 모든값이 동시 만족해야하는 조건으로 해당 레코드가 없을 때가 대부분. 사용빈도가 낮다
SELECT * FROM EMP WHERE DEPTNO <> ALL(10, 20, 40);
-- 이와 같이 구성내용 모두 같지 않을 때를 필터링할 때 자주 사용

-- 위 예문을 IN으로 사용
SELECT * FROM EMP WHERE DEPTNO NOT IN(10,20,40);

-- 그 외 활용하기 좋은 SELECT의 예제

-- 부서번호가 10이 아닌 사원
SELECT * FROM EMP WHERE NO (DEPTNO = 10);
SELECT * FROM EMP WHERE DEPTNO <> 10;

-- 금여가 1000달러 이상, 3000달러 이하
SELECT * FROM EMP WHERE SAL >=1000 AND SAL <=3000;
SELECT * FROM EMP WHERE SAL BETWEEN 1000 AND 3000;

-- 사원의 연봉 출력
SELECT DEPTNO, ENAME, SAL*12 AS 연봉 FROM EMP;


/* 정렬(SORT) : WHERE 구문 뒤, 또는 구문의 맨 끝에 ORDER BY 필드명[DESC]
	SELECT 명령의 결과를 특정 필드값의 오름차순이나 내림차순으로 정령해랄라는 명령
	ASC : 오름차순 정렬. 쓰지 않으면 기본이 오름차순
	DESC : 내림차순 정렬. 내림차순을 하기 위해선 반드시 필드명 뒤에 써야한다. 
*/	
-- EMP 테이블
-- SAL이 1000 이상인 데이터를 ENAME의 오름차순으로 정렬하여 조회
SELECT * FROM EMP WHERE SAL >= 1000 ORDER BY ENAME;
-- SAL이 1000 이상인 데이터를 ENAME의 내림차순으로 정렬하여 조회
SELECT * FROM EMP WHERE SAL >= 1000 ORDER BY ENAME DESC;

-- JOB으로 내림차순 정렬 후 같은 JOB_ID 사이에선 순서를 HIREDATE의 내림차순으로 정렬
SELECT * FROM EMP ORDER BY JOB DESC, HIREDATE DESC;
-- 두가지 이상의 정렬 기준이 필요하다면 위와 같이 컴마(,)로 구분해서 두가지 기준을 지정해주며, 
-- JOB으로 내림차순 정렬 후, 같은 JOB값들 사이에서 HIREDATE로 내림차순 정렬
