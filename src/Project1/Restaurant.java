package Project1;

abstract public class Restaurant {
	private String hotelname;
	private int deliverycharges;
	
	void takeorder() {
		System.out.println("your order taken by:"+hotelname);
	}
	
	abstract  int calculatebill(int price,int quantity);
	abstract int deliverytime();
	
	public void setDetails(String hotelname,int deliverycharges) {
		this.hotelname=hotelname;
		this.deliverycharges=deliverycharges;
	}
	public int getDeliverycharges() {
		return deliverycharges;
	}
	

}
