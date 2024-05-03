--데이터 변경 & 수정(UPDATE)

UPDATE 테이블명 SET 변경내용 WHERE 검색조건

SELECT * FROM BOOKLIST;

UPDATE MEMBERLIST SET AGE = 30, PHONE = '010-0000-1111' WHERE MEMBERNUM = 3;

/*
명령문의 WHERE 이후 구문은 생략 가능 -> 단 이부분 생략 시 모든 레코드를 대상으로 SET 내용을 수정
검색 조건을 활용하는 조건연산이며 where부분은 자바 if()문의 괄호 안의 역할을 수행한다.
	ex) 나이가 29세 이상 -> WHERE AGE >= 29
두개 이상의 필드를 수정하고자 한다면 ','로 구분해서 기술
복합조건을 사용하고자 한다면 AND, OR 등을 사용(&& == AND, || == OR, ! == NOT)
*/

--BOOKLIST테이블의 도서제목이 봉제인형 살인사건 도서의 GRADE를 18로 수정
UPDATE BOOKLIST SET GRADE = 18 WHERE SUBJECT = '봉제인형 살인사건';
UPDATE BOOKLIST SET GRADE = 18 WHERE SUBJECT LIKE '봉제인형%';
UPDATE BOOKLIST SET GRADE = 18 WHERE SUBJECT LIKE '%살인사건';
UPDATE BOOKLIST SET GRADE = 18 WHERE SUBJECT LIKE '%인형%';

-- BOOKLIST의 모든 도서대여 가격을 10% 이상 인상한 값으로 수정
UPDATE BOOKLIST SET INPRICE = INPRICE*1.1

-- MEMBERLIST에서 사온포인트가 300이상인 회원에게 30점 가산
UPDATE MEMBERLIST SET BPOINT = BPOINT + 30 WHERE BPOINT >=300;

-- 생년월일이 NULL인 회원의 생년월일을 2000-01-01로 AGE 23으로 변경
UPDATE MEMBERLIST SET BIRTH = '2000/01/01' WHERE BIRTH IS NULL;

-- GENDER가 NULL인 회원의 GENDER를 'M'으로 변경 
UPDATE MEMBERLIST SET GENDER = 'M' WHERE GENDER IS NULL;


-- 외래키로 참조되는 필드를 수정
UPDATE BOOKLIST SET BOOKNUM = 2 WHERE BOOKNUM = 27;
	-- BOOKLIST의 BOOKNUM은 RENTLIST의 BNUM을 외래키로 참조하고 있음
		-- RENTLIST의 BNUM에 7번이 있다면 변경이 불가능함
		

-- 해결방법 #1 : 외래키를 지우고 해당 BOOKNUM과 BNUM을 함께 수정한 후 다시 외래키를 설정
-- 해결방법 #2 : PL/SQL의 트리거 기능을 이용해서 동시에 변경


-- 레코드의 삭제
DELETE FROM 테이블명 WHERE 조건식
-- WHERE 조건식 생략 시 모든 레코드가 삭제

DELETE FROM RENTLIST WHERE DISCOUNT <= 10;

-- 삭제의 제한
DELETE FROM BOOKLIST WHERE BOOKNUM = 7;
-- 외래키로 참조되고 있어 참조무결성을 해칠 우려가 있다면 삭제가 실패함

-- 해결방법 #1
-- 해결하려면 우선 RENTLIST 테이블의 해당도서 대여목록 레코드(CHILD RECORD)를 모두 삭제 후 BOOKLIST 테이블에서 해당 도서 삭제
DELETE FROM RENTLIST WHERE BNUM = 7;
DELETE FROM BOOKLIST WHERE BOOKNUM = 7;

-- 해결방법 #2
-- 외래키 제약조건을 삭제한 후 다시 생성
-- 외래키 생성 시에 옵션을 추가해서
-- 참조되는 값(PARENTS RECORD)이 삭제되면 참조되는 값(CHILD RECORD)도 같이 삭제되게 구성

SELECT * FROM BOOKLIST;
SELECT * FROM RENTLIST;
SELECT * FROM MEMBERLIST;

ALTER TABLE BOOKLIST 

--외래키 삭제
ALTER TABLE RENTLIST DROP CONSTRAINT FK1;
ALTER TABLE RENTLIST ADD CONSTRAINT FK1 FOREIGN KEY(BNUM) REFERENCES BOOKLIST(BOOKNUM) ON DELETE CASCADE;

MEMBERLIST테이블에서 회원 한명을 삭제하면, RENTLIST테이블에서도 해당회원이 대여한 기록을 같이 삭제하도록 외래키 설정을 바꿔주세요
ALTER TABLE RENTLIST DROP CONSTRAINT FK2;
ALTER TABLE RENTLIST ADD CONSTRAINT FK1 FOREIGN KEY(MNUM) REFERENCES MEMBERLIST(MEMBERNUM) ON DELETE CASCADE;