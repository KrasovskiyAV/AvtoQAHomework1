package ru.netology;

//import org.junit.Assert;
//import org.junit.Test;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();
//Тесты на движке junit4:
    @org.junit.Test
    public void testRemainIfAmountLessBorderBoundaryJunit4() {
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void testRemainIfAmountAboveBorderBoundaryJunit4() {
        org.junit.Assert.assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void testRemainIfAmountLessBoundaryJunit4() {
        org.junit.Assert.assertEquals(440, service.remain(560));
    }

    @org.junit.Test
    public void testRemainIfAmountAboveBoundaryJunit4() {
        org.junit.Assert.assertEquals(311, service.remain(1689));
    }

    @org.junit.Test
    public void testRemainIfAmountEqualBoundaryJunit4() {
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void testRemainIfAmountMultipleBoundaryJunit4() {
        org.junit.Assert.assertEquals(0, service.remain(5000));
    }

    @org.junit.Test
    public void testRemainIfAmountZeroBoundaryJunit4() { // баг - покупка на 0
        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void testRemainIfAmountNegativeBoundaryJunit4() { // баг - покупка на отрицательное
        org.junit.Assert.assertEquals(1100, service.remain(-100));
    }

    @org.junit.Test
    public void testRemainIfAmountOneJunit4() {
        org.junit.Assert.assertEquals(999, service.remain(1));
    }

//Тесты на движке junit5:
    @org.junit.jupiter.api.Test
    public void testRemainIfAmountLessBorderBoundaryJunit5() {
        org.junit.jupiter.api.Assertions.assertEquals(1, service.remain(999));
}

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountAboveBorderBoundaryJunit5() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1001));
    }

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountLessBoundaryJunit5() {
        org.junit.jupiter.api.Assertions.assertEquals(440, service.remain(560));
    }

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountAboveBoundaryJunit5() {
        org.junit.jupiter.api.Assertions.assertEquals(311, service.remain(1689));
    }

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountEqualBoundaryJunit5() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(1000));
    }

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountMultipleBoundaryJunit5() {
        org.junit.jupiter.api.Assertions.assertEquals(0, service.remain(5000));
    }

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountZeroBoundaryJunit5() { // баг - покупка на 0
        org.junit.jupiter.api.Assertions.assertEquals(1000, service.remain(0));
    }

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountNegativeBoundaryJunit5() { // баг - покупка на отрицательное
        org.junit.jupiter.api.Assertions.assertEquals(1100, service.remain(-100));
    }

    @org.junit.jupiter.api.Test
    public void testRemainIfAmountOneJunit5() {
        org.junit.jupiter.api.Assertions.assertEquals(999, service.remain(1));
    }
}