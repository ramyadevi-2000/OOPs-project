package Project1;

public class Fastfood extends Restaurant{
	int calculatebill(int price,int  quantity) {
		int amount=quantity*price+getDeliverycharges();
		return amount;
	}
	int deliverytime() {
		return 40;
	}

}
