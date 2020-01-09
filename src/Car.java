public class Car
{
    private int carNum;
    private String owner;
    private int km;

    public Car()
    {
        carNum = 111;
        owner = "No Owner Yet";
        km = 0;
    }

    public Car(int num, String carOwner)
    {
        carNum = num;
        owner = carOwner;
        km = 0;
    }

    public int getCarNum()
    {
        return carNum;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String carOwner)
    {
        owner = carOwner;
    }

    public int getKm()
    {
        return km;
    }

    public void setKm(int carKm)
    {
        if(carKm > km)
            km = carKm;
    }

    public void drive(int distance)
    {
        if(distance>=0){
            km += distance;
        }

    }

    public String toString()
    {
        return "Car num: " + carNum + ", km: " + km +
                ", belongs to " + owner;
    }

    public static void main(String[] args){
        Car car1 = new Car(112, "Sharon");
        Car car2 = new Car();


        car2.setKm(-400);
        car1.drive(-400);
        System.out.println(car1 + " and " + car2);


    }

}