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
		System.out.println("------------ buscamos el 3er elemento (partiendo de 0)");
		sll.find(3);
		System.out.println("------------ eliminamos el 2do elemento (partiendo de 0)");
		sll.removeAt(2);
		sll.printValues();
	}
}
