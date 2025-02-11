package academy.javapro;

public class Tesla extends Vehicle implements Electric, Autonomous {
    private boolean autopilotEnabled;
    private boolean charging;

    // Constructor
    public Tesla (String model , int year) {
        super("Tesla" , model , year);
        this.isRunning = false;
        this.autopilotEnabled = false;
        this.charging = false;
    }

    public void startEngine() {
        isRunning = true;
        System.out.println(make + " " + model + " started");
    }
    public void stopEngine() {
        isRunning = false;
        System.out.println(make + " " + model + " stopped");
    }
    public void accelerate() {
        System.out.println(make + " " + model + " is accelerating...");
    }
    public void brake() {
        System.out.println(make + " " + model + " is braking...");
    }
    public void charge() {
        charging = true;
        System.out.println(make + " " + model + " is now charging");
    }
    public boolean isCharging() {
        return charging;
    }
    public void enableAutopilot() {
        autopilotEnabled = true;
        System.out.println("Autopilot enabled");
    }
    public void disableAutopilot() {
        autopilotEnabled = false;
        System.out.println("Autopilot disabled");
    }
    public boolean isAutopilotEnabled() {
        return autopilotEnabled;
    }
}
