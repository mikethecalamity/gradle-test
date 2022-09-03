package com.acme;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void test() {
        Assertions.assertEquals("Bartholomew", Simpsons.bart().getFirstName());
    }

}
