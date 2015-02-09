// Jack Curran
// 2/8/2015
// hw03
//program#3
//CSE2

    // import scanner
    import java.util.Scanner;
    
    // declare class
    public class FourDigits {
        
        //add a main method
        public static void main (String[]args) {
            
            // declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner= new Scanner (System.in);
            
            // ask user to input a double with four decimals
            System.out.print("Enter a number with four decimal places: ");
            double inputNumber= myScanner.nextDouble();
            
            // calculations
            int fourthDigit = ((int)(inputNumber*10000%10));
            int thirdDigit = ((int)(inputNumber*1000%10));
            int secondDigit = ((int)(inputNumber*100%10));
            int firstDigit = ((int)(inputNumber*10%10));
            
            //print out calculations
            System.out.print(firstDigit);
            System.out.print(secondDigit);
            System.out.print(thirdDigit);
            System.out.println(fourthDigit);
            
            
        }
    }