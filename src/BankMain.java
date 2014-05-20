
public class BankMain {
	
	public static void main(String[] args){
		
		     AccountType accType1;
		     Account account1;
		     Customer customer1;
		     AccountType accType2;
		     Account account2;
		     Customer customer2;
		     Account account3;
		     Bank bank;
		    

		   
		        accType1 = new AccountType("Credit", 2);
		        account1 = new Account(accType1);
		        accType2 = new AccountType("Salary", 5);
		        account2 = new Account(accType2);
		        customer1 = new Customer("Alex", "NyVej 9, Aarhus", "alex@gmail.com", "45454545");
		        customer1.addAcount(account1);
		        customer1.addAcount(account2);
		        account2.deposit(500);
		        account1.deposit(300);
		        account1.deposit(700);
//		        System.out.println(" 1) Information about the customer1 and his two accounts ");
//		        customer1.printCustomerInfo(); 
//		        System.out.println();
		        
		        customer2 = new Customer("Per", "Marketsvej 5, Aarhus", "per@yahoo.com", "67676767");
		        account3 = new Account(accType1);
		        customer2.addAcount(account3);
		        account3.deposit(900);
		        accType1.setInterestRate(3);
//		        System.out.println(" 2) Information about the customer1 and his two accounts ");
//		        customer2.printCustomerInfo(); 
//		        System.out.println();
		        
		        
		        bank = new Bank();
		        bank.addCustomer(customer1);
		        bank.addCustomer(customer2);
		        System.out.println(" 3)  Information about customers of the bank ");
		        bank.printBank(); 
		        System.out.println();
		        
		        account3.withdraw(900);
		        bank.deleteCustomer(0) ;
		        System.out.println();
		        
		        System.out.println(" 4)  Information about customers of the bank after deletion of customers with a balance = 0"); 
		        bank.printBank();                   
		    }	   
	}


