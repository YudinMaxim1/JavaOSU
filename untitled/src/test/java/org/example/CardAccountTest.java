package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardAccountTest {

    @Test
    void debit() throws Exception {
        CardAccount cardAccount = new CardAccount(200);
        Assertions.assertEquals(99, cardAccount.debit(100));
    }

    @Test
    void topUp() throws Exception {
        CardAccount cardAccount = new CardAccount(200);
        Assertions.assertEquals(300, cardAccount.topUp(100));
    }
}