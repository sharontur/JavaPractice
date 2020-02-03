import org.w3c.dom.css.Rect;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle() {
        this(10,  10);
    }

    public Rectangle(int w, int l) {
        width = w;
        length = l;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int calculatePerimeter(){
        return (length*2) + (width*2);
    }

    public int calculateArea(){
        return length*width;
    }

    public void print(char x){
        for (int j = 0; j <length; j++) {
            for (int i = 0; i < width; i++) {
                System.out.print(x);
            }
            System.out.println("");
        }
    }

    public void print(){
        this.print('*');
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.print();
        r.setWidth(25);
        r.print('%');
    }
}