package observerPattern.observable;

import observerPattern.observer.notificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class iphoneObservableImpl implements stockObservable{

    List<notificationAlertObserver> list = new ArrayList<>();
    int stock =0 ;

    @Override
    public void add(notificationAlertObserver obj) {
        list.add(obj);
    }

    @Override
    public void remove(notificationAlertObserver obj) {
        list.remove(obj);
    }

    @Override
    public void notifysubs() {
        for(notificationAlertObserver obj:list){
            obj.update();
        }
    }

    @Override
    public void setStockCount(int newstock) {
        if(stock==0 && newstock>0){
            notifysubs();
        }
        stock = stock+newstock;
    }

    @Override
    public int getStockCount() {
        return stock;
    }
}
