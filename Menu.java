
import java.util.LinkedList;
import java.util.Scanner;

	public class Menu {
		    public static void main(String args[])
		    {
		        // Creating object of class linked list

		        Menu test = new Menu();
				test.menu();

		    }

		    public  void menu() {
				printMenu();
				String userChoice;

		        boolean exit=false;
		        do {


		        	Scanner s1 = new Scanner(System.in);
		        	System.out.println("Please make a choice, and press ENTER: ");
		        	userChoice = s1.nextLine();


		        	switch (userChoice)
		        	{
		        		case "A":
		        		case "a":

		        			add();

		        			break;
		        		case "d":
		        		case "D":
		        			delete();
		        			break;
		        		case "e":
		        		case "E":
		        			edit();

		        			break;
		        		case "Q":
		        		case "q":
		        			quit();
		        			exit=true;
		        			break;
		            default: System.out.println("That is not a valid choice, please try again");
		                    break;
		        	}
		        }while (!exit);
			}

			public static void printMenu(){
				System.out.println("\nList  Menu");
				   System.out.println("A - Add a new user ");
				   System.out.println("D - Delete a user");
				   System.out.println("E - Edit a users data");
				   System.out.println("Q - quit");
			}


			public void add() {
				System.out.println("Add a user");
				   String name;
					Scanner s1 = new Scanner(System.in);
					System.out.println("Please enter your name");

					name = s1.nextLine();


					String profession;
					Scanner s2 = new Scanner(System.in);
					System.out.println("Please enter your profession");

					profession = s2.nextLine();


					String WorkLocation;
					Scanner s3 = new Scanner(System.in);
					System.out.println("Please enter the Location of your work");

					WorkLocation = s3.nextLine();
			        LinkedList<String> HealthProfessional = new LinkedList<String>();

					HealthProfessional.add(name + "," + profession + ","+ WorkLocation);


					System.out.println(HealthProfessional);
					//System.out.println("Name:" + name);
					//System.out.println("Profession:" + profession);
					//System.out.println("Work location:" + WorkLocation);




					System.out.println("===============================");
					String choice;

					Scanner s4 = new Scanner(System.in);
					System.out.println("Would you like to make any other operations enter: Y/N");
					choice = s4.nextLine();



						switch (choice)
			        	{
			        		case "n":
			        		case "N":
			        			quit(); //not quitting straight away - calling the menu for some reason
			        			break;

			        		case "y":
			        		case "Y":
			        			menu();
			        			break;

			        		default: System.out.println("That is not a valid choice, please try again");
			        			break;

			        	}


			}


			public static void delete() {
				   System.out.println("Delete a user");


			}

			public static void edit() {
				   System.out.println("Edit a user");

			}

			public static void quit() {
				System.out.println("Goodbye!");
			}

	}
