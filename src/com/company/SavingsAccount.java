package com.company;

public class SavingsAccount extends Account {
    double annualInterest;
    public SavingsAccount(int idNumber, double startBal, double ai){
        super(idNumber, startBal);
        annualInterest = ai;
    }
    public void withdraw(double w){
        if(w <= currentBalance()){
            super.decreaseBalance(w);
        }
    }
    public double monthlyInterest(){
        
    }
}
