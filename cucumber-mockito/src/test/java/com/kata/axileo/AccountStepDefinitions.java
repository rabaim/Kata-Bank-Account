package com.kata.axileo;

import static org.mockito.Matchers.startsWith;
import static org.mockito.Mockito.verify;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountStepDefinitions {

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	// PrintStream printer = Mockito.spy(PrintStream.class);

	private Transaction transaction;
	private Account account = new Account();
	private Statement statement = new Statement();

	@Given("^I make a deposit of (\\d+) on \"(.*?)\"$")
	public void i_make_a_deposit_of_on(double deposit, Date date) throws Throwable {
		// Write code here that turns the phrase above into concrete actions

		deposit = 100;
		date = sdf.parse("06/09/2018");

		transaction = new Transaction(100, date);

		statement.addTransaction(transaction);
		account.deposit(deposit, date);
		// throw new PendingException();
	}

	@Given("^a deposit of (\\d+) on \"(.*?)\"$")
	public void a_deposit_of_on(double deposit, Date date) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		date = sdf.parse("07/09/2018");
		deposit = 200;
		transaction = new Transaction(deposit, date);

		statement.addTransaction(transaction);

		account.deposit(deposit, date);
		// throw new PendingException();
	}

	@Given("^a withdrawal of (\\d+) on \"(.*?)\"$")
	public void a_withdrawal_of_on(double withdraw, Date date) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		date = sdf.parse("10/09/2018");
		withdraw = -50;
		transaction = new Transaction(withdraw, date);

		statement.addTransaction(transaction);
		account.withdraw(withdraw, date);
		// throw new PendingException();
	}

	@When("^I print my bank statement$")
	public void i_print_my_bank_statement() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		statement = account.getStatement();

		// throw new PendingException();

	}

	@Then("^I should see my history$")
	public void i_should_see_my_history() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		statement = account.getStatement();
		PrintStream out = Mockito.mock(PrintStream.class);
		System.setOut(out);
		
		StatementPrinter sb = new StatementPrinter();

		System.out.println(sb.printStatement(statement));
		verify(out).println(
			startsWith("operation    ||date                          ||amount                 ||balance      "));

		
		

		// throw new PendingException();

	}

}