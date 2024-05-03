-- 02_DDL.sql
-- DDL(Data Definition Language) 데이터 정의어
-- 테이블의 생성 CREATE (대소문자의 구별이 없지만 섞어쓰진 말자)

CREATE TABLE 테이블이름(
	필드명1 DATATYPE [DEFAULT 값 OR 제약조건 등], 
	필드명2 DATATYPE [DEFAULT 값 OR 제약조건 등], 
	필드명3 DATATYPE [DEFAULT 값 OR 제약조건 등],  
	필드명4 DATATYPE [DEFAULT 값 OR 제약조건 등], 
	...
	필드명N DATATYPE [DEFAULT 값 OR 제약조건 등]
);

-- 도서대여점의 도서목록 테이블의 생성
-- 필드 : booknum, subject, makeyear, inprice, outprice
-- 자료형 : booknum(문자5자리), subject(문자30), makeyear(숫자4), inprice(숫자6), outprice(숫자6)
-- 제약조건 : booknum(Not null), subject(Not null), makeyear, inprice, outprice
-- 테이블명 : booklist

CREATE TABLE bookList(
	booknum varchar2(5), 
	subject varchar2(30) not null,
	makeyear number(4),
	inprice number(6) not null,
	outprice number(6) not null,
	-- 필드명 옆에 현재 필드에만 적용하는 제약조건을 필드레벨의 제약
	-- 아래처럼 쓰는 것은 테이블 레벨의 제약조건
	constraint booklist_pk primary key(booknum)
	-- constraint : 테이블 수준의 제약조건을 지정하는 키워드(명령)
	-- booklist_pk : 테이블 외부에서 현재 제약조건을 컨트롤 하기 위한 제약조건의 고유이름
	-- primary key(booknum) : 기본키로 booknum을 지정하겠다는 뜻
);

SELECT * FROM bookList;

DROP TABLE bookList purge;

-- 기본키(Primary Key)
-- 테이블을 구성하는 필드 중에서 갖는 값들이 빈칸(Null)이 없고 서로 다른 값(유일한 값)을 가지고 있어 레코드를 구분해낼 수 있는 유일한 필드
-- 테이블을 구성하는 필드 중 자격이 되는 필드 중 하나에 부여하는 테이블의 대표값
-- 기본키를 지정함으로써 기본키가 지정되지 않았을 떄 발생할 수 있는 오류들을 미연에 방지할 수 있다. 
-- 기본키로 결함을 없앤 상태로 유지되는 것을 "개체 무결성"이라 한다. 



-- CREATE TABLE 명령의 세부규칙
-- 1. 테이블의 이름과 객체를 의미할 수 있는 적합한 이름을 사용합니다. ( 자바의 변수명과 비슷)
-- 2. 다른 테이블과 이름이 중복되지 않게 정합니다. (같은 아이디로 로그인했을 때 중복)
-- 3. 한 테이블 내에서도 필드명이 중복되지 않게 정합니다. 
-- 4. 각 필드들은 ","로 구분해서 생성함
-- 5. CREATE를 비롯한 모든 SQL 명령은 ";"로 닫아준다.
-- 6. 필드명 뒤에 DATATYPE을 반드시 지정하고, [] 안의 내용은 생략가능
-- 7. 예약어, 명령어 등을 테이블명과 필드명으로 쓸 수 없음
-- 8. 테이블 생성 시 대소문자 구분을 하지 않음(기본적으론 대문자)
--	CREATE TABLE
--	create table
--	Create Table
-- 9. 보통은 데이터형식과 용량(크기)를 지정하는데, DATE데이터형식은 유형을 별도로 크기 지정하지 않음
-- 10. 문자데이터의 DataType -> varchar2(10), number(4)
-- 11. 문자데이터 유형은 반드시 가질 수 있는 최대 길이를 표시해야함
-- 12. 숫자 데이터 형식은 byte 수로 표현하지 않고 자리수로 표현 number(4) -> 4자리 숫자(0000 ~ 9999)
-- 13. 컬럼(필드)와 컬럼(필드)의 구분은 콤마로 하되, 마지막 컬럼이나 constraint를 작성 후엔 콤마를 찍지 않음



