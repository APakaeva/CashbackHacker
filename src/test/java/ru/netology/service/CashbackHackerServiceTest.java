package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldThousandCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);

    }
    @Test
    public void shouldZeroCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);

    }

    @Test
    public void shouldMinusCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;
        assertEquals(actual, expected);

    }
}