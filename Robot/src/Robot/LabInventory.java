package Robot;

import java.util.Scanner;


/**
 * @author test
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner key =new Scanner(System.in);
		  String ID;
		 String name;
		 String description;
		 String category;
		 String supplierName;
		 String supplierContact;
		 double price;
		 int quantity;
		 int choice;
		 String password;
		 int count;
		 int max;
		 int num;
		 count = 1;
		 max = 0;
		 Object itemDatabase[]; 
		 String change;
		 int pick;
		 
		 System.out.println("Welcome");
		 
		 System.out.println("Enter the amount of item you want to have in the list:  ");
		int number = key.nextInt();
		
		System.out.println("Enter your choice: ");
		choice = key.nextInt();
		
		if (choice!= 1 && choice!= 2 &&  choice!= 3 &&  choice!= 4 &&  choice!= 5 &&  choice!= 6 ) {
			System.out.println("Please enter a valid choice.");
			break;
		}
			
		if(choice == 1 ) {
			do {
				System.out.println("Enter password:");
				password = key.next();
				
				if(password != "Ditprog123") {
					max ++;
					count ++;
					
					System.out.println("Invalid Password");
				}
			}
			while(password != "Ditprog123" && count < 3 );
			System.out.println("1. Enter a new Item to the inventory (password required)");
			System.out.println("2. Change information of an existing Item (password required)");
			System.out.println("3. Display all the Items with the specified category");
			System.out.println("4. Display all Items to be re-ordered");
			System.out.println("5. Number of Items currently in store");
			System.out.println("6. Quit");
			choice = key.nextInt();
			
				
		if(password != "Ditprog123" && max == 12 ) {
		
		System.out.println("Program detected suspicious activity and is terminating!");
		break;
		
			
		
		}
		while(password == "Ditprog123" && count < 3);
			do {
				System.out.println("Enter the new item you want to add in the inventory");
				 num = key.nextInt();
		

			for (int i = 0; i < num; i++) {
				
				System.out.println("Item ID" + (i+1) + ": ");
				ID = key.next();
				
				System.out.println("Name" + (i+1) + ": ");
				name = key.next();
				
				System.out.println("Description" + (i+1) + ": ");
				description = key.next();
				
				System.out.println("Category" + (i+1) + ": ");
				category= key.next();
				
				System.out.println("Supplier Name" + (i+1) + ": ");
				supplierName = key.next();
				
				System.out.println("Supplier Contact" + (i+1) + ": ");
				supplierContact = key.next();
				
				System.out.println("Price" + (i+1) + ": ");
				price = key.nextInt();
				
				System.out.println("Available Quantity" + (i+1) + ": ");
				quantity = key.nextInt();
				
				itemDatabase [i] = new Item(ID, name, description, category,supplierName, supplierContact, price, quantity);
			
			}
			
			}
		}
		
				 
			
				
		

			else if (choice == 2) {
			do {
				System.out.println("Enter password:");
				password = key.next();
				
				if(password != "Ditprog123") {
					count ++;
					
					System.out.println("Invalid Password");
				}
			}
			while(password != "Ditprog123" && count == 3 );
			System.out.println("1. Enter a new Item to the inventory (password required)");
			System.out.println("2. Change information of an existing Item (password required)");
			System.out.println("3. Display all the Items with the specified category");
			System.out.println("4. Display all Items to be re-ordered");
			System.out.println("5. Number of Items currently in store");
			System.out.println("6. Quit");
			choice = key.nextInt();
			
			while(password == "Ditprog123" && count < 3);
			System.out.println("Enter the Item ID: ");
			change = key.next();
			
	
		
			for (int i = 0; i < num; i++) {
			itemDatabase[i] = Item i(get.ID, get.name, get.description, get.category,get.supplierName, get.supplierContact, get.price, get.quantity);
			boolean ans = Item.contains(change);
			if(ans) {
				System.out.println(itemDatabase.toString());
				System.out.println("Which attribute do you wish to change: ");
				System.out.println("1.1. Name\r\n" + 
						"2. Description\r\n" + 
						"3. Category\r\n" + 
						"4. Supplier name\r\n" + 
						"5. Supplier contacts\r\n" + 
						"6. Price\r\n" + 
						"7. Available qty\r\n" + 
						"8. Quit");
				System.out.println("Please enter your choice: ");
				pick = key.nextInt();
				
				if (pick == 1) {
				System.out.println("Enter a name: ");
				String N = key.next();
					Item.setName(N);
					
				}
				
				if(pick == 2) {
					System.out.println("Enter a Description: ");
					String D = key.next();
					Item.setDescription(D);
					
				}
				
				if(pick == 3) {
					System.out.println("Enter a Category: ");
					String C = key.next();
					Item.setDescription(C);
					
				}
				if(pick == 4) {
					System.out.println("Enter a Supplier Name: ");
					String supN = key.next();
					Item.setDescription(supN);
					
				}
				if(pick == 5) {
					System.out.println("Enter a Supplier contacts: ");
					String supC = key.next();
					Item.setDescription(supC);
					
				}
				if(pick == 6) {
					System.out.println("Enter a price: ");
					String P = key.nextInt();
					Item.setDescription(P);
									
				}
				if(pick == 7) {
					System.out.println("Enter the Available qty: ");
					String QTY = key.nextInt();
					Item.setDescription(QTY);
					
				}
				if(pick == 8) {
					
					System.out.println("Thanks");
					break;
				}

					
					
					
				}
				else {
					System.out.println("Sorry Item not found!");
					break;
				}
			
			
			
			}
		
		
			
			if(choice == 3) {
			System.out.println("Please enter the category of the item: ");
			String cat = key.next();
			for(int i = 0; i< num; i++ ) {
				
			
				if(itemDatabase[i].getCategory().equals(cat)) {
					System.out.println(Item.toString());
				}
			}
			}
			
			
		
		
	     else if(choice == 4) {
	    	 
	    		for (int i = 0; i < num; i++) {
	    			System.out.println(	Item.toString());
	    		}
	    	 
	    	 
		
		}
		
		
		
	     else if(choice == 5) {
			System.out.println("Number of items are " + Item.TotalItem());
		}
	
		
	     else if(choice == 6) {
			System.out.println("Thank you for your time.");
			break;
		}
		
}


	

}
		
	}
	
}
		 
			
		
			
			
	
		
		
		
		
		
		
		
			
			
		

		
		
	


