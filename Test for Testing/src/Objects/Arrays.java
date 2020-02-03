package Objects;
import java.util.Scanner;
public class Arrays {

    /*

    public double average(double[] dArr) {
        double average = 0;
        for (int i = 0; i < dArr.length ; i++) {
            average += dArr[i];
        }
        average  /= dArr.length;

       return average;
    }

    public static void main(String[] args){
        Arrays a1 = new Arrays();
        double[] a = {1, 2, 3, 4, 5};

        System.out.println(a1.average(a));


        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            int[] a = new int[5];
            a[0] = scan.nextInt();
            int min = a[0];
            for (int i = 1; i < a.length; i++) {
                System.out.println("Please Enter a Number:");
                a[i] = scan.nextInt();
                if (a[i] < min){
                    min = a[i];
                }
            }
            System.out.println(min);
*/
    public static boolean sameSumRows(int[][] a) {
        int sum = 0;
        for (int row = 0; row < a.length; row++) {
            int sumRow = 0;
            for (int col = 0; col < a[row].length; col++) {
                sumRow += a[row][col];
                System.out.println(sumRow);
            }
            if (row == 0) {
                sum = sumRow;
            } else if (sumRow != sum) {
                return false;
            }
        }
        return true;
    }

    public static boolean sameSumCols(int[][] a) {
        int sum = 0;
        int numberOfCol = a[0].length;
        int numberOfRow = a.length;
        for (int col = 0; col < numberOfCol; col++) {
            int sumCol = 0;
            for (int row = 0; row < numberOfRow; row++) {
                sumCol += a[row][col];
                System.out.println(sumCol);
            }
            if (col == 0) {
                sum = sumCol;
            } else if (sumCol != sum) {
                return false;
            }
        }
        return true;
    }
}

class Test{
    public static void main(String[] args){
        Arrays a1 = new Arrays();
        int[][] a ={
                {1, 2, 3},
                {3, 2, 1},
                {3, 3, 0},
                {1, 2, 3}
        };
        System.out.println(a1.sameSumCols(a));
        // how do i check if the mathod works?
    }
}