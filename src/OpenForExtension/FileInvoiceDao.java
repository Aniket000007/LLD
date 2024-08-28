package OpenForExtension;

public class FileInvoiceDao implements InvoiceDaoInterface{

    @Override
    public void save(){
        System.out.println("Saved to File");
    }
}
