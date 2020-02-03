import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
/*
        int[] a = new int[5];
        int countOdd = 0, countEven = 0;

        for (int i = 0; i <a.length ; i++) {
            a[i] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even numbers: " + countEven + "\n" + "Odd numbers: " + countOdd);
*/
        int[] a = new int[4];
        a[0] = 3;
        a[1] = scan.nextInt();
        a[2] = a[0] + a[1];
        a[3] = a[0]*a[1]*a[2];

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
            }


    }
}
