public class CookieTester {

    public static void printCookie(Cookie cookie) {
        System.out.println("This is the Cookie:" + "\n" + "Is there Glutten: " + Boolean.toString(cookie.isThereGluten)
                + "\n" + "Number of eggs: " + cookie.numberOfEggs + "\n" + "Amount of sugar: " + cookie.sugarAmount
                + "\n" + "Amount of flower: " + cookie.flowerAmount);

    }

    public static void main(String[] args) {
        //a
        Cookie cookie2 = new Cookie(true, 3, 5, 4.3);
        Cookie cookie3 = new Cookie(true, 3, 5, 4.3);
        printCookie(cookie3);
        cookie3 = cookie2;
        printCookie(cookie3);
        cookie3.numberOfEggs = 50;
        printCookie(cookie3);
        printCookie(cookie2);
//        //b
//        Cookie cookie2 = new Cookie(true, 3, 5, 4.3);
//        Cookie cookie3 = new Cookie(cookie2);
//        cookie2.isThereGluten = false;
//        printCookie(cookie2);
//        printCookie(cookie3);
    }
}




