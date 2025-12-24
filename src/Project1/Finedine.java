package Project1;

public class Finedine extends Restaurant{
	int calculatebill(int price,int  quantity) {
		int amount=quantity*price+20+getDeliverycharges();//packing fees=20
		return amount;
	}
	int deliverytime() {
		return 20;
	}


}
