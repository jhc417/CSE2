// Jack Curran
// 3/16/2015
// hw07
// CSE2

// import scanner
import java.util.Scanner;

    // declare class
    public class waves{
        
        //add a main method
        public static void main (String[]args){
            
            //declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner = new Scanner (System.in);
            
            //ask for input
            System.out.print("Please enter an integer"+
            " between 1 and 30: ");
            int input= myScanner.nextInt();
            
            //if statement
            if (input<1 || input>30){
                System.out.println("The input is not valid");
                return;
                }
            else{
                //FOR LOOP
                System.out.println("FOR LOOP:");
                for(int i=1; i<input+1; i++){
                    
                    for (int j=0; j<i; j++){
                        if(i%2==0){
                        for (int k=0; k<j+1; k++){
                        System.out.print(i);
                        }
                        System.out.println("");
                    }
                    else{
                        for (int m=i; m>j; m--){
                          System.out.print(i);
                        }
                        System.out.println("");  
                        }
                    }
                }
                //WHILE LOOP
                System.out.println("WHILE LOOP:");
                int a=1; 
                int b=0;
                int c=0;
                int d=0;
                while(a<input+1){
                    
                    while(b<a){
                        if(a%2==0){
                            while(c<b+1){
                                System.out.print(a);
                                c++; 
                            }
                            c=0;
                            
                            System.out.println("");
                        }
                        else{
                            d=a;
                            while(d>b){
                                System.out.print(a);
                                d--;
                            }
                            System.out.println("");
                        }
                        b++;
                    }
                    b=0;
                   a++; 
                }
                // DO WHILE LOOP
                System.out.println("DO WHILE LOOP:");
                int z=1; //a
                int y=0; //b
                int x=0; //c
                int w=0; //d
                do{
                    do{
                    if(z%2==0){
                        do{
                         System.out.print(z);
                         x++;
                            }while(x<y+1);
                            x=0;
                            System.out.println("");
                        }
                        else{
                            w=z;
                            do{
                                System.out.print(z);
                                w--;
                            }while(w>y);
                            System.out.println("");
                        }
                        y++;
                    } while(y<z);
                   y=0;
                    z++;
               } while (z<input+1);
                
            
            }
            
            } 
        }
    