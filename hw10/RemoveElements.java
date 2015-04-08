//Jack Curran
// 4/6/2015
// hw10
//CSE2

import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  //method that generates an array of 10 random integers
  public static int[] randomInput(){
  		int [] numberID = new int[10];
      for (int i=0; i<10; i++){
      int randomNumber = (int) (Math.random()*10);
      numberID[i] = randomNumber;
      }
      return numberID;
  }
  //method to take input and delete the position that is entered
  public static int [] delete(int[] list,int pos){
    if (pos>9|| pos<0){
      System.out.println("The index is not valid.");
      return list;
    }
  	int [] secondList = new int[list.length-1];
  	int counter2=0;
  	for (int counter=0; counter<list.length; counter++){
  	  if (counter==pos){
  	    continue;
  	  }
  	  secondList[counter2++]=list[counter];
  	  
  	}
  	return secondList;
  	
  }
  //method to remove elements that are equal to the target
  public static int [] remove(int [] list,int target){
    if (target>9|| target<0){
      System.out.println("The index is not valid.");
      return list;
    }
    int matches = 0;
    for(int i = 0; i < list.length; i++){
      if(list[i] == target){
        matches++;
      }
    }
      if (matches == 0){
        System.out.println("Element "+target+" has not been found");
        return list;
      }
      if (matches>0){
        System.out.println("Element "+target+" has been found");
      }
    
    int j=0;
  	int [] thirdList = new int[list.length - matches];
  	for(int i = 0; i < list.length; i++){
  	  if(list[i] == target){
  	    continue;
  	  }
  	  thirdList[j++] = list[i];
  	}
  	return thirdList;
  	  
  }
}







