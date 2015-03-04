// Jack Curran
// 3/2/2015
// hw06
// program #3
// CSE2

// declare class
public class MakeSymbols{
    
    // add main method
    public static void main (String[]args){
        
        // generate random number from 0-100
        int random= (int) ((Math.random())*100);
        
        // print out random number
        System.out.println("The random number"+
        " is "+random);
        
        //crate counter
        int counter=0;
        //do-while loop
        do{
            if (random%2==0){
                System.out.print("*");
                counter++;
            }
            else{
                System.out.print("&");
                counter++;
            }
            }while(counter<random);
    }
}