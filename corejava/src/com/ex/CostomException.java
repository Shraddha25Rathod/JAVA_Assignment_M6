package com.ex;
class NoBalanceException extends Exception
{
	double amount;
	public NoBalanceException(double amount)
	{
		this.amount=amount;
	}
}
class ATM
{
	double balance;
	public void deposit(double amount)
	{
		balance+= amount;
		System.out.println(amount+"rs deposited...");
	}
	public void withrawal (double amount) throws NoBalanceException
	{
		if(amount<=balance)
		{
			balance -= amount;
			System.out.println(amount+"rs withdrawal successfully...");
		}
		else
		{
			double needs=amount - balance;
			throw new NoBalanceException(needs);
		}
	}
}
public class CostomException
{
	public static void main(String[] args) 
	{
		ATM a1=new ATM;
		
		Scanner sc=new Scanner(system)
	}
}
