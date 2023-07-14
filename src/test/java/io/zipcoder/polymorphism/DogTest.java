package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest extends TestCase {

    @Test
    public void speakTest() {
//        Given
        Dog d = new Dog();
        String expected = "Woof!";

//        When
        String actual = d.speak();
//        Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetName() {
//        Given
       Dog d = new Dog();
        String expected = "Fido";
//        When
        String actual = d.getName();
//        Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetName() {
//        Given
        Dog d = new Dog();
        String expected = "Whiskers";
//        When
        d.setName(expected);
        String actual = d.getName();
//        Then
        Assert.assertEquals(expected, actual);
    }
}