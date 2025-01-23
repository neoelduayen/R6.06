public class Driver {
    private String driverName;
    private int driverAge;

    private static final int DRIVER_AGE = 18;

    public Driver(String name, int age) {
        this.driverName = name;
        this.driverAge = age;
    }

    public boolean isAdult() {
        return driverAge >= DRIVER_AGE;
    }

    public String getDriverName() {
        return driverName;
    }
}
