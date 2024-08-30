package Strategy.typeOfStrategy;

public class NormalVehicle extends Vehicle {
    NormalVehicle() {
        super(new NormalDrive());
    }
}
