package WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Vehicle vehicle = new GoodsVehicle();
        vehicle.letsDrive();
    }
}