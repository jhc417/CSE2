// Jack Curran
// 4/20/2015
// hw12
//CSE002

//import scanner
import java.util.Scanner;

//declare class
public class Multiply{
    
    //main method
    public static void main (String[]args){
        //declare scanner
        Scanner myScanner;
        
        //construct scanner
        myScanner = new Scanner (System.in);
        //while loop to make sure dimensions are compatible
        int counter=0;
        int width=0;
        int height=0;
        int width2=0;
        int height2=0;
        while(counter<1){
            //ask user for width and height of each matrix
            System.out.println("Enter the width of the first matrix: ");
            width=myScanner.nextInt();
            System.out.println("Enter the height of the first matrix: ");
            height=myScanner.nextInt();
            System.out.println("Enter the width of the second matrix: ");
            width2=myScanner.nextInt();
            System.out.println("Enter the height of the second matrix: ");
            height2=myScanner.nextInt();
            System.out.println("xxxxxxxxx");
        
            //check to see if matrices are compatible for multiplication
            if (width!=height2){
                System.out.println("The dimensions you entered are not compatible"+
                " for multiplication. Enter again:");
            }
            else if (width<1||height<1||width2<1||height2<1){
                System.out.println("The dimensions you entered were not all "+
                "positive. Enter again:");
            }
            else{
                counter++;
            }
        }
        //create both arrays
        int [][] myArray = new int [width][height];
        int [][] myArray2 = new int [width2][height2];
        //call randomMatrix method to assign random 
        //numbers to each section of first matrix/array
        myArray = randomMatrix(width, height);
        //call method to print out first matrix/array
        System.out.println("First Matrix:");
        printMatrix(myArray);
        //call randomMatrix method to assign random 
        //numbers to each section of second matrix/array
        myArray2=randomMatrix(width2, height2);
        //call method to print out second matrix/array
        System.out.println("Second Matrix:");
        printMatrix(myArray2);
        // call multiply method to multiply the two arrays/matrices
       int [][] myArray4 = multiply(myArray, myArray2, height, width);
       System.out.println("Final Matrix:");
        printMatrix(myArray4);
    } 
    // random matrix method
    public static int [] [] randomMatrix(int n1, int n2){
        int [][] myArray3= new int [n1][n2];
        for (int row=0; row<myArray3.length ;row++){
            for (int column=0; column<myArray3[row].length; column++){
                 myArray3[row][column] = (int) ((Math.random()*20)-10);
            }
        }
    return myArray3;
    }
    public static void printMatrix(int [][] myArray3){
        for (int a=0; a<myArray3.length; a++){
            for (int b=0; b<myArray3[a].length; b++){
                System.out.print(" "+ myArray3[a][b]);
            }
            System.out.println("");
            
        }
        System.out.println("xxxxxxxxx");
    }
    public static int [][] multiply(int [][] myArray, int [][] myArray2, int height, int width2){
        int [][] myArray4 = new int [height][width2];
        for (int z=0; z<myArray4.length; z++){
                for(int y=0; y<myArray4[0].length; y++){
                    for (int v=0; v<myArray4[0].length; v++){
                        myArray4[z][y]+= (myArray[z][v]*myArray2[v][y]);
                    }
                }
        }
        return myArray4;
        
    }
    
    
    
}
    
    
    
    
    
