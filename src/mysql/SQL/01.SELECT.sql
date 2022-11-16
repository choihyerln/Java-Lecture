/*
* 데이터 조작 언어(DML : Data Manipulation Language)
*/

/* 1. Select */
USE world;  # 사용할 데이터베이스 선택
SHOW TABLES;    # 현 데이터베이스에 있는 테이블 조회
DESC city;      # city의 테이블 구조 보기

Select * from city # city 테이블에 있는 내용을 전부 가져오기
SELECT Name, Population FROM city;  # name, Population 내용만 가져오기


/* 조회 조건 Where */

select * from city where CountryCode='KOR'; # 한국만 조회
select Name, District, Population from city where CountryCode='KOR';

# 대한민국 광역시도명
select distinct District From city	# distinct - 유일한, 고유한
	where CountryCode='KOR';		

# 수도권 도시(서울, 인천, 경기)
select * From City
	where District='Seoul' or District='Inchon' OR District='Kyonggi';

# 한국의 인구수 100만 이상인 도시중 인구수가 홀수인 도시
select * From City
	Where CountryCode = 'KOR' AND Population>=1000000 AND Population % 2 = 1;

# 한국의 인구수 50만 ~100만 도시
select * From City
	Where CountryCode = 'KOR' AND Population>=500000 AND Population<=1000000;
# (같은 방법)
select * From City
	Where CountryCode = 'KOR' AND
	Population between 500000 AND 1000000;		# between 은 <= ~ <= 임

# 충청남북도의 도시
select * From City
	Where District = 'Chungchongbuk' OR District = 'Chungchongnam'
# (같은 방법)  
select * From City
	Where District Like 'Chungchong%'



/* 순서 */

# 전세계에서 인구가 800만 이상인 도시를 내림차순으로 조회
select * From City
	Where Population>=8000000 order by population DESC;    생략하거나 ASC는 오름차순!!

# 한국에서 100만 이상인 도시를 내림차순으로 조회
select * From City
	Where Population>=500000 AND CountryCode = 'KOR'
	order by District, Population DESC;

/* 갯수 */

# 전세계 인구수 Top10 (내림차순 -> 리미트 10개설정)
Select * from city
	order by Population desc
	Limit 10;

# 국내 인구수 Top5 도시 (나라설정 -> 내림차순 -> 리미트 5개설정)
Select * from city
	Where countrycode = 'KOR'
	order by Population desc
	Limit 5;

# 국내 인구수 11위 ~ 20위 도시
Select * from city
	Where countrycode = 'KOR'
	order by Population desc
	Limit 10 OFFSET 10;         앞에 10개 뛰고, 10개 선정

# 국내 도시의 평균 인구수
Select ROUND(AVG(Population)) from city
	Where countrycode = 'KOR';

# 국내 도시의 최대/최소 인구수
Select MAX(Population), MIN(Population) from city
	Where countrycode = 'KOR';


/* 그룹 */

# 경기도의 도시 이름
Select GROUP_CONCAT(Name) from city
	Where District = 'Kyonggi';

# 국내 광역시도 이름
Select GROUP_CONCAT(District) from city
	Where Countrycode = 'KOR';

# 국내 도시의 광역시도의 인구수를 내림차순으로 정렬
Select District, SUM(Population) from city
	Where countrycode = 'KOR'
	Group by District
    order by SUM(Population) DESC;

# 국가별 도시의 갯수가 많은 나라 Top10
Select Countrycode, COUNT(*) from city
	Group by Countrycode
	Order by COUNT(*) DESC
	Limit 10;

# 국내 도시의 갯수가 5개 이상인 도의 인구수 평균
Select District, ROUND(AVG(Population)), COUNT(*) from city
	Where Countrycode = 'KOR'
	Group by District
	Having COUNT(*)>=5;

# 국내 도시의 갯수가 5개 이상인 도의 인구수 평균을 내림차순으로 정렬
Select District, ROUND(AVG(Population)), COUNT(*) from city
	Where Countrycode = 'KOR'
	Group by District
	Having COUNT(*)>=5
	Order By AVG(Population) DESC;

# 도시의 갯수가 100개 이상인 국가의 인구수 평균을 인구수 평균의 내림차순으로 정렬
Select Countrycode, ROUND(AVG(Population)), COUNT(*) from city
	Group by Countrycode
	Having COUNT(*)>=100
	Order By AVG(Population) DESC;

# 대륙별 면적, 평균 GMP, 국가의 숫자
SELECT Continent, SUM(SurfaceArea), ROUND(AVG(GNP)), COUNT(Name) From country
	GROUP BY Continent
	ORDER BY SUM(SurfaceArea) DESC;

/* Join */
# 도시의 갯수가 많은 나라 Top 10
SELECT country.Name, city.CountryCode, COUNT(city.Name) FROM city
JOIN country
ON city.CountryCode = country.Code
GROUP BY city.CountryCode
ORDER BY COUNT(city.Name) DESC
LIMIT 10;

# 인구가 많은 도시 Top 10의 국가명, 도시명, 인구수
SELECT r.name AS Country, l.Name AS City, l.Population FROM city AS l
JOIN country AS r
ON l.CountryCode = r.Code
ORDER BY l.Population DESC
LIMIT 10;

# 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 정렬
# 			(대륙명, 국가명, 도시명, 인구수)
SELECT r.`Continent`, r.Name AS country, l.Name AS city, l.`Population`
FROM city AS l
JOIN country AS r
ON l.CountryCode = r.Code
WHERE r.`Continent` = 'Asia'
ORDER BY l.`Population` DESC
LIMIT 10;

# 우리나라의 공식 언어는?
SELECT Language, CountryCode FROM countrylanguage
Where CountryCode = 'KOR'
AND IsOfficial = TRUE;

# 아시아 국가의 국가명과 국가별 공식 언어는?
SELECT l.Name AS country, r.Language FROM country AS l
JOIN countrylanguage AS r
ON l.Code = r.CountryCode
Where l.Continent = 'Asia'
AND r.IsOfficial = TRUE;