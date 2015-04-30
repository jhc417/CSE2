// Jack Curran
//4/12/15
//lab11
//CSE2

//import scanner
import java.util.Scanner;

//declare class
public class MaxAndMin {
    
    //main method
    public static void main (String [] args) {
        //declare scanner
        Scanner myScanner; 
        //construct scanner
        myScanner = new Scanner (System.in);
        //create array
        int[] myArray = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int)((Math.random() * 100));
        }
        printArray(myArray);
        System.out.println(" ");
        linear(myArray);
        int targetValue = 0;
        System.out.println("Enter an int:");
        while (true) {
            //checks to make sure inputs are integers
            if (myScanner.hasNextInt() != true) { 
                System.out.println("Please only enter integers, exiting");
                System.exit(1);
            }
            //makes sure inputs are positive
            int number = myScanner.nextInt();
            if (number >= 0) { 
                targetValue = number;
                break;
            }
            else {
                System.out.println("Please enter only positive integers, exiting");
                System.exit(1);
            }
        }

        int[] myArray2 = new int[50];
        int number2 = 0;
        for (int i = 0; i < myArray2.length; i++) {
            number2 += (int)((Math.random() * 100));
            myArray2[i] = number2;
        }
        printArray(myArray2);
        System.out.println(" ");
        int[] myArray3 = binary(myArray2, targetValue);
        if (myArray3[2] == 0) {
            System.out.println(myArray2[myArray3[0]] + " was found");
            
        }
        //if cannot find
        else {
            System.out.println(targetValue + " was not found");
            System.out.println("The number below the key "+ myArray2[myArray3[0] - 1]);
        }   System.out.println("The number above the key "+ myArray2[myArray3[0]]);

    }
    //method to print array
    public static void printArray(int[] x) {

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
    // method to perform linear search
    public static void linear(int[] x) {
        int maxValue = x[0];
        int minValue = x[0];
        for (int i = 0; i < x.length; i++) {
            if (x[i] >= maxValue) {

                maxValue = x[i];
            }
            else if (x[i] <= minValue) {

                minValue = x[i];
            }
        }
        System.out.println("The maximum of Array 1: " + maxValue);
        System.out.println("The miniimum of Array 1: " + minValue);
    }
    // method to perform binary search
    public static int[] binary(int[] x, int a) {
        int lowValue = 0;
        int highValue = x.length - 1;
        int counter = 0;
        int[] myArray4 = {-1, 0, 1};
        while (highValue >= lowValue) {
            myArray4[1] ++;
            int midValue = (lowValue + highValue) / 2;
            if (a < x[midValue]) {
                highValue = midValue - 1;
                myArray4[0] = midValue;
            }
            else if (a == x[midValue]) {
                myArray4[0] = midValue;
                myArray4[2] = 0;
                return myArray4;
            }
            else {
                lowValue = midValue + 1;
            }
        }
        return myArray4;

    }

}