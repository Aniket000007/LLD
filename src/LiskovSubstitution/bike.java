package LiskovSubstitution;

public class bike implements twoWheeler{

    private int speed;
    boolean isEngineOn = false;

    @Override
    public void accelerate(){
        speed+=10;
        System.out.println("Bike Speed =" + speed);
    }

    public void turnOnEngine(){
        isEngineOn =true;
    }
}
