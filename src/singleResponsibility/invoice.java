package singleResponsibility;

public class invoice {

    private Marker marker;
    private int quantity;


    public invoice(int quantity, Marker marker) {
        this.quantity = quantity;
        this.marker = marker;
    }

    public int CalculateTotal(){
        int price = marker.price*quantity;
        return price;
    }
}
