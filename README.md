# Lab 2: Object-Oriented Programming

In this lab, you'll create a simplified Tesla vehicle system to practice core Object-Oriented Programming concepts.
You'll implement an abstract class, interfaces, and a concrete class to demonstrate inheritance, abstraction, and
polymorphism.

### Learning Objectives

- Understand and implement abstract classes and interfaces
- Practice inheritance and polymorphism
- Apply encapsulation principles
- Create a working vehicle system using OOP concepts

### Prerequisites

- Basic understanding of Java programming

### What You'll Achieve

- Develop a solid understanding of OOP principles
- Implement practical examples using inheritance, polymorphism, and encapsulation
- Enhance your skills in designing and implementing object-oriented systems

### Assignment Details

- **Part 1: Create the `Vehicle` Abstract Class**
    - Create this abstract class in the file `Vehicle.java`:
    ```java
    public abstract class Vehicle {
                protected String make;
                protected String model;
                protected int year;
                protected boolean isRunning;
            
                // TODO: Create constructor that takes make, model, and year
                // TODO: Initialize isRunning to false
            
                // Abstract methods to implement:
                public abstract void startEngine();
            
                public abstract void stopEngine();
            
                public abstract void accelerate();
            
                public abstract void brake();
            
                // TODO: Create getters and setters for all fields
            }
    ```
- **Part 2: Create the `Electric` Interface**
  - Create this interface in the file `Electric.java`:
    ```java
    public interface Electric {
        void charge();
    
        boolean isCharging();
    }
    ```
- **Part 3: Create the `Autonomous` Interface**
  - Create this interface in the file `Autonomous.java`:
    ```java
    public interface Autonomous {
        void enableAutopilot();
    
        void disableAutopilot();
    
        boolean isAutopilotEnabled();
    }
    ```
- **Part 4: Create the `Tesla` Class**
  - Create a `Tesla` class that `extends` `Vehicle` and `implements` both `interfaces` in `Tesla.java`:
    ```java
    public class Tesla extends Vehicle implements Electric, Autonomous {
        private boolean autopilotEnabled;
        private boolean charging;
    
        // TODO: Create constructor that takes model and year
        // TODO: Set make to "Tesla"
        // TODO: Initialize autopilotEnabled and charging to false
    
        // TODO: Implement all required methods from Vehicle, Electric, and Autonomous
        // Each method should include appropriate print statements
    }
    ```
- **Part 5: Create the `Main` Class**
  - Create the test program in `Main.java`:
    ```java
    public class Main {
        public static void main(String[] args) {
            // Step 1: Create a new Tesla Model S, 2024
            // TODO: Add your code here
            
            // Step 2: Display initial status
            System.out.println("Initial Status:");
            // TODO: Display car's initial state
            
            // Step 3: Start the car and test basic vehicle functions
            System.out.println("\nTesting basic vehicle functions:");
            // TODO: Start engine
            // TODO: Accelerate
            // TODO: Brake
            
            // Step 4: Test autonomous features
            System.out.println("\nTesting autonomous features:");
            // TODO: Enable autopilot
            // TODO: Check if autopilot is enabled
            // TODO: Disable autopilot
            
            // Step 5: Test electric features
            System.out.println("\nTesting electric features:");
            // TODO: Start charging
            // TODO: Check charging status
            
            // Step 6: Stop the car and display final status
            System.out.println("\nFinal car status:");
            // TODO: Stop engine
            // TODO: Display final state
        }
    }
    ```

**Expected Output**

Your program should produce output similar to this:

```text
Initial Status:
Tesla Model S 2024
Running: false
Autopilot: false
Charging: false

Testing basic vehicle functions:
Tesla Model S started
Tesla Model S is accelerating...
Tesla Model S is braking...

Testing autonomous features:
Autopilot enabled
Autopilot is currently: enabled
Autopilot disabled

Testing electric features:
Tesla Model S is now charging
Charging status: true

Final car status:
Tesla Model S stopped
Running: false
Autopilot: false
Charging: true
```

### Implementation Requirements

- `Vehicle` Class Requirements:
  - Constructor must initialize all fields
  - Getter methods should return the current value of each field
  - Setter methods should update the value of each field

- `Tesla` Class Requirements:
  - Must extend `Vehicle` and implement both interfaces
  - Constructor should set make to "Tesla"
  - All methods should include appropriate print statements
  - Implement all abstract methods from `Vehicle` class
  - Implement all methods from both interfaces

- `Main` Class Requirements:
  - Create a `Tesla` object
  - Test all `Vehicle` methods
  - Test all `Electric` interface methods
  - Test all `Autonomous` interface methods
  - Follow the sequence in the template
  - Match the expected output format
