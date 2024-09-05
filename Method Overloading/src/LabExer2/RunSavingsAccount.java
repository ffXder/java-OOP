package LabExer2;

import java.util.Scanner;

public class RunSavingsAccount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.println("==== Welcome to SAVINGS ACCOUNT ====");
        System.out.print("Enter interest rate: ");
        savings.setInterestRate(input.nextDouble());

        System.out.print("Enter deposit amount: ");
        savings.deposit(input.nextDouble());

        SavingsAccount.showBalance(savings);

        while (true) {
            System.out.print("\nPress D for another  deposit or W to withdraw: ");
            String choice = input.next();

            if (choice.equalsIgnoreCase("D")) {
                System.out.print("Enter deposit amount: ");
                savings.deposit(input.nextDouble());

                if (savings.getBalance() > 1000) {
                    savings.addInterest();
                    System.out.println("Your new balance is " + savings.getBalance());
                } else {
                    System.out.println("Your balance is " + savings.getBalance());
                }
            } else if (choice.equalsIgnoreCase("W")) {
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = savings.withdraw(input.nextDouble());

                System.out.println("You have successfully withdrawn!");
                savings.showBalance(savings);

            } else {
                System.out.println("Invalid Choice! Please select the proper operation!");
            }

        }

    }
}