package CarSystem;

public class carSeats {
    int carSeatNumber;
    String carSeatQuality;
    int carSeatPrice;


    public carSeats(int carSeatNumber, String carSeatQuality, int carSeatPrice) {
        this.carSeatNumber = carSeatNumber;
        this.carSeatQuality = carSeatQuality;
        this.carSeatPrice = carSeatPrice;
    }
    void totalCarSeatPrice()
    {
        int totalCarSeatPrice = carSeatNumber*carSeatNumber;
        System.out.println("Total price of car seats : " + totalCarSeatPrice );
    }
    void setCarSeatDetails()
    {
        System.out.println("The number of car seats  : " +carSeatNumber );
        System.out.println("The material of car seats : " + carSeatQuality);
        totalCarSeatPrice();
    }

}
