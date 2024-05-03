/* 오라클 - 시퀀스(Sequence)
	테이블 내의 중복되지 않는 숫자를 자동으로 생성하는 자동 번호 발생기
	테이블 생성 후 시퀀스(일련번호)를 따로 만들어야 한다. 
	 
	형태
	CREATE SEQUENCE 시퀀스명 START WITH 시작숫자 INCREMENT BY 증가량;
	
	주로 NUMBER 형식에 기본키값으로 사용
	일련번호 정도로 이해해도 무방
	NUMBER(자리수) : 자료형의 자리수가 몇자리냐에 따라 그만큼 숫자가 증가할 수 있습니다. 
*/

-- 1. 시퀀스의 생성
CREATE SEQUENCE BOOK_SEQ START WITH 1 INCREMENT BY 1;

-- 테이블에 레코드를 추가합니다. 
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL, '일곱해의 마지막', 2020, 12150, 2000, 'ALL');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL, '봉제인형 살인사건', 2019, 13150, 2000, '18');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL, '쇼코의 미소', 2023, 13420, 2000, '12');

SELECT * FROM BOOKLIST;

-- 시퀀스 수정 : 최대 증가값을 14까지로 제한
ALTER SEQUENCE BOOK_SEQ MAXVALUE 14;

-- 시퀀스 삭제
DROP SEQUENCE BOOK_SEQ;

-- 시퀀스 재생성 : 다음숫자부터 시작하게 하여 기존 레코드와의 중복을 방지
CREATE SEQUENCE BOOK_SEQ START WITH 15 INCREMENT BY 1;

-- 1부터 1씩 늘어나는 MEMBER_SEQ, RENT_SEQ를 생성
CREATE SEQUENCE MEMBER_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE RENT_SEQ START WITH 1 INCREMENT BY 1;

