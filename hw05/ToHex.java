// Jack Curran
// 2/21/2015
// hw05
// CSE2

    //import scanner
    import java.util.Scanner;
    
    //declare class
    public class ToHex{
        
        //add a main method
        public static void main (String[]args){
            
            //declare scanner
            Scanner myScanner;
            
            //construct scanner
            myScanner = new Scanner(System.in);
            
            // ask user for three numbers
            System.out.println("Please enter three"+
            " numbers representing RGB values: ");
            System.out.print("First value: ");
            int first = myScanner.nextInt();
            if (first>255 || first<0){
                System.out.println("Sorry, you"+
                " must enter a number from 0-255.");
                return;
            }
            System.out.print("Second value: ");
            int second = myScanner.nextInt();
            if (second>255 || first<0){
                System.out.println("Sorry, you+"+
                " must enter a number from 0-255.");
                return;
            }
            System.out.print("Third value: ");
            int third = myScanner.nextInt();
            if (third>255 || first<0){
                System.out.println("Sorry, you"+
                " must enter a number from 0-255.");
                return;
            }
            
            //find how many times 16 can go into
            //each user's input numbers
            int firstDivide= first/16;
            int secondDivide= second/16;
            int thirdDivide= third/16;
            
            //get remainder of each user input number
            //when dividing by 16
            int firstRemainder= first%16;
            int secondRemainder= second%16;
            int thirdRemainder= third%16;
            
            
             System.out.print("The decimal numbers R:"+first+
            ", G:"+second+", B:"+third+" is represented"+
            " in hexidecimal as: ");
            
             if(0<=firstDivide && firstDivide<=9){
                System.out.print(firstDivide);
            
             }
            
            
            char firstTen;
            char firstEleven;
            char firstTwelve;
            char firstThirteen;
            char firstFourteen;
            char firstFifteen;
            switch(firstDivide){
                case 10:
                    firstTen='A';
                    System.out.print(firstTen);
                    break;
                case 11:
                    firstEleven='B';
                    System.out.print(firstEleven);
                    break;
                case 12:
                    firstTwelve='C';
                    System.out.print(firstTwelve);
                    break;
                case 13:
                    firstThirteen='D';
                    System.out.print(firstThirteen);
                    break;
                case 14:
                    firstFourteen='E';
                    System.out.print(firstFourteen);
                    break;
                case 15:
                    firstFifteen='F';
                    System.out.print(firstFifteen);
                    break;
            }
            
            char firstRTen;
            char firstREleven;
            char firstRTwelve;
            char firstRThirteen;
            char firstRFourteen;
            char firstRFifteen;
            switch(firstRemainder){
                case 10:
                    firstRTen='A';
                    System.out.print(firstRTen);
                    break;
                case 11:
                    firstREleven='B';
                    System.out.print(firstREleven);
                    break;
                case 12:
                    firstRTwelve='C';
                    System.out.print(firstRTwelve);
                    break;
                case 13:
                    firstRThirteen='D';
                    System.out.print(firstRThirteen);
                    break;
                case 14:
                    firstRFourteen='E';
                    System.out.print(firstRFourteen);
                    break;
                case 15:
                    firstRFifteen='F';
                    System.out.print(firstRFifteen);
                    break;
            }
            if(0<=firstRemainder && firstRemainder<=9){
                 System.out.print(firstRemainder);
             }
            if(0<=secondDivide && secondDivide<=9){
                 System.out.print(secondDivide);
             }
             
            char secondTen;
            char secondEleven;
            char secondTwelve;
            char secondThirteen;
            char secondFourteen;
            char secondFifteen;
            switch(secondDivide){
                case 10:
                    secondTen='A';
                    System.out.print(secondTen);
                    break;
                case 11:
                    secondEleven='B';
                    System.out.print(secondEleven);
                    break;
                case 12:
                    secondTwelve='C';
                    System.out.print(secondTwelve);
                    break;
                case 13:
                    secondThirteen='D';
                    System.out.print(secondThirteen);
                    break;
                case 14:
                    secondFourteen='E';
                    System.out.print(secondFourteen);
                    break;
                case 15:
                    secondFifteen='F';
                    System.out.print(secondFifteen);
                    break;
            }
           
            char secondRTen;
            char secondREleven;
            char secondRTwelve;
            char secondRThirteen;
            char secondRFourteen;
            char secondRFifteen;
            switch(secondRemainder){
                case 10:
                    secondRTen='A';
                    System.out.print(secondRTen);
                    break;
                case 11:
                    secondREleven='B';
                    System.out.print(secondREleven);
                    break;
                case 12:
                    secondRTwelve='C';
                    System.out.print(secondRTwelve);
                    break;
                case 13:
                    secondRThirteen='D';
                    System.out.print(secondRThirteen);
                    break;
                case 14:
                    secondRFourteen='E';
                    System.out.print(secondRFourteen);
                    break;
                case 15:
                    secondRFifteen='F';
                    System.out.print(secondRFifteen);
                    break;
            }
            if(0<=secondRemainder && secondRemainder<=9){
                 System.out.print(secondRemainder);
             }
             if(0<=thirdDivide && thirdDivide<=9){
                 System.out.print(thirdDivide);
             }
             
            char thirdTen;
            char thirdEleven;
            char thirdTwelve;
            char thirdThirteen;
            char thirdFourteen;
            char thirdFifteen;
            switch(thirdDivide){
                case 10:
                    thirdTen='A';
                    System.out.print(thirdTen);
                    break;
                case 11:
                    thirdEleven='B';
                    System.out.print(thirdEleven);
                    break;
                case 12:
                    thirdTwelve='C';
                    System.out.print(thirdTwelve);
                    break;
                case 13:
                    thirdThirteen='D';
                    System.out.print(thirdThirteen);
                    break;
                case 14:
                    thirdFourteen='E';
                    System.out.print(thirdFourteen);
                    break;
                case 15:
                    thirdFifteen='F';
                    System.out.print(thirdFifteen);
                    break;
            }
            char thirdRTen;
            char thirdREleven;
            char thirdRTwelve;
            char thirdRThirteen;
            char thirdRFourteen;
            char thirdRFifteen;
            switch(thirdRemainder){
                case 10:
                    thirdRTen='A';
                    System.out.println(thirdRTen);
                    break;
                case 11:
                    thirdREleven='B';
                    System.out.println(thirdREleven);
                    break;
                case 12:
                    thirdRTwelve='C';
                    System.out.println(thirdRTwelve);
                    break;
                case 13:
                    thirdRThirteen='D';
                    System.out.println(thirdRThirteen);
                    break;
                case 14:
                    thirdRFourteen='E';
                    System.out.println(thirdRFourteen);
                    break;
                case 15:
                    thirdRFifteen='F';
                    System.out.println(thirdRFifteen);
                    break;
            }
            if(0<=thirdRemainder && thirdRemainder<=9){
                 System.out.println(thirdRemainder);
             }
            
            
            
            
            
            
            
            
        }
    }