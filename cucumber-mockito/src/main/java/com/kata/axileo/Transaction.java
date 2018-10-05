package com.kata.axileo;

import java.util.Date;

public final class Transaction {

	private final double amount;
	private Date date;
	private TrasactionType operation;

	/**
	 * @param amount
	 * @param date 
	 */
	public Transaction(double amount, Date date) {
		super();
		this.amount = amount;
		this.date = date;
		this.operation = (amount >= 0) ? TrasactionType.DEPOSIT : TrasactionType.WITHDRAWAL;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the operation
	 */
	public TrasactionType getOperation() {
		return operation;
	}

	/**
	 * @param operation the operation to set
	 */
	public void setOperation(TrasactionType operation) {
		this.operation = operation;
	}

	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}

}
