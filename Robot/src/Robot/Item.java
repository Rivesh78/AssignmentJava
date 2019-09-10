package Robot;
import java.util.Scanner; 



/**
 * @author test
 *
 */

//attributes
public class Item {
	private static int totalItem = 0;
	
	private String ID;
	private String name;
	private String description;
	private String category;
	private String supplierName;
	private String supplierContact;
	private double price;
	private int quantity;
}
	
	
	
	//Default constructor
	public Item() {
		 this.ID = null;
		 this.name = null;
	     this.description = null;
		 this.category = null;
		 this.supplierName = null;
		 this.supplierContact = null;
		 this.price = 0.0;
		 this.quantity = 0;
		 
	}
		
		
		//constructors
	 public Item(String ID, String name,  String description, String category, String supplierName, String supplierContact, double price, int quantity){
		 this.ID = ID;
		 this.name = name;
		 this.description = description;
		 this.category = category;
		 this.supplierName = supplierName;
		 this.supplierContact = supplierContact;
		 this.price = price;
		 this.quantity = quantity;
		 
 }
	
	 



	public void setQuantity(int quantity) {
		this.quantity = quantity;
		
		
		 
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
		totalItem++;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		this.ID = iD;
		totalItem++;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
		
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
		
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public String getSupplierContact() {
		return supplierContact;
	}


	public void setSupplierContact(String supplierContact) {
		this.supplierContact = supplierContact;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getQuantity() {
		return quantity;
	}


	@Override
	public String toString() {
		return "Item [ID=" + ID + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplierName=" + supplierName + ", supplierContact=" + supplierContact + ", price=" + price
				+ ", quantity=" + quantity + ", getName()=" + getName() + ", getID()=" + getID() + ", getDescription()="
				+ getDescription() + ", getCategory()=" + getCategory() + ", getSupplierName()=" + getSupplierName()
				+ ", getSupplierContact()=" + getSupplierContact() + ", getPrice()=" + getPrice() + ", getQuantity()="
				+ getQuantity() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}


	public static boolean contains(String change) {
		// TODO Auto-generated method stub
		return true;
	}

	 public static int TotalItem() {
	        return totalItem;
	 }



	


}
