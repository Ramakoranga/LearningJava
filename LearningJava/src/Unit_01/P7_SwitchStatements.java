package Unit_01;
import java.util.*;

public class P7_SwitchStatements {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		int num = sc.nextInt();
		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements(num);

	}

}

class SwitchStatements {
	void switchStatements(int x) {
		
		
		switch(x) {
		case 1: System.out.println("Current year is: 2022");
				break;
				
		case 2: System.out.println("Current month is: April");
				break;
				
		case 3: System.out.println("Current day is: Thursday");
				break;
				
		case 4: System.out.println("Not Applicable");
				break;
				
		default: break;

	}

	}
}
