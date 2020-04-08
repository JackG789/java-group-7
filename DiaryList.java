class DiaryList {

	private static int counter;
	private Node head;

	public DiaryList() {

	}

	// adds the specified element to the end of this list.
	public void add(Object data) {

		if (head == null) {
			head = new Node(data);
		}

		Node DiaryTemp = new Node(data);
		Node DiaryCurrent = head;

		if (DiaryCurrent != null) {

			while (DiaryCurrent.getNext() != null) {
				DiaryCurrent = DiaryCurrent.getNext();
			}

			// the last node's reference set to our new node
			DiaryCurrent.setNext(DiaryTemp);
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

	private void decrementCounter() {
		counter--;
	}

	// inserts the specified element at the specified position in this list
	public void add(Object data, int index) {
		Node DiaryTemp = new Node(data);
		Node DiaryCurrent = head;

		if (DiaryCurrent != null) {
			// crawl to the requested index or the last element in the list, whichever comes first
			for (int i = 0; i < index && DiaryCurrent.getNext() != null; i++) {
				DiaryCurrent = DiaryCurrent.getNext();
			}
		}

		DiaryTemp.setNext(DiaryCurrent.getNext());

		DiaryCurrent.setNext(DiaryTemp);

		// increment the number of elements variable
		incrementCounter();
	}

	public Object get(int index)
	// returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if (index < 0)
			return null;
		Node DiaryCurrent = null;
		if (head != null) {
			DiaryCurrent = head.getNext();
			for (int i = 0; i < index; i++) {
				if (DiaryCurrent.getNext() == null)
					return null;

				DiaryCurrent = DiaryCurrent.getNext();
			}
			return DiaryCurrent.getData();
		}
		return DiaryCurrent;

	}

	// removes the element at the specified position in this list.
	public boolean remove(int index) {

		// if the index is out of range, exit
		if (index < 1 || index > size())
			return false;

		Node DiaryCurrent = head;
		if (head != null) {
			for (int i = 0; i < index; i++) {
				if (DiaryCurrent.getNext() == null)
					return false;

				DiaryCurrent = DiaryCurrent.getNext();
			}
			DiaryCurrent.setNext(DiaryCurrent.getNext().getNext());

			// decrement the number of elements variable
			decrementCounter();
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
			Node DiaryCurrent = head.getNext();
			while (DiaryCurrent != null) {
				output += "[" + DiaryCurrent.getData().toString() + "]";
				DiaryCurrent = DiaryCurrent.getNext();
			}

		}
		return output;
	}

	private class Node {
		// reference to the next node in the chain, or null if there isn't one.
		Node next;

		// data carried by this node. could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object dataValue) {
			next = null;
			data = dataValue;
		}

		// another Node constructor if we want to specify the node to point to.


		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}


		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}

	}
}
