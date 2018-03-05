package TPAssignment3.co.za;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by thabomoopa on 2017/03/24.
 */
public class AtmMachineTest extends TestCase {
    private AtmMachineInterface atm;

    @BeforeMethod
    public void setUp() throws Exception{
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        atm = (AtmMachineInterface)ctx.getBean("ATM");

    }
    @AfterMethod
            public void tearDown() throws Exception{

    }
    @Test
    public void testDepositAtm() throws Exception
    {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.deposit(balance, 4000);
        assertTrue(balance<amount);

    }

    @Test
    public void testDeposit()
    {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.deposit(balance, 4000);
        assertTrue(balance<amount);
    }
    @Test
    public void testWithdrawalAtm() throws Exception {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.withdrawal(balance, 300);
        assertEquals(balance, amount);
    }

    @Test
    public void testWithdrawal()
    {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.withdrawal(balance, 300);
        assertEquals(balance, amount);

    }
    @Test
    public void testPurchasePrepaidAtm() throws Exception{
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.purchasePrepaid(balance, 35);
        assertTrue(balance>amount);
    }
    @Test
    public void testPurchasePrepaid()
    {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.purchasePrepaid(balance, 35);
        assertTrue(balance>amount);
    }
    @Test
    public void testTransferAtm() throws Exception {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.transfer(balance, 7000);
        assertTrue(balance> amount);
    }
    @Test
    public void testTransfer()
    {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        double amount = machine.transfer(balance, 7000);
        assertTrue(balance> amount);
    }
    @Test
    public void testCheckBalanceAtm() throws Exception {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        assertNotNull(balance);
    }
    @Test
    public void testCheckBalance()
    {
        AtmMachineInterface machine = new AtmMachineImpl();
        double balance = machine.checkBalance(1000);
        assertNotNull(balance);
    }
}
