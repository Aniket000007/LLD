
import InterfaceSegmented.chef;
import InterfaceSegmented.chefInterface;
import InterfaceSegmented.waiter;
import InterfaceSegmented.waiterInterface;
import LiskovSubstitution.bicycle;
import LiskovSubstitution.bike;
import LiskovSubstitution.twoWheeler;
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

//        Marker marker = new Marker("Reynolds", "blue",2,50);
//        invoice invoice = new invoice(20,marker);
//        DBinvoiceDao dao = new DBinvoiceDao();
//        dao.save();
//        FileInvoiceDao dao2 = new FileInvoiceDao();
//        dao2.save();


        //LISKOV SUBSTITUTION PRINCIPLE

//        twoWheeler vehicle = new bike();
//        vehicle.accelerate();
//        twoWheeler vehicle2 = new bicycle();
//        vehicle2.accelerate();


        // Interface Segmented Principle

        chefInterface chef = new chef();
        chef.cookFood();
        chef.decideMenu();

        waiterInterface waiter = new waiter();
        waiter.orderTake();
        waiter.serveCustomers();
    }
}