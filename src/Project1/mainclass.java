package Project1;
import java.util.Scanner;
public class mainclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("choose restaurant:");
		System.out.println("1.fastfood");
		System.out.println("2.finedine");
		
		int choice=sc.nextInt();
		
		if (choice==1) {
			Fastfood ff=new Fastfood();
			ff.setDetails("kkk", 100);
			ff.takeorder();
			
			
			System.out.println("enter the price:");
			int price=sc.nextInt();
			
			System.out.println("enter the quantity:");
			int quantity=sc.nextInt();
			
			int totalbill = ff.calculatebill(price, quantity);
			System.out.println("totalbill"+totalbill);
			System.out.println("Delivery Time : "+ff.deliverytime());
			
		}
		else {
			Finedine fd=new Finedine();
			fd.setDetails("sss", 200);
			fd.takeorder();
			System.out.println("enter the price:");
			int price=sc.nextInt();
			
			System.out.println("enter the quantity:");
			int quantity=sc.nextInt();
			
			int totalbill = fd.calculatebill(price, quantity);
			System.out.println("totalbill"+totalbill);
			System.out.println("Delivery Time : "+fd.deliverytime());
			
		}
		

	}

}
