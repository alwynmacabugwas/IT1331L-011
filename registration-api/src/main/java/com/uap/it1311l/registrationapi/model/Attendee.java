package com.uap.it1311l.registrationapi.model;

public class Attendee {

	public String getAttendeeId() {
		return attendeeId;
	}
	public void setAttendeeId(String attendeeId) {
		this.attendeeId = attendeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String attendeeId;
	public String firstName;
	public String middleName;
	public String lastName;
	public String course;
	public int age;
} 
