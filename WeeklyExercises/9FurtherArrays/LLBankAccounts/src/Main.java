
public class Main {

	public static void main(String[] args) 
	{
		Customer[] customerList;
		customerList = new Customer[30];
		customerList [0] = new Customer("William", "08383243123");
		customerList [1] = new Customer("Benjamin", "08876243123");
		customerList [2] = new Customer("Duncan", "08312345623");
		
		System.out.println(customerList[2].deposit(500));
		System.out.println(customerList[2].toString());
		System.out.println(customerList[2].addInterest());
		System.out.println(customerList[2].toString());	
		System.out.println(customerList[2].withdraw(400));
		System.out.println(customerList[2].toString());
		
		System.out.println(customerList[0].deposit(800));
		System.out.println(customerList[0].toString());
		System.out.println(customerList[0].addInterest());
		System.out.println(customerList[0].toString());	
		System.out.println(customerList[0].withdraw(1000));
		System.out.println(customerList[0].toString());

		
	}

}
