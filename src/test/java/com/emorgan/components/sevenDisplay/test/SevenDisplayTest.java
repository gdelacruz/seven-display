package com.emorgan.components.sevenDisplay.test;

import com.emorgan.components.sevenDisplay.SevenDisplay;
import com.emorgan.components.sevenDisplay.model.Result;
import org.junit.Assert;
import org.junit.Test;

public class SevenDisplayTest {

    @Test
    public void testNumber(){
        SevenDisplay sd = new SevenDisplay();
        Result r = sd.construct(1234567890);

        Assert.assertEquals("   _  _       _   _  _   _   _   _  ", r.getLine1());
        Assert.assertEquals("|  _| _| |_| |_  |_   | |_| |_| | | ", r.getLine2());
        Assert.assertEquals("| |_  _|   |  _| |_|  | |_|  _| |_| ", r.getLine3());
    }

    @Test
    public void testZero(){
        SevenDisplay sd = new SevenDisplay();
        Result r = sd.construct(0);

        Assert.assertEquals(" _  ", r.getLine1());
        Assert.assertEquals("| | ", r.getLine2());
        Assert.assertEquals("|_| ", r.getLine3());
        Assert.assertEquals(" _  "+"\n"+"| | "+"\n"+"|_| ", r.toString());
    }

    @Test(expected = AssertionError.class)
    public void testNegative(){
        SevenDisplay sd = new SevenDisplay();
        Result r = sd.construct(-1234567890);
    }
}
