// Jack Curran
// 3/6/2015
// lab07
//CSE2

// import scanner
import java.util.Scanner;

    // declare class
    public class zigzag{
        
        // add a main method
         public static void main (String[]args){
        
             //declare scanner
             Scanner myScanner;
             
             // construct scanner
             myScanner= new Scanner (System.in);
             
             //variable for number of stars
             int nStars=10;
             
             //loop to print out 10 stars in a line
             int counter=0;
             while(counter<nStars){
                 System.out.print("*");
                 counter++;
             }
             System.out.println("");
             
             // nested loop to print out diagonal
             for (int j=1;j<10; j++){
                for (int i=10; j<i; i--){
                    System.out.print(" ");
                     //i++;
                }
                System.out.print("*");
                System.out.println("");
             }
             // another loop to print out 10 stars in a line
             int nStarts=10;
             int counter2=0;
             while(counter2<nStarts){
                 System.out.print("*");
                 counter2++;
             }
             System.out.println("");
             
             }
             
         }
    