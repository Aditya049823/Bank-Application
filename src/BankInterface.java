public interface BankInterface {
    int getBalance();

    void setPassword(String password);

    String depositMoney(int amount);
    String withdraw(int amt,String enteredPass);
    double calculateInterest(int time);

}
