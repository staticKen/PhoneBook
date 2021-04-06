package listing;

import phoneBook.Entries;

public class Listings {

	public static Entries[] phoneBook;

	public static void TheList() {
		//public Entries(String firstName, String middleName, String lastName, String phone, String contactAddress, //String city, String state, String zip) {
				
		phoneBook = new Entries[5];
		phoneBook[0] = new Entries("JOHN", "", "DOE", "636-643-5698", "114 MARKET ST", "ST LOUIS", "MO", "63403" );
		phoneBook[1] = new Entries("JOHN", "E", "DOE", "847-539-0126", "324 MAIN ST", "ST CHARLES", "MO", "63303");
		phoneBook[2] = new Entries("JOHN", "MICHAEL WEST", "DOE", "562-859-2375", "574 POLE AVE", "ST PETERS", "MO", "63333");
		phoneBook[3] = new Entries(null, null, null, null, null, null, null, null);
		phoneBook[4] = new Entries(null, null, null, null, null, null, null, null);

		
		

	}

	
	public static void allEntries() {
		TheList();
		for (int i = 0; i < phoneBook.length; i++) {
			System.out.println(phoneBook[i]);
		}
	}
	public static void searchFirst(String targetFirst) {
		TheList();
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].firstName != null && phoneBook[i].firstName.equals(targetFirst)) {
				System.out.println(phoneBook[i]);
				
				}
			}
		}
	
	public static void searchLast(String targetLast) {
		TheList();
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].lastName != null && phoneBook[i].lastName.equals(targetLast)) {
				System.out.println(phoneBook[i]);
				
				}
			}
		
		}
	public static void searchfull(String targetfull) {
		TheList();
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].lastName != null && phoneBook[i].fullName.equals(targetfull)) {
				System.out.println(phoneBook[i]);
				}
			}
		}

	public static void searchphone(String targetphone) {
		TheList();
		for (int i = 0; i < phoneBook.length; i++) {
			if (phoneBook[i].lastName != null && phoneBook[i].phone.equals(targetphone)) {
				System.out.println(phoneBook[i]);
				}
			}
		}




}




