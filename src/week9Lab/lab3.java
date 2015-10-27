package week9Lab;

import java.util.Random;
import java.util.Scanner;

public class lab3 {

		public static void main(String[]args){
	
	int[] oddArray=new int[10];
	int[] evenArray=new int[10];
	int[] compArray=new int[10];
	int[] winArray=new int[10];
	int[] loseArray=new int[10];
	int even=0;
	int odd=0;
	int win = 0;
	
	RandomNumber myGame = new RandomNumber();//my class 
	
	for(int i=0;i < winArray.length;i++){
			Scanner input = new Scanner(System.in);
			
			int genNumber =myGame.GetANumber_Between_1_and_10();
			
		 System.out.print("Is the number between 0-10  odd(1) or even(2)?\n");		 
		 int choice = input.nextInt();

		 System.out.printf("number is: %d\n", genNumber);//check 
		 
		 compArray[i]= genNumber;//good comp number
		 
		  
		 //guess odd or eve
			 if((choice%2 ==0)){
				evenArray[i] = 2; 
				even = 1+ even;
			 }
			 else{oddArray[i]= 1; 
			 odd = odd+1;}
			
	
			 //guess correct
			 if(genNumber %2==0 && choice %2==0)
			 {
				 winArray[i] =2;
				 System.out.println("Correct");
				 win= win+1;
			 }
			 else if(!(genNumber %2==0) && !(choice %2==0))
			 {
				 System.out.println("Choose odd, correct,");
			 	winArray[i] =1;
			 	win= win+1;
			 }
			 else
				 System.out.println("sorry wrong");
				  }
		 
		
		System.out.println("Remeber 0: Wrong, 1: odd , 2: even");
		for(int i=0;i < winArray.length;i++){
		 System.out.printf(" For %d round\nThe computer choose %d you guess %d\n ",i+1,compArray[i],winArray[i]); 
		}
		
		 System.out.printf("You guessed even:%d, odd:%d, won:%d", even,odd,win);

		}
		}





