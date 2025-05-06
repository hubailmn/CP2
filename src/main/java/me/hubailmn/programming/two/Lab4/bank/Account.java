package me.hubailmn.programming.two.Lab4.bank;

import me.hubailmn.utils.CC;
import me.hubailmn.utils.Exercise;

@Exercise(
        name = "Bank Account Simulation (OOP)",
        description = "Demonstrates basic object-oriented programming principles by simulating a bank account system. " +
                "The program creates an instance of a bank account, sets its attributes (account number | owner | balance), " +
                "and performs typical operations such as deposit and withdrawal. " +
                "It displays the account state before and after the transactions."
)
public class Account {

    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();

        myAccount.setAccountNumber("SA100100010000");
        myAccount.setOwner("Mohammad");
        myAccount.setBalance(10000);

        System.out.println(myAccount);

        myAccount.deposit(1000);
        myAccount.withdraw(500);

        System.out.println("Account Balance: " + CC.BRIGHT_GREEN + myAccount.getBalance() + CC.RESET);

        System.out.println(myAccount);


    }
}