-- 테이블 생성 2
-- 테이블이름 : memberList(회원리스트)
-- 필드 : memberNum, memberName, Phone, Birth, Bpoint
-- 데이터 형식 : memberNum : VARCHAR2(5), memberName : VARCHAR2(12), phone : VARCHAR2(13), birth : DATE, Bpoint : NUMBER(6)
-- 제약조건 : memberNum, memberName, Phone 세개의 필드 Not Null - 필드 레벨
-- 			memberNum : Primary Key - 테이블 레벨

CREATE TABLE memberList(
	memberNum VARCHAR2(5) not null,
	memberName VARCHAR2(12) not null,
	phone VARCHAR2(13) not null,
	birth DATE,
	Bpoint NUMBER(6),
	constraint memberNum_pk primary key(memberNum)
);

select * from MemberList;



-- 외래키(Foreign Key)
-- 테이블 간의 필수 포함 관계에 있어 상대 테이블의 특정 필드값을 참조하면서 없는 값을 사용하지 않는 필드.
-- 외래키로 유지되는 무결성을 "참조무결성"이라 한다.


-- 테이블 생성 3
-- 테이블 이름 : rentlist
-- 필드 : idx(NUMBER(3)), rent_date(DATE), bnum(VARCHAR2(5)), mnum(VARCHAR2(5)), discount(NUMBER(4))
-- 제약조건 : bnum, mnum : not null

CREATE TABLE rentList(
	idx NUMBER(3), 					--대여기록번호
	rent_date DATE default sysdate, --대여날짜
	--rent_seq NUMBER(3)			--하나의 날짜안에서 지정된 순번
	bnum VARCHAR2(5) not null,		--대여한 도서번호(Book)
	mnum VARCHAR2(5) not null,		--대여한 회원번호(Member)
	discount NUMBER(4) default 500,	--할인금액
	constraint rent_pk primary key(idx),
	--constraint rent_pk primary key(rent date, rent_seq)
	constraint fk1 foreign key(bnum) references bookList(booknum),
	--현재 테이블의 bnum 필드는 bookList 테이블의 booknum 필드값을 참조합니다. 
	constraint fk2 foreign key(mnum) references memberList(membernum)
	--현재 테이블의 mnum 필드는 memberList 테이블의 membernum 필드값을 참조합니다. 
	);
	
SELECT * from rentList;

-- 제약조건(CONSTRAINT)
-- PRIMARY KEY
-- 테이블에 저장된 레코드를 고유하게 식별하기 위한 키
-- 하나의 테이블엔 하나의 기본키만 정의가능
-- 여러 필드가 조합된 기본키 생성 가능
-- 기본키는 중복된 값을 가질 수 없으며 빈간도 있을 수 없다
-- PRIMARY KEY = UNIQUE KEY + NOT NULL

-- UNIQUE KEY
-- 테이블에 저장된 행 데이터를 고유하게 식별하기 위한 고유키
-- 단 NULL은 고유키 제약의 대상이 아니므로, NULL값을 가진 행 여러개가 제약에 위배되진 않습니다.

-- NOT NULL
-- 비어있는 상태. 아무것도 없는 상태를 허용하지 않는다 (입력 필수)

-- CHECK 
-- 입력할 수 있는 값의 범위를 제한.
-- TRUE or FALSE로 평가할 수 있는 논리식을 지정

-- FOREIGN KEY
-- 관계형 데이터 베이스에서 테이블간의 관계를 정의하기 위해 기본키를 다른 테이블의 외래키로 형성하는 경우 외래키가 생성
-- 참조무결성 제약 옵션이 생성
