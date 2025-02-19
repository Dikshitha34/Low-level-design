package Observable;


// design a "NOTIFY Me" feature which is present in e-commerce platforms whenever a user selects it and whenever the item gets out of stock


import Observer.NotificationAlertObserver;

public interface StockObeservable {
	public void add(NotificationAlertObserver obs);
	
	public void remove(NotificationAlertObserver obs);
	
	public void notifyAlert();
	
	public void setItem(int newAddedStock);
	
	public int getItem();
}
