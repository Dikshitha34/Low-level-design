package ObserverPattern;

import ObserverPattern.Observable1.ItemObservableImplementation;
import ObserverPattern.Observable1.StockObeservable;
import ObserverPattern.Observers.EmailNotifyObserverImpl;
import ObserverPattern.Observers.MsgNotifyObserverImpl;
import ObserverPattern.Observers.NotificationAlertObserver;

public class ItemStore {
	public static void main(String[] args) {
		StockObeservable itm=new ItemObservableImplementation();
		
		NotificationAlertObserver ob1=new EmailNotifyObserverImpl("abc@gmail.com", itm);
		NotificationAlertObserver ob2=new EmailNotifyObserverImpl("ddd@gmail.com", itm);
		NotificationAlertObserver ob3=new MsgNotifyObserverImpl(9390243858L, itm);
		
		itm.add(ob1);
		itm.add(ob2);
		itm.add(ob3);
		
		itm.setItem(10);
	}
}
