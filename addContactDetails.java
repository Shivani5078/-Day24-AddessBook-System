package addressbook.com;

import java.util.ArrayList;	
import java.util.Scanner;

public class AddressBook {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Person> personList = new ArrayList<Person>();
	
	/*
	 * @purpose:Add contact details and set this details
	 * @return: No return value 
	 */

	public void addContactDetails() {
		
		System.out.println("Enter the contact details:");
		System.out.println("Enter the first name:");
		String firstName = sc.next();
		System.out.println("Enter the last name:");
		String lastName = sc.next();
		System.out.println("Enter the address:");
		String address = sc.next();
		System.out.println("Enter the city:");
		String city = sc.next();
		System.out.println("Enter the state:");
		String state = sc.next();
		System.out.println("Enter the email:");
		String email = sc.next();
		System.out.println("Enter the phonenumber:");
		String phoneNumber = sc.next();
		System.out.println("Enter the zip:");
    	String zip =sc.next();
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setAddress(address);
		person.setCity(city);
		person.setState(state);
		person.setEmail(email);
		person.setPhonenumber(phoneNumber);
		person.setZip(zip);
		
		personList.add(person);
	}
	
