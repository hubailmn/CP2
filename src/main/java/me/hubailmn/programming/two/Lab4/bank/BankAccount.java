package me.hubailmn.programming.two.Lab4.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.hubailmn.utils.CC;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {

    private String accountNumber;
    private String owner;
    private double balance;

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println(CC.colorize("A deposit of $" + amount + " has been successfully credited to your account.", CC.Color.BRIGHT_GREEN));
    }

    public void withdraw(double amount) {
        if ((getBalance() - amount) <= 0) {
            System.out.println(CC.colorize("Failed to withdraw $" + amount + ", you don't have enough credit in your account.", CC.Color.BRIGHT_RED));
            return;
        }

        setBalance(getBalance() - amount);
        System.out.println(CC.colorize("A withdrawal of $" + amount + " has been successfully debited from your account.", CC.Color.BRIGHT_RED));
    }

    @Override
    public String toString() {
        return String.format("""
                        %s
                        Account Number: %s
                        Owner Name   : %s
                        Balance      : %s$%.2f%s
                        """,
                CC.colorize("----- Account Summary -----", CC.Color.BRIGHT_CYAN),
                accountNumber,
                owner,
                CC.BRIGHT_GREEN,
                balance,
                CC.RESET
        );
    }
}
