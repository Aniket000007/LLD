import Strategy.typeOfStrategy.DriveStrategy;
import Strategy.typeOfStrategy.SpecialDrive;

public class SportsVehicle extends Vehicle{
    SportsVehicle() {
        super(new SpecialDrive());
    }
}
