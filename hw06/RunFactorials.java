// Jack Curran
// 2/27/2015
// hw06
// program#2
// CSE2

// import scanner
import java.util.Scanner;

    //  declare class
    public class RunFactorials{
        
        //add a main method
        public static void main (String[]args){
            
            //declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner= new Scanner (System.in);
            
            //ask for integer between 9 and 16
            System.out.print("Please enter"+
            " an integer that is between 9 and 16: ");
            int number=myScanner.nextInt();
            
            //use while loop to make sure input is 9-16
            int counter=0;
            while (counter<1){
                
                if(number>=9&&number<=16){
                    counter++;
                    System.out.println("Input Accepted!");
                }
                else{
                    System.out.print("Invalid input,"+
                    " enter again: ");
                    number=myScanner.nextInt();
                }

                int factorial=1;
                int i=1;
                while (i<=number){
                    factorial= factorial*i;//(factorial)*(number*(number-subtract));
                    i++;
                    
                }
                System.out.println(number+"!="+factorial);
            }
            }
            }
            
            
            
        
    
