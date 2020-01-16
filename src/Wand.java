public class Wand {
    private int length;
    private String woodType;

    public Wand(int l, String w){
        length = l;
        woodType = w;
    }

    public Wand(){
        this(20, "yoffi");

    }

    public void wave(){
        System.out.println("I'm waving my " + woodType + " wand that is " + length + " cm long");
    }

}
