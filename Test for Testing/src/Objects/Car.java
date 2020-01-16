package Objects;

import java.util.Scanner;

import static java.lang.Integer.max;

public class Car {
    int speed;

    public void speedUp(){
        speed++;
    }

    public void speedDown(){
        speed = max(0, speed-1);
    }

    public void stop(){
        speed=0;
    }

    public void printSpeed(){
        System.out.println("Speed: " + speed);
    }

    public static void main(String[] args){
        Car car1 = new Car();
        car1.printSpeed();

        System.out.println("How much: ");
        Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();

       for (int i = 0; i<a; i++){
           car1.speedUp();
       }
        car1.printSpeed();

       for (int i = 0; i<2; i++){
           car1.speedDown();
       }
       car1.printSpeed();
        car1.stop();
        car1.printSpeed();






    }






}
