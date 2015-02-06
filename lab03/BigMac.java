// Jack Curran
// lab03
//2/6/2015
// CSE2

    //import scanner
    import java.util.Scanner;
    
    //declare class
    public class BigMac {
        
        //add main method
        public static void main (String[] args) {
            
            //declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner = new Scanner ( System.in );
            
            //ask for number of Big Macs
            System.out.print("Enter the desired number of Big Macs(Integer>0): ");
            
            //Declare Big Mac variable for user input
            int nBigMacs = myScanner.nextInt();
            
            //ask for the cost of each Big Mac
            System.out.print("Enter the cost for each individual Big Mac"+
            "as a number in the form of xx.xx: ");
            double bigMac$= myScanner.nextDouble();
            
            //ask for the tax rate
            System.out.print("Enter the tax rate as a whole"+
            "number (xx): ");
            double taxRate= myScanner.nextDouble();
            
            //input given as a whole number, but we need as a proportion
            taxRate/=100;
            
             //Calculationg total cost
             double cost$;
             int dollars;
             int dimes;
             int pennies;
             cost$=nBigMacs*bigMac$*(1+taxRate);
             
             //calculating number of dollars, dimes, and pennies
             dollars=(int)cost$;
             dimes= (int) (cost$*10)%10;
             pennies= (int) (cost$*100)%10;
             
             //Print out final result
             System.out.println("The total cost of "+nBigMacs+" Big Macs at a price of $"+
             bigMac$+" per Big Mac, with a sales tax of "+
             (int) (taxRate*100)+"% is $"+ dollars+"."+dimes+pennies);
             
             
            
             
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        } //end of main method
    } //end of class