package com.example.codingpractice.etc;

public class Account {

    private String name;
    private int deposit;
    private int maxLoan;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public void setMaxLoan(int maxLoan) {
        this.maxLoan = maxLoan;
    }

    public int getDeposit() {
        return deposit;
    }

    public int getMaxLoan() {
        return maxLoan;
    }

    public Account(String name, int deposit, int maxLoan) {
        this.name = name;
        this.deposit = deposit;
        this.maxLoan = maxLoan;
    }
}
