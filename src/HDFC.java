import java.util.UUID;

public class HDFC implements BankInterface {

    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double interest;

    public HDFC(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        this.accountNo=String.valueOf(UUID.randomUUID());
        this.interest=10.7;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String depositMoney(int amount) {

            this.balance+=amount;
            return "The updated balance is"+getBalance();
    }

    @Override
    public String withdraw(int amt, String enteredPass) {
        if(this.password.equals(enteredPass)) {
            if (amt < getBalance()) {
                this.balance -= amt;
                return "Balance after withdrawal is" + getBalance();
            } else {
                return "Insufficient Balance";
            }
        }
        else
        {
            return "Incorrect Password";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*interest*time)/100;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }
}
