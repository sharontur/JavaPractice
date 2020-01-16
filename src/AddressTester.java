import java.sql.SQLOutput;

public class AddressTester {
    public static void main(String[] args){

        Address a2 = new Address("Tel Aviv", "Wiesuman", 59, 23432);
        Address a3 = new Address("Ramat Gan", "Ben Gurion", 12);

        System.out.println(a2);
        System.out.println(a3);
        a3.setZip(45456);
        System.out.println(a3);

    }
}
