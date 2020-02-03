package Objects;
import java.util.Scanner;
public class Clock {


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        for (int j = 0; j < 5; j++) {
             a[j] = scan.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }

    }

}