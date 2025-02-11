package academy.javapro;

public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected boolean isRunning;

    // Constructor
    public Vehicle (String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.isRunning = false;
    }

    // Abstract methods
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void accelerate();
    public abstract void brake();

    // Getters and setters
    public String getMake() {
        return make;
    }
    public void setMake (String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int Year) {
        this.year = year;
    }
    public boolean getIsRunning() {
        return isRunning;
    }
    public void setIsRunning(boolean Running) {
        Running = isRunning;
    }
}
