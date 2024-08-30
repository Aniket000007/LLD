package decoratorDesignPattern;

public class extraCheese extends toppings{

    basePizza pizza;

    public extraCheese(basePizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int cost(){
        return pizza.cost()+20;
    }
}
