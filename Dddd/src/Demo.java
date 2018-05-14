import java.util.Scanner;

public class Demo {
	
	public void Dress(int dress_price,int available_money) {
		
		if(dress_price < available_money) {
			int remaining_money = available_money - dress_price;
			System.out.println("dress purchased sucessfuy, and u the remaining amount is  "+remaining_money);
		}
		else {
			int need_money = dress_price - available_money;
			System.out.println("Money is not suffieciennt to buy this dress \n because dress price is  "+dress_price);
			System.out.println("and u have money only  "+available_money);
			System.out.println("still u need money   "+need_money);
		}
	}
	public static void main(String[] args) {	
		System.out.println("enter dress price  ?");	
		Scanner sc = new Scanner(System.in);
		int dress_price = sc.nextInt();
		System.out.println("enter How much money you have  ?  ");
		int available_money = sc.nextInt();
		Demo d = new Demo();
		d.Dress(dress_price, available_money);
	}
}
