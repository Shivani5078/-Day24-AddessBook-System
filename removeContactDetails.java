      public void removeContactDetails() {
		
		System.out.println("Enter the contact details:");
		System.out.println("Enter the first name:");
		String firstName = sc.next();
				
		for(Contact person : personList) {
			if(person.getFirstname().equals(firstName)) {
				personList.remove(person);
			}
		}		
	}
   
     public static void main(String args[]) {
		
		EditContact addressBook = new EditContact();
		boolean flag = true;
		while(flag)
		{
		System.out.println("1.Add Contact" + "\n" + "2.Edit Contact" + "\n" + "3.Display AddressBook" + "\n" + "4.Delete Contact" + "\n" + "5.Exit");
		System.out.println("Enter Choice");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			addressBook.addContactDetails();
			break;
		
		case 2:
			System.out.println("Edit details");
			String firstName = sc.next();
			addressBook.editContact(firstName);
			break;
		
		case 3:
			System.out.println(personList);
			break;
			
		case 4:
			addressBook.removeContactDetails();        
			break;
		default:
			flag = false;
			break;
		}
     }
   }
}
