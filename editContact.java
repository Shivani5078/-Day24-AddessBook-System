public void editContact(String fName) {
		
		for (Person person : personList) {

			if (person.getFirstName().equals(fName)) {

				System.out.println("Enter the detail which needs to be updated:");

				System.out.println("1 : First Name of the contact to be edited");
				System.out.println("2 : Last Name of the contact to be edited");
				System.out.println("3 : Address of the contact to be edited");
				System.out.println("4 : City of the contact to be edited");
				System.out.println("5 : State of the contact to be edited");
				System.out.println("6 : Zip of the contact to be edited");
				System.out.println("7 : Phone Number of the contact to be edited");
				System.out.println("8 : Email of the contact to be edited");

				System.out.println("Select the index for the contact detail ");

				int choice = sc.nextInt();
				switch (choice) {
				case 1: 
					System.out.println("Enter First Name: ");
					String firstName = sc.next();
					person.setFirstName(firstName);
					break;			
	
				case 2: 
					System.out.println("Enter last name: ");
					String lastName = sc.next();
					person.setLastName(lastName);
					break;
				
				case 3: 
					System.out.println("Enter Address: ");
					String address = sc.next();
					person.setAddress(address);
					break;
				
				case 4: 
					System.out.println("Enter City: ");
					String city = sc.next();
					person.setCity(city);
					break;
				
				case 5: 
					System.out.println("Enter State: ");
					String state = sc.next();
					person.setState(state);
					break;
				
				case 6: 
					System.out.println("Enter Zip: ");
					String zip = sc.nextLine();
					person.setZip(zip);
					break;
				
				case 7: 
					System.out.println("Enter Phone Number:");
					String phoneNumber = sc.nextLine();
					person.setPhonenumber(phoneNumber);
					break;
				
				case 8: 
					System.out.println("Enter Email Code: ");
					String email = sc.next();
					person.setEmail(email);
					break;
					
				default:
						break;
				}
			}

		}
	}
