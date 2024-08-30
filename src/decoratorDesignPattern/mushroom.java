package decoratorDesignPattern;

public class mushroom extends toppings{

    basePizza pizza;

    public mushroom(basePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost()+20;
    }
}
