# Lista Simple Enlazada (Singly Linked List - SLL)

En esta lección, creará su propio implementación de una Lista Simple Enlazada (SLL en inglés Singly Linked List) en Java. Necesitará 3 archivos: **Node.java, SinglyLinkedList.java y ListTester.java.** Tan pronto como estos archivos estén en el mismo directorio, no necesitará importarlos explícitamente. Recomendamos que cree una carpeta llamada **ListAssigment** y coloque los 3 archivos allí.

**Node.java**

    public class Node {
        public int value;
        public Node next;
        public Node(int value) {
        // su codigo aqui
        }
    }
**SinglyLinkedList.java**

    public class SinglyLinkedList {
    public Node head;
        public SinglyLinkedList() {
        // su codigo aqui
        }
        
        //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
            public void add(int value) {
            Node newNode = new Node(value);
                if(head == null) {
                head = newNode;
                } else {
                Node runner = head;
                while(runner.next != null) {
                runner = runner.next;
                }
            runner.next = newNode;
            }
        }  
    }
**ListTester.java**

    public class ListTester {
        public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(3);
        sll.add(4);
        sll.add(10);
        sll.add(5);
        sll.add(15);
        sll.add(2);
        sll.remove();
        sll.remove();
        sll.printValues();
        }
    }

### Objetivos

- Practicar creando clases y objetos.
- Aprender a implementar un Lista Simple Enlazada en Java.

## Actividades

- Crear una clase Nodo como la anterior.
- Establecer en el método constructor **value** con un número dado y **next** de tipo Nodo en null.
- Crear una clase SinlgyLinkedList como la anterior.
- Crear un método constructor para establecer **head** en null para los objetos de su SinglyLinkedList.
- Crear un método **remove()** que removerá un nodo del final de su lista.
- Crear un método **printValues()** que mostrará en pantalla todos los valores de cada nodo de la lista en el mismo orden que fue creada.
- Crear una clase **ListTestes** como la anterior.

## Desafíos Opcionales

- Implementar un método **find(int)** que retornará el primer nodo con el valor dado en los parámetros.
- Implementar un método **removeAt(int)** que removerá un nodo después de n nodos, donde n es el parámetro. Por ejemplo, si n es 0 removerá el primer nodo, si n es 1 removerá el segundo nodo. Similar a los arrays.
