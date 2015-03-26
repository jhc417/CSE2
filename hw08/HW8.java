// Jack Curran
// 3/24/2015
// hw08
// CSE2

//import scanner
import java.util.Scanner;
import java.util.Random;

//declare class
public class HW8{
    
    //MAIN METHOD
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
    
        
    //visual cave code
    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    //visual giant code
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }
    //visual reward box code
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    //continuation code
    public static String getInput(Scanner scan, String string){
        String continueInput = scan.next();
        if(continueInput.equals("C") || continueInput.equals("c")){
        return ("");
        }
        else{
            System.out.println("Yeah right LOSER");
            System.exit(1);
        }
        return("");
    }
    //method for fighting the giant
    public static String getInput(Scanner scan, String string, int trial){
        int random=0;
        int random2=0;
        int counter=0;
        String attackOrEscape;

        while (true){
            attackOrEscape = scan.next();
            if (attackOrEscape.equals("A")||attackOrEscape.equals("a")){
                random = (int)( Math.random()*2);
                if(random==0){
                    System.out.println("Critical Hit!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
                    //code for defeating the giant
                    counter++;
                    if(counter == 10){
                        System.out.println("You defeated the giant!");
                        break;
                    }
                    
                }
                else{
                     System.out.println("Gosh! How could you miss it!");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");

                     continue;
                 }   
            
            }
            // 
            else if (attackOrEscape.equals("E")||attackOrEscape.equals("e")){
                // generates random number between 1 and 10
                random2= (int)( Math.random()*11);

                if(random2==10){
                    System.out.println("You have escaped!");
                    break;
                }
                else{
                    System.out.println("You have failed to escape");
                    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");

                }
            }
            else{
                System.out.println("Executed by the GIANT! Game over!");
                System.exit(1);
            }
        }
        return ("");
    }
    //method for rewards after victory
    public static String getInput(Scanner scan){
        int reward = scan.nextInt();
        switch(reward){
            case 1:
                System.out.println("You get $500!");
                break;
            case 2:
                System.out.println("You get a new car!");
                break;
            case 3:
                System.out.println("You unlocked a"+
                " new hero!");
                break;
            default:
                System.out.println("Sorry, you entered "+
                "a wrong input and therefore get nothing");
                break;
        }
        return (" ");
    }
}