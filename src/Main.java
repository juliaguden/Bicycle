public class Main {
    public static void main(String[] args) {

        Bicycle A = new Bicycle("Red",10, "BMX");

        Bicycle B = new Bicycle("blue", 15,"BMX");

        Bicycle C = new Bicycle("green", 20,"BMX");
       A.display();
       B.display();
       C.display();
       int total = A.speed + B.speed + C.speed;
       System.out.println(total);
    }
}
