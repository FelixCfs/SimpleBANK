import java.util.ArrayList;

public class Bank
{
	private ArrayList<Customer> customers;

	public Bank()
	{
		customers = new ArrayList<Customer>();
	}
	
	public void addCustomer(Customer newCustomer)
	{
	    customers.add(newCustomer);
	}
	public void printBank()
	{
		for(Customer customer : customers)
	    {
	        customer.printCustomerInfo();
	    }
	}
	
	public void deleteCustomer(double balance)
	{
	        int index = 0;
	        while(index < customers.size())
		    {
	        Customer customer = customers.get(index);
	        if(!customer.hasBalance(balance))
	        { 
	            customers.remove(index);
	            System.out.println(customer.getName() + " is deleted");
	        }
	        else{
		           index++;
		       }
	   }   
	}
}
