package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(expected,actual);
    }
}