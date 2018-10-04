package com.kata.axileo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.kata.axileo.Transaction;

public class TransactionTest {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Test
	public void depositTransaction() throws ParseException {
		final double deposit =200;
		final Date date =sdf.parse("01/10/2018");
		Transaction transaction = new Transaction(deposit, (date));
		assertThat(transaction).isNotNull();
		assertThat(transaction.getAmount()).isEqualTo(deposit);
		assertThat(transaction.getDate()).isEqualTo(date);
		assertEquals(TrasactionType.DEPOSIT, transaction.getOperation());
	}
	
	@Test
	public void withdrawTransaction() throws ParseException {
		final double withdraw = -200;
		final Date date =sdf.parse("01/10/2018");
		Transaction transaction = new Transaction(withdraw, (date));
		assertThat(transaction).isNotNull();
		assertThat(transaction.getAmount()).isEqualTo(withdraw);
		assertThat(transaction.getDate()).isEqualTo(date);
		assertEquals(TrasactionType.WITHDRAWAL, transaction.getOperation());
	}

}
