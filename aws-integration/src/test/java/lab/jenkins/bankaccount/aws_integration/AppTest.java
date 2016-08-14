package lab.jenkins.bankaccount.aws_integration;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    @Test
    public void testDebitWithSufficientFund(){
    	BankAccount bankAccount = new BankAccount(10);
    	double amount = bankAccount.debit(5);
    	Assert.assertEquals(amount, 5.0, 0);
    }
}
