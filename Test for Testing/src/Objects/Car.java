package Objects;

import java.util.Scanner;

import static java.lang.Integer.max;

public class Car {
    int speed;
    String licenseNumber;
    int engineCapacity;
    int km;

    public Car(String l, int e, int k){
        licenseNumber = l;
        engineCapacity = e;
        km = k;
    }

    public Car(String l, int e){
        licenseNumber = l;
        engineCapacity = e;

    }

    public Car(Car c){
        this.licenseNumber = c.licenseNumber;
        this.engineCapacity = c.engineCapacity;
        this.km = c.km;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public void setEngineCapacity(int engineCapacity){
        this.engineCapacity = engineCapacity;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getLicenseNumber(){
        return licenseNumber;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getKm() {
        return km;
    }

    public String toString() {
        return "License Number: " + licenseNumber + ", Engine: " + engineCapacity + ", KM: " + km;
    }

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
     /*
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
       */
        Scanner scan = new Scanner(System.in);
        Car car2 = new Car("11-222-33", 60, 230);
        Car car3 = new Car( "44-555-66", 80);
        System.out.println("Please update KM: ");
        int kmNew = scan.nextInt();
        car3.setKm(kmNew);
        System.out.println(car2.toString());
        System.out.println(car3.toString());








    }






}
