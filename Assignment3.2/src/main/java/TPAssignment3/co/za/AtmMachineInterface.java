package TPAssignment3.co.za;

/**
 * Created by thabomoopa on 2017/03/24.
 */
public interface AtmMachineInterface {
    double deposit(double balance, int amount);
    double withdrawal(double balance, int amount);
    double checkBalance(double balance);
    double purchasePrepaid(double balance, int amount);
    double transfer(double balance, int amount);
}
