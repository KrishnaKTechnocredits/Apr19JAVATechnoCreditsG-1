package shantanuG;

import java.util.Scanner;

public class MeetingRoom {

	String room;
	float hrs;
	
	void bookMeetingRoom()
	{
		room="Nalanda";
		hrs=1;
	}
	
	void bookMeetingRoom(String room,float hrs)
	{
		this.room=room;
		this.hrs=hrs;
	}
	
	void displayInfo()
	{
		System.out.println(room+" is booked for "+hrs+" hour/s.");
	}
	
	public static void main(String args[])
	{
		MeetingRoom meetingRoom=new MeetingRoom();
		Scanner sc=new Scanner(System.in);
		System.out.println("Following meeting rooms are available");
		System.out.println("1. Nalanda");
		System.out.println("2. Takshashila");
		System.out.println("3. AgraFort");
		System.out.println("4. PratapGadh");
		System.out.print("Enter name of the meeting room which you want to book:");
		String room=sc.next();
		if(room.equalsIgnoreCase("Nalanda"))
		{
			meetingRoom.bookMeetingRoom();
			meetingRoom.displayInfo();
		}
		else if(room.equalsIgnoreCase("Takshashila")||room.equalsIgnoreCase("AgraFort")||room.equalsIgnoreCase("PratapGadh"))
		{
			System.out.print("Enter the number of hours:");
			float hrs=sc.nextFloat();
			if(hrs>0)
			{
				meetingRoom.bookMeetingRoom(room, hrs);
				meetingRoom.displayInfo();
			}
			else
				System.out.println("Please enter valid hours");
		}
		else
			System.out.println("Please enter valid meeting room");
		}
				
	}
