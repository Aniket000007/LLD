package Strategy.typeOfStrategy;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.print("SpecialDrive");
    }
}
