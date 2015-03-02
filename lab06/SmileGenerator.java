// Jack Curran
// 2/27/2015
// lab06
// CSE2

// declare class
public class SmileGenerator{
    
    //add a main method
    public static void main (String[]args){
        
        //step 1:use loop to print smiley faces 5 times
        int counter=0;
        while(counter<5){
            System.out.print(":)");
            counter++;
        }
        System.out.println("");
        //step2: print out random number of smiley faces
        int counter2=0;
        int random= (int) ((Math.random())*100);
        System.out.println("Printed "+random+" smiley faces below.");
        while(counter2<random){
            System.out.print(":)");
            counter2++;
        }
        System.out.println("");
        System.out.println("");
        //step3: make loop that prints only 30 smileys on each line
        int counter3=0;
        int counter4=0;
        while (counter4<random){
            while((counter4<30 && 30<random)|| (counter4<61 &&61<random)){
                System.out.print(":)");
                counter4++;
                while((counter4==30)|| (counter4==61)){
                    System.out.println("");
                    counter4++;
                }
        }
            System.out.print(":)");
            counter4++;
        }
        
        // spaces 
        System.out.println("");
        System.out.println("");

        //step4
        
        for(int k=0; k<5; k++){
            for(int j=0; j<=k; j++){
                System.out.print(":)");
            }
            System.out.println();
        }
        
    }
}