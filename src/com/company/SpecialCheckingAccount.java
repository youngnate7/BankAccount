package com.company;

public class SpecialCheckingAccount extends CheckingAccount {
    double minimumBalance;
    double interestRate;
    public SpecialCheckingAccount(int idNumber, double startBal, double cc, double m, double i) {
        super(idNumber, startBal, cc);
        minimumBalance = m;
        interestRate = i;
    }
}
