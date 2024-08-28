package LiskovSubstitution;

public class bicycle implements twoWheeler{

    private int speed;
    @Override
    public void accelerate(){
        speed+=10;
        System.out.println("Cycle Speed =" + speed);
    }
}
