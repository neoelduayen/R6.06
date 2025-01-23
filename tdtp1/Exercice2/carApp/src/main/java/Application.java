public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Blue");
        Driver driver = new Driver("John", 20);

        myCar.startCar(driver);
        myCar.accelerate();
        myCar.changeSpeed(80, driver);
        myCar.slowDown();
        myCar.changeSpeed(30, driver);
        myCar.stopCar(driver);
        System.out.println("ended");
    }
}
