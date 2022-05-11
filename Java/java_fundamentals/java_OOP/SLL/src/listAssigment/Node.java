public class Node {
	public int value;
	public Node next; // puntero

	public Node(int value) {
		this.value = value;
	}

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}
}
