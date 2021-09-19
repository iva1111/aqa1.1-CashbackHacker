package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void shouldAddAmountUp1000 () {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturn10IfAmountIs2000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;
        int expected = 10;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateBonusFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual, expected);
    }
}