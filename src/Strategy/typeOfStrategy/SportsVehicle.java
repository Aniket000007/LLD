package Strategy.typeOfStrategy;

public class SportsVehicle extends Vehicle {
    SportsVehicle() {
        super(new SpecialDrive());
    }
}
