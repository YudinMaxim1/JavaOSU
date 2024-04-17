package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class DepositAccountTest {

    @Test
    void topUp() throws Exception {
        DepositAccount depositAccount = new DepositAccount(100, LocalDate.of(2024, 1, 13));
        Assertions.assertEquals(200, depositAccount.topUp(100));
    }

    @Test
    void debit() throws Exception {
        DepositAccount depositAccount = new DepositAccount(200, LocalDate.of(2024, 1, 13));
        Assertions.assertEquals(100, depositAccount.debit(100));
    }
}