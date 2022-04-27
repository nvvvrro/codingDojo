# Teorema de Pitágoras

En esta actividad, usted creará un programa en Java para implementar el Teorema de Pitágoras.

imagen

> Para completar esta actividad, usted necesitará la clase Math del paquete java.lang. Este paquete provee clases fundamentales para el lenguaje de programación Java tales como Object, Boolean, String, Integer, Math, etc. Por lo tanto, el paquetejava.lang es importado automáticamente y está listo para usarse en cada programa de Java.

### Objetivos:

- Aprender como importar una clase en tu proyecto.
- Practicar la creación de instancias de objetos.
- Practicar los métodos de invocación.
- Utilizar el paquete java.lang.

## Actividades:

- Crear una clase Pitagoras en javaFun.

javaFun/Pitagoras.java

    public class Pitagoras {
        public double calcularHipotenusa(int catetoA, int catetoB) {
            //La hipotenusa es el lado opuesto del ángulo recto.
            //Calcular el valor de c dados los valores catetoA y catetoB
        }
    }

Usar un método de la clase Math para calcular la hipotenusa de un triángulo rectángulo dados los valores de los catetos.

> SUGERENCIA: Utilice el método estático sqrt. Estático significa que el método pertenece a la clase en lugar de al objeto. Aquí hay un ejemplo de código:

    double four = 4.0
    //Invocando el método estático sqrt de la clase
    double squareRoot = Math.sqrt(four) // 2.0

● Crea un archivo de pruebas **PitagorasTest** que creará una instancia nueva del objeto Pitagoras y ejecutará el método calcularHipotenusa.
