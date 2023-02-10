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
        System.out.println("Your account with SBI has been created with account number"+myAcc.getAccountno());

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

        System.out.println("Your ROI for SBI will be"+myAcc.calculateInterest(3));


        HDFC newACC= new HDFC(name,amount,password);
        System.out.println("Your account with HDFC is created with account number"+newACC.getAccountNo());

        System.out.println("Account balance is "+newACC.getBalance());

        //deposit with hdfc
        System.out.println(newACC.depositMoney(5000));
        System.out.println("The updated balance for HDFC is"+newACC.getBalance());

        //withdraw
        System.out.println("Enter the amount to be withdrawn");
        int val2=sc.nextInt();
        System.out.println("Enter your password");
        String ip=sc.next();
        System.out.println(newACC.withdraw(val2,ip));
        System.out.println("The current balance is"+newACC.getBalance());

        System.out.println("The ROI for HDFC is"+newACC.calculateInterest(3));
    }
}