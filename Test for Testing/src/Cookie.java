public class Cookie {
    boolean isThereGluten;
    int numberOfEggs;
    int sugarAmount;
    double flowerAmount;

    public Cookie(){
    }

    public Cookie( boolean isThereGluten,
            int numberOfEggs,
            int sugarAmount,
            double flowerAmount){
        this.isThereGluten = isThereGluten;
        this.numberOfEggs = numberOfEggs;
        this.sugarAmount = sugarAmount;
        this.flowerAmount = flowerAmount;
    }

    public Cookie(Cookie cookie){
        isThereGluten = cookie.isThereGluten;
        numberOfEggs = cookie.numberOfEggs;
        sugarAmount = cookie.sugarAmount;
        flowerAmount = cookie.flowerAmount;
    }

    public boolean isThereGluten() {
        return isThereGluten;
    }

    public int getNumberOfEggs() {
        return numberOfEggs;
    }

    public static void main(String[] args){
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie(true, 3, 5, 4.3);
        Cookie cookie3 = new Cookie();

        boolean num = cookie1.isThereGluten();
        System.out.println(":)");
    }


}
