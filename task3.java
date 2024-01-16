import java.util.*;
public class task3 {

    public static class BankAccount{
        static String name;
        static int account_no;
        static float balance;

        Scanner sc = new Scanner(System.in);
        BankAccount(){
            System.out.println("Enter the name of Account Holder : ");
            name = sc.next();

            System.out.println("Enter the account number : ");
            account_no = sc.nextInt();

            System.out.println("Enter the current Balance : ");
            balance = sc.nextFloat();
        }
    }
    public static class ATM extends BankAccount {

        public void withdraw(float amount) {
            if(amount > balance) {
                System.out.println("You dont have enought balance in your account...");
            } else {
                balance -= amount;
                System.out.println("Amount withdrawn successfully!!");
            }
        }

        public void deposit(float amount) {
            balance += amount;
            System.out.println("Amount deposited successfully!!");
        } 

        public void checkBalance() {
            System.out.println("The Balance in your account is : " + balance);
        }
    }
    public static void main(String args[]) {
        BankAccount b;
        ATM atm = new ATM();

        int choice;
        Scanner sc = new Scanner(System.in);
        char ch = 'a';

        while(ch != 'e') {

            System.out.println("Please Select the below option\n1.Deposit\n2.Withdraw\n3.Display\n4.Exit");
            choice = sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Enter the amount to deposit : ");
                float deposit_amount = sc.nextFloat();
                atm.deposit(deposit_amount);
                break;

            case 2:
                System.out.println("Enter the amount to withdraw : ");
                float withdraw_amount = sc.nextFloat();
                atm.withdraw(withdraw_amount);
                break; 

            case 3:
                atm.checkBalance();
                break;

            case 4:
                ch = 'e';
                break;
        }
    }

    System.out.println("Thank you for using our ATM !");
    
        
    }   
}
