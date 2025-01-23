public class Car {
    private String model;
    private String color;
    private int speed;

    private static final int MAX_SPEED = 120;
    private static final int STANDARD_INCREMENT = 10;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void accelerate() {
        if (speed + STANDARD_INCREMENT <= MAX_SPEED) {
            speed += STANDARD_INCREMENT;
            // show details
            System.out.println("Model : " + model);
            System.out.println("Color : " + color);
            System.out.println("Current speed : " + speed);
        } else {
            System.out.println("The car is already at max speed.");
        }
    }

    public void slowDown() {
        if (speed - STANDARD_INCREMENT >= 0) {
            speed -= STANDARD_INCREMENT;
            // show details
            System.out.println("Model : " + model);
            System.out.println("Color : " + color);
            System.out.println("Current speed : " + speed);
        } else {
            System.out.println("The car is already stopped.");
        }
    }

    public void startCar(Driver driver) {
        if (driver.isAdult()) {
            System.out.println(driver.getDriverName() + " starts the car.");
        } else {
            System.out.println("The conductor is not old enough to drive the car.");
        }
    }

    public void stopCar(Driver driver) {
        System.out.println(driver.getDriverName() + " stop the car.");
    }

    public void changeSpeed(int newSpeed, Driver driver) {
        System.out.println(driver.getDriverName() + " changes the car speed to " + newSpeed);
        int currentSpeed;
        if (getSpeed() >= newSpeed) {
            while (getSpeed() > newSpeed) {
                slowDown();
            }
        } else  {
            while (getSpeed() < newSpeed) {
                accelerate();
            }
        }
    }
}

