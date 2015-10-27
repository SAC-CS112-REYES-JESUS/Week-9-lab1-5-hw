package week9Lab;

public class RandomNumber {

	
	public int GetANumber_Between_1_and_10()
	{
		
	int random= (int) (1+Math.random() * 10) ;
	return random;
		
		
	}
	/* lab 4
	public int GetANumber(int high){
		int random= (int) (1+Math.random() * high);
		return random;
		*/
		
		
	public int GetANumber(int lo, int hi){
	int random= lo+(int) (Math.random() *((hi-lo)+1));
	return random;
	
	
	}
}
