// Jack Curran
// 4/27/2015
// lab13
// CSE002

//declare class
public class TwoDSort{
    //main method
    public static void main(String[] args) {
            int[][] myArray = new int[5][];
            for (int a = 0; a < 5; a++) {
                myArray[a] = new int[a * 3 + 5];
                for (int b = 0; b<myArray[a].length; b++) {
                    myArray[a][b] = (int)(Math.random() * 30);
                }
            }
            //printing the arrays
            System.out.println("Array before sorting: ");
            printArray(myArray);
            System.out.println(" ");
            System.out.println("Array after sorting: ");
            sortArray(myArray);
            printArray(myArray);
            System.out.println(" ");
            System.out.println("Array after sorting and copying: ");
            copyArray(myArray);
            
    }
    //method to print array
    public static void printArray(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < x[i].length; j++) {
                if (j == (x[i].length - 1)) {
                    System.out.print(x[i][j]);
                }
                else {
                    System.out.print(x[i][j] + ", ");
                }
            }
            System.out.println(" }");
        }
    }
    // method to sort array
    public static void sortArray(int[][] x){
        for (int c = 0; c < x.length; c++) {
            for (int d = 1; d < x[c].length; d++) {
                int current = x[c][d];
                int e;
                for (e = d - 1; e >= 0 && x[c][e] > current; e--) {
                    x[c][e + 1] = x[c][e];
                }
                x[c][e + 1] = current;
            }
        }
    }
    // method to copy array
    public static void copyArray(int[][] x){
        int [][] resultArray = new int[5][17];
        for(int i = 0; i < x.length; i++){
            for(int j =0; j<x[i].length;j++){
                resultArray[i][j]=x[i][j];
            }
        }
        printArray(resultArray);
    }
    
    
}