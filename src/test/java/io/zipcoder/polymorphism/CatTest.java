package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest() {
//        Given
        String expected = "Meow";
        Cat c = new Cat();
//        When
        String actual = c.speak();
//        Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
//        Given
        Cat c = new Cat();
        String expected = "Boots";
//        When
        String actual = c.getName();
//        Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
//        Given
        Cat c = new Cat();
        String expected = "Whiskers";
//        When
        c.setName(expected);
        String actual = c.getName();
//        Then
        Assert.assertEquals(expected, actual);
    }
}