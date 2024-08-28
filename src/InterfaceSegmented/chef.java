package InterfaceSegmented;

public class chef implements chefInterface{
    @Override
    public void cookFood() {
        System.out.println("Cooking Food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Deciding Menu");
    }
}
