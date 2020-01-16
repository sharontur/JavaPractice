public class Wizard {
    private String name;
    private Wand wand;

    public Wizard(){
        this("Harry", new Wand(30, "ficus"));

    }
    public Wizard(String n, Wand w){
        name = n;
        wand = w;
    }
    public void castASpell(){
        System.out.print("My name is " + name + " and ");
        wand.wave();

    }
}
