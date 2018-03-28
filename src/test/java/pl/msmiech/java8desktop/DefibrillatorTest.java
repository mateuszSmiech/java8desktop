package pl.msmiech.java8desktop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefibrillatorTest {

    @Test
    void createDefibrillator() {
        Defibrillator defib = new Defibrillator();
        defib.setNumber(1);
        defib.setName("Defib1");
        defib.setAddress("Address1");
        defib.setPhoneNumber("");
        defib.setLocation(new Point(1,2));
        //System.out.println(defib.toString());

        assertEquals("Defibrillator: number=1, name=Defib1, address=Address1, phoneNumber=, location=1.0/2.0", defib.toString());

    }
}