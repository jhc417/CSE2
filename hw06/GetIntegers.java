//Jack Curran
//2/27/2015
//hw06
//program#1
//CSE2

//import scanner
import java.util.Scanner;

    //declare class
    public class GetIntegers{
        
        
        //add a main a method
        public static void main (String[]args){
            
            //declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner= new Scanner (System.in);
            
            // ask user for 5 positive integers
            System.out.print("Please enter 5"+
            " non-negative integers: ");
            int one;
            int two;
            int three;
            int four;
            int five;
            for (int a=0; a<1; a++){
                System.out.print("First Integer:");
                one = myScanner.nextInt();
                if(one<0){
                    System.out.print("Invalid input, enter again: ");
                    one = myScanner.nextInt();
                }
            }
            for (int b=0; b<1; b++){
                System.out.print("Second Integer: ");
                two = myScanner.nextInt();
                if(two<0){
                    System.out.print("Invalid input, enter again: ");
                    two = myScanner.nextInt();
                }
            }
            for (int c=0; c<1; c++){
                System.out.print("Third Integer: ");
                three = myScanner.nextInt();
                if(three<0){
                    System.out.print("Invalid input, enter again: ");
                    three = myScanner.nextInt();
                }
            }
            for (int d=0; d<1; d++){
                System.out.print("Fourth Integer: ");
                four = myScanner.nextInt();
                if(four<0){
                    System.out.print("Invalid input, enter again: ");
                    four = myScanner.nextInt();
                }
            }
            for (int e=0; e<1; e++){
                System.out.print("Fifth Integer: ");
                five = myScanner.nextInt();
                if(five<0){
                    System.out.print("Invalid input, enter again: ");
                    five = myScanner.nextInt();
                }
            }
            int sum=(one+two+three+four+five);
            System.out.println("");
            System.out.println("The sum is "+sum);
            }
        }
    
