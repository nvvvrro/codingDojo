# Calculadora Parte II

El cliente ha solicitado un cambio en las especificaciones: necesitan la calculadora para procesar múltiples valores, así como tener algunas operaciones más complejas.

Necesitan la posibilidad de agregar varios números seguidos: esto requiere un cambio en nuestra interfaz ya que no podemos estar seguros de cuántos operandos en total usará el cliente. Ahora esperan que esto funcione:

- **performOperation(10.5)**
- **performOperation("+")**
- **performOperation(5.2)**
- **performOperation("\*")**
- **performOperation(10)**
- **performOperation("=")**
- **getResults()**

Donde el resultado debería ser **62.5.** Quieren tener la posibilidad de hacer esto para cualquier cantidad de números, tanto como la capacidad de multiplicar y dividir. Puede asumir que todas las entradas serán válidas. La calculadora debe realizar correctamente el orden de las operaciones.

### Objetivos

- Practicar con clases y objetos.
- Implementar una calculadora en Java.

## Actividades

- Crear el sistema Beans **Calculator** que permitirá al usuario establecer los operandos y las operaciones, luego realizarlos y obtener el resultado.
- Tener la lógica para sumar, restar, multiplicar y dividir.
### *Notas*
- *Es posible utilizar una propiedad boolean para indicar si una operación u operando ya ha sido establecido.*
