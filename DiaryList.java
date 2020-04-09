import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

class DiaryList {

	private static int counter;
	DiaryEntry head;
	DiaryEntry focus;			//The current node being checked when going through the linked list
	DiaryEntry last;			//The last node checked when searching through the linked list             
	DiaryEntry removedEntry;	//Stores the last entry to be removed in case the user wants to undo the change
	DiaryEntry uneditedEntry;	//Saves a copy of the entry before it is changed which can be reverted to with undo
	String lastChange;			//Stores the type of change that was last made to be used in undo feature
	

	public DiaryList() {

	}

	// adds the specified element to the end of this list.
	public void add(LocalDate date, LocalTime startTime, LocalTime endTime, String treatmentType) {
		DiaryEntry newEntry = new DiaryEntry(date, startTime, endTime, treatmentType);

		if (head == null) {
			head = newEntry;
		} else {
			newEntry.setNext(head);
			head = newEntry;
		}

		// increment the number of elements variable
		incrementCounter();
		
		lastChange = "add";
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

	

	

	// removes the element at the specified position in this list.
	public void remove(int index) {
		if (head != null) {
			focus = head;
			last = null;
			int counter = 0;
			boolean found = false;
				
			while (found != true) {
				if (counter == index) {
					if (counter == 0) {
						found = true;
						head = head.getNext();
					} else {
						found = true;
						removedEntry = focus;
						last.setNext(focus.getNext());
					}
				} else {
					last = focus;
					focus = focus.getNext();
					counter++;
				}
			}
		System.out.println("Removed entry number " + (index + 1));
		}
		
		lastChange = "remove";
	}
	
	//Changes a edits a random entry to be undone
	public void editEntry(int index) {
		if (head != null) {
			focus = head;
			last = null;
			int counter = 0;
			boolean found = false;
				
			while (found != true) {
				if (counter == index) {
					found = true;
					uneditedEntry = focus;
					focus.setAppType("checkup");
				} else {
					focus = focus.getNext();
					counter++;
				}
			}
		System.out.println("Edited entry number " + (index + 1));
		}
		
		lastChange = "edit";
	}	
	
	public void displayAll() {
		focus = head;
		if (head != null) {
			do {
				focus.displayEntry();
				focus = focus.getNext();
			} while(focus != null);
		}
	}

	// returns the number of elements in this list.
	public int size() {
		return getCounter();
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
		@SuppressWarnings("unused")
		public Node(Object dataValue, Node nextValue) {
			next = nextValue;
			data = dataValue;
		}

		// these methods should be self-explanatory
		public Object getData() {
			return data;
		}

		@SuppressWarnings("unused")
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
	
	
	public void undoLast() {
		
		switch (lastChange) {
		case "add":
			undoAdd();
		
		
		case "remove":
			undoRemove();
			
		case "edit":
			undoEdit();
		}
	}
	
	public void undoAdd() {
		DiaryEntry last = null;
		focus = head;
		while (focus != null) {
			if (focus.getNext() != null && last == null) {
				last = focus;
				focus = focus.getNext();
			} else {
				System.out.println("The last entry has been undone");
				last.setNext(null);
				return;
			}
		}
	}
	
	public void undoRemove() {
		DiaryEntry last = null;
		boolean found = false;
		if (removedEntry.getNext() == null) {
			focus = head;
			while (found != true) {
				if (focus.getNext() == null) {
					found = true;
					focus.setNext(removedEntry);
				} else {
					focus = focus.getNext();
				}
			}
		} else {
			if (removedEntry.getNext() == head) {
				head = removedEntry;
			} else {
				focus = head;
				last = null;
				while (found != true) {
					if (focus == removedEntry.getNext()) {
						found = true;
						last.setNext(removedEntry);
					} else {
						last = focus;
						focus = focus.getNext();
					}
				}
			}
		}
	}
	
	public void undoEdit() {
		focus = head;
		last = null;
		boolean found = false;
		
		while (found != true) {
			if (uneditedEntry == focus) {
				found = true;
				focus = uneditedEntry;
			} else {
				focus = focus.getNext();
			}
		}
	}
}
