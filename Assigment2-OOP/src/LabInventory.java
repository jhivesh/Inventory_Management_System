import java.util.Objects;
import java.util.Scanner;
public class LabInventory {
	/
	 public static void startMenu(int choice, Scanner myKeyIn ) {
		 
		 System.out.println("1. Enter a new Item to the inventory \n 2. Change information of an existing Item (password required) \n 3. Display all the Items with the specified category \n 4. Display all Items to be re-ordered \n 5. Number of Items currently in store");
	     System.out.println("What do you want to do ?.");
	     choice = myKeyIn.nextInt(); 
	     if (choice == 1) {
	    	 option1(myKeyIn);
	     }
	     if (choice == 2 ) {
	    	 option2(attempt, choice, myKeyIn, PASSWORD, str1, itemDatabase, diff, choice1);
	     }
	     if (choice == 3 ) {
	    	 findItemByCat(itemDatabase, myKeyIn);
	     }
	     if (choice == 4) {
	    	 option4(itemDatabase);
	     }
	     if (choice == 5) {
	    	  System.out.println("The number of item created"+""+Item.getTotalitems());
	     }
	     if (choice == 6) {
	    	 System.out.println("Program is terminating");
	    	
	     }
	
	 }
	 //=====================================================================================================//
	public static int menu(int choice,Scanner myKeyIn ) {
		
		 System.out.println("====================Menu================================");
		 System.out.println("What do you want to do ?.");
	     System.out.println(" 1.Enter a new Item to the inventory \n 2. Change information of an existing Item (password required) \n 3. Display all the Items with the specified category \n 4. Display all Items to be re-ordered \n 5. Number of Items currently in store \n 6. quit");
	    
	     choice = myKeyIn.nextInt(); 
	     return choice;
	}
	 //=====================================================================================================//
	public static void comparePass(String str1,String PASSWORD,int attempt,int choice,Scanner myKeyIn ) {
		
		
				while(str1 != PASSWORD) {
					System.out.println("Wrong Password.. Re-enter :");
					str1 = myKeyIn.next();
					
					attempt++;
					 if (attempt == 12) {
						 
						 System.out.println("Program detected suspicious activity and is terminating!");
						 break;
					}
						
						
						boolean a = false;
						a = Objects.equals(PASSWORD, str1) ;
						if (a == true) {
							 
							 System.out.println("password accepted");
							 option1(myKeyIn);
							 choice =menu(choice, myKeyIn);
							 break; 
						} 
						if ((attempt == 3 ) || attempt == 6 || attempt == 9 ) {
							ch(choice, choice, choice, myKeyIn, PASSWORD, PASSWORD, null, choice);
							
						 }
						
				}
		
	}
	   
