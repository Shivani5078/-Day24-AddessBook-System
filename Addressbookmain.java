package addressBook.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Addressbookmain {
	static ArrayList<contacts>conactList=new ArrayList<contacts>();
	
	public void addcontactDetails(){
		
			System.out.println("enter the contact deatils:");
			System.out.println("enter the frist name:");
			Scanner sc=new Scanner(System.in);
			String firstName=sc.next();
			System.out.println("enter the last name:");
			String lastname=sc.next();
			System.out.println("enter the address:");
			String address=sc.next();
			System.out.println("enter the city:");
			String city=sc.next();
			System.out.println("enter the state:");
			String state=sc.next();
			System.out.println("enter the email");
			String email=sc.next();
			System.out.println("enter the phonenumber");
			long phonenumber=sc.nextLong();
			System.out.println("enter the zip");
			long zip=sc.nextLong();
			
			
			contacts person=new contacts();
			person.setFristname(firstName);
			person.setLastname(lastname);
			person.setAddress(address);
			person.setCity(city);
			person.setState(state);
			person.setEmail(email);
			person.setPhonenumber(phonenumber);
			person.setZip(zip);
		
			conactList.add(person);
		}
		public void dispalyContact()
		{
			System.out.println(conactList);
		}
		public static void main(String[]args)
		{
			 Addressbookmain addcontact=new  Addressbookmain();
			
			//call the method
			 addcontact.addcontactDetails();
			 addcontact.dispalyContact();
			
		
	}

}
