import java.util.Scanner;


public class Tester
{
    private HealthProfessional[] HealthProfessionals;
    private int numHealthProfessionals;

    public static void main(String args[])
    {

		Tester t = new Tester();
		t.menu();
		//t.initialise();
		//t.process();
    }

    public  void menu() {
		String userChoice;

        boolean exit=false;
        do {

    		printMenu();

        	Scanner s1 = new Scanner(System.in);
        	System.out.println("Please make a choice, and press ENTER: ");
        	userChoice = s1.nextLine();


        	switch (userChoice)
        	{
        		case "A":
        		case "a":

        			initialise();

        			break;
        		case "d":
        		case "D":
        			//delete();
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

    /**
     * Constructor for objects of class Tester
     */
    public Tester()
    {
        numHealthProfessionals = 1;
        HealthProfessionals = new HealthProfessional[numHealthProfessionals];
    }

    /**
     * Initialise - Initialise the array of healthProfessionals with user input
     *
     */
    public void initialise()
    {
        String name;
        String workArea;
        String profession;
        int id;
        int i;

        Scanner s = new Scanner(System.in);

        for (i=0; i<numHealthProfessionals; i++)
        {

            System.out.println("Please type in the Health Professionals name: ");
            name = s.nextLine();

            System.out.println("Please type in the profession");
            profession = s.nextLine();

            System.out.println("Now type in their work area");
            workArea = s.nextLine();

            id = i;

            HealthProfessionals[i] = new HealthProfessional(id, name, workArea, profession);

         }

        process();

    }

    public void delete() {
    	int del;
        Scanner s = new Scanner(System.in);

    	System.out.println("Please enter the ID of the Health Professional you'd like to delete");
      //to do
    }

    public void edit() {
    	int i;
    	Scanner s = new Scanner(System.in);

    	System.out.println("Please enter the ID of the Health Professional you'd like to edit");
    	i = s.nextInt();

    	initialise();


    }


    /**
     * Process - output the array of healthProfessionals
     */
    public void process()
    {
       int i;

       for (i=0; i<numHealthProfessionals; i++)
       {
           System.out.println(HealthProfessionals[i].showInfo());
       }
    }

    public void quit(){
        System.out.println("goodbye!");
    }




}
