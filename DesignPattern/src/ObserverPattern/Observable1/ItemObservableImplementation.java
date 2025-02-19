package ObserverPattern.Observable1;

import java.util.ArrayList;
import java.util.List;

//import Observer.NotificationAlertObserver;

public class ItemObservableImplementation implements StockObeservable{
	
	
	public List<ObserverPattern.Observers.NotificationAlertObserver> ls = new ArrayList();
	public int itemCnt=0;
	@Override
	public void add(ObserverPattern.Observers.NotificationAlertObserver obs) {
		// TODO Auto-generated method stub
		ls.add(obs);
		
	}

	@Override
	public void remove(ObserverPattern.Observers.NotificationAlertObserver obs) {
		// TODO Auto-generated method stub
		ls.remove(obs);
	}

	@Override
	public void setItem(int newAddedStock) {
		// TODO Auto-generated method stub
		if(itemCnt==0) {
			notifyAlert();
		}
		itemCnt+=newAddedStock;
	}
	
	public void notifyAlert() {
		for(ObserverPattern.Observers.NotificationAlertObserver obs:ls) {
			obs.update();
		}
	}

	@Override
	public int getItem() {
		// TODO Auto-generated method stub
		return itemCnt;
	}
	
}
