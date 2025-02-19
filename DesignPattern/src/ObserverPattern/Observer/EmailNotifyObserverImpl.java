package Observer;

import Observable.StockObeservable;

public class EmailNotifyObserverImpl implements NotificationAlertObserver{
	
	String emailId;
	StockObeservable ob;
	
	
	
	public EmailNotifyObserverImpl(String emailId, StockObeservable ob) {
		
		this.emailId = emailId;
		this.ob = ob;
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMail(emailId, "ALERT!, Item is in stock!!!");
	}


	// send actual email to the user..
	
	private void sendMail(String emailId, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Mail sent to "+ emailId);
	}

}
