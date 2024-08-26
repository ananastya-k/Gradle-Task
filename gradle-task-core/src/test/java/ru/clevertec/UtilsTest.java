package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    @Test
    public void testMain() {

        assertAll(
                "Grouped Assertions for .isAllPositiveNumber()",
                () -> assertTrue(Utils.isAllPositiveNumbers("2.7", "18", "28.18")),
                () -> assertFalse(Utils.isAllPositiveNumbers("28.4", "-59", "04")),
                () -> assertFalse(Utils.isAllPositiveNumbers())
        );
    }
}