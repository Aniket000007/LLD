package singleResponsibility;

public class InvoiceDao {

    private invoice invoice;

    public InvoiceDao(singleResponsibility.invoice invoice) {
        this.invoice = invoice;
    }

    public void save2DB(){
        System.out.println("Invoice saved to db");
    }
}
