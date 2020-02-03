package Objects;
class Brain{
    public Brain(){
        System.out.println("Thinking...");
    }
}
class Person{
    private String name;
    private Brain brain;

    public Person(){

    }
    public Person(String name){
        this.name = name;
        this.brain = new Brain();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void writeName(){
        System.out.println("My name is " + name);
    }
}
public class Application {

    public static void main(String[] args){
        System.out.println("Hello world");
        Person person = new Person("Sharon");

        String name = person.getName();
        name = name + " Turner";
        person.setName(name);
        person.writeName();
    }
}
