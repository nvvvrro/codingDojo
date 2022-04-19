USE world;

#1.-
SELECT c.name, l.language, l.percentage 
FROM countries c
INNER JOIN languages l
ON c.id = l.country_id
WHERE l.language="Slovene"
ORDER BY l.percentage DESC;

#2.-
SELECT c.name, count(ct.id) as total_cities
FROM countries c
INNER JOIN cities ct
ON c.id = ct.country_id
GROUP BY c.name
ORDER BY total_cities DESC;

#3.-
SELECT ct.name, ct.population, c.name,  c.id
FROM cities ct 
INNER JOIN countries c
ON ct.country_id=c.id
WHERE c.name="Mexico"
AND ct.population > 500000;

#4.-
SELECT c.name, l.language, l.percentage 
FROM countries c
INNER JOIN languages l
ON c.id = l.country_id
WHERE l.percentage >= 89
ORDER BY l.percentage DESC;

#5.-
SELECT name, surface_area, population
FROM countries 
WHERE population >= 100000
AND surface_area <=501;

#6.-
SELECT name, government_form, capital, life_expectancy
FROM countries 
WHERE government_form = "Constitutional Monarchy"
AND capital >= 200
AND life_expectancy >= 75;

#7.-
SELECT c.name, ct.name, ct.district, ct.population
FROM countries c
INNER JOIN cities ct
WHERE c.name = "Argentina" 
AND ct.district = "Buenos Aires"
AND ct.population >= 500000;

#8.-
SELECT region, COUNT(id) as total_countries
FROM countries 
GROUP BY region
ORDER BY total_countries DESC;
