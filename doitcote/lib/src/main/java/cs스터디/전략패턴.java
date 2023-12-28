package cs스터디;

import java.util.ArrayList;
import java.util.List;

interface PaymentStrategy{
	
	public void pay(int amount);
}

class KakaoStrategy implements PaymentStrategy{ //카카오 결제 전략

	private String name;
	private String cardNum;
	private String cvv;
	private String date;
	
	public KakaoStrategy(String name, String cardNum, String cvv, String date) {
		super();
		this.name = name;
		this.cardNum = cardNum;
		this.cvv = cvv;
		this.date = date;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "kakao pay");
	}
	
	
}

class NaverStrategy implements PaymentStrategy{ //네이버 결제 전략
	
	private String email;
	private String password;
	
	public NaverStrategy(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + "naver pay");
	}
	
}

class Item {
	private String name;
	private int price;
	
	public Item(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
}

class ShoppingCart{
	List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		this.items.add(item);
	}
	
	public void removeItem(Item item) {
		this.items.remove(item);
	}
	
	public int caculateTotal() {
		int sum = 0;
		for(Item item : items) {
			sum += item.getPrice();
		}
		
		return sum;
	}
	
	public void pay(PaymentStrategy paymentMethod) {
		int amount = caculateTotal();
		paymentMethod.pay(amount);
		items.clear();
	}
	
}


public class 전략패턴 {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShoppingCart cart = new ShoppingCart();
		Item itemA = new Item("book", 30000);
		Item itemB = new Item("food", 100000);
		
		cart.addItem(itemA);
		cart.addItem(itemB);
		
		cart.pay(new KakaoStrategy("hae@naver", "1234", "10", "20231228"));
		cart.pay(new NaverStrategy("godud1118@naver.com", "qwer12345"));

	}

}
