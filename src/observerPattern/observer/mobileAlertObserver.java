package observerPattern.observer;

import observerPattern.observable.stockObservable;

public class mobileAlertObserver implements notificationAlertObserver{


    stockObservable obj;
    int mobileNo;

    public mobileAlertObserver(stockObservable obj, int mobileNo) {
        this.obj = obj;
        this.mobileNo = mobileNo;
    }

    @Override
    public void update() {
        sendMail(mobileNo);
    }

    public void sendMail(int Mobile){
        System.out.println("In stock sent message to "+ Mobile);
    }
}
