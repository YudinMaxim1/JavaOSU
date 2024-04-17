package org.example;

import org.junit.jupiter.api.Assertions;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void topUp() throws Exception {
        BankAccount bankAccount = new BankAccount(100) {
            @Override
            public void topUp(int addition, LocalDate lastIncome){
            }
        };

        Assertions.assertEquals(200, bankAccount.topUp(100));
    }

    @org.junit.jupiter.api.Test
    void debit() throws Exception {
        BankAccount bankAccount = new BankAccount(1000) {
            @Override
            public void topUp(int addition, LocalDate lastIncome) throws Exception {
            }
        };

        Assertions.assertEquals(900, bankAccount.debit(100));
    }

}