package org.example;

import java.time.LocalDate;

public class DepositAccount extends BankAccount{
    LocalDate lastIncome;
    DepositAccount(double bank, LocalDate lastIncome) {
        super(bank);
        this.lastIncome = lastIncome;
    }

    @Override
    public void accountCheck(){
        System.out.println("Your bank account have: " + (int)(this.bank) + " *abstract currency*" + "\nLast income was: " + this.lastIncome);
    }

    @Override
    public void topUp (int addition, LocalDate lastIncome) throws Exception{

        if(this.lastIncome.getMonthValue() != lastIncome.getMonthValue()){
            if(addition > 0){
                this.bank = this.bank + addition;
                this.lastIncome = LocalDate.now();
            }else if(addition == 0){
                this.bank = this.bank + addition;
            }else{
                throw new Exception("***Cannot top up a negative number of money");
            }
        }else{
            throw new Exception("***Cannot top up until next month");
        }
    }
}
