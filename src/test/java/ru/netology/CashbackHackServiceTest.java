package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainIfAmountLessBorderBoundary() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void testRemainIfAmountAboveBorderBoundary() {
        Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void testRemainIfAmountLessBoundary() {
        Assert.assertEquals(service.remain(560), 440);
    }

    @Test
    public void testRemainIfAmountAboveBoundary() {
        Assert.assertEquals(service.remain(1689), 311);
    }

    @Test
    public void testRemainIfAmountEqualBoundary() {
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testRemainIfAmountMultipleBoundary() {
        Assert.assertEquals(service.remain(5000), 0);
    }

    @Test
    public void testRemainIfAmountZeroBoundary() { // баг - покупка на 0
        Assert.assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testRemainIfAmountNegativeBoundary() { // баг - покупка на отрицательное
        Assert.assertEquals(service.remain(-100), 1100);
    }

    @Test
    public void testRemainIfAmountOne() {
        Assert.assertEquals(service.remain(1), 999);
    }
}