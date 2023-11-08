public class Circle {
    public int radius;

    public Circle(int pradius){
        radius=pradius;
    }
    public void display(){
        System.out.println(" Circle Radius " + radius);
    }
    public void getArea (){
        System.out.println("Area " + radius * radius * 3.14);
    }
    public void getCircumference(){
        System.out.println("Circumference " + 2*3.14*radius);
    }
}
