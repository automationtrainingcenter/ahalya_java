package encapsulation;

public class TestEncapsulation {
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo(101, "core java", "bala guruswamy", 345.99, 10);
		System.out.println(obj.getName());
		obj.displayDetails();
		
		Customer ahalya = new Customer(1234, "ahalya", "chandanagar");
		ahalya.displayInfo();
		ahalya.purchase("core java");
		ahalya.purchase("python");
		ahalya.purchase("selenium webdriver");
		ahalya.getHistory();
	}

}
