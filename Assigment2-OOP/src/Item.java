
public class Item{
	 	private String itemName;
    	private String serialNo;
    	private String model;
    	private String description;
    	private String supplierName;             
    	private String supplierContacts;           //number should be of string 0
    	private double price;
    	private int availableQty;
    	private String category;
    	private double weight;
    	                                             
    	private static int totalitems = 0; 		
    	
		//========================================================================================================================================//
//*****Static attributes
    	/** _______overload Constructor____
    	 * 
    	 * @param itemName
    	 * @param model
    	 * @param weight
    	 */
    public Item(String itemName,String model,double weight ){
    	this.itemName = null;
    	this.model = null;
    	this.weight = 0.0;
    	setTotalitems(getTotalitems()+1);
    }
    /**
     *  ==============Default Constructors=============================
     */
    public Item() {
    	itemName = null;
    	serialNo = null;
    	model = null;
    	description = null;
    	supplierName = null;
    	supplierContacts = null;
    	price = 0.0;
    	availableQty = 0;
    	category = null;
    	weight = 0.0;
    	setTotalitems(getTotalitems()+1);

    }
	//========================================================================================================================================//
		/** _______overload_Constructors______
		 * 
		 * @param serialNo
		 * @param model
		 * @param description
		 * @param supplierName
		 * @param supplierContacts
		 * @param price
		 * @param availableQty
		 * @param category
		 * @param weight
		 * @param itemName
		 */
		public Item(String serialNo, String model, String description, String supplierName, String supplierContacts,
				double price, int availableQty, String category, double weight, String itemName) {
			this.itemName = itemName;
			this.serialNo = serialNo;
			this.model = model;
			this.description = description;
			this.supplierName = supplierName;
			this.supplierContacts = supplierContacts;
			this.price = price;
			this.availableQty = availableQty;
			this.category = category;
			this.weight = weight;
			
	    	setTotalitems(getTotalitems()+1);

		}
		//========================================================================================================================================//
		//==========================Getter and Setter====================================//
		//===============================================================================//
		/**
		 * @return the itemName
		 */
		public String getItemName() {
			return itemName;
		}
		/**
		 * @param itemName the itemName to set
		 */
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		//========================================================================================================================================//
		/**
		 * @return the serialNo
		 */
		public String getSerialNo() {
			return serialNo;
		}
		/**
		 * @param serialNo the serialNo to set
		 */
		public void setSerialNo(String serialNo) {
			this.serialNo = serialNo;
		}
		//========================================================================================================================================//
		/**
		 * @return the model
		 */
		public String getModel() {
			return model;
		}
		/**
		 * @param model the model to set
		 */
		public void setModel(String model) {
			this.model = model;
		}
		//========================================================================================================================================//
		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
		//========================================================================================================================================//
		/**
		 * @return the supplierName
		 */
		public String getSupplierName() {
			return supplierName;
		}
		/**
		 * @param supplierName the supplierName to set
		 */
		public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		//========================================================================================================================================//
		/**
		 * @return the supplierContacts
		 */
		public String getSupplierContacts() {
			return supplierContacts;
		}
		/**
		 * @param supplierContacts the supplierContacts to set
		 */
		public void setSupplierContacts(String supplierContacts) {
			this.supplierContacts = supplierContacts;
		}
		//========================================================================================================================================//
		/**
		 * @return the price
		 */
		public double getPrice() {
			return price;
		}
		/**
		 * @param price the price to set
		 */
		public void setPrice(double price) {
			if (price > 0) {
				this.price = price;
			}
			else {
				System.out.println("invalid Price \n Price Should be greater than 0 \n Please re-enter");
			}
		}
		//========================================================================================================================================//
		/**
		 * @return the availableQty
		 */
		public int getAvailableQty() {
			return availableQty;
		}
		/**
		 * @param availableQty the availableQty to set
		 */
		public void setAvailableQty(int availableQty) {
			if (availableQty >= 0) {
					this.availableQty = availableQty;
			}
			else {
			System.out.println("invalid Quantity entered...");
			}
		}
		//========================================================================================================================================//
		/**
		 * @return the category
		 */
		public String getCategory() {
			return category;
		}
		/**
		 * @param category the category to set
		 */
		public void setCategory(String category) {
			this.category = category;
		}
		//========================================================================================================================================//
		/**
		 * @return the weight
		 */
		public double getWeight() {
			return weight;
		}
		/**
		 * @param weight the weight to set
		 */
		public void setWeight(double weight) {
			if (weight > 0) {
				this.weight = weight;
			}
			else {
				System.out.println("invalid weight");
			}
		}
		//========================================================================================================================================//
		@Override
		public String toString() {
			return "Item [itemName=" + itemName + ", serialNo=" + serialNo + ", model=" + model + ", description="
					+ description + ", supplierName=" + supplierName + ", SupplierContacts=" + supplierContacts
					+ ", price=" + price + ", availableQty=" + availableQty + ", category=" + category + ", weight="
					+ weight + "]";
		}
		
		//========================================================================================================================================//
		public boolean equalsTo(Item i) {
			if (this.serialNo.equals(i.serialNo)) {
				return true;
			}
			else {
				return false;
			}
		}
		//========================================================================================================================================//
		/**
		 * @return the totalitems
		 */
		public static int getTotalitems() {
			return totalitems;
		}
		/**
		 * @param totalitems the totalitems to set
		 */
		public static void setTotalitems(int totalitems) {
			Item.totalitems = totalitems;
		}
		//========================================================================================================================================//
		
}
