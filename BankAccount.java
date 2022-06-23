import java.util.Scanner;
public class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	Scanner in = new Scanner(System.in);
	
	
	public BankAccount(int number, double initialBalance){
		accountNumber = number;
		number = in.nextInt();
		balance = initialBalance;
		initialBalance = in.nextDouble();
		}
	
	public void deposit(double a) {
		double newBalance=balance+a;
		balance=newBalance;
		}
	
	public void withdraw(double a){
		double newBalance = balance-a;
		balance= newBalance;
		}
	
	public double getBalance(){
		return balance;
		}
	
	public double getAccountNumber(){
		return accountNumber;
		}
	}

