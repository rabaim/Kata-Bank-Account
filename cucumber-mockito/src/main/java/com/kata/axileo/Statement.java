package com.kata.axileo;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public final class Statement {

	private final List<StatementItem> statementItems = new ArrayList<StatementItem>();

	/**
	 * 
	 */
	public Statement() {
		super();

	}

	/**
	 * addTransaction.
	 *
	 * @param transaction
	 */
	public void addTransaction(final Transaction transaction) {
		this.statementItems.add(new StatementItem(transaction, this.getBalance() + transaction.getAmount()));
	}

	public double getBalance() {
		return this.statementItems.isEmpty() ? 0 : this.statementItems.get(this.statementItems.size() - 1).getBalance();

	}

	public void printStatement() {
		StatementPrinter statementPrinter = new StatementPrinter();
		statementPrinter.printStatement(this);
	}

	public void printTo(PrintStream printer) {

		StatementPrinter statementPrinter = new StatementPrinter();
		printer.print(statementPrinter.printStatement(this));
	}

	/**
	 * @return the statementItems
	 */
	public List<StatementItem> getStatementItems() {
		return statementItems;
	}

}
