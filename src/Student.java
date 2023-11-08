public class Student {
    public int age;
    public String name;

    public Student (int page, String pname){
        age=page;
        name=pname;
    }
    public void display(){
        System.out.println("Student");
    }
    public void getAge(){
        System.out.println("Age " + age);
    }
    public void getName(){
        System.out.println("name " + name);
    }
}
