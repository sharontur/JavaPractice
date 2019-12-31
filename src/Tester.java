import java.util.Scanner;
public class Tester {

    public static void main(String[] args){
        /*
        int n1, n2, n3;

        //exercise 1:

        System.out.println("Here are all the numbers between 0 and 100 that divide by 3 without any reminder: ");
        for(int i=0; i<100; i+=3){
            System.out.print(i + " ");
        }

        //exercise 2:
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi, Welcome to the range divides by calculator!");
        System.out.println("Enter range start value: ");
        n1 = scan.nextInt();
        System.out.println("Enter range end value: ");
        n2 = scan.nextInt();
        System.out.println("Enter value to divide by without any reminder: ");
        n3 = scan.nextInt();

        System.out.println("Here are all the numbers between " + n1 + " and " + n2 + " that divide by " + n3 + " without any reminder:");

        for(n1 =n1; n1<n2; n1++) {
            if (n1 % n3 == 0) {
                System.out.print(n1 + " ");
            }
        }

        //exercise 3:

        System.out.println("Here is the multiplication table for the values 1-10");
        for(int i=1; i<=10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(j*i + "\t");}

                System.out.println();
            }

         */

        //exercise 4:

        Scanner scan = new Scanner(System.in);
        int n, max =0, min =0;
        do {
            System.out.print("Please Provide an integer value or 0 to terminate: ");
            n = scan.nextInt();
            if(n>max){
                n = max;
                }
            if(n<min){
                n = min;
            }
            n = scan.nextInt();

        }while(n!=0);



        System.out.println("Min value provided: " + min);
        System.out.println("Max value provided: " + max);


        }




}


