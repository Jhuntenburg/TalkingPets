package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void petInheritanceTest(){
//        Given
        Pet cat = new Cat();
//        When
//        Then
        Assert.assertTrue(cat instanceof Pet);
    }

}
