--03_Function.sql

/* 숫자관련 함수
	CEILING(숫자) : 값보다 큰 정수 중 가장 작은 수(올림)
	FLOOR(숫자) : 값보다 작은 정수 중 가장 큰 수(내림)(음수의 경우 제외)
	Round(숫자, 자리수) : 소수점 자리수만큼 남기고 반올림
*/

/* 문자관련 함수
	SUBSTRING('문자열', 시작위치, 개수) : 문자열 중 시작위치부터 개수만큼 출력
	LCASE('문자열') or LOWER('문자열') : 소문자로 변환
	UCASE('문자열') or UPPER('문자열') : 대문자로 변환
	REVERSE('문자열') : 문자열을 반대로 나열
*/

UPDATE BOOKLIST SET GRADE = UPPER(GRADE);
SELECT * FROM BOOKLIST;

/* 날짜 관련 함수
	NOW() : 현재 날짜와 시간 (DATETIME 형식)
	CURDATE() or CURRENT_DATE() : 현재 날짜 (DATE 형식)
	CURTIME() or CUREENT_TIME() : 현재 시간 (TIME 형식)
	
	DATE_ADD(날짜, INTERVAL 더할숫자 기준값)
		: 날짜에서 기준값단위로 더할 숫자 만큼 더한다.
		기준값 : YEAR, MONTH, DAY, HOUR, MINUTE, SECOND

	DATE_SUB(날짜, INTERVAL 뺄숫자 기준값)
		: 날짜에서 기준값 단위로 뺄 숫자만큼 뺀다.

	YEAR(날짜) : 날짜의 연도 추출
	MONTH(날짜) : 날짜의 월 추출
	MONTHNAME(날짜) : 날짜의 월을 영어로 추출
	DAYOFMONTH(날짜) : 날짜의 월별 일자 추출
	DAYOFWEEK(날짜) : 날짜의 주별 일자 출력(일요일(1), 월요일(2)...토요일(7))
	WEEKDAY(날짜) : 날짜의 주별 일자 추출(월요일(0), 화요일(1)...일요일(6))
	
*/
SELECT DATE_ADD(NOW(), INTERVAL 3 YEAR) FROM DUAL;
SELECT CONCAT(YEAR(NOW()), '년') AS 년도 FROM DUAL;

/* 
오라클의 날짜-문자변환
TO_CHAR(SYSDATE, 'YYYYMMDD') : 날짜 -> 문자
TO_DATE('20240417', YYYYMMDD) : 문자 -> 날짜

MySQL 에서의 날짜-문자변환 ('%Y%m%d'의 대소문자 주의)
DATE_FORMAT( NOW(), '%Y%m%d') : 날짜 -> 문자
STR_TO_DATE('20240417', '%Y%m%d') : 문자 -> 날짜
 */

SELECT DATE_FORMAT(NOW(), '%Y%m%d') FROM DUAL;
SELECT STR_TO_DATE('20211013', '%Y%m%d') FROM DUAL;

/* 시간, 날짜 지칭
	%a : 요일(Sun ~ Sat)
	%b : 월(Jan ~ Dec)
	%M : 월(January ~ December)
	%c : 월(0 ~ 12)
	%h : 시간(00 ~ 12)
	%I : 시간(00 ~ 12)
	
	%r : 시간(12시)을 hh:mm:ss AM/PM 형식으로
	%T : 시간(24시)을 hh:mm:ss 형식으로 
*/

/* 집계함수(그룹함수)
	COUNT(필드명) : NULL값이 아닌 레코드 수
	SUM(필드명) : 필드명의 합계
	AVG(필드명) : 필드명의 평균값
	MAX(필드명) : 필드의 최댓값
	MIN(필드명) : 필드의 최솟값	
*/



