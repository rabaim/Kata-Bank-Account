package com.kata.axileo;

public class StatementItem {

	
	
	private final Transaction  transaction;
	private final double balance;
	
	/**
	 * @param transaction
	 * @param balance
	 */
	public StatementItem(Transaction transaction, double balance) {
		super();
		this.transaction = transaction;
		this.balance = balance;
	}

	
	/**
	 * @return the amount
	 */
	public double getBalance() {
		return balance;
	}
	

	/**
	 * @return the transaction
	 */
	public Transaction getTransaction() {
		return transaction;
	}

}
