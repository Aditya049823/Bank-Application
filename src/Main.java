import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner((System.in));
        System.out.println("Please Enter your Name");
        String name=sc.next();
        System.out.println("Please Enter your Password");
        String password=sc.next();
        System.out.println("Enter your intial amount");
        int amount=sc.nextInt();

        SBIAccount myAcc=new SBIAccount(name,amount,password);
        System.out.println("Your account has been created with account number"+myAcc.getAccountno());

        System.out.println("Your balance is"+myAcc.getBalance());

        //deposit money
        System.out.println(myAcc.depositMoney(1050));
        System.out.println("The new balance is"+myAcc.getBalance());

        //withdraw money
        System.out.println("Enter amount to be withdrawn");
        int val=sc.nextInt();
        System.out.println("Enter your password");
        String pass=sc.next();

        System.out.println(myAcc.withdraw(val,pass));
        System.out.println("Current balance is"+myAcc.getBalance());

        System.out.println("Your ROI will be"+myAcc.calculateInterest(3));


    }
}