package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int num=34343;
		int reverse=0; 
		for (int i = num; i >0; i=i/10) {
			
		int remainder = i % 10;  
		reverse = reverse * 10 + remainder;  
		}
		
		if(num==reverse)
			System.out.println("It is a Palindrome number");
		else
			System.out.println("It is not a Palindrome number");
	}

}
