package dependencyInversionn;

public class macbook implements Keyboard{

    Keyboard keyboard;

    public macbook(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void display(){
        keyboard.display();
    }
}
