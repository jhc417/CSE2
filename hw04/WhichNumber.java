// Jack Curran
// 2/17/2015
//hw04
//CSE2

    // import scanner
    import java.util.Scanner;
    
    // declare class
    public class WhichNumber{
        
    
    
    // add a main method
    public static void main (String[]args){
        
        //declare scanner
        Scanner myScanner;
        
        //construct scanner
        myScanner = new Scanner (System.in);
        
        // ask user to think of integer between 1 and 10
        System.out.println("Think of an integer between"+
        " 1 and 10 and I will guess it. For each question asked"+
        " please respond with Y/y for yes, and N/n for no.");
        
        // ask user if number is even
        System.out.println("Is the number even?: ");
        String even = myScanner.next();
        
        //if answer is yes
        if (even.equals("y") || even.equals("Y")){
            System.out.print("Is the number"+ 
            " divisible by 3?: ");
        
        
         String three = myScanner.next();
        if(three.equals("y") || three.equals("Y")){
            System.out.println("The number is 6.");
            return;
        }
        if (three.equals("n") || three.equals("N")){
            System.out.print("Is the number"+
            " divisible by 4?: ");
        }
         String four = myScanner.next();
        if (four.equals("Y") || four.equals("y")){
            System.out.print("Is the number divided"+
            " by 4 greater than 1?: ");
        }
            if (four.equals("n") || four.equals("N")){
            System.out.print("Is the number divisible"+
            " by 5?: ");
        }
        String fourGreaterThanOne= myScanner.next();
        if (fourGreaterThanOne.equals("y")|| fourGreaterThanOne.equals("Y")){
            System.out.println("The number is 8.");
            return;
        }
        if(fourGreaterThanOne.equals("n")|| fourGreaterThanOne.equals("N")){
            System.out.println("The number is 4.");
            return;
        }
        String five=myScanner.next();
        if(five.equals("Y") || five.equals("y")){
            System.out.println("The number is 10.");
            return;
        }
        if (five.equals("N") || five.equals("n")){
            System.out.println("The number is 2.");
            return;
        }
        }
        if(even.equals("n") || even.equals("N")){
            System.out.print("Is it divisible by 3??: ");
        
        String threeOdd= myScanner.next();
        if (threeOdd.equals("Y") || threeOdd.equals("y")){
            System.out.print("When divided, is"+
            " the result greater than 1?: ");
        }
        if(threeOdd.equals("N")||threeOdd.equals("n")){
            System.out.print("Is it greater than six?: ");
        }
         String greaterThanSix = myScanner.next();
        if(greaterThanSix.equals("y")||greaterThanSix.equals("Y")){
            System.out.println("The number is 7.");
            return;
        }
         if(greaterThanSix.equals("n")||greaterThanSix.equals("N")){
            System.out.print("Is it less than 3?: ");
        }
         String lessThanThree = myScanner.next();
        if (lessThanThree.equals("y")||lessThanThree.equals("Y")){
            System.out.println("The number is 1.");
            return;
        }
        if (lessThanThree.equals("n")|| lessThanThree.equals("N")){
            System.out.println("The number is 5.");
            return;
        }
        String greaterThanOne = myScanner.next();
        if (greaterThanOne.equals("y")|| greaterThanOne.equals("Y")){
            System.out.println("The number is 9.");
            return;
        }
        if (greaterThanOne.equals("n")||greaterThanOne.equals("N")){
            System.out.println("The number is 3.");
            return;
        }
        if(greaterThanSix.equals("y")||greaterThanSix.equals("Y")){
            System.out.println("The number is 7.");
            return;
        }
        }
        
    
        
        
        
        
        
        
        
        
        
        }
    }