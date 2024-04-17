package org.example;

import java.time.LocalDate;

public class CardAccount extends BankAccount{
    CardAccount(double bank) {
        super(bank);
    }

    @Override
    public double debit(int decrease) throws Exception{
        if((this.bank >= decrease + (0.01 * decrease)) && decrease >= 0){
            this.bank = this.bank - (decrease + (0.01 * decrease));
        }else if(decrease < 0){
            throw new Exception("***Cannot decrease a negative number of money");
        }else{
            throw new Exception("***Not enough money have");
        }
        return (this.bank);
    }

    @Override
    public void topUp(int addition, LocalDate lastIncome) throws Exception {
    }
}
