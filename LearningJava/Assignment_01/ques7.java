package Assignment_01;

public class ques7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee2 E1 = new Employee2("rama");
		
		E1.display();
		E1.display();
		E1.display();
		
		System.out.println("No. of times the function called: " + E1.count);
		
        Employee2 E2 = new Employee2("koranga");
		
		E2.display();
		E2.display();
		E2.display();
		
		System.out.println("No. of times the function called: " + E2.count);
		
	}

}

class Employee2{
	static int count = 0;
	String name;
	
	Employee2(String name){
		this.name = name;
	}
	
	void display() {
		System.out.println("Name: " + name);
		count++;
	}
}

	


