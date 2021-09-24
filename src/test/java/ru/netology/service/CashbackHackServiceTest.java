package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

       /* @Test
        public void shouldReturn250IfAmountIs750() {
            CashbackHackService service = new CashbackHackService();
            int amount = 750;
            int expected = 250;
            int actual = service.remain(amount);
            assertEquals(actual, expected);
        }*/

        @Test
        public void shouldReturn0IfAmountIs1000 () {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int expected = 0;
            int actual = service.remain(amount);
            assertEquals(actual, expected);
        }
/*

        @Test
        public void shouldReturn1IfAmountIs999() {
            CashbackHackService service = new CashbackHackService();
            int amount = 999;
            int expected = 1;
            int actual = service.remain(amount);
            assertEquals(actual, expected);
        }
        @Test
        public void shouldReturn0IfAmountMore1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1010;
            int expected = 0;
            int actual = service.remain(amount);
            assertEquals(actual, expected);
        }
*/


}