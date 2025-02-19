package Observer;

import Observable.StockObeservable;

public class MsgNotifyObserverImpl implements NotificationAlertObserver{

	Long phn;
	StockObeservable ob;
	
	
	
	public MsgNotifyObserverImpl(Long phn, StockObeservable ob) {
		
		this.phn = phn;
		this.ob = ob;
	}



	@Override
	public void update() {
		// TODO Auto-generated method stub
		sendMsgOnPhn(phn, "ALERT!, Item is in stock!!!");
	}



	private void sendMsgOnPhn(Long phn, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Msg sent to: "+phn);
	}

}
