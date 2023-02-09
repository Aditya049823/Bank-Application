import java.util.UUID;

public class SBIAccount implements BankInterface {
    private String name;
    private String accountno;
    private int balance;
    private String password;
    private double interest;

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.interest=9.4;
        this.accountno=String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public int getBalance() {
        return balance;
    }


    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        return "The updated balance is"+getBalance();
    }


    @Override
    public String withdraw(int amt ,String enteredPass) {
        System.out.println("Please Enter Your Password");
        if (this.password.equals(enteredPass)) {
            if (balance < amt || amt<0) {
                return "Insufficient Balance";
            } else {
                this.balance -= amt;
                return "Money Deducted";
            }
        } else {
            return "Incorrect Password";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*interest*time)/100;
    }
}

