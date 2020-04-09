class HealthProfessionalList {

	private static int counter;
	private Node head;

	public HealthProfessionalList() {

	}

	// adds the specified element to the end of this list.
	public void add(Object data) {

		if (head == null) {
			head = new Node(data);
		}

		Node HPTemp = new Node(data);
		Node HPCurrent = head;

		if (HPCurrent != null) {

			while (HPCurrent.getNext() != null) {
				HPCurrent = HPCurrent.getNext();
			}

			// the last node's reference set to our new node
			HPCurrent.setNext(HPTemp);
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
		Node HPTemp = new Node(data);
		Node HPCurrent = head;

		if (HPCurrent != null) {

			for (int i = 0; i < index && HPCurrent.getNext() != null; i++) {
				HPCurrent = HPCurrent.getNext();
			}
		}

		HPTemp.setNext(HPCurrent.getNext());

		HPCurrent.setNext(HPTemp);

		incrementCounter();
	}

	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node HPCurrent = null;
		if (head != null) {
			HPCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (HPCurrent.getNext() == null)
					return null;

				HPCurrent = HPCurrent.getNext();
			}
			return HPCurrent.getData();
		}
		return HPCurrent;

	}

	// removes the element at the specified position in the list.
	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node HPCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (HPCurrent.getNext() == null)
					return false;

				HPCurrent = HPCurrent.getNext();
			}
			HPCurrent.setNext(HPCurrent.getNext().getNext());

			// decrease the number of elements variable
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
			Node HPCurrent = head.getNext();
			while (HPCurrent != null) {
				output += "[" + HPCurrent.getData().toString() + "]";
				HPCurrent = HPCurrent.getNext();
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
