package observerPattern.observable;

import observerPattern.observer.notificationAlertObserver;

public interface stockObservable {

    void add(notificationAlertObserver obj);
    void remove(notificationAlertObserver obj);
    void notifysubs();
    void setStockCount(int data);
    int getStockCount();

}
