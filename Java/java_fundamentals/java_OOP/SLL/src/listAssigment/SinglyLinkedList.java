public class SinglyLinkedList {
	public Node head;

	public SinglyLinkedList() {
		this.head = null;
	}

	// Los metodos de la SLL van aqui. Al principio, les mostraremos c�mo agregar
	// nodos a la lista.
	public void add(int value) {
		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else {
			Node runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNode;
		}
	}

	public void remove() {

		if (head != null) {
			if (head.next == null) {
				head = null;

			} else {
				Node runner = head;
				while (runner.next.next != null) {
					runner = runner.next;
				}
				runner.next = null;
			}
		}
	}

	public void printValues() {

		if (head != null) {
			Node runner = head;
			System.out.println(runner.value);

			while (runner.next != null) {
				runner = runner.next;
				System.out.println(runner.value);
			}

		}
	}

	public void find(int i) {

		if (head != null) {
			Node runner = head;
			int count = 0;
			while (count < i && runner.next != null) {
				runner = runner.next;
				count++;
			}
			if (count != i) {
				System.out.println("null");
				return;
			} else {
				System.out.println(runner.value);
			}
		}
	}

	public void removeAt(int i) {
		if (head != null) {
			Node runner = head;
			int count = 0;

			while (count < (i - 1) && runner.next != null) {
				runner = runner.next;
				count++;
			}

			Node temp = runner.next;
			runner.next = temp.next;

		}
	}
}