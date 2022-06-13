# Mascotas!

Se le ha pedido a su compañía hacer un prototipo para PetIntelligence. Quieren que los niños que ingresen a la tienda puedan llenar una información sobre su mascota y ver cómo esa mascota puede interactuar con ellos.

La compañía quiere que los niños puedan ver los de resultados tanto para perros como para gatos. Esto significa que ven los resultados en dos direcciones diferentes **(/dog y /cat)**; en el futuro, se desarrollarán una serie de características diferentes para las dos páginas.

Su gerente dice que necesita crear un modelo para animal que tenga a **name, breed y weight** y que ambos, **cat y dog** , hereden de esta. Ella dice que si este contrato se hace más grande, el código que desarrolle debe ser fácil de entender y más importante, fácil de escalar.

Ella también quiere que crees una interfaz **pet** que contenga solo el método **showAffection**; este método solo devuelve una cadena por ahora. En el futuro, es posible que necesitemos asegurarnos que todas nuestras mascotas tienen algunos comportamientos similares y que la interfaz nos permita estar seguros de esto (ella también le mencionó que por ahora puede colocar la interfaz en la carpeta de modelo).

Para crear el prototipo de la aplicación, los servlets primero deberán procesar los parámetros de consulta de la dirección, crear un perro o un gato y luego cargar un JSP con el objeto. Para la implementación de **showAffection en dog** , su gerente le ha pedido tener diferentes reacciones basadas en el peso del perro. Ver el diagrama a continuación.

Por último, su gerente le recordó utilizar JSTL para mostrar los datos de entrada y que los desarrolladores front-end tengan más facilidad para leer nuestro código.

### Observe que los formularios son solicitudes GET!

![PetIntelligence](https://s3.amazonaws.com/General_V88/boomyeah2015/codingdojo/curriculum/content/chapter/04_10_petIntelligence.png)

### Objetivos

- Colocar en práctica MVC. Modularizar la aplicación para tener modelos, vistas y controladores.
- Implementar las etiquetas JSTL.
- Permitir al controlador recibir parámetros de consulta.

## Actividades

- Crear un modelo **animal** que contenga los campos **name, breed, y weight.**
- Crear una interfaz **pet** que contenga el métodos **String showAffection() .**
- Extender el modelo **animal** e implementar la intefaz **pet** con ambos modelos **cat y dog.**
- Para la implementación de **showAffection en dog** tener diferentes salidas dependiendo del peso.
- Enviar el formulario en dos rutas diferentes. Procesar en dos servlets y tener dos JSP para manejar la información.
- Usar JSTL para mostrar las páginas.
