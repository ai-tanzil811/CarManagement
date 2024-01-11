package CarSystem;

public class carEngine {
    int carEnginePrice;
    String carEngineModel;
    double carEngineWeight;

    public carEngine(int carEnginePrice, String carEngineModel, double carEngineWeight) {

        this.carEnginePrice = carEnginePrice;
        this.carEngineModel = carEngineModel;
        this.carEngineWeight = carEngineWeight;
    }
    void carEngineDetails()
    {
        System.out.println("The price of this Engine  : " + carEnginePrice);
        System.out.println("The Engine Model is : " + carEngineModel);
        System.out.println("The Engine Weight is : " + carEngineWeight);
    }

}
