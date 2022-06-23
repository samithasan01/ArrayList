import java.util.Scanner;
public class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	
	
	public BankAccount(int number, double initialBalance){
		accountNumber = number;

		balance = initialBalance;
		
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

