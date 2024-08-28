package observerPattern.observer;

import observerPattern.observable.stockObservable;

public class emailAlertObserver implements notificationAlertObserver{

    stockObservable obj;
    String emailId;

    public emailAlertObserver(stockObservable obj, String emailId) {
        this.obj = obj;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendMail(emailId);
    }

    public void sendMail(String email){
        System.out.println("In stock sent mail to "+ email);
    }
}
