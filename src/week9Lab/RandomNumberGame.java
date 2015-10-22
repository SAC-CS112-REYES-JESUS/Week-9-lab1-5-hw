package week9Lab;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {

	
	
	public static void main(String[]args){
	
	int[] oddArray=new int[10];
	int[] evenArray=new int[10];
	int[] compArray=new int[10];
	int[] winArray=new int[10];
	int[] loseArray=new int[10];
	int number =0;
	
	RandomNumber myGame = new RandomNumber();
	
	
	
	
		 
		for(int i=0;i < winArray.length;i++){
			Scanner input = new Scanner(System.in);
			
			int genNumber =myGame.GetANumber(number);
			System.out.println("Pick a limit number 0-X");
			number=input.nextInt();
			
			
			
		 System.out.printf("Is the number between 0-%d  odd(1) or even(2)?\n",number);
		 
		
		 int choice = input.nextInt();

		  
		 System.out.printf("number is: %d\n", genNumber);
		 
		 compArray[i]= genNumber;//good comp number
		 
		  
		 //guess odd or eve
			 if((choice%2 ==0)){
				evenArray[i] = 2; 	 
			 }
			 else{oddArray[i]= 1; }
			 
			
			 
			 //guess correct
			 if(genNumber %2==0 && choice %2==0)
			 {
				 winArray[i] =2;
				 System.out.println("Correct");
			 }
			 else if(!(genNumber %2==0) && !(choice %2==0))
			 {
				 System.out.println("Choose odd, correct,");
			 	winArray[i] =1;
			 }
			 else
				 System.out.println("sorry wrong");
			
				 
			 
			 
			  }
		 
		
		System.out.println("Remeber 0: Wrong, 1: odd , 2: even");
		for(int i=0;i < winArray.length;i++){
		 System.out.printf("For %d round\nThe computer choose %d you guess %d\n ",i+1,compArray[i],winArray[i]);
		 
		}
		
		}
		}





