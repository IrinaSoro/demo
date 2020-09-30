package org.example.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.Assertions.*;

class XxxTest {
//
//    @BeforeEach
//    void setUp() {
//        System.out.println("BeforeEach");
//    }
//
//    @AfterEach
//    void tearDown() {
//        System.out.println("AfterEach");
//    }

    @Test
    void sum() {
        Xxx xxx = new Xxx();
        Assertions.assertEquals(4, xxx.sum(2, 2));

    }

    @Test
    void sum2() {
        Xxx xxx = new Xxx();

        Assertions.assertEquals(3, xxx.sum(2, 2), "Failed");
    }
}