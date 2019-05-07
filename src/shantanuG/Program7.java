package shantanuG;

public class Program7 {
	void timeConversion(int seconds)
	{
		int sec=seconds%60;
		int hrs=seconds/60;
		int mins=hrs%60;
		hrs=hrs/60;
		System.out.println(seconds+" in hh:mm:ss is "+hrs+":"+mins+":"+sec);
	}
	public static void main(String args[])
	{
		Program7 program7=new Program7();
		program7.timeConversion(3600);
	}
}
