package Strategy.typeOfStrategy;

public class Vehicle implements DriveStrategy {

    DriveStrategy driveobj;

    Vehicle(DriveStrategy driveobj){
        this.driveobj=driveobj;
    }

    public void drive() {
        driveobj.drive();
    }
}
