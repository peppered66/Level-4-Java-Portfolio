import java.util.Random;

public class Customer {
	private String name;
	private String phone;
	private int accountNumber;
	private double balance;
	Random number = new Random();
	
	public Customer(String eName, String ePhone)
	   {
	      name = eName;
	      phone = ePhone;
	      //assigning and forcing account number
	      //to be 6 digits long with random
	      accountNumber = 100000 + number.nextInt(900000);
	      //initialising balance to 0 when account is created
	      balance = 0;
	   }
	
	//allows customer to deposit money and returns balance on screen
	public double deposit (double amount)
	{
	    if (amount > 0)
	       balance = balance + amount;
	    return balance;
	 }
	
	//allows customer to withdraw money
	public double withdraw (double amount) {
	   
	     if (amount > 0 && amount < balance) {
	         balance = balance - amount;
			 System.out.println("Balance remaining: " + balance + ".");
			 }
		else 
		{
			System.out.println("Not enough balance to withdraw this amount. Please check balance and try again.");
	    }
		return balance;
	}
	//adds 3% interest to balance
	public double addInterest ()
	   {
	      balance += (balance * 0.03);
	      System.out.println("Interest added.");
	      return balance;
	   }
//returns basic information about customer
	public String toString()
	   {
	      String result = "Name: " + name + "\n";
	      result += "Phone: " + phone + "\n";
	      result += "Account: " + accountNumber + "\n";
	      result += "Balance: " + balance + "\n";
	      return result;
	   }
}

