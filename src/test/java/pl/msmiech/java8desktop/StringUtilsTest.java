package pl.msmiech.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void toDouble() {
        String inputData = "1,12";

        assertEquals(1.12, StringUtils.toDouble(inputData));
    }
}