	 //=====================================================================================================//
	public static void comparePass2(String str1,String PASSWORD,int attempt,int choice) {
		
		Scanner myKeyIn = new Scanner(System.in);
		do {
			attempt++;
			 
			if (attempt == 3  ) {
				
				 choice =menu(choice, myKeyIn);
			 }
			else if (attempt == 12) {
				
				    System.out.println("Program detected suspicious activity and is terminating!");
				    break;
			}
			
			boolean a = false;
			a = Objects.equals(PASSWORD, str1) ;
			
			if (a == true) {
				
				 System.out.println("password accepted");
				 option1(myKeyIn);
			}
			
				System.out.println("Wrong Password.. Re-enter : ");
			   str1 = myKeyIn.next();
			
			
		 }while (str1 != PASSWORD || attempt <= 12);
	     
		
	}
	 //=====================================================================================================//
	public static void  findItemByCat(Item itemDatabase[],Scanner myKeyIn) {
		String cat;
		System.out.println("Enter the specified category");
		cat = myKeyIn.next();
		for (int i=0;i<=itemDatabase.length;i++) {
			
			if(itemDatabase[i].getCategory().equals(cat) == true ) {
			   System.out.println("Item Name :"+itemDatabase[i].getItemName() + " \n Description : +" +
			                      itemDatabase[i].getDescription() +"\n Category : "+ 
									itemDatabase[i].getCategory() +" \n Model :"+
			                      itemDatabase[i].getModel() +" \n Serial No. : "+ itemDatabase[i].getSerialNo() 
									+" \n Availabe Quantity : "+ itemDatabase[i].getAvailableQty() +" \n Price :"+
			                      itemDatabase[i].getPrice() +" \n "+
									itemDatabase[i].getSupplierContacts() +" \n Supplier Name :"+
			                      itemDatabase[i].getSupplierName() +" \n Weight : "+ itemDatabase[i].getWeight() );
			}
		}
	}
	 //=====================================================================================================//
     public static void option1(Scanner myKeyIn ) {
    	 
    	 System.out.println("How many item do you want to enter:");
	    	int noOfItem=0;int diff=0;int max =3;
	    	Item[] itemDatabase= new Item[3];
	        noOfItem = myKeyIn.nextInt();
	    		
	    	if (noOfItem > max) {
	    		
	  			  diff = noOfItem - max;
	  			  System.out.println(" You can only add "+(diff)+"remaining places in the array");
	  		  }
	  		  else if (noOfItem <= max) {
	 			diff = max;
	 		}
	    		
	 		   
	 		     for (int i=0;i<diff;i++) {
	 	 	 			

	 	 	 			 System.out.println("enter item name");
	 	 	        	 String itemname  = myKeyIn.next();
	 	 	        	 
	 	 	        	 System.out.println("enter the serial nummber of item");
	 	 	        	 String serial  = myKeyIn.next();
	 	 	        	 
	 	 	        	 System.out.println("enter the model of the item");
	 	 	        	 String model  = myKeyIn.next();
	 	 	        	 
	 	 	        	 System.out.println("enter the description of the item");
	 	 	        	 String descript = myKeyIn.next();
	 	 	        	 
	 	 	        	 System.out.println("enter the name of the supplier ");
	 	 	        	 String sname  = myKeyIn.next();
	 	 	        	 
	 	 	        	 System.out.println("enter the number of the supplier");
	 	 	        	 String contact  = myKeyIn.next();
	 	 	        	 
	 	 	        	 System.out.println("enter the price of the item");
	 	 	        	 double price  = myKeyIn.nextDouble();
	 	 	        	 
	 	 	        	  System.out.println("enter the quantity of this item available ");
	 	 	        	 int quantity  = myKeyIn.nextInt();
	 	 	        	 
	 	 	        	 System.out.println("enter the category of the item");
	 	 	        	 String categry  = myKeyIn.next();
	 	 	        	 
	 	 	        	 System.out.println("enter the weight of the item");
	 	 	        	 double wght  = myKeyIn.nextInt();
	 	 	        	 
	 	 	        	 itemDatabase[i] = new Item(serial,model,descript,sname,contact,price,quantity,categry,wght,itemname);
	 	 	        	 
	 	 	 		}
     }
	 //=====================================================================================================//
     public static void ch(int attempt,int choice1,int choice,Scanner myKeyIn,String PASSWORD,String str1,Item itemDatabas[],int diff) {
    	 Item[] itemDatabase= new Item[3];

		 itemDatabase[0] = new Item("a","a","a","a","a",0.0,0,"a",0.0,"a");
    	 do {
	    		 
	    		 choice = menu(choice, myKeyIn);
	    		 if (choice ==6) {
		 	    	   System.out.println("Program is terminating...");
		 	    	   break;
		 	       }
	    		 if (choice < 1 || choice >5) {
	    		    	
	    		    	System.out.println("Choice must be between 1 to 6..pls re-enter");
	    		    	choice = menu(choice, myKeyIn);
	    		    }
	    		 if (choice ==2) {
	    			 option2( attempt, choice,myKeyIn, str1, str1, itemDatabas, diff, choice1);
	    		 }
	     }while (choice < 1 & choice >5 );
     }
	 //=====================================================================================================//
     public static void option2(int attempt,int choice,Scanner myKeyIn,String PASSWORD,String str1,Item itemDatabase[],int diff,int choice1) {
    		System.out.println("Enter your password for the Lab Inventory ");
	 	    str1 = myKeyIn.next();
	 	        boolean a = false;
	 	    	a = Objects.equals(PASSWORD, str1) ;
	 	    if (a == true) {
		    	System.out.println("What Item do you want to changed");
		    	String temp =myKeyIn.next();
		   
				for (int j=0;j<=diff;j++) {
					
					
					if (itemDatabase[j].getSerialNo().equals(temp) == true) {
						do {
							System.out.println("Here is the attributes of the given serial number");
							System.out.println(itemDatabase[j].getSerialNo() +" \n "+ itemDatabase[j].getItemName() +" \n "+
												itemDatabase[j].getDescription() +" \n "+ itemDatabase[j].getCategory() +" \n "+ 
												itemDatabase[j].getSupplierName() +" \n "+ itemDatabase[j].getSupplierContacts() +
												" \n "+ itemDatabase[j].getPrice() +" \n "+ itemDatabase[j].getAvailableQty());
						    System.out.println("What information of this Item would you like to change?");
						    System.out.println("                                                      ");
							System.out.println("1. Name \n 2. Description \n 3. Category \n 4. Supplier name \n 5. Supplier contacts \n 6. Price  \n 7. Available Qty \n 8. Quit");
							System.out.println("Please enter your choice >  ");
							 choice1 = myKeyIn.nextInt();
						
							if (choice1 == 1) {
								System.out.println("enter the new item name >");
								String a1 = myKeyIn.next();
								itemDatabase[j].setItemName(a1);
							}
							if (choice1 == 2) {
								System.out.println("enter the new description of Item >");
								String a2 = myKeyIn.next();
								itemDatabase[j].setDescription(a2);
							}
							if (choice1 == 3 ) {
								System.out.println("enter the new category of Item ");
								String a3 = myKeyIn.next();
								itemDatabase[j].setCategory(a3);
							}
							if (choice1 ==4) {
								System.out.println("enter the new Supplier name ");
								String a4 =myKeyIn.next();
								itemDatabase[j].setSupplierName(a4);
							}
							if (choice1 ==5 ) {
								System.out.println("enterh the new Supplier contact");
								String a5 = myKeyIn.next();
								itemDatabase[j].setSupplierContacts(a5);
							}
							if (choice1 == 6) {
								System.out.println("enter the new price");
								double b = myKeyIn.nextDouble();
								itemDatabase[j].setPrice(b);
							}
							if (choice1 == 7) {
								System.out.println("enter the new available quantity of the item");
								int c =myKeyIn.nextInt();
								itemDatabase[j].setAvailableQty(c);
							}
							if (choice1 == 8) {
								break;
							}
						} while (choice1 <  1 || choice1 > 8);
					}
		    	}
		    	

 	    	 	// Use the Item ID to look for the Item in itemDatabase. 
 	    	    // If there is no Item with the specified ID
	 	    		 System.out.println("Password IS OK");
	 	    	 }
	 	    else if (str1 != PASSWORD) {
	 	    	
	 	       comparePass2(str1, PASSWORD, attempt, choice);
     }
     }
	 //=====================================================================================================//
     /**
      * 
      */
     public static void option4(Item itemDatabase) {
    	 for (int i =0;i < itemDatabase.length;i++)) {
    		if (itemDatabase[i].getAvailableQty() == 0) {
    		 System.out.println("There is no available item..product ");
    		 System.out.println("Here is the product");
    		 System.out.println(itemDatabase[j].getSerialNo() +" \n "+ itemDatabase[j].getItemName() +" \n "+
						itemDatabase[j].getDescription() +" \n "+ itemDatabase[j].getCategory() +" \n "+ 
						itemDatabase[j].getSupplierName() +" \n "+ itemDatabase[j].getSupplierContacts() +
						" \n "+ itemDatabase[j].getPrice() +" \n "+ itemDatabase[j].getAvailableQty());
    		 
    	 } 
    	 }
    	 
     }
     public static void main1(Scanner myKeyIn,Item itemDatabase[]) {
    	 
		 String cat;String str1;
		 int attempt=0;
	     final String PASSWORD = "DitProg123";
	     int noOfItem=0;
	     int choice1;
	     int diff = 0;
	    
		
		 int choice =0;
		
    	 
		 	//=====================================================================================================// 
       	 do {
       		 
       		 choice = menu(choice, myKeyIn);
       		if (choice ==6) {
	 	    	   System.out.println("Program is terminating...");
	 	    	   break;
	 	       }
       		
       		    if (choice < 1 || choice >5) {
       		    	
       		    	System.out.println("Choice must be between 1 to 6..pls re-enter");
       		    	choice = menu(choice, myKeyIn);
       		    }
	       	    if (choice == 1) {
	       	    	
			 	    System.out.println("Enter your password for the Lab Inventory ");
			 	    str1 = myKeyIn.next();
			 	    boolean a = false;
			 	    a = Objects.equals(PASSWORD, str1) ;
			 	    
			 	    if (a == true) {
			 	    	option1(myKeyIn);
			 	    	
			 	    	 }
			 	    else if (str1 != PASSWORD) {
			 	    	
			 	       comparePass(str1, PASSWORD, choice, attempt, myKeyIn);
			 	       
				 	    }
					}// block of choice == 1 
						
			 	 
		 	       if (choice == 2) {
		 	    	   
					 	    }
		 	        // end of block choice == 2 
		 	       if (choice == 3) {
		 	    	  findItemByCat(itemDatabase, myKeyIn);
		 	       }
		 	       
		 	       if (choice == 4 ) {
		 	    	   if ( )
		 	       }
		 	       if (choice == 5) {
		 	    	   System.out.println("The number of item created"+""+Item.getTotalitems());
		 	       }
		 	       if (choice == 6) {
		 	    	   System.out.println("The program is now terminating...");
		 	       }
		 	    
	      
	     }while (choice < 1 & choice >5 );
     }
	 //=====================================================================================================//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myKeyIn = new Scanner(System.in);
		 int max = 3;
		 Item[] itemDatabase= new Item[3];
		 System.out.println("The System can only store 3 items");
		 
	     main1(myKeyIn, itemDatabase);
	     startMenu(choice, myKeyIn);
	
     
    
	}
   
}
