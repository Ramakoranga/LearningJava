package unit03;
import java.util.*;
public class exception_handling {

	public static void main(String[] args) {
		
		abc obj=new abc();
		obj.handleException();
		obj.InputMismatchException();
		obj.indexOutOfBoundException();
	}
	
	class abc{
		
		void basic_excption() {
			int b =0;
			
			int a =100/b;     // sensitive code 
			System.out.println(a);
			
		}

	   void handleException()
			 {
			    try {
			    	 int b =0;
			    	 int a = 100/b;//sensitive code comes under try and catch block
			    	  System.out.println(a);
			       } 
			       catch(ArithmeticException e) {       // catch handles the exception 
			    	   System.out.println(e.getMessage());
			       }
			       System.out.println("done  ");
			 }
	    }    
	   void handleException() {
		   try {
			int b =0;
			int a =100/b;
			System.out.println(a);  //specific exception first and then general exception  
		}
		  catch(Exception e) {
			System.out.println(e.getMessage()+"exception");
		}
	   }
	void InputMismatchException() {
		 try {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the number ");
		int num =sc.nextInt();
		System.out.println("you entered num"+num);
		}
		catch(InputMismatchException e) {
			System.out.println(e +"resolved");
		}
		System.out.println("done !!");
	}
	void stackOverflow(int a) {
		try {
	         while(a>0) {     // stack over flow is error not exception so can't be handled
		                   // try and catch will not handled stack over flow 
	         a++;
	        stackOverflow(a);
	         }
	     catch(Exception e) {
	    	 System.out.println(e.getMessage());
	     }
	     System.out.println("other code executes ");
		
	}
	void indexOutOfBoundException() {
		try {
			int [] number = {1,2,3,4};
			System.out.println( number[10]);
		}
		catch(IndexOutOfBoundsException e) {
			
			System.out.println( e.getMessage());
		}
		System.out.println( "done ");
	}
	void nullPointerExecption() {
		try {
			String s =null;
			System.out.println( s.length());
		}
		catch(NullPointerException e) {
			System.out.println( e.getMessage());
		}
	}
	void useOfThrow(int age)throws Exception{
		if(age<18) {
			throw new Exception();
		}
		else {
			System.out.println( " you are allowed to enter  ");
	}
	  }		
			void useOfThrow_And_Finally() {
				try {
					useOfThrow(17);
				}
		catch(Exception e) {
			e.printStackTrace();
		}
 finally {
	 System.out.println( " the try catch block is finished   ");
        }
			}
	void checkedAndUnchecked() {
		int x =0;
		int y = 10;
		int z = y/x;
		System.out.println(z);
		try {
			useOfThrow(17);
		}
		 catch(Exception e) {
			 e.printStackTrace();
		 }
	}
	void ManualExceptionThrow() {
		try {
			calculateArea(-1);
		}
		catch(Exception e) {
			 System.out.println(e.getMessage());
		}
	void calculateArea(int r ) throws ManualException{
		if(r<0) {
			throw new ManualException();
		}
		int area =r*r;
		 System.out.println(area);
		
	}
	class ManualException extends Exception{
		public string getMessage() {
			string detailMessage ="Exception occured!";
			return detailMessage;
			
		}
		
	}
		//      chache exception aye na aye ya catch ho na ho finally chalega hi chlega      
		 
	}
		}
		}

