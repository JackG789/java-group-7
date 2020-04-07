public class AppointmentLinkedListTest {
	public static AppointmentLinkedList appointmentList;

	public static void main(String[] args) {

		// Default constructor - let's put "0" into head element.
		appointmentList = new AppointmentLinkedList();

		// add more elements to LinkedList
		appointmentList.add("1");
		appointmentList.add("2");
		appointmentList.add("3");
		appointmentList.add("4");
		appointmentList.add("5");

		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */

		System.out.println("Print: : \t\t" + appointmentList);
		System.out.println(".size(): \t\t\t\t" + appointmentList.size());
		System.out.println(".get(3): \t\t\t\t" + appointmentList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + appointmentList.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + appointmentList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + appointmentList.size());
		System.out.println("Print again: : \t" + appointmentList);
	}

}
