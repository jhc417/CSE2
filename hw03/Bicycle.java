// Jack Curran
// 2/6/2015
// hw#3
// CSE2
// Bicycle.java program
// program #1

    //import scanner
    import java.util.Scanner;
    
    //declare class
    public class Bicycle {
        
        //add a main method
        public static void main (String[]args) {
            
            // declare scanner
            Scanner myScanner;
            
            //construct Scanner
            myScanner = new Scanner (System.in);
            
            // ask user for counts and seconds inputs
            System.out.print("Input how many counts occurred: ");
            int nCounts=myScanner.nextInt();
            System.out.print("Input how many seconds: ");
            int nSeconds=myScanner.nextInt();
            
            //calculate distance and minutes
            double pI=3.14159;
            int wheelDiameter=27;
            int nInchesPerFoot=12;
            int nFeetPerMile=5280;
            double nMinutes= (nSeconds/60);
            double totalDistance= (nCounts*pI*wheelDiameter);
            totalDistance/=nInchesPerFoot*nFeetPerMile;
            
            //truncate total distance to two decimal places
            totalDistance= ((int)(totalDistance*100))/100.0;
            
            //print out distance traveled in miles and the time in minutes
            System.out.println("The total distance traveled is "+
            totalDistance+" miles in "+nMinutes+" minutes.");
            
            //calculate and print out average miles per hour
            double nHours=(nMinutes/60);
            double milesPerHour=(totalDistance/nHours);
            milesPerHour=((int)(milesPerHour*100))/100.0;
            System.out.println("The average mph was "+milesPerHour);
        
            
            
            
            
            
            
            
            
            
            
        }
    }
    