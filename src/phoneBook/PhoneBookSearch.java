package phoneBook;

import java.util.Scanner;

import listing.Listings;

public class PhoneBookSearch extends Listings {



	public static void phoneBookSearch(){

		Scanner sc = new Scanner(System.in);
		System.out.println("\r");
		System.out.println("1. By First Name");
		System.out.println("2. By Last Name");
		System.out.println("3. By Full Name");
		System.out.println("4. By Phone Number");
		System.out.println("5. By City or State");
		System.out.println("Please select Search Option");
		 int searchNumOption = sc.nextInt();
				
		switch (searchNumOption) {
		case 1:
			System.out.println("Please enter First Name: ");
			String firstName = sc.next().toUpperCase();
			searchFirst(firstName);
			break;
			
			
		case 2:
			System.out.println("Please enter Last Name: ");
			String lastName = sc.next().toUpperCase();
			searchLast(lastName);
			break;
			
		case 3:
			Scanner full = new Scanner(System.in);
			System.out.println("Please enter first Name: ");
			String first = full.nextLine().toUpperCase();
			System.out.println("Please enter middle Name: ");
			String middle = full.nextLine().toUpperCase();
			System.out.println("Please enter last Name: ");
			String last = full.next().toUpperCase();			
			String fullName = first + middle + last;
			searchfull(fullName);
			full.close();
			break;
			
		case 4:
			System.out.println("Please enter Phone Number (i.e.xxx-xxx-xxxx): ");
			String phone = sc.next().toUpperCase();
			searchphone(phone);
			break;
			
		case 5:
			Scanner cands = new Scanner(System.in);
			System.out.println("Please enter City: ");
			String city = cands.nextLine().toUpperCase();
			System.out.println("Please enter abbreviation of state: ");
			String state = cands.next().toUpperCase();
			String cityandstate = city + state;
			searchcityandstate(cityandstate);
			break;
			
		case 6:
			
			
			
			default:
				System.out.println("Invalid Entry. Please Try Again");
				
		}
	
	}

	private static void searchcityandstate(String cityandstate) {
	}

	public static void searchfull(String fullName) {
	}

	public static void searchLast(String lastName) {
	}
}
