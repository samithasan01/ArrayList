import java.util.*;
public class SearchAccounts {
	public static void main(String [] args) {
	ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	Scanner in = new Scanner(System.in);
	

	accounts.add(new BankAccount(1111, 500.00));
	accounts.add(new BankAccount(2222, 250.00));
	accounts.add(new BankAccount(3333, 125.00));
	accounts.add(new BankAccount(4444, 500.00));
	
	BankAccount x = new BankAccount(9999, 250.0);
	accounts.add(x);
	
	System.out.println("Enter Account number to search ");
	int search = in.nextInt();
	
	boolean found = false;
	for(int i =0; i<accounts.size(); i++) {
		if(accounts.get(i).getAccountNumber() == search) {
			System.out.println("Your balance is: " + accounts.get(i).getBalance());
			found = true;
		}
	}
	if(!found)
	{
		System.out.println("Account not found ");
	}
	
       in.close();
}
}
