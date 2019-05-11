package swapanaW;

public class SwapNos {

	void swap(int x, int y)
	{
		System.out.println("Before swapping the values are x = " +x + " and value of Y = " +y );   
        
		x = x+y;  
        y = x-y;  
        x = x-y;  
        
		System.out.println("After swapping the values are x = " +x + " and value of Y = " +y );   
	}
	
	public static void main(String[] args) 
	{
		SwapNos sn= new SwapNos();
		sn.swap(1,3);		
	} 
}
