
import OpenForExtension.DBinvoiceDao;
import OpenForExtension.FileInvoiceDao;
import dependencyInversionn.bluetoothKeyboard;
import dependencyInversionn.macbook;
import dependencyInversionn.wiredKeyboard;
import singleResponsibility.InvoiceDao;
import singleResponsibility.InvoicePrinter;
import singleResponsibility.Marker;
import singleResponsibility.invoice;

public class Main {
    public static void main(String[] args) {
        // SINGLE RESPONSIBILITY
//        Marker marker = new Marker("Reynolds", "blue",2,50);
//        invoice invoice = new invoice(20,marker);
//        System.out.println(invoice.CalculateTotal());
//        InvoiceDao dao = new InvoiceDao(invoice);
//        dao.save2DB();
//        InvoicePrinter print = new InvoicePrinter(invoice);
//        print.print();

        //Open for extension / Closed for modification

        Marker marker = new Marker("Reynolds", "blue",2,50);
        invoice invoice = new invoice(20,marker);
        DBinvoiceDao dao = new DBinvoiceDao();
        dao.save();
        FileInvoiceDao dao2 = new FileInvoiceDao();
        dao2.save();
        
    }
}