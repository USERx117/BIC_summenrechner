package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummenrechnerTest {

    @Test
    public static void checkAdd() {
        //Arrange
        Summenrechner rechner = new Summenrechner();

        //Act
        long summe = rechner.add(2,2);

        //Assert
        assertEquals(4,summe);

    }
}