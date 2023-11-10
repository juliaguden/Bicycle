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

        Student C = new Student (17,"Jack");
        C.display();

        C.getAge();
        C.getName();

        BankAccount D = new BankAccount(12345678,1000);
        D.display();
        D.getBalance();
        D.deposit(100);
        D.withdraw(100);
        D.transfer(250);


    }
}
