
import InterfaceSegmented.chef;
import InterfaceSegmented.chefInterface;
import InterfaceSegmented.waiter;
import InterfaceSegmented.waiterInterface;
import LiskovSubstitution.bicycle;
import LiskovSubstitution.bike;
import LiskovSubstitution.twoWheeler;
import OpenForExtension.DBinvoiceDao;
import OpenForExtension.FileInvoiceDao;
import decoratorDesignPattern.basePizza;
import decoratorDesignPattern.extraCheese;
import decoratorDesignPattern.farmHouse;
import decoratorDesignPattern.mushroom;
import dependencyInversionn.Keyboard;
import dependencyInversionn.bluetoothKeyboard;
import dependencyInversionn.macbook;
import dependencyInversionn.wiredKeyboard;
import factoryPattern.shape;
import factoryPattern.shapeFactory;
import observerPattern.observable.iphoneObservableImpl;
import observerPattern.observable.stockObservable;
import observerPattern.observer.emailAlertObserver;
import observerPattern.observer.mobileAlertObserver;
import observerPattern.observer.notificationAlertObserver;
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
//
//        chefInterface chef = new chef();
//        chef.cookFood();
//        chef.decideMenu();
//
//        waiterInterface waiter = new waiter();
//        waiter.orderTake();
//        waiter.serveCustomers();



        //Dependency Inversion
//        Keyboard keyboard = new wiredKeyboard();
        //Keyboard keyboard = new bluetoothKeyboard();
//        macbook mac = new macbook(keyboard);
//        mac.display();

        // ObserverPattern

//        stockObservable stock = new iphoneObservableImpl();
//        notificationAlertObserver obj1 = new mobileAlertObserver(stock,989126928);
//        notificationAlertObserver obj2 = new emailAlertObserver(stock,"xyz@gmail.com");
//        notificationAlertObserver obj3 = new emailAlertObserver(stock,"abc@gmail.com");
//
//        iphoneObservableImpl iphone = new iphoneObservableImpl();
//        iphone.add(obj1);
//        iphone.add(obj2);
//        iphone.add(obj3);
//
//        iphone.setStockCount(10);

        //DECORATOR DESIGN PATTERN

//        basePizza pizza = new mushroom(new extraCheese(new farmHouse())); //farmhouse ka decorator extra cheese fir unka decorator mushroom
//        System.out.print(pizza.cost());

        //FACTORY DESIGN PATTERN

//        shapeFactory sh = new shapeFactory();
//        shape shap =  sh.getshape("RECTANGLE");
//        shap.draw();


    }
}