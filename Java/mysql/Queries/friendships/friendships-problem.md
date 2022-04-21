## Friendships

### Objetivos:
1. Practica creando tus base de datos.

>Practica consultas SQL y SELF JOIN.
Crea una base de datos llamada "amigos" y luego importe friends.sql Esto creará dos nuevas tablas: usuarios y amistades.

Usando el siguiente ERD como referencia, escribe una consulta SQL que devuelva una lista de usuarios junto con los nombres de sus amigos.


Sus resultados deberían verse a continuación:


| first_name | last_name | friend_first_name| friend_last_name |
| -- | -- | -- | -- |
| Amy | Giver | Eli | Byers |
| Amy | Giver | Big | Bird |
| Amy | Giver | Kermit | The Frog |
| Eli | Byers | Kermit | The Frog |
| Eli | Byers | Marky | Mark |
| Marky | Mark | Big | Bird|

Su consulta real tendrá un aspecto similar a este:

>SELECT * FROM users 
LEFT JOIN friendships ON____=____ 
LEFT JOIN users as user2 ON ____ = ____

Tenga en cuenta que nos estamos uniendo a la tabla de usuarios nuevamente, pero estamos especificando la segunda tabla de usuarios como user2. Luego puede hacer referencia a los segundos usuarios llamando a user2 (por ejemplo, user2.id, user2.first_name, etc.).

También puede cambiar el nombre de los campos que se seleccionan en el resultado usando la palabra clave como, como en el siguiente ejemplo:

>SELECT user2.first_name as friend_first_name, user2.last_name as friend_last_name, ...  FROM ...

Saber cómo hacer uniones puede ser complicado, pero se usa con bastante frecuencia y lo más probable es que vuelva a aparecer en el examen belt.

## Ejercicio Adicional
También escriba las consultas SQL necesarias para realizar las siguientes tareas:

1. Devuelva a todos los usuarios que son amigos de Kermit, asegúrese de que sus nombres se muestren en los resultados.
2. Devuelve el recuento de todas las amistades.
3. Descubre quién tiene más amigos y devuelve el recuento de sus amigos.
4. Crea un nuevo usuario y hazlos amigos de Eli Byers, Kermit The Frog y Marky Mark.
5. Devuelve a los amigos de Eli en orden alfabético.
6. Eliminar a Marky Mark de los amigos de Eli.
7. Devuelve todas las amistades, mostrando solo el nombre y apellido de ambos amigos