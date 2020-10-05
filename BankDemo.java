import java.util.Scanner;

public class BankDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Balance?");
        double balance = input.nextDouble();
        System.out.println("Making your new bank account.");

        // Initialize BankAccount Object

        BankAccount myAccount = new BankAccount(balance);

        int i = 0;

        while (i == 0){
            System.out.println("Would you like to 1) Deposit, 2) Withdraw, 3) Calculate Interest or 4)Quit?");
            int userChoice = input.nextInt();

            if(userChoice == 1){
                System.out.println("How much would you like to deposit?");
                double deposit = input.nextDouble();
                myAccount.deposit(deposit);
                System.out.println("Your new balance is: $" + myAccount.getBalance());
            }
            else if(userChoice == 2){
                System.out.println("How much would you like to withdraw?");
                double withdraw = input.nextDouble();
                myAccount.withdraw(withdraw);
                System.out.println("Your new balance is: $" + myAccount.getBalance());
            }
            else if(userChoice == 3){
                System.out.println("What is the interest rate?");
                double interestRate = input.nextDouble();
                System.out.println("Balance with interest: " + myAccount.calcInterest(interestRate));
            }
            else if(userChoice == 4){
                break;
            }
            else {
                System.out.println("Please input a value from 1-4");
            }
        }

    }
}
