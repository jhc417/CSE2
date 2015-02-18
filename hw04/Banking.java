// Jack Curran
// 2/17/2015
//hw04
// CSE2

    //import scanner
    import java.util.Scanner;
    
    //declare class
    public class Banking{
        
        //add a main method
        public static void main(String[]args){
            
            //declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner = new Scanner (System.in);
            
           //random number between 1,000 and 5,000
           int randomNumber= (int) (1000 + Math.random()*4000);
           System.out.println("You have $"+randomNumber+
           " in your bank account.");
           
           //ask user what they would like to do with money
           System.out.println("Would you like to deposit"+
           " or withdraw money? Enter 1 for deposit"+
           " or 2 for withdrawal: ");
           int answer = myScanner.nextInt();
           switch (answer){
               case 1:
               System.out.print("How much would you"+
               " like to deposit?: ");
               int deposit = myScanner.nextInt();
            if(deposit<0){
                   System.out.println("You did not enter"+ 
                  " a positive amount.");
                  return;
               }
            else{
               System.out.println("You chose to deposit"+
               " $"+deposit);
               int newBalance=randomNumber+deposit;
               System.out.println("Your new balance is"+
               " $"+newBalance);
               break;
               }
            case 2:
                System.out.print("How much would"+
                " you like to withdraw?: ");
                int withdrawal = myScanner.nextInt();
                if (withdrawal<0){
                    System.out.println("You did not enter"+
                    " a positive amount.");
                    return;
                }
                else{
                if (withdrawal>randomNumber){
                    System.out.println("You do not have"+
                    " enough money in your account.");
                    return;
                     }
                System.out.println("You chose to withdraw"+
                " $"+ withdrawal);
               int newBalanceTwo= (randomNumber-withdrawal);
               System.out.println("Your new balance is"+
               " $"+newBalanceTwo);
               break;
                }
              default:
               System.out.println("You did not choose to deposit"+
               " or withdraw from you account. Your balance"+
               " remains at $"+randomNumber);
               break;
            }
            
            
            
            
            
    }
    }