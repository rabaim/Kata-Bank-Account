package com.kata.axileo;

import static org.assertj.core.api.Assertions.assertThat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.kata.axileo.Account;

public final class AccountTest {

	private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Account account;
	 
	 @Before
	 public void initialize() {
		 account = new Account();
	    }
	 
	 
	 @Test
	public void depositAccount() throws ParseException {
		final double deposit = 100;
		final double withdraw = -30;
		Date date = sdf.parse("01/10/2018");
		
		account.deposit(deposit, date);
		
		account.withdraw(withdraw, date);
		
		assertThat(account).isNotNull();
		assertThat(account.getStatement().getBalance()).isEqualTo(70);

	}


}
