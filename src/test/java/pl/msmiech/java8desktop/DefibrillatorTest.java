package pl.msmiech.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefibrillatorTest {

    @Test
    void createDefibrillator() {

        String defibString = "1;Defib1;Address1;;2,2;22,4";
        Defibrillator defibril = Defibrillator.createDefibrillator(defibString);
        assertTrue(defibril.getNumber() == 1);
        assertTrue(defibril.getName().equals("Defib1"));
        assertTrue(defibril.getAddress().equals("Address1"));
        assertTrue(defibril.getPhoneNumber().equals(""));
        assertTrue(defibril.getLocation().equals(new Point(2.2,22.4)));


    }
}