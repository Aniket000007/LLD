package InterfaceSegmented;

public class waiter implements waiterInterface{

    @Override
    public void serveCustomers() {
        System.out.println("Serving Customers");
    }

    @Override
    public void orderTake() {
        System.out.println("Taking order from customers");
    }
}
