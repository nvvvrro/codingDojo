# Juego Great Number

Se le ha pedido crear una aplicación de un sencilla de un juego de adivinanzas. Su cliente le ha pedido que genere un número entre 1 y 100 y permita al usuario que intente adivinar qué número fue generado. Cada usuario debe tener un único número cada vez que juega, pero el número debe permanecer hasta que lo adivinen. Cuando la respuesta sea incorrecta, debe decirle si fue demasiado alto (too high) o demasiado bajo (too low).


![Great Number Game](https://s3.amazonaws.com/General_V88/boomyeah/company_209/chapter_2240/handouts/chapter2240_3241_great-number-game.png)

### Objetivos
- Implementar POST y Session junto con Servlets.
## Actividades
- Generar un nuevo número en la primera visita o después de que el juego ha finalizado.
- Retener el valor del numero a lo largo de las respuestas incorrectas, mientras le hace una retroalimentación al usuario.
- Solo reinicie el número cuando el jugador presione Jugar de Nuevo.

### **Pista: Cuando compare dos variables utilice el método .equals() en lugar de "==", ¿sabes por qué?**
## Desafíos Opcionales:
- Permita al usuario seleccionar el rango de números en el que quiere adivinar (ejemplo de -1000 hasta 1000).
- Proporcione al usuario un número fijo de intentos e informe al usuario el número de intentos que lleva; después que el usuario exceda el número de intentos, muestre un mensaje informando que ha perdido y muestre la respuesta; permítale al usuario jugar de nuevo.
