import java.util.Random;
import java.util.Scanner;
/*
public class Tester {

    public static void main(String[] args) {
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


        Scanner scan = new Scanner(System.in);
        int startHour, startMinute, durHour, durMinute, endHour, endMinute;
        System.out.println("Start Hour:");
        startHour = scan.nextInt();
        System.out.println("Start Minute:");
        startMinute = scan.nextInt();

        if(startHour>=24 || startMinute>=60){
            System.out.println("Invalid Input!");
        } else {

            System.out.println("Duration Hour:");
            durHour = scan.nextInt();
            System.out.println("Duration Minute:");
            durMinute = scan.nextInt();

            if(durMinute>=60){
                System.out.println("Invalid Input!");
            } else {
                endHour = (startHour + durHour) % 24;

                if (startMinute+durMinute<60) {
                    endMinute = startMinute + durMinute;
                } else {
                    endMinute = startMinute + durMinute - 60;
                    endHour++;
                }
                System.out.println("End hour:" + endHour + ":" + endMinute);
            }
        }

        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int randomNum = rand.nextInt(99) + 1;

        int n;
        int count = 0;
        do {
            System.out.println("Please Guess a number: ");
            n = scan.nextInt();
            count++;
            if (n < randomNum){
                System.out.println("The value is larger");
            }
            if (n> randomNum){
                System.out.println("The value is smaller");
            }
            if (n == randomNum){
                System.out.println("YAY you did it!");
                break;
            } if (count==7){
                System.out.println("Failed to find number!");
                break;
            }
        } while (n != randomNum && count<=7);

        }

        int n = 0;

        for (int count = 0; count <= 7 || n == randomNum; count++) {
            System.out.println("Please Guess a number: ");
            n = scan.nextInt();
            if (count==7){
                System.out.println("Failed to find number!");
                break;
            }
            if (n < randomNum) {
                System.out.println("The value is larger");
            }
            if (n > randomNum) {
                System.out.println("The value is smaller");
            }
            if (n == randomNum) {
                System.out.println("YAY you did it!");
                break;
            }

       //exercise 7:
            int min = 1, max = 100, middle;
            Scanner scan = new Scanner(System.in);
            String answer;
            for(int i=0;i<7;i++){
                middle = (min + max)/2;
                System.out.println("computer chooses: " + middle);
                answer = scan.nextLine();
                if (answer.contains("larger")){
                    min = middle;
                } else if(answer.contains("smaller")){
                    max = middle;
                } else if(answer.contains("ci")){
                    System.out.println("computer wins");
                    break;
                }

            }
*/
        public class Tester
        {
            public static void main(String[] args)
            {
//                Unknown a1 = new Unknown(1, 4);
//                Unknown a2 = new Unknown();
//                Unknown a3 = new Unknown(3, 8.9);
//
//                int x = a1.get1();
//                int y = a3.get1();
//                if(a3.f(y, x))
//                    System.out.println("OK");
//                else
//                    System.out.println("Wrong");

            Address a1 = new Address("Jerusalem", "Herzel", 34);
            System.out.println(a1.toString());


            }






        }




