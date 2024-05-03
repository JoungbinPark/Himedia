-- 04_LIMITOFFSET.sql
/* 
	SELECT 명령의 결과 레코드가 개수가 많을 때 일부만 지목해서 열람할 수 있습니다.
	오라클에서는 ROWNUM 이라는 키워드를 이용
		SELECT ROWNUM, 테이블명.* FROM 테이블명;
		SELECT * FROM 테이블명 WHERE ROWNUM >= 1 AND ROWNUM <=10;
*/


-- LIMIT
-- SELECT로 데이터를 조회할 때, 조회할 레코드의 개수를 조절 제한할 수 있습니다. 
SELECT * FROM MEMBERLIST ORDER BY MEMBERNUM DESC LIMIT 5;
-- 회원번호 조회하여 5개의 레코드만 리턴

-- OFFSET
-- SELECT로 데이터를 조회할 때, 맨 위에서부터 OFFSET에 지정한 번째까지는 뛰어넘고 그 다음부터 리턴
SELECT * FROM MEMBERLIST ORDER BY MEMBERNUM DESC;
SELECT * FROM MEMBERLIST ORDER BY MEMBERNUM DESC LIMIT 5 OFFSET 3;