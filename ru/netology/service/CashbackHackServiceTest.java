package ru.netology.service;

junit4
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerServiceTest4 {


    @Test
    public void shouldCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }
    
    @Test
    public void shouldThousandCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void shouldZeroCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinusCashbackHackerServiceTest() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = -1;
        int actual = service.remain(amount);
        int expected = 1001;
        Assert.assertEquals(expected, actual);
    }
}
