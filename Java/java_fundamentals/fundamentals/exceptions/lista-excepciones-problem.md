# Lista de Excepciones

Su nuevo Manager sabe que usted no conoce Java muy bien. Ella quiere que usted se familiarice con generics y exception y descubra cómo funcionan. Primero, ella quiere que usted cree un ArrayList con números y cadenas.

    ArrayList<Object> myList = new ArrayList<Object>();
    myList.add("13");
    myList.add("Hola Mundo");
    myList.add(48);
    myList.add("Adios Mundo");

Recorrer la lista e intentar asignar cada elemento a una variable int. Para hacer esto, necesitará hacer cast e su lista de elementos Integer, puede hacer algo como:

    for(int i = 0; i < myList.size(); i++) {
        int castedValue = (int) myList.get(i);
    }

Después de haber configurado este código, trate de ejecutarlo. Esto debe producir una ClassCastException. Cambie el código anterior para manejar las excepciones e Imprimir los mensajes de error, el índice del ArrayList donde ocurrió el error y el valor del objeto que activó el error. El programa debe continuar después de Imprimir el mensaje de error.

### Objetivos
- Implementar un manejador de excepciones.
## Actividad
- Crear un ArrayList.
- Intentar hacer cast Integer a cada elemento.
- Utilizar bloques de código try/catch para manejar las excepciones.

