package ru.netology;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainIfAmountLessBorderBoundary() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void testRemainIfAmountAboveBorderBoundary() {
        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void testRemainIfAmountLessBoundary() {
        Assert.assertEquals(440, service.remain(560));
    }

    @Test
    public void testRemainIfAmountAboveBoundary() {
        Assert.assertEquals(311, service.remain(1689));
    }

    @Test
    public void testRemainIfAmountEqualBoundary() {
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemainIfAmountMultipleBoundary() {
        Assert.assertEquals(0, service.remain(5000));
    }

    @Test
    public void testRemainIfAmountZeroBoundary() { // баг - покупка на 0
        Assert.assertEquals(1000, service.remain(0));
    }

    @Test
    public void testRemainIfAmountNegativeBoundary() { // баг - покупка на отрицательное
        Assert.assertEquals(1100, service.remain(-100));
    }

    @Test
    public void testRemainIfAmountOne() {
        Assert.assertEquals(999, service.remain(1));
    }
}