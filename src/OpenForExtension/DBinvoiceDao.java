package OpenForExtension;

public class DBinvoiceDao implements InvoiceDaoInterface{

    @Override
    public void save(){
        System.out.println("Saved to DB");
    }
}
