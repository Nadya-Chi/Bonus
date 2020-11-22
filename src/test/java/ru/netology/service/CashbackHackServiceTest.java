package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void shouldReturnZeroIfAmountIs2000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn900IfAmountIs1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(expected,actual);
    }

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(expected,actual);
    }

}