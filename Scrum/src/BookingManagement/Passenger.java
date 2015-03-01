package BookingManagement;

import EmployeeManagement.Gender;

public class Passenger {

	private String firstName;
	private String lastName;
	private int age;
	private Gender gender;
        private String contactNumber;
	private Ticket ticket;

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	public Gender getGender() {
		return this.gender;
	}
	
        public Ticket getTicket() {
            return ticket;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public Passenger(String firstName, String lastName, int age, Gender gender, String contactNumber, Ticket ticket) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.gender = gender;
            this.contactNumber = contactNumber;
            this.ticket = ticket;
        }

        

}