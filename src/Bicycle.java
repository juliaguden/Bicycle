public class Bicycle {
    public String color;
    public int speed;
    public String brand;

    public Bicycle (String pcolor, int pspeed, String pbrand){
        color = pcolor;
        speed = pspeed;
        brand = pbrand;
    }
    public void display(){
        System.out.println("Color: "+ color + " Speed: " + speed + " Brand: " + brand);
    }
}
