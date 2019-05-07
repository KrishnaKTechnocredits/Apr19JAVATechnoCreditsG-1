package jiniY;

//convert seconds to hour,minute and seconds

public class Time {

	void convertSecond(int s) {
		System.out.println("Seconds to Hour:" + s / 3600 + "hr");
		System.out.println("Seconds to Minutes:" + s % 3600 + "min");
		System.out.println("Seconds :" + s + "sec");
	}

	static void convertSecond1(int sec) {
		System.out.println(" ");
		System.out.println(
				"Seconds to Hour, Minutes & seconds:" + sec / 3600 + "hr" + " " + sec % 3600 + "min" + " " + sec + " ");

	}

	public static void main(String[] args) {
		Time t = new Time();
		t.convertSecond(3630);
		convertSecond1(3630);
	}

}
