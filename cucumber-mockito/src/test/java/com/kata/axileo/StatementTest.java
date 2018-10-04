package com.kata.axileo;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.kata.axileo.Statement;
import com.kata.axileo.Transaction;

public class StatementTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Test
	public void depositStatement() throws ParseException {

		final double amount = 200;
		final Date date = sdf.parse("01/10/2018");
		Transaction transaction = new Transaction(amount, date);

		final Statement statement = new Statement();
		statement.addTransaction(transaction);
		assertThat(statement).isNotNull();
		assertThat(statement.getBalance()).isEqualTo(amount);

	}
//	@Test
//	public void withdrawStatement() throws ParseException {
//
//		final double amount = 200;
//		final Date date = sdf.parse("01/10/2018");
//		Transaction transaction = new Transaction(amount, (date));
//
//		final Statement statement = new Statement(transaction);
//		assertThat(statement).isNotNull();
//		assertThat(statement.getTransaction().getAmount()).isEqualTo(amount);
//
//	}
}
