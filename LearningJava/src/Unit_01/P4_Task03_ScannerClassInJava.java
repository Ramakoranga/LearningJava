package Unit_01;
import java.util.Scanner;
public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj1 = new Scanner(System.in);//Create a scanner obj
		Scanner obj2 = new Scanner(System.in);
		
		//Read the First-Token till the spacebar: (_spacebar)
		String Firstname = obj1.next();
		System.out.println("Name is" + Firstname );
		
		String name = obj2.nextLine();
		System.out.println("Name is : " + name);
		
		Boolean b = obj1.nextBoolean();
		System.out.println("Name is correct: " b );
		
		obj1.close();
		obj2.close();
	}

}
