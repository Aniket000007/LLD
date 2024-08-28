import Strategy.typeOfStrategy.DriveStrategy;
import Strategy.typeOfStrategy.NormalDrive;

public class NormalVehicle extends Vehicle{
    NormalVehicle() {
        super(new NormalDrive());
    }
}
