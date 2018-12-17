package encapsulation;
/*
 * encapsulation means hiding data or properties
 * hide data or properties by declaring them using private access modifier
 * create setter and getter methods of private variables
 */

//this is book class in my bookstore site

public class EncapsulationDemo {
	private int id;
	private String name;
	private String authorName;
	private double price;
	private int units;
	
	public EncapsulationDemo(int id, String name, String authorName, double price, int units) {
		this.id = id;
		this.name = name;
		this.authorName = authorName;
		this.price = price;
		this.units = units;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setUnits(int units) {
		this.units = units;
	}
	
	public int getUnits() {
		return this.units;
	}
	
	
	public void displayDetails() {
		System.out.println("id : "+id+"\nname : "+name+"\nauthour : "+authorName+"\nprice : "+price);
	}
	


}
