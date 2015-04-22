// Jack Curran
// lab08
// 3/19/2015
// CSE2

// import scanner
import java.util.Scanner;

// declare class
public class Factorials{
    
    //add a main method
    public static void main (String[]args){
        
        //declare scanner
        Scanner myScanner;
        
        //construct scanner
        myScanner = new Scanner (System.in);
        
        // ask user for number input
        System.out.print("Please enter"+
        " an integer: ");
        int number= myScanner.nextInt();
        int sum=0;
        
        //loop to obtain sum
        for (int i=0; i<number; i++){
            sum+=factorial(i);
        }
        print(sum);
    }
    public static int factorial(int key){
       int multiply = 1;
       for (int i=1; i<=key+1; i++){
           multiply*=i;
       }
       System.out.println(multiply);
       return multiply;
       }
    public static void print(int num){
        System.out.println("The super factorial"+
        " is equal to "+num);
        
    }
}

