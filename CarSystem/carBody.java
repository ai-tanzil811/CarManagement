package CarSystem;

public class carBody {
    String carBodyMaterial;
    String carBodyColor;
    int carBodyPrice;

    public carBody(String carBodyMaterial, String carBodyColor, int carBodyPrice) {
        this.carBodyMaterial = carBodyMaterial;
        this.carBodyColor = carBodyColor;
        this.carBodyPrice = carBodyPrice;
    }
    void carBodyDetails() {
        System.out.println("The material is : " + carBodyMaterial);
        System.out.println("The body color is : " + carBodyColor);
        System.out.println("The price of CarBody " + carBodyPrice);
    }

     }
