package model;
// The order that people put down
public class Order {
	// order id
	private String orderId;
	// table id
	private int table;
	// the time the order was created
	private String create_time;
	// the total cost of the order
	private double amount;
	// Order constructor, initiating table, create_time and amount 
	public Order(int table, String create_time, double amount) {
		this.table = table;
		this.create_time = create_time;
		this.amount = amount;
	}
	// get table id
	public int getTable() {
		return table;
	}
	// set table id
	public void setTable(int table) {
		this.table = table;
	}
	// get create time
	public String getCreate_time() {
		return create_time;
	}
	// set create time
	public void setCreate_time(String create_time) {
		this.create_time = create_time;
	}
	// get total cost
	public double getAmount() {
		return amount;
	}
	// get total cost
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
