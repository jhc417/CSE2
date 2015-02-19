// Jack Curran
// 2/13/2015
// Lab04
// CSE2

    //import scanner
    import java.util.Scanner;
    
    // declare a class
    public class Cookies {
        
        // add a main method
        public static void main (String[]args){
            
            // declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner= new Scanner (System.in);
            
            // ask for number of people attending
            System.out.print("Enter the number of people "
            +"attending the event: ");
            
            //make sure user input is an int
            if (myScanner.hasNextInt()){
            }
            else {
                System.out.println("You did not enter an integer");
                return;
            }
            
            // assign variable for the number of people total
            int nPeople=myScanner.nextInt();
            // ask for number of cookies planning on being bought
            System.out.print("Enter the number of cookies "+
            "planned on being purchased: ");
            
            //make sure the input is an int
            if(myScanner.hasNextInt()){
            }
            else{
                System.out.println("You did not enter an integer.");
                return;
            }
            //assign variable for the number of cookies total
            int nCookies=myScanner.nextInt();
            
            //make sure the input is a positive number
            
            //ask for number of cookies each person will receive
            System.out.print("Enter the number of cookies "+
            "each person will receive: ");
            
            //make sure the input is an int
            if(myScanner.hasNextInt()){
            }
            else{
                System.out.println("You did not enter an integer.");
                return;
            }
            
            //assign variable for number of cookies each person gets
            double nEachPerson= (double) myScanner.nextInt();
            // if statements to make sure positive number is entered
            if(nEachPerson < 0){
                System.out.println("You need to enter a positive number"+
                " for the number of cookies each person will get");
                return;
            }
            if(nCookies<0){
                System.out.println("You need to enter a positive number"+
                " for the number of cookies being purchased");
                return;
            }
            if(nPeople<0){
                System.out.println("You need to enter a positive number"+
                " for the number of people attneding the event");
                return;
            }
            //calculations
            double nCookiesNeeded= nPeople*nEachPerson;
            
            //if statement to determine if there are enough cookies
            if(nCookiesNeeded>nCookies){
                System.out.println("You don't have enough"+
                " cookies for everyone.");
            }
            else{
                System.out.println("You have enough"+
                " cookies for everyone.");
            }
            // variable to see if it divides evenly
            double nDivideEvenly= nPeople%nCookies;
            double enough= nEachPerson*nPeople/nCookies;
            
            //if statement for even division or not
            if(nDivideEvenly==(nDivideEvenly*enough)){
                System.out.println("The cookies divide"+
                " evenly for the number of people.");
            }
            else{
                System.out.println("The cookies do not"+
                " divide evenly for the number of people.");
            }
            if(nCookies<nCookiesNeeded){
                System.out.println("You need "+(nCookiesNeeded-nCookies)+
                " more cookies to divide evenly.");
            }
       
            
            
            
            
            
            
            
            
            
            
        }
    }