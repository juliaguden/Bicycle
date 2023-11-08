public class Main2 {
    public static void main(String[] args) {

        Rectangle A = new Rectangle(20,10);
        A.display();

        A.getArea();
        A.getPerimeter();

        Circle B = new Circle (5);
        B.display();

        B.getArea();
        B.getCircumference();

        Student C = new Student (17,"Julia");
        C.display();

        C.getAge();
        C.getName();
    }
}
