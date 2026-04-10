/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bank;

/**
 *
 * @author Siddhesh
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println("===== Banking System =====");

        SavingsAccount sa = new SavingsAccount("SA001", "Alice", 5000, 5);
        System.out.println("\n-- Savings Account --");
        sa.deposit(1000);
        sa.withdraw(500);
        sa.applyInterest();

        CurrentAccount ca = new CurrentAccount("CA001", "Bob", 2000, 1000);
        System.out.println("\n-- Current Account --");
        ca.deposit(500);
        ca.withdraw(3000);  // uses overdraft
        ca.withdraw(9999);  // exceeds limit

        System.out.println("\n===== Done =====");
    }
}
