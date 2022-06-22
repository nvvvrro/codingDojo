# Lista de Equipos (Team Roster)

Una liga deportiva local necesita ayuda para crear una lista de varios equipos que necesitan hacer seguimiento. Para el prototipo necesita una página para crear y enumerar los equipos, así como para ver un equipo individual y agregarle miembros. El cliente le ha proporcionado su propia estructura. La lista de equipos y la lista de jugadores solo deben existir en la sesión actual.

![Team Roster](https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/04_23_Team_Roster_Updated.png)

### Objetivos

- Implementar Post y Session juntos con Servlets.
- La meta de la actividad es implementar todo lo que se ha enseñado en Java en la Web.

### Notas

- Haga que un método **doPost()** procese todo antes de redireccionar. Solo cargue la página desde una solicitud POST, si hay un error muestre un mensaje en la misma página.
- Tendrá que buscar cómo redireccionar para completar esta actividad; pista: **sendRedirect.**

## Actividades

- Crear un **Player** como modelo JavaBean con **first_name, last_name, y age.**
- Crear páginas para: crear equipos, ver todos los equipos, agregar nuevos jugadores a los equipos y ver la lista de equipos.
- Usar JSTL para crear las páginas.

### Desafíos Opcionales

- Agregar validaciones para los nombre con 2 o menos caracteres.
- Agregar validaciones para la edad del jugador con un mínimo de 18.
- Agregar un mensaje de error para mostrarlo en la página cuando no se realiza el envío.
