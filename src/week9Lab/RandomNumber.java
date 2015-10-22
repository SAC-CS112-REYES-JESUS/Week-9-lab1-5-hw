package week9Lab;

public class RandomNumber {

	
	public int GetARandomNumberbtw()
	{
		
	int random= (int) (1+Math.random() * 10) ;
	return random;
		
		
	}
	
	public int GetANumber(int high){
		int random= (int) (1+Math.random() * high);
		return random;
		
	}
}
