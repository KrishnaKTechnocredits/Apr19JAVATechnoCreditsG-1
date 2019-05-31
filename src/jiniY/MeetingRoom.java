package jiniY;


import java.util.Scanner;

public class MeetingRoom {

	String bookMeetingRoomName;
	int hours;

	
	
	void bookMeetingRoom()
	{
		bookMeetingRoomName="Nalanda";
		 hours =1;
		 
	}
	
	void bookMeetingRoomName(String bookMeetingRoomName,int hours)
	{
		this.bookMeetingRoomName=bookMeetingRoomName;
		this.hours=hours;
	}
	
	void display()
	{
		System.out.println("Meeting Room Info:");
		System.out.println("Room name is:" +" " +bookMeetingRoomName);
		System.out.println("For hours is :" +" " +hours);
	}
	
	public static void main(String[] args) {
		
		MeetingRoom mr = new MeetingRoom();
		mr.bookMeetingRoom();
		mr.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter booking room name other than Nalanda?");
		String bookname = sc .next();
		System.out.println("For how many hours?");
		int hours = sc.nextInt();
		mr.bookMeetingRoomName(bookname,hours);
		mr.display();
	}
}
