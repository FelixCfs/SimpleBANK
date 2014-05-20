public class AccountType
{
	private String type;
	private double interestRate;
//	private double yearsIntRate;

   public AccountType(String type, double interestRate)
	{
		this.type = type;
		this.interestRate = interestRate;
	}
   public String getType()
   {
   return type;
   }
   public double getInterestRate()
   {
   return interestRate;
   }
   
   public void setInterestRate(double newInterestRate)
   {
       interestRate = newInterestRate;
    }
}







