package week9Lab;

import java.util.Arrays;

public class lab1 {
	
	public static void main(String[] args){
		
		
		int[] myArray= {123,456,479,135,246,135};
		
		int sum=0;
		Arrays.sort(myArray);
		
		for (int i=0;i<myArray.length;i++){
			
			
			System.out.printf("This is the number %d\n",myArray[i]);
			sum = sum +myArray[i];
			
		}
		
		double average = (sum/myArray.length);
	
		System.out.printf("The average is %.2f", average);
		
		
		
		
	}

}
