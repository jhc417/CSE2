// Jack Curran
// 4/12/15
// hw11
//CSE2

//import scanner
import java.util.Scanner;

//import random number generator
import java.util.Random;

// declare class
public class CSE2Linear{
    
    //main method
    public static void main (String[]args){
        
        //declare scanner
        Scanner myScanner;
        
        //construct scanner
        myScanner = new Scanner (System.in);
        
        //array to store 15 grades
        int [] finalGrades = new int [15];
        
        //for loop to assign values to array 
        System.out.println("Enter 15 ints for final grades in CSE2:");
        int inputGrade=0;
        for(int i = 0; i<15; i++){
            //IF YOU ENTER A WRONG NUMBER IT WILL PROMPT YOU TO ENTER IT AGAIN
            if(myScanner.hasNextInt()){
                inputGrade = myScanner.nextInt();
                
                if(inputGrade >= 0 && inputGrade <= 100){
                    if(i > 0){
                        if(finalGrades[i-1] > inputGrade){
                            System.out.println("Please enter the number in ascending order");
                            i--;
                            continue;
                        }  
                    }
                    finalGrades[i] = inputGrade;
                }
                else{
                    System.out.println("Please enter numbers between 0 and 100");
                    i--;
                    continue;
                }
            }
            else{
                System.out.println("You did not enter an int");
                myScanner.nextLine();
                i--;
                continue;
            }
        }
            System.out.println("Enter a grade to search for");
            int gradeSearch = myScanner.nextInt();
            int[] myArray0 = Binary(finalGrades, gradeSearch);
            if(myArray0[0] != -1){
                System.out.println("The number was found");
                System.out.println("It took "+myArray0[1]+" iteration(s)");
            }
            else{
                System.out.println("The number was not found");
                System.out.println("It took "+myArray0[1]+" iteration(s)");
            }
            //call scramble method
            System.out.println("Scramble:");
            Scramble(finalGrades);
            for (int c=0; c<finalGrades.length; c++){
                System.out.println(finalGrades[c]);
            }
            
            // call linear search method
            System.out.print("Enter a grade to search for: ");
            int gradeSearch2 = myScanner.nextInt();
            int[] myArray = Linear(finalGrades, gradeSearch2);
            if(myArray[0] != -1){
                System.out.println("The number was found");
                System.out.println("It took "+myArray[1]+" iteration(s)");
            }
            else{
                System.out.println("The number was not found");
                System.out.println("It took "+myArray[1]+" iteration(s)");
            }
    }
    public static int[] Linear(int [] finalGrades, int gradeSearch2){
        int[] myArray = {-1,0};
        // myArray = {index, iterations}
        // if index = -1 the number was not found
        for (int i=0; i<finalGrades.length; i++){
            myArray[1]++; //increment number of iterations
            if (gradeSearch2==finalGrades[i]){
                myArray[0] = i; //store with index of the number found
                return myArray; //the index was found
            }
        }
        return myArray; //the index was not found
    }
    public static int[] Binary(int [] finalGrades, int gradeSearch){
        int[] myArray = {-1, 0};
        // myArray = {index, iterations}
        // if index = -1 the number was not found
        int lowValue = 0;
        int highValue = finalGrades.length-1;
        while (highValue>= lowValue){
            myArray[1]++;
            int middleValue= (highValue+lowValue)/2;
            if (gradeSearch<finalGrades[middleValue]){
                highValue = middleValue-1;
            }
            else if(gradeSearch==finalGrades[middleValue]){
                myArray[0] = middleValue;
                return myArray;
            }
            else{
                lowValue= middleValue+1;
            }
        }
        return myArray;
    }
    public static void Scramble(int [] finalGrades){
        int scramble;
        for (int z=0; z<finalGrades.length; z++){
            int random2= (int) (Math.random()*15);
            scramble = finalGrades[z];
            finalGrades[z] = finalGrades[random2];
            finalGrades[random2]=scramble;
        }
    }
    
    
    
    
    
}