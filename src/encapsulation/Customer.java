package encapsulation;

//customer class in bookstore site
public class Customer {

	private int custId;
	private String name;
	private String address;
	private String[] history = new String[20];
	private int index = 0;

	public Customer(int custId, String name, String address) {
		this.custId = custId;
		this.name = name;
		this.address = address;
	}

	public int getCustId() {
		return custId;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void getHistory() {
		System.out.println("******purcahsed books are*********");
		for (String book : history) {
			if(book != null)
				System.out.println("\t\t"+book);
		}
	}

	public void purchase(String book) {
		if (this.index >= 20) {
			this.index = 0;
		}
		history[index] = book;
		index++;
	}

	public void displayInfo() {
		System.out.println("name : " + name + "\naddres : " + address);
	}

}
