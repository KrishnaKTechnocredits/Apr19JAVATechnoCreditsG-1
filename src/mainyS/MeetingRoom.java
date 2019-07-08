package mainyS;

import java.util.Scanner;

//WAP for Meeting Room
public class MeetingRoom {
	String name;
	double hours;
	static String a;
	static double hrs;

	void bookMeetingRoom() {
		System.out.println("Nalanda is booked for 1 hour");
	}

	void bookMeetingRoom(String a, double hrs) {
		name = a;
		hours = hrs;
	}

	void displayInfo() {
		System.out.println("Meeeting room " + name + " is booked for " + hours + " hours");
	}

	public static void main(String[] args) {
		MeetingRoom room = new MeetingRoom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any one Meeting room name given below" + "\n" + "1. Takshashila" + "\n"
				+ "2. AgraFort" + "\n" + "3. PratapGadh" + "\n" + "4. Nalanda");
		System.out.println("Enter the Meeting room name");
		a = sc.nextLine();
		if (a.equalsIgnoreCase(a = "Nalanda")) {
			room.bookMeetingRoom();
		} else {
			System.out.println("Duration required for booking");
			hrs = sc.nextDouble();
			room.bookMeetingRoom(a, hrs);
			room.displayInfo();
		}

	}
}