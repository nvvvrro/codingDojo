# Prueba MySql Queries

1. Puede usar el operador BETWEEN para cuál de los siguientes escenarios

```diff
+ E. Todo lo anterior.
```
2. 'ORDER BY id DESC' mostrará primero el registro más reciente (esto supone que hemos creado una tabla usando las convenciones adecuadas con id como clave principal única)


```diff
+ Verdadero
```
3. Dónde aplicamos las funciones mysql?

```diff
+ cualquier lugar dentro de una consulta donde haga referencia a una columna
```

4. En el query 'SELECT * FROM users LEFT JOIN posts ON users.id = posts.user_id;'  la tabla izquierda es post

```diff
+ Falso
```

5. Qué esperarias que se devuelva de la siguiente consulta? 'SELECT * FROM customers JOIN orders ON customers.id = orders.customer_id;'

```diff
+ Solo los pedidos donde el customer_id tiene una coincidencia para la identificación en la tabla de clientes
```
6. Es aconsejable especificar una función de agrupación cuando se utiliza una instrucción GROUP BY

```diff
+ Verdadero
```

7. Cuál sería el resultado de la siguiente consulta? 'SELECT DATE_FORMAT (' 2012-03-09 12:30 ','% W% M% D% Y at% r ') AS great_time';

```diff
+ Viernes Marzo 9th 2012 at 12:30:00 PM
```

8. En la siguiente consulta, ¿qué esperaría que se devuelva? SELECCIONE clients.company, SUM (billing.amount) AS total_sales FROM clients LEFT JOIN billing ON billing.client_id = client.id GROUP BY clients.company HAVING SUM (billing.amount )> 3500;

```diff
+ Una lista de cada compañía cuyos montos totales de facturación son superiores a 3500
```

9. Cuándo desearía utilizar una LEFT JOIN en lugar de una JOIN?

```diff
+ cuando hay registros que desea mostrar en la tabla de la izquierda que no coinciden con los registros de la tabla de la derecha
```

10. Qué registros se mostrarán en la siguiente consulta 'SELECCIONAR ID, nombre_de los usuarios LIMIT 11,10;'

```diff
+ 10 registros de nombre e identificación del usuario, comenzando con el 12º registro en el resultado (independientemente de la identificación de ese registro)
```
