public class Unknown {

    int a;
    int b;

    public Unknown(){
    }
    public Unknown(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Unknown(int a, double b){
        this.a = a;
        this.b = (int) b;
    }


    public int get1(){
        return a+b;
    }


    public boolean f(int a,  int b){
        return (a <= b);

    }
}
