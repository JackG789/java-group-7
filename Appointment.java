import java.util.Scanner;

public class Appointment {



	 String appName;
	    String appType;

	    int appDay = 0;
	    int appMonth = 0;
	    int appYear = 0;
	    int appSTime = 0;
	    int appETime =0 ;
	    int maxDay =0;
	    boolean validDate = false;

	    public static void main(String args[]) {
	        Appointment test = new Appointment();
	        test.appointment();
	    }

  public void appointment(){


    Scanner s1 = new Scanner(System.in);
     System.out.println("Please follow the instructions to book your appointment");
     System.out.println("=======================================================");

     System.out.println("Please enter your name:");
     appName = s1.nextLine();

     //Scanner s2 = new Scanner(System.in);
    // System.out.println("Please enter the treatment you require: ");
     //appTretment = s2.nextLine();
     //Random appLength = new Random();
    // appLength = random(3);

     Scanner s3 = new Scanner(System.in);
     System.out.println("Please enter the desired date of your appointment: ");
     System.out.println("Day: ");
     appDay = s3.nextInt();

     System.out.println("Month: ");
     appMonth = s3.nextInt();

     System.out.println("Year: ");
     appYear = s3.nextInt();

     do {
       if (appYear < 2020){
         System.out.println("Please enter a valid date: ");

         Scanner s = new Scanner(System.in);
         System.out.println("Please enter the desired date of your appointment: ");
         System.out.println("Day: ");
         appDay = s.nextInt();

         System.out.println("Month: ");
         appMonth = s.nextInt();

         System.out.println("Year: ");
         appYear = s.nextInt();
       }

       //month validation
       if (appMonth<0 || appMonth>12 ){
         if (appDay > maxDay || appDay<0){
           System.out.println("Please enter a valid date: ");

           System.out.println("Please enter the desired date of your appointment: ");
           System.out.println("Day: ");
           appDay = s3.nextInt();

           System.out.println("Month: ");
           appMonth = s3.nextInt();

           System.out.println("Year: ");
           appYear = s3.nextInt();
       }



       //validation for date for months with 31 days
       if (appMonth == 1 || appMonth == 3 || appMonth == 5 || appMonth == 7 || appMonth == 8 || appMonth == 10 || appMonth == 12 ) {
          maxDay = 31;
         if (appDay > maxDay || appDay<0){
           System.out.println("Please enter a valid date: ");

           System.out.println("Please enter the desired date of your appointment: ");
           System.out.println("Day: ");
           appDay = s3.nextInt();

           System.out.println("Month: ");
           appMonth = s3.nextInt();

           System.out.println("Year: ");
           appYear = s3.nextInt();
         }

       }
       //validation for months with 30 days
       if (appMonth == 4 || appMonth == 6 || appMonth == 9 || appMonth == 11) {
          maxDay = 30;
         if (appDay > maxDay || appDay<0){
           System.out.println("Please enter a valid date: ");

           System.out.println("Please enter the desired date of your appointment: ");
           System.out.println("Day: ");
           appDay = s3.nextInt();

           System.out.println("Month: ");
           appMonth = s3.nextInt();

           System.out.println("Year: ");
           appYear = s3.nextInt();
         }

       }
       //validation for feb
       if (appMonth == 2 ) {
          maxDay = 28;
         //leap year calc div 4 find mod ; if leap year mod should =0
         if (appYear%4 == 0){
            maxDay = 29;
         }
         if (appDay > maxDay || appDay<0){
           System.out.println("Please enter a valid date: ");

           System.out.println("Please enter the desired date of your appointment: ");
           System.out.println("Day: ");
           appDay = s3.nextInt();

           System.out.println("Month: ");
           appMonth = s3.nextInt();

           System.out.println("Year: ");
           appYear = s3.nextInt();
         }

       }
       validDate = true;
       }
     } while (validDate = false );




     //appointment time validation

     Scanner s4 = new Scanner(System.in);
     System.out.println("Please enter the desired time of your appointment in 24hr format between 8am and 8pm: ");
     System.out.println("Hour: ");
     appSTime = s4.nextInt();
     //open 8am to 8om
     if (appSTime<8 || appSTime>20){
       System.out.println("Please enter a valid time in 24hr format between 8am and 8om: ");
       System.out.println("============================================== ");

       System.out.println("Please enter the desired time of your appointment in 24hr format: ");
       System.out.println("Hour: ");
       appSTime = s4.nextInt();
       //appointments take 2 hours
       appETime = (appSTime+2);


     }

     //appointment type


     System.out.println("\nList  Menu");
        System.out.println("1 - Pediatrician");
        System.out.println("2 - Neurologist");
        System.out.println("3 - General Practitioner");
        System.out.println("4 - Psychiatrist");
        System.out.println("5 -Surgeon");
        System.out.println("6 -Dermatologist");



        int userChoice =0;
           Scanner s5 = new Scanner(System.in);
           System.out.println("Please make a choice of the doctor you wish to see, and press ENTER: ");
           userChoice = s5.nextInt();


           switch (userChoice)
           {
             case 1 :
             appType = "Pediatrician";
               break;

             case 2:
             appType = "Neurologist";
               break;

             case 3:
             appType = "General Practitioner";
               break;

             case 4:
             appType = "Psychiatrist";
               break;

             case 5:
             appType = "Surgeon";
               break;

             case 6:
             appType = "Dermatologist";
               break;


             default: System.out.println("That is not a valid choice, please try again");
                     break;
           }


           displayAppointmentInfo();
     }














  public void displayAppointmentInfo(){
    System.out.println("Appointment Information");
    System.out.println("=========================");

    System.out.println(appName);
    System.out.println("date: " + appDay + "/" + appMonth + "/" + appYear);
    System.out.println("Start Time: " + appSTime + ":00" );
    System.out.println("End Time: " + appETime + ":00");
    System.out.println("Appointment Type: " + appType);

  }










}
