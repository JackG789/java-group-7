
class AppointmentLinkedList {

	private static int counter;
	private Node head;

	public AppointmentLinkedList() {

	}

	// adds the specified element to the end of the list.
	public void add(Object data) {

		if (head == null) {
			head = new Node(data);
		}

		Node AppTemp = new Node(data);
		Node AppCurrent = head;

		if (AppCurrent != null) {

			while (AppCurrent.getNext() != null) {
				AppCurrent = AppCurrent.getNext();
			}

			// the last node's reference set to our new node
			AppCurrent.setNext(AppTemp);
		}

		// increment the number of elements variable
		incrementCounter();
	}

	private static int getCounter() {
		return counter;
	}

	private static void incrementCounter() {
		counter++;
	}

	private void dCounter() {
		counter--;
	}

	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node AppTemp = new Node(data);
		Node AppCurrent = head;

		if (AppCurrent != null) {

			for (int i = 0; i < index && AppCurrent.getNext() != null; i++) {
				AppCurrent = AppCurrent.getNext();
			}
		}

		AppTemp.setNext(AppCurrent.getNext());

		AppCurrent.setNext(AppTemp);

		// increment the number of elements variable
		incrementCounter();
	}

	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node AppCurrent = null;
		if (head != null) {
			AppCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (AppCurrent.getNext() == null)
					return null;

				AppCurrent = AppCurrent.getNext();
			}
			return AppCurrent.getData();
		}
		return AppCurrent;

	}

	// removes the element at the specified position in this list.
	public boolean remove(int index) {

//exit statement
		if (index < 1 || index > size())
			return false;

		Node AppCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (AppCurrent.getNext() == null)
					return false;

				AppCurrent = AppCurrent.getNext();
			}
			AppCurrent.setNext(AppCurrent.getNext().getNext());

			dCounter();
			return true;

		}
		return false;
	}

	// returns the number of elements in this list.
	public int size() {
		return getCounter();
	}

	public String toString() {
		String output = "";

		if (head != null) {
			Node AppCurrent = head.getNext();
			while (AppCurrent != null) {
				output += "[" + AppCurrent.getData().toString() + "]";
				AppCurrent = AppCurrent.getNext();
			}

		}
		return output;
	}

	private class Node {
		Node next;

		Object data;

		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}

		public Object getData() {
			return data;
		}

		public void setData(Object dataValue) {
			data = dataValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}

	}
}
