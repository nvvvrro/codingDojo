Sakila

Objetivos:

1. Practica tus consultas SQL.![](Aspose.Words.bdedc558-c50f-475c-99ac-6c0ab3f4e3c6.001.png)

Usando la base de datos Sakila, complete las consultas a continuación.

Puedes obtener la base de datos de **Sakila** y ERD aquí (sakila-data.[sql y sakila-db-mod](https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/sakila-data.sql)el[.png), utilízalos como refere](https://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3569/handouts/chapter3569_5431_sakila-db-model.png)ncia.

Nota

Anteriormente en esta sección, recomendamos que los estudiantes nombren sus tablas en minúsculas y tengan una clave principal llamada 'id' en cada tabla. Estas son las reglas que seguimos, sin embargo, no todos los desarrolladores siguen estas reglas. El archivo SQL con el que trabajará NO sigue las reglas que discutimos, incluida la denominación de los campos en minúsculas. Todavía queremos que siga las reglas que enseñamos, pero use esto como una oportunidad para sentirse cómodo con otros archivos SQL que no siguen completamente las reglas de normalización.

Consultas

1.¿Qué consulta ejecutarías para obtener todos los clientes dentro de city\_id = 312? Su consulta debe devolver el nombre, apellido, correo electrónico y dirección del cliente.

2.¿Qué consulta harías para obtener todas las películas de comedia? Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, las características especiales y el género (categoría).

3.¿Qué consulta harías para obtener todas las películas unidas por actor\_id = 5? Su consulta debe devolver la identificación del actor, el nombre del actor, el título de la película, la descripción y el año de lanzamiento.

4.¿Qué consulta ejecutaría para obtener todos los clientes en store\_id = 1 y dentro de estas ciudades (1, 42, 312 y 459)? Su consulta debe devolver el nombre, apellido, correo electrónico y dirección del cliente.

5.¿Qué consulta realizarías para obtener todas las películas con una "calificación = G" y "característica especial = detrás de escena", unidas por actor\_id = 15? Su consulta debe devolver el título de la película, la descripción, el año de lanzamiento, la calificación y la función especial. Sugerencia: puede usar la función LIKE para obtener la parte 'detrás de escena'.

6.¿Qué consulta harías para obtener todos los actores que se unieron en el film\_id = 369? Su consulta debe devolver film\_id, title, actor\_id y actor\_name.

7.¿Qué consulta harías para obtener todas las películas dramáticas con una tarifa de alquiler de 2.99? Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, las características especiales y el género (categoría).

8.¿Qué consulta harías para obtener todas las películas de acción a las que se une SANDRA KILMER? Su consulta debe devolver el título de la película, la descripción, el año de estreno, la calificación, las características especiales, el género (categoría) y el nombre y apellido del actor.

Nota: Puedes descargar este archivo PDF que muestra los Resultados e[sperados (Sakila) a las preguntas anter](https://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_3569/handouts/chapter3569_5439_MySQL-Intermediate-Sakila-Expected-Result.pdf)iores. Su proyecto debe llamarse **sakila** en Github.
