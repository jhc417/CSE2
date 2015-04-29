// Jack Curran
// 4/26/2015
// hw13
//CSE002
// this was wayyyy too difficult lol

//import scanner
import java.util.Scanner;

//declare class
public class FourDwin{
    
    //main method
    public static void main (String[]args){
        
        //declare scanner
        Scanner myScanner;
        
        //construct scanner
        myScanner=new Scanner (System.in);
        
        //ask user for range of array length
        int counter=0;
        int highLength=0;
        int lowLength=0;
        while (counter<1){
            System.out.println("Enter the range for the length"+
            " of the array: ");
            lowLength=myScanner.nextInt();
            highLength=myScanner.nextInt();
            if (lowLength>=highLength){
                System.out.println("The first number input must"+
                " be smaller than the second. Try again.");
            }
            if (highLength>lowLength){
            counter++;
            }
        }
        
        int diff=highLength-lowLength;
        int length= (int) ((Math.random()*diff)+lowLength);
        int length2= (int) ((Math.random()*diff)+lowLength);
        int length3= (int) ((Math.random()*diff)+lowLength);
        
        
        //crate array
        double [][][][] myArray= new double [3][length][length2][length3];
        
        //assign values to the array- $ for loops
        for (int a=0; a<myArray.length; a++){
            for (int b=0; b<myArray[a].length; b++){
                for (int c=0; c<myArray[a][b].length; c++){
                    for (int d=0; d<myArray[a][b][c].length; d++){
                        double randomNumber=(Math.random()*30);
                        randomNumber=Double.parseDouble(String.format("%.1f",randomNumber));
                        myArray[a][b][c][d]= randomNumber;
                    }
                }
            }
        }
        statArray(myArray);
        sort3DArray(myArray, length, length2, length3);
        sort4DArray(myArray, length, length2, length3);
        printArray(myArray);
        
        
        
    }
    //statArray method to return sum, mean and number of elements
    public static void statArray(double [][][][]x){
        //find sum, mean, and number elements of the array
        double sum=0.0;
        double average=0.0;
        int elementCounter=0;
        for (int a=0; a<x.length; a++){
            for (int b=0; b<x[a].length; b++){
                for (int c=0; c<x[a][b].length; c++){
                    for (int d=0; d<x[a][b][c].length; d++){
                        sum+=x[a][b][c][d];
                        elementCounter++;
                        average=sum/elementCounter;
                    }
                }
            }
        } 
        //round sum to one decimal place
        sum=(sum*10);
        sum=(int)sum;
        sum=sum/10.0;
        
        //round average to one decimal place
        average= (average*10);
        average=(int) average;
        average = average/10.0;
        //print sum of the array
        System.out.println("The sum of the array is "+sum);
        //print average of the array
        System.out.println("The average of the array is "+average);
        //print out number of elements
        System.out.println("The number of elements is "+elementCounter);
    
    }
    public static void sort4DArray(double [][][][]x, int n1, int n2, int n3){
        //insertion sort
        double [][][][] temp = new double [3][n1][n2][n3];
        System.arraycopy(x,0,temp,0,x.length);
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[i].length; j++){
                for (int k=1; k<x[i][j].length; k++){
                    if (x[i][k].length<x[i][j].length){
                        temp[i][j]=x[i][k];
                        x[i][k]= x[i][j];
                        x[i][j]=temp[i][k];
                    }
                }
            }
                
        }
        
           
           
           
          
           
        
        
    }
    public static void printArray(double [][][][]x){
        for (int a=0; a<x.length; a++){
            System.out.print("{");
            System.out.println("  ");
            for (int b=0; b<x[a].length; b++){
                System.out.print(" {");
                System.out.println("   ");
                for (int c=0; c<x[a][b].length; c++){
                    System.out.print("  {");
                    System.out.print("");
                    for (int d=0; d<x[a][b][c].length; d++){
                        if (d%2==0){
                            System.out.print("(");
                        }
                        if (d%2!=0){
                            System.out.print(",");
                        }
                        System.out.print(x[a][b][c][d]);
                    }
                    System.out.print(")");
                    
                }
                System.out.println("}");
                System.out.print("");
            }
            System.out.print("}");
            System.out.println("");
        }
        System.out.println("}");
    }
    public static double[][][][] sort3DArray(double [][][][]x, int n1, int n2, int n3){
        double [][][][] temp = new double [3][n1][n2][n3];
        int currentMin=x[0][0].length;
        System.arraycopy(x,0,temp,0,x.length);
        for (int i=0; i<x.length; i++){
            for (int j=0; j<x[i].length; j++){
                for (int k=1; k<x[i][j].length; k++){
                    if (x[i][k].length<currentMin){
                        currentMin=x[i][k].length;
                        temp[i][j]=x[i][k];
                        x[i][k]= x[i][j];
                        x[i][j]=temp[i][k];
                    }
                }
            }
                
        }
        
        return temp;
    }
    //sorry I couldn't get the sort to work!
    
    
    
    
    
    
}