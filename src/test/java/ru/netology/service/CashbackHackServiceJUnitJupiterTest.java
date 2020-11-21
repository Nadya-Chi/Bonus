package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceJUnitJupiterTest {
    @Test
    public void purchaseForTheAmount2000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);
    }

    @Test
    public void purchaseForTheAmount1100() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1100;

        int actual = cashbackHackService.remain(amount);
        int expected = 900;

        assertEquals(actual,expected);
    }

    @Test
    public void purchaseForTheAmount900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }
}
