package org.example;

import java.time.LocalDate;

public abstract class BankAccount {
    double bank;
    BankAccount(double bank){
        this.bank = bank;
    }

    public void accountCheck(){
        System.out.println("Your bank account have: " + (int)(this.bank) + " *abstract currency*");
    }

    public double topUp (int addition) throws Exception{
        if(addition >= 0){
            this.bank = this.bank + addition;
        }else{
            throw new Exception("***Cannot top up a negative number of money");
        }
        return (this.bank);
    }

    public double debit(int decrease) throws Exception {
        if ((this.bank >= decrease) && decrease >= 0) {
            this.bank = this.bank - decrease;
        }else if(decrease < 0){
            throw new Exception("***Cannot decrease a negative number of money");
        }else{
            throw new Exception("***Not enough money have");
        }
        return (this.bank);
    }

    public abstract void topUp (int addition, LocalDate lastIncome) throws Exception;
}
