import java.io.*;
import java.util.ArrayList;

public class Customer 
{
    private String name;
    private String address;
    private String email;
    private String phone;
    private ArrayList <Account> accounts;

    public Customer(String name, String address, String email, String phone)
    {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;

        accounts = new ArrayList<Account>();
    }
    
    public Customer()
    {
    }

    public void addAcount(Account newAccount)
    {
      accounts.add(newAccount);
    }

    public void printCustomerInfo()
    {
    System.out.println(" Information about a customer");
    System.out.println(" Name                - " + name);
    System.out.println(" address             - " + address);
    System.out.println(" email               - " + email);
    System.out.println(" phone #             - " + phone);
    if(accounts != null){
    	printAllAcounts(); 
    }
    else{
        System.out.println("The customer has no accounts");
    }
      
    }

    public void printAllAcounts()
    {
        for(int i=0; i < accounts.size(); i++)
        {
            Account account = accounts.get(i);
            account.printInfo();
    	    System.out.println("InterestsRate on the account is " + account.getAccountType().getInterestRate());
        }
    }

    public double totalBalance()
    {
        double totalBalance = 0;
        for(Account account : accounts)
        {          
           totalBalance = totalBalance + account.getBalance();
        }
 //       System.out.println("Total balance in all accounts = " + totalBalance);
        		return totalBalance;
    }
    
//    public boolean totalBalance(double balance)
//    {
//        double totalBalance = 0;
//        boolean ok = true;
//        int index = 0;
//        while(index < myBankAcounts.size())
//        {
//            BankAcount account = myBankAcounts.get(index);
//            totalBalance = totalBalance + account.getBalance();
//            index++;
//         }//end while
//         if(totalBalance < balance)
//         {
//             ok = false;
//         }
//         return ok;
//     }

    public boolean hasBalance(double totalBalance)
    {
        boolean ok = true;
        totalBalance = totalBalance();

         if(totalBalance <= 0)
         {
             ok = false;
         }
         return ok;
     }
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}

