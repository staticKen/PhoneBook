package phoneBook;

import java.util.Scanner;



public class Index_PhoneBook extends PhoneBookSearch{

	public static void main(String[] args) {

		Scanner kbd = new Scanner(System.in);
		System.out.println("PHONEBOOK MAIN MENU");
		System.out.println("1. search phone book.");
		System.out.println("2. display listings.");
		System.out.println("Enter number option: ");
		int numberOption = kbd.nextInt();
		
		switch (numberOption) {
		 case 1:
	            phoneBookSearch();

	            break;
	        case 2:
	            System.out.println("\r");
	            allEntries();



	            break;
	        default:
	            System.out.println("Invalid Entry, Please Try Again");
	         	
		}

	}
	

}