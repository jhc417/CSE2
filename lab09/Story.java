// Jack Curran
// 3/27/2015
//lab09
//CSE2

//import scanner
import java.util.Scanner;
//import random number generator
import java.util.Random;

//declare class
public class Story{
    //main methid
    public static void main(String[] args) {
        //declare scanner
        Scanner myScanner;
        //construct scanner
        myScanner = new Scanner(System.in);
        //loop to run all methods
        while (true) {
            String adjectiveOne = adjectiveGenerator();
            String adjectiveTwo = adjectiveGenerator();
            String adjectiveThree = adjectiveGenerator();
            String subjectOne = subjectGenerator();
            String verbOne = verbGenerator();
            String objectOne = objectGenerator();

            //print out final sentence
            System.out.println("The " + adjectiveOne + " " + adjectiveTwo + 
            " " + subjectOne + " " + verbOne + " the " + adjectiveThree + 
            " " + objectOne+".");
            //ask user to go again
            System.out.print("Would you like to make"+
            " another sentence? (Y/y) for yes, anything else to exit: ");
            String reply =myScanner.next();
            if (reply.equals("Y") || reply.equals("y")) { 
                continue;  
            }
            else {
                break;
            }
        }

    }
    //method to generate adjectives
    public static String adjectiveGenerator(){
    Random randomNumber = new Random();
    int number = randomNumber.nextInt(10);
    switch (number){
        case 0:
            return "awesome";
        case 1:
            return "big";
        case 2:
            return "smart";
        case 3:
            return "clumsy";
        case 4: 
            return "fast";
        case 5:
            return "creative";
        case 6:
            return "small";
        case 7:
            return "special";
        case 8:
            return "good";
        case 9: 
            return "great";
        default:
            return "great";
    }



    }  
    // method to generate subjects
    public static String subjectGenerator(){
        Random randomNumber = new Random();
    int number = randomNumber.nextInt(10);
    switch (number){
        case 0:
            return "pig";
        case 1:
            return "cat";
        case 2:
            return "moose";
        case 3:
            return "dog";
        case 4: 
            return "lion";
        case 5:
            return "sheep";
        case 6:
            return "lizard";
        case 7:
            return "boy";
        case 8:
            return "girl";
        case 9: 
            return "cheetah";
        default:
            return "cheetah";
    } 
}
    //method to generate verbs
    public static String verbGenerator(){
    Random randomNumber = new Random();
    int number = randomNumber.nextInt(10);
    switch (number){
        case 0:
            return "ran";
        case 1:
            return "jumped";
        case 2:
            return "raced";
        case 3:
            return "thanked";
        case 4: 
            return "read";
        case 5:
            return "ate";
        case 6:
            return "fell";
        case 7:
            return "insured";
        case 8:
            return "won";
        case 9: 
            return "lost";
        default:
            return "lost";    
    
    }
}
    //method to generate objects
    public static String objectGenerator(){
    Random randomNumber = new Random();
    int number = randomNumber.nextInt(10);
    switch (number){
        case 0:
            return "chair";
        case 1:
            return "TV";
        case 2:
            return "house";
        case 3:
            return "tree";
        case 4: 
            return "drink";
        case 5:
            return "food";
        case 6:
            return "room";
        case 7:
            return "person";
        case 8:
            return "window";
        case 9: 
            return "bed";
        default:
            return "bed";
    }
    }
}