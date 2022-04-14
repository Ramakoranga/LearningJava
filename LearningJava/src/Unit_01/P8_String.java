package Unit_01;
import java.util.*;
public class P8_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75457");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s2);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) {
		int j = s.length()-1;
		Boolean b = true;
		for (int i = 0; i <= j; i++) {
			if (s.charAt(i) != s.charAt(j)) {
				b = false;
				break;
			}
			j--;
		}
		if (b) {
			System.out.println("String(" + s + ") is a palindrome.");
		} 
		else {
			System.out.println("String(" + s +") is not a palindrome.");
		}
	}

	void reverseOfAString(String s) {
	
		String str = "";
		char temp;
		for(int i= 0; i< s.length();i++) {
			temp = s.charAt(i);
			str = temp + str;
		}
		System.out.println("Original string was: " + s);
		System.out.println("Reverse string is: "+ str);

	}

	void stringEqualOrNot(String s1, String s2) {
		Boolean flag = true;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)!=s2.charAt(i)) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Strings are equal.");
		}
		else {
			System.out.println("Strings are not equal.");
		}

	}

}
