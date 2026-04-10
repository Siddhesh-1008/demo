package com.mycompany.bank;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testDeposit() {
        Account a = new Account("A001", "Tom", 1000);
        a.deposit(500);
        assertEquals(1500, a.getBalance(), 0);
    }

    @Test
    public void testWithdraw() {
        Account a = new Account("A001", "Tom", 1000);
        a.withdraw(400);
        assertEquals(600, a.getBalance(), 0);
    }

    @Test
    public void testInsufficientFunds() {
        Account a = new Account("A001", "Tom", 500);
        a.withdraw(1000);
        assertEquals(500, a.getBalance(), 0); // balance unchanged
    }

    @Test
    public void testInterest() {
        SavingsAccount sa = new SavingsAccount("SA001", "Alice", 1000, 10);
        sa.applyInterest();
        assertEquals(1100, sa.getBalance(), 0);
    }

    @Test
    public void testOverdraft() {
        CurrentAccount ca = new CurrentAccount("CA001", "Bob", 1000, 500);
        ca.withdraw(1400);
        assertEquals(-400, ca.getBalance(), 0);
    }
}