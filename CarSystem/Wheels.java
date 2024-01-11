package CarSystem;

public class Wheels {
    int wheels;
    String brand;
    String type;
    String color;
    double diameter;
    int price;

    public Wheels(int wheels, String brand, String type, String color, double diameter, int price) {
        this.wheels = wheels;
        this.brand = brand;
        this.type = type;
        this.color = color;
        this.diameter = diameter;
        this.price = price;
    }
    void wheelsPrice()
    {
        int totalPrice = price*wheels;
        System.out.println("The total price for purchasing these wheels is : " + totalPrice);
    }
    void wheelsDetails(int wheels,String brand,String type,String color,double diameter,int price)
    {
        System.out.println("Number of Wheel : " +wheels);
        System.out.println("Brand of Wheel : " +brand);
        System.out.println("Type of Wheel : " +type );
        System.out.println("Color of Wheel : "+color);
        System.out.println("Diameter of Wheel : " + diameter );
        wheelsPrice();
    }



}
