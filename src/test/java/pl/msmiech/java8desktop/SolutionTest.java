package pl.msmiech.java8desktop;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findNearest() {

        User user = new User(new Point(0,0));
        Defibrillator def1 = Defibrillator.createDefibrillator("1;a;b;c;0;20");
        Defibrillator def2 = Defibrillator.createDefibrillator("1;d;e;f;0;10");
        Defibrillator def3 = Defibrillator.createDefibrillator("1;g;h;i;0;30");
        List<Defibrillator> defList = new ArrayList<>();
        defList.add(def1);
        defList.add(def2);
        defList.add(def3);
        Defibrillator nearest = Solution.findNearest(user, defList);
        assertEquals(def2, nearest);
    }
}