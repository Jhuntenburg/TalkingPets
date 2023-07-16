package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class PigTest extends TestCase {

    public void testSpeak() {
//        Given
        Pig p = new Pig();
        String expected = "oink!";

//        When
        String actual = p.speak();
//        Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testGetName(){
        Pig p = new Pig();
        String expected = "Oinks";
//        When
        String actual =p.getName();
//        then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetName(){
        Pig p = new Pig();
        String expected = "truffle";
//        when
        p.setName(expected);
        String actual = p.getName();
//        then
        Assert.assertEquals(expected,actual);
    }

}