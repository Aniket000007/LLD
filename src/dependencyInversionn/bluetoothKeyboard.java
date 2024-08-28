package dependencyInversionn;

public class bluetoothKeyboard implements Keyboard{

    @Override
    public void display() {
        System.out.print("Bluetooth Keyboard");
    }

}
