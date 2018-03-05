package TPAssignment3.co.za;

/**
 * Created by thabomoopa on 2017/03/24.
 */
public class AtmMachineImpl implements AtmMachineInterface {

    @Override
    public double deposit(double balance, int amount)
    {
        return balance + amount;
    }

    @Override
    public double withdrawal(double balance, int amount)
    {
        return balance = balance - amount;
    }
    @Override
    public double checkBalance(double balance)
    {
        return balance;
    }
    @Override
    public double purchasePrepaid(double balance, int amount)
    {

       return balance - amount;
    }
    @Override
    public double transfer(double balance, int amount)
    {
        return balance - amount;
    }
}
