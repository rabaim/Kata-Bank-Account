package com.kata.axileo;

public class StatementPrinter {

	/**
	 * 
	 */
	public StatementPrinter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static final String STATEMENT_HEADER = "operation    ||date                          ||amount                 ||balance      ";

	public String printStatement(Statement statement) {

		StringBuilder sb = new StringBuilder();
		sb.append(STATEMENT_HEADER);
		sb.append("\n");
		for (final StatementItem statementItem : statement.getStatementItems()) {
			sb.append(statementItem.getTransaction().getOperation()).append(" ");

			sb.append(statementItem.getTransaction().getDate()).append(" ");
			sb.append(statementItem.getTransaction().getAmount()).append(" ");
			sb.append(statementItem.getBalance()).append(" ");
			
			sb.append("\n");
		}
		return sb.toString();
	}

}
