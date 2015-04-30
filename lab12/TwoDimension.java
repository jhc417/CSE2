// Jack Curran
//4/17/2015
// lab12
// CSE002

//import scanner
import java.util.Scanner;

//declare class
public class TwoDimension {
    //main method
    public static void main(String[] args) {
        // generate random widths and heights
        int width = (int)((Math.random() * 5) + 1);
        int height = (int)((Math.random() * 5) + 1);
        int width2 = (int)((Math.random() * 5) + 1);
        int height2 = (int)((Math.random() * 5) + 1);
        //call methods to make matrices
        int[][] myArray = increasingMatrix(width, height, true);
        int[][] myArray2 = increasingMatrix(width, height, true);
        int[][] myArray3 = increasingMatrix(width2, height2, true);
        //print first matrix
        System.out.println("Matrix A");
        printArray(myArray, true);
        System.out.println(" ");
        //print second matrix
        System.out.println("Matrix B");
        printArray(myArray2, false);
        System.out.println(" ");
        //print third matrix
        System.out.println("Matrix C");
        printArray(myArray3, true);
        System.out.println(" ");
        //call method to add matrices 1 & 2
        int[][]  result= addArray(myArray, true, myArray2, false);
         if (result != null) {
            printArray(result, true);
        }
        //call method to add matrices 1 & 3
        int[][] result2 = addArray(myArray, true, myArray3, true);
        if (result2 != null) {
            printArray(result2, true);
        }
    }
    //method that returns a 2D array
    public static int [][] increasingMatrix(int a, int b, boolean format){
        int [][] matrix = new int[a][b];
        int number = 1;
        if(format == true){
            for(int i=0; i<a; i++){
                for(int j=0; j<b; j++){
                    matrix[i][j]=number;
                    number++;
                }
            }
            return matrix;
        }
        
        else{
            for(int i=0; i<b; i++){
                for(int j=0; j<a; j++){
                    matrix[i][j]= 1 + i*j ;
                    number++;
                }
            }
        return matrix;    
        }
    }
    // prints array
    public static void printArray(int[][] x, boolean format) {
        if (format == true) {
            for (int i = 0; i < x.length; i++) {
                System.out.print("{ ");
                for (int j = 0; j < x[i].length; j++) {
                    if (j == (x[i].length - 1)) {
                        System.out.print(x[i][j]);
                    }
                    else {
                        System.out.print(x[i][j] + ", ");
                    }
                }
                System.out.println(" }");
            }
        }
        else {
            int [][] y = x;
            for (int a = 0; a < y.length; a++) {
                System.out.print("{ ");
                for (int b = 0; b < y[a].length; b++) {
                    if (b == (y[a].length - 1)) {
                        System.out.print(y[a][b]);
                    }
                    else {
                        System.out.print(y[a][b] + ", ");
                    }
                }
                System.out.println(" }");
            }
        }
    }
    // method that transfers array values into a new array
    public static int [][] translate(int[][] x){
        int [][] y = new int[x.length][x[0].length];
        for(int a = 0; a < x.length; a++){
            for(int b = 0; b<x[a].length; b++){
                y[a][b]=x[b][a];
            }
        }
        return y;
    }
    // method that adds the matrices
   public static int [][] addArray( int[][] a, boolean formata, int[][] b, boolean formatb){
      if(a.length!=b.length){
          System.out.println("The matrices are not able to be added.");
          return null;
      }
      else if(a[0].length != b[0].length){
          System.out.println("The matrices are not able to be added.");
          return null;
      }
      int[][] myArray4 = new int [a.length][a[0].length];
        for(int i=0; i<a.length;i++){
            for(int j = 0; j<a[i].length; j++){
                myArray4[i][j]=a[i][j]+b[i][j]; 
            }
        }
      return myArray4; 
    } 
    
}






