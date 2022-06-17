<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>form</title>
  </head>

  <body>
    <h2>Ingrese sus datos en el formulario</h2>
    <br />

    <form name="home" action="home" method="post">
      <label for="nombre">Nombre: </label>
      <input type="text" value="" name="nombre" /> <br />
      <br />

      <label for="apellido">Apellido: </label>
      <input type="text" value="" name="apellido" /><br />
      <br />

      <label for="favLang">lenguaje favorito: </label>
      <input type="text" value="" name="favLang" /><br />
      <br />

      <label for="hometown">ciudad: </label>
      <input type="text" value="" name="hometown" /><br />
      <br />

      <button type="submit">Confirmar</button>
    </form>
  </body>
</html>
