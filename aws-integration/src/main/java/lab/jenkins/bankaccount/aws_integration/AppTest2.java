package lab.jenkins.bankaccount.aws_integration;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest2 
{

    @Test
    public void testDebitWithSufficientFund(){
    	System.out.println("Test 2 is executed by JaCoCo");
    	BankAccount bankAccount = new BankAccount(10);
    	double amount = bankAccount.debit(5);
    	Assert.assertEquals(amount, 5.0, 0);
    }
}
