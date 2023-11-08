public class Rectangle {
    public int length;
    public int width;

    public Rectangle (int plength, int pwidth){
        length=plength;
        width=pwidth;
    }
    public void display(){
        System.out.println(" Rectangle length "+ length + " width "+ width);
    }
    public void getArea(){
        System.out.println(length * width);
    }
    public void getPerimeter(){
        System.out.println(length+length+width+width);
    }
}
