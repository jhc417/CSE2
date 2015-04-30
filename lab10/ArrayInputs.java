// Jack Curran
// 4/3/2015
// lab10
// CSE2

//import scanner
import java.util.Scanner;

//declare class
public class ArrayInputs {
    
    //main method
    public static void main(String[] args) {
    //delcare scanner
    Scanner myScanner; 
    //construct scanner
    myScanner = new Scanner(System.in);
    //ask for array length
    System.out.print("Please enter the desired size of the array: ");
    int sizeOfArray = myScanner.nextInt();
    int [] myArray = inputMethod(sizeOfArray);
    //print out array
    System.out.print("The array is: ");
    printArray(myArray);
    System.out.println(" ");
    }
    //method to obtain the number of integers
    public static int [] inputMethod(int z){
        Scanner myScanner; //Declare the Scanner
        myScanner = new Scanner(System.in);
        int number = 1;
        int [] myArray2 = new int [z];   
        //ask user for the specific integers
        System.out.println("Please enter " +z+" positive integer");
        for(int i=0; i<z;){ 
            // make sure user enters integers
            while (true) {
                if (myScanner.hasNextInt() != true) {  
                    System.out.println("Please enter integers only, enter again");
                    String wrong = myScanner.next();
                    continue;
                }
                number = myScanner.nextInt();
                //make sure integers are greater than zero
                if (number >= 0) { 
                    myArray2[i]=number;
                    i++;
                    break;
                }
                else {
                    System.out.println("Please enter positive numbers only, enter again");//if not prompt user to re-enter
                    continue;
                }
            }
        }
        return myArray2;
    }
    //method to print each member of the array
    public static void printArray(int[] x) {
        for (int i = 0; i < x.length; i++)
            System.out.print(x[i]+ " ");
    }
}