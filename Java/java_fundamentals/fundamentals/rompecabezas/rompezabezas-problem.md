# Rompecabezas
Después de pasar su primer desafío, la compañía decidió que quieren darle unos pocos rompecabezas para solucionar. Ellos lo expresaron así “El primer desafío fue solo para verificar su conocimiento del lenguaje, ahora queremos ver sus habilidades para resolver problemas.”

Para esta actividad, vamos a introducir dos nuevas clases: **Collections y Random**. Vamos a utilizar el primero para mezclar y ordenar una colección, y luego el segundo para Imprimir una salida aleatoria. Por ejemplo:

### **CodeExample.java**
    import java.util.ArrayList;
    import java.util.Collections;
    import java.util.Random;
    public class CodeExample {
        public static void main() {
            ArrayList<Integer> numeros = new ArrayList<Integer>();
            numeros.add(5);
            numeros.add(4);
            numeros.add(3);
            numeros.add(2);
            numeros.add(1);
            
            Collections.shuffle(numeros);
            System.out.println(numeros); // [5, 4, 3, 2, 1]
            Collections.sort(numeros);
            System.out.println(numeros); // [1, 2, 3, 4, 5]
                    
            Random r = new Random();
            System.out.println(r.nextInt()); // Sin límites
            System.out.println(r.nextInt(5)); // Con límites entre 0 y 5
        }
    }

### Objetivos
- Implementar diferentes algoritmos en Java.
- Practicar **Array y ArrayList**.
- Practicar **bucles**.
- Aprender y utilizar las clases de **Collections y Random**. 

## Actividades
Trabajar en los rompecabezas a continuación. Haga su código lo más limpio posible. El nombre de la clase debe ser **PuzzleJava**, necesitará crear métodos para cada tarea a continuación y probarlos en el método **main**.

1. Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de todos los números en el arreglo. El método también debe retornar un arreglo que incluya solo los números que son mayores a 10 (Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).

2. Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método también devuelva un arreglo con los nombres que tienes más de 5 caracteres.

3. Crear un arreglo que contiene las 26 letras del alfabeto (este arreglo debe tener 26 valores). Mezcle el arreglo y, después de mezclarlo, imprima la última letra del arreglo. También debe imprimir la primera letra del arreglo. Si la primera letra del arreglo es una vocal, haga que muestre un mensaje.
    * Para mezclar una colección, puede utilizar el método **shuffle** de la clase **Collections**.

4. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100.
    * Para obtener un número entero aleatorio, puede utilizar el método **nextInt** de la clase **Random**. 

5. Generar y devolver un arreglo con 10 números aleatorios entre 55 - 100 y hacer que estén ordenados (mostrar el número más pequeño en el principio del arreglo). Imprimir todos los números del arreglo. Luego, Imprimir el valor mínimo del arreglo, así como el valor máximo.
    * Para ordenar una colección, puede utilizar el método **sort** de la clase **Collections**.

6. Crear una cadena aleatoria con 5 caracteres de longitud.

7. Generar un arreglo con 10 cadenas aleatorias y cada una con 5 caracteres de longitud.