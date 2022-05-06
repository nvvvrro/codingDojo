# Proyecto Class
Una empresaria le ha pedido crear una clase que ella pueda utilizar para crear proyectos fácilmente. Ella pide que cada proyecto tenga un **nombre  y una descripcion**. Ella necesita poder crear proyectos vacíos a los que pueda agregar nombre y descripción más adelante, proyectos solo con nombre y también proyectos con ambos parámetros. Todos los proyectos deberían tener getters y setters, ambos métodos. También necesita que cada proyecto pueda Imprimir una breve descripción y devolver nombre y descripción separados por dos puntos ( : )

Por supuesto, usted necesitará demostrarle sus capacidades a ella, así que cree la clase **ProjectTest** para hacer esto.

### Objetivos
- Practicar sobrecarga tanto de métodos como de constructores.
- Implementar ***getters y setters***.
## Actividades
- Crear una clase **Project** que tenga los campos **nombre y descripcion.**
- Crear una instancia de método que se llame **elevatorPitch** que devolverá **nombre y descripcion** separados por dos puntos ( : ).
- Sobrecargar el método constructor en tres diferentes formas:
    * **public Project() { }**
    * **public Project(String name) { }**
    * **public Project(String name, String description) { }**
- Crear getter y setter para cada campo.
- Crear el archivo **ProjectTest** que hará las pruebas a toda la funcionalidad.
## Desafíos Opcionales
- Agregar una variable **initialCost** de tipo double y tenga su propio getter and setter.
- Agregar esto en el paréntesis de **elevatorPitch** después del nombre, ejemplo **nombre (cost): descripcion**
- Crear una clase **Portfolio** que tendrá un **Arraylist de Project** en el campo **projects**. Utilizar Generics para asegurarse que esos son objetos de tipo **Project**.
- Agregar los métodos apropiados de getter y setter y el constructor para que funcione.
- Agregar el método **getPortfolioCost** para calcular y devolver el costo total del portafolio completo.
- Agregar el método **showPortfolio** que mostrará en pantalla todos los proyectos en formato elevator Pitches, seguido del costo total.