--SQL 파일에서 주석문은 "--" 표시하고 해당내용을 기술.

--Table : 데이터 베이스에서 사용되는 데이터 집합의 단위. 흔히 알고 있는 "표" 양식
--Record : 행에 해당하는 데이터 단위. 튜플.
--Field : 열에 해당하는 데이터 단위. 속성. 애트리뷰트. 

-- 위와 같이 표 형식의 데이터베이스를 "관계형 데이터 베이스"라고 부른다. 

-- 현재 출시되어 데이터베이스로 활용되는 제품 : Oracle, MySQL, MSSQL, MariaDB, MongoDB, Access

-- DB 프로그램에는 저장하는 공간이나 기능이 있지만, 이를 가능하게 해주는 프로그램이 따로 있습니다. 
-- DB 조작 운영을 가능하게 하는 프로그램 : DBMS(DataBase Management System)
-- 각 데이터베이스 제품들에는 자신의 DB를 관리할 수 있는 DBMS가 존재
-- 오라클데이터베이스에서 사용가능한 DBMS : SQL Developer, SQLPLUS, Eclipse

-- DB에 활용되는 언어(Language)
-- SQL(Structured Query Language) : 관계형 데이터베이스 관리 시스템(RDBMS)의 데이터를 관리하기 위해 설계된 특수 목적의 프로그래밍 언어

-- SQL의 세가지 종류
-- 1. DDL(Database Definition Language)  create user ~
-- 2. DML(Database Management Language) 
-- 3. DCL(Database Control Language) grant dba to ~

--DDL(Data Definition Language) : 데이터 정의어
-- 예시 : Create, Alter, Drop
-- Create : 테이블, 뷰, 사용자 등을 생성할 때 사용하는 명령
-- Alter : 이미 생성되어 있는 테이블, 뷰, 사용자 등의 구조를 수정하기 위한 명령
-- Drop : 이미 생성되어 있는 테이블, 뷰, 사용자 등을 삭제하기 위한 명령

--DML(Data Management Language) : 데이터 조작어 (레코드 단위 처리)
-- 예시 : Insert, Update, Delete, Select
-- Insert : 테이블에 레코드를 추가하기 위한 명령
-- Update : 테이블에 있는 레코드 중 일부 또는 전부를 수정하기 위한 명령
-- Delete : 테이블에 있는 레코드 중 일부 또는 전부를 삭제하기 위한 명령
-- Select : 테이블에 있는 레코드 중 일부 또는 전부를 조회(검색)하여 열람하기 위한 명령

--DCL(Data Control Language) : 데이터 제어어
-- 예시 : Grant, Revoke
-- Grant : 특정 사용자에게 권한을 설정
-- Revoke : 특정 사용자에게 권한을 해제


-- 초기화
DROP TABLE BOOKLIST;
DROP TABLE MEMBERLIST;
DROP TABLE RENTLIST;

CREATE TABLE bookList(
	booknum VARCHAR2(5), 
	subject varchar2(30) not null,
	makeyear number(4),
	inprice number(6) not null,
	outprice number(6) not null,
	GRADE VARCHAR2(15),
	constraint booklist_pk primary key(booknum)
);

CREATE TABLE memberList(
	memberNum VARCHAR2(5),
	memberName VARCHAR2(12) not null,
	phone VARCHAR2(13) not null,
	birth DATE,
	Bpoint NUMBER(6),
	GENDER VARCHAR2(5),
	AGE NUMBER(6),
	constraint memberNum_pk primary key(memberNum)
);

CREATE TABLE rentList(
	idx NUMBER(3), 					
	rent_date DATE default sysdate, 
	bnum VARCHAR2(5) not null,		
	mnum VARCHAR2(5) not null,		
	discount NUMBER(4) default 500,
	constraint rent_pk primary key(idx),
	constraint fk1 foreign key(bnum) references bookList(booknum),
	--현재 테이블의 bnum 필드는 bookList 테이블의 booknum 필드값을 참조합니다. 
	constraint fk2 foreign key(mnum) references memberList(membernum)
	--현재 테이블의 mnum 필드는 memberList 테이블의 membernum 필드값을 참조합니다. 
	);
	
DROP SEQUENCE BOOK_SEQ;
DROP SEQUENCE MEMBER_SEQ;
DROP SEQUENCE RENT_SEQ;

CREATE SEQUENCE BOOK_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE MEMBER_SEQ START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE RENT_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'일곱해의 마지막',2020, 12150, 2000, 'ALL');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'봉제인형 살인사건',2019, 13150, 2000, '18');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'쇼코의 미소',2023, 13420, 2000, '12');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'좀비아이',2020, 12000, 2500, 'ALL');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'가면산장 살인사건',2018, 13320, 1500, '12');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'나미야 잡화점의 기적',2017, 13320, 2000, '18');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'유튜브 영상편집',2020, 20700, 2500, 'ALL');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'이것이 자바다',2017, 30000, 3000, '18');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'JSP웹프로그래밍',2016, 25000, 2500, 'ALL');
INSERT INTO BOOKLIST VALUES(BOOK_SEQ.NEXTVAL,'오라클 데이터베이스',2020, 30000, 3000, 'ALL');

INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'홍길동','010-1111-2222', '75/11/13', 240, 'M', 23);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'김개똥','010-5164-2268', '45/12/03', 340, 'F', 27);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'라기라','010-7777-8848', '85/10/30', 440, 'F', 32);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'김성모','010-5124-3547', '95/01/01', 540, 'F', 25);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'윤대춘','010-1502-0012', '00/03/05', 220, 'M', 33);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'일음동','010-1851-2229', '02/02/19', 140, 'M', 24);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'황희찬','010-1131-2225', '75/05/12', 260, 'F', 65);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'손흥민','010-1511-2252', '94/07/16', 320, 'F', 34);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'김건모','010-9415-2382', '92/09/20', 570, 'F', 24);
INSERT INTO MEMBERLIST VALUES(MEMBER_SEQ.NEXTVAL,'최대한','010-1519-5712', '88/08/21', 470, 'M', 17);

INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/01', 1, 1, 100);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/01', 2, 3, 200);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/01', 3, 3, 300);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/02', 4, 4, 400);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/02', 5, 7, 100);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/02', 6, 9, 100);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/03', 7, 1, 200);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/08', 8, 1, 300);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/12', 9, 4, 400);
INSERT INTO RENTLIST VALUES(RENT_SEQ.NEXTVAL, '2024/04/13', 10, 6, 500);

SELECT * FROM BOOKLIST;
SELECT * FROM MEMBERLIST;
SELECT * FROM RENTLIST;

ALTER TABLE MEMBERLIST MODIFY(bpoint DEFAULT 0);
