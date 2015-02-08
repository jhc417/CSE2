// Jack Curran
// 2/6/2015
// hw#3
// program#2
// CSE2

    //import scanner
    import java.util.Scanner;
    
    // declare class
    public class Root {
        
        //add main method
        public static void main(String[]args) {
            
            //declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner = new Scanner (System.in);
            
            //ask user for a number
            System.out.print("Enter the desired number to cube rooted: ");
            double inputNumber = myScanner.nextDouble();
            
            //first guess
            double firstGuess= (inputNumber/3);
            
            
            //second guess
            double secondGuess= (firstGuess*firstGuess*firstGuess+inputNumber)/(3*firstGuess*firstGuess);
            
            
            //third guess
            double thirdGuess= (2*secondGuess*secondGuess*secondGuess+inputNumber)/(3*secondGuess*secondGuess);
            System.out.println("The cubed root of "+
            inputNumber+" is "+ thirdGuess);
            
            //cube the number given after the cubing
            double cube= (thirdGuess*thirdGuess*thirdGuess);
            System.out.println("If we cube the outputted cube root,"+
            " we get an answer of "+cube);
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }