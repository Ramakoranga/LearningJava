package Assignment_01;
import java.util.Scanner;
public class ques11 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		
		System.out.println("Enter first number: ");
		int y = sc.nextInt();
		
		int result = (x > y)? sum(x,y) : sub(x,y);
		
		System.out.println("Result : " + result);
	}
	
	public static int sum(int a, int b) {
		return (a+b);
	}
	
	public static int sub(int a, int b) {
		int res = a-b;
		if (res < 0) {
			return 0;
		}
		return res;
	}
}
