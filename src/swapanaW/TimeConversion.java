package swapanaW;

public class TimeConversion {

	static void timecheck(int input){
		
		int hours = input/3600;
		int min = (input % 3600)/60;
		int sec = input % 60;
		System.out.println("Seconds entered " +input+ " are = " +hours+ " Hours " + min + " Minutes " + sec + " Seconds");
	}
	
	public static void main(String[] args) {

		timecheck(3725);	
	}
}