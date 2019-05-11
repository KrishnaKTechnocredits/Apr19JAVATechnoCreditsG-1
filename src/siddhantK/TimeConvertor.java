package siddhantK;

public class TimeConvertor {

	public static void main(String[] args) 
	{
		System.out.println("Code Test 1 - Input value of seconds 3725");
		timeInSecondsToHours(3725);
		System.out.println("Code Test 2 - Input value of seconds 86400");
		timeInSecondsToHours(86400);
		System.out.println("Code Test 3 - Input value of seconds 127");
		timeInSecondsToHours(127);
		}
		public static void timeInSecondsToHours(int tsec)
			{ 
				int temp=tsec;
				int hour = temp/ 3600;
				int sec1 = temp%3600;
				int min = sec1/60;
				int sec2 = sec1 %60;
				System.out.print(" Hours: "+hour);
				if (sec1 > 60)
				{
					System.out.print(" , Minutes: "+min); 
				}
				else
					System.out.print(" , Minutes: "+min);
			
				System.out.print(" and Seconds: "+sec2);
				System.out.println();
				
			}
			
		 
				
		
			
			
		}

