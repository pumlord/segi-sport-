package assignment1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SegiSportsSystem {
	
	public static void main(String[] args) {
           int userIndex = 0;
	       Scanner scan = new Scanner(System.in);
	       boolean cont = true;
	       UI obj = new UI();
	       int pNum = 0;
	       
	       //declaration of array
	       List<User> userList = new ArrayList<>();
	       List<Court> courtList = new ArrayList<Court>();
	       List<Booking> bookingList = new ArrayList<>();
	       List<Package> packageList = new ArrayList<>();
	       
	       //user array
	       userList.add(new User("SUKD2102255", "Ain", "cheoknurain@gmail.com",173683839));
	       userList.add(new User("SUKD1900229", "Nicholas", "nicholas@gmail.com",986342739));
	       userList.add(new User("SUKD2102364", "Alamin", "alaminabu@gmail.com", 277329020));
	       userList.add(new User("SUKD1801620", "Novaira", "novairanaeem@gmail.com",2343434));
	       
	       //student or outsider
	       System.out.println(obj.toString2());
	       int entry = scan.nextInt();
	       
	       //student
	       if (entry == 1) {
	    	   //existing or new
	    	   System.out.println(obj.toString1());
	    	   int account = scan.nextInt();
	    	   
	    	   //existing
	    	   if (account == 1) {
	    		   System.out.print("Select user index: ");
	    		   for (int i = 0; i<userList.size(); i++) {
	    			   System.out.println(i+1 + ")" + userList.get(i));
	    		   }
	    		   userIndex = scan.nextInt()-1;
	    		   User obj1 = new User (userIndex);
	    	   }
	    	   //new
	    	   else if (account == 2) {
	    		   System.out.print("Enter userID: ");
	    		   scan.next();
	    		   String userID = scan.nextLine();
	    		   System.out.print("Enter userName: ");
	    		   scan.next();
	    		   String userName = scan.next();
	    		   System.out.print("Enter email: ");
	    		   String email = scan.nextLine();
	    		   System.out.print("Enter contact number: ");
	    		   long contact = scan.nextLong();
	    		   userList.add(new User(userID, userName, email, contact));
	    		   userIndex = userList.size()-1;
	    	   }
	       }
	       //outsider
	       else if (entry == 2) {
    		   System.out.print("Enter userID: ");
    		   scan.next();
    		   String userID = scan.nextLine();
    		   System.out.print("Enter userName: ");
    		   String userName = scan.next();
    		   System.out.print("Enter email: ");
    		   String email = scan.nextLine();
    		   System.out.print("Enter contact number: ");
    		   long contact = scan.nextLong();
    		   userList.add(new User(userID, userName, email, contact));
	       }
	       else {
	    	   System.out.println("Invalid input");
	       }
	            
	       do{
	           //Print menu list
	           System.out.println(obj.toString());
	           
	           System.out.println("Enter your choice: ");
	           int choice = scan.nextInt();
	           
	        switch(choice){
	            // Add court
	            case 1: 
	                System.out.println("Enter court name (0 to exit): ");
	                for (int i = 1; i>0; i++){
	                    String fname = scan.nextLine();
	                    if (fname.contains("0")){
	                        break;
	                    }
	                    else {
	                        courtList.add(new Court(fname));
	                    } 
	                }
	                courtList.remove(0);
	                break;
	                
	            // Add package    
	            case 2:
	            	
	                for (int i = 1; i>0; i++){
	                    System.out.println("Enter package name: ");
	                    scan.nextLine();
	                    for (int j = 1; j>0; j++) {
		                    String pname = scan.nextLine();
	
		                    System.out.println("Choose court name");
		                    System.out.println(courtList.toString());
		                    String courtname = scan.nextLine();
		                    for (int x = 0; x<courtList.size(); x++) {
		                    	if (courtList.get(x).getCname().contains(courtname)) {
				                    System.out.println("Enter the price per hour(RM): ");
				                    double price = scan.nextDouble();
				                    
				                    if (entry == 1) {
				                    	price = price/100*75;
				                    }
			
				                    System.out.println("Enter duration (by hours): ");
				                    double duration = scan.nextDouble();
			
				                    packageList.add(new Package (pname, courtname, price, duration));  
		                    	} 
		                    	else {
		                    		System.out.print("");
		                    	}
		                    }
		                    break;
	                    }
	                    break;
	                }  
	                break;
	                
	            //Show court  
	            case 3:
	                for (int j = 0 ; j < courtList.size(); j++){
	                    System.out.println(courtList.get(j));
	                }
	                
	                break;
	                
	            //Show package
	            case 4: 
	                for (int j = 0 ; j < packageList.size(); j++){
	                    System.out.println(packageList.get(j));
	                }
	                
	                break;
	            
	            //User Booking    
	            case 5: 
                    for (int j = 0 ; j < packageList.size(); j++){
                    System.out.println("Package " + j + "\n" + packageList.get(j));
	                }
	                
	                System.out.println("Select the package number that user want to book.");
	                pNum = scan.nextInt();
	                
	                bookingList.add(new Booking (packageList.get(pNum),userList.get(userIndex)));
	                break;
	                
	            //Show Booking
	            case 6:
	                for (int j = 0 ; j < bookingList.size(); j++){
	                    System.out.println(bookingList.get(j));
	                }
	                
	                break;
	                
	            //Payment
	            case 7:

	                System.out.println("Enter paid amount");
	                int pay = scan.nextInt();
	                
	                Payment obj2 = new Payment(packageList.get(pNum), userList.get(userIndex), pay);
	                System.out.println(obj2.toString()+"\n");
	                
	                break;
	                
	            case 0:
	                cont = false;
	                break;
	            
	            default: 
	                System.out.println("Invalid choice!");
	                
	        }  
	      }while (cont);
	       
	    }
}
