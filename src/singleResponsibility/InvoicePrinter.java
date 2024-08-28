package singleResponsibility;

public class InvoicePrinter {

    private invoice invoice;

    public InvoicePrinter(singleResponsibility.invoice invoice) {
        this.invoice = invoice;
    }

    public void print(){
        System.out.println("Invoice Printed");
    }
}
