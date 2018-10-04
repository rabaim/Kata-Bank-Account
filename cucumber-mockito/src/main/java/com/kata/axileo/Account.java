package com.kata.axileo;

import java.util.Date;

public final class Account {

	private final Statement statement = new Statement();
	

	
	
	public Account() {
		// TODO Auto-generated constructor stub
	}

	public void deposit(final double amount, final Date date) {
        this.statement.addTransaction(new Transaction(amount, date));
      
    }

	public void withdraw(final double amount, final Date date) {
        this.statement.addTransaction(new Transaction(amount, date));
         
    }
	

	/**
	 * @return the statement
	 */
	public Statement getStatement() {
		return statement;
	}

	
	public void printStatement() {
		this.statement.printStatement();
	}
}
