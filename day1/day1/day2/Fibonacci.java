package week1.day2;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		int i=8; 
		int firstNum=0;
		int secNum=1;
		System.out.println(firstNum);
		System.out.println(secNum);
		
for (int j = 1; j <=8; j++) {
	int sum= firstNum+secNum;
	firstNum=secNum;
	secNum=sum;
	System.out.println(sum);
}

	}

}
