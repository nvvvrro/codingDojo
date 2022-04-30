# Manipulación de Cadenas

Se le ha pedido que implemente una serie de métodos para la manipulación de cadenas. Para hacer esto, necesitará utilizar métodos integrados de clase String. Utilice las clases **StringManipulator** y **StringManipulatorTesting**. A continuación está la firma de los métodos y una breve descripción del método para ser implementado.

### Objetivos
- Practicar la firma de métodos implementando los siguientes códigos.
- Implementar algunos de los métodos de cadena más utilizados.

## Actividad
Crear una clase **StringManipulator** e implementar el siguiente método.

- **String trimAndConcat(String, String):** Elimina los espacios en blanco de ambos lados de las cadenas ingresadas y las concatena. Devolver la nueva cadena. Puede utilizar el método **trim** de la clase **String**.

        StringManipulator manipulator = new StringManipulator();
        String str = manipulator.trimAndConcat("    Hola     ","     Mundo    ");
        System.out.println(str); // HolaMundo 

- **int getIndexOrNull(String, char):** Obtener el índice del caracter dado y devolverlo o devolver -1. Si el caracter aparece varias veces, retornar el primer índice. Puede utilizar el método **indexOf** de la clase **String**.

        StringManipulator manipulator = new StringManipulator();
        char letter = 'n';
        int a = manipulator.getIndexOrNull("Coding", letter);
        int b = manipulator.getIndexOrNull("Hola Mundo", letter);
        int c = manipulator.getIndexOrNull("Saludar", letter);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); // -1

- **int getIndexOrNull(String, String):** Obtener el índice donde empieza la subcadena dada y devolverlo o devolver -1. Puede utilizar el método **indexOf** de la clase **String**.

        StringManipulator manipulator = new StringManipulator();
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        int a = manipulator.getIndexOrNull(word, subString);
        int b = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(a); // 2
        System.out.println(b); // -1


- **String concatSubstring(String, int, int, String):** Obtener una subcadena utilizando un índice de inicio y un índice de finalización y concatenarlo con la segunda cadena de entrada en nuestro método. Puede utilizar el método **substring** de la clase **String**.

        StringManipulator manipulator = new StringManipulator();
        String word = manipulator.concatSubstring("Hola", 1, 3, "mundo");
        System.out.println(word); // olmundo

*Después debe crear el archivo de pruebas StringManipulatorTest para probar todos los métodos.*