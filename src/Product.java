
public class Product {
	private int price;
	private String name;
	private int balance;

	String getName() {
		return this.name;
	}

	int getPrice() {
		return this.price;
	}

	int getBalance() {
		return this.balance;
	}

	Product(String name, int price, int balance) {
		this.name = name;
		this.price = price;
		this.balance = balance;
	}

}
