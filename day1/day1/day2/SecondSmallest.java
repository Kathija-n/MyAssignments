package week1.day2;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int [] numbers= {23,45,67,32,89,22};
        int len =numbers.length;
        Arrays.sort(numbers);
        //22,23,32,45,67,89
        System.out.println("Second Smallest number is " +numbers[1]);
        
	}
}
