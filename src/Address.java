public class Address {
    private String city, street;
    private int number, zip;

    public Address(String c, String s, int n, int z){
        city = c;
        street = s;
        number = n;
        zip = z;
    }
    public Address(String c, String s, int n){
        city = c;
        street = s;
        number = n;
        zip = 0;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getZip() {
        return zip;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public String toString(){
        String bobi = "Address: " + street + " st., " + number + ", " + city;
        if (zip!=0){
            bobi+= ", " + zip;
        }
        return bobi;
    }
}
