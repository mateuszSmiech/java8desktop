package pl.msmiech.java8desktop;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String LON = in.next();
        String LAT = in.next();

        User user = new User(new Point(StringUtils.toDouble(LON), StringUtils.toDouble(LAT)));

        int N = in.nextInt();

        if (in.hasNextLine()) {
            in.nextLine();
        }

        List<Defibrillator> defibrillators = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String DEFIB = in.nextLine();
            Defibrillator defibrillator = Defibrillator.createDefibrillator(DEFIB);
            defibrillators.add(defibrillator);
        }
        Defibrillator nearest = findNearest(user, defibrillators);


        System.out.println(nearest.getName());
    }

    private static Defibrillator findNearest(User user, List<Defibrillator> defibrillators) {
        double minDistance = user.getLocation().distanceTo(defibrillators.get(0).getLocation());
        Defibrillator minDefibrillator = defibrillators.get(0);

        for(Defibrillator defibs :defibrillators) {
            double distance = user.getLocation().distanceTo(defibs.getLocation());
            if(distance < minDistance) {
                minDistance = distance;
                minDefibrillator = defibs;
            }
        }

        return minDefibrillator;
    }


}