package swapanaW;

public class MeetingRoom {

	public static void main(String[] args) {

		new MeetingRoom().displayInfo();
	}

	void bookMeetingRoom() {
		System.out.println("Nalanda room is booked for 1 hours");
	}

	void bookMeetingRoom(String name, double hrs) {
		System.out.println(name + " room is booked for " + hrs + " hours");
	}

	void displayInfo() {
		new MeetingRoom().bookMeetingRoom();
		new MeetingRoom().bookMeetingRoom("Takshashila", 5);
		new MeetingRoom().bookMeetingRoom("AgraFort", 2.5);
		new MeetingRoom().bookMeetingRoom("PratapGadh", 3);
	}
}
