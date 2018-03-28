package pl.msmiech.java8desktop;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class Point {

    private final static double EARTH_RADIUS = 6371.0;

    private double longitude;
    private double latitude;

    public double distanceTo(Point B) {
        double x = (B.longitude - longitude) * Math.cos((latitude + B.latitude) / 2);
        double y = B.latitude - latitude;
        return Math.sqrt(x * x + y * y) * EARTH_RADIUS;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return latitude == point.latitude && longitude == point.longitude;
        } else {
            return false;
        }
    }
}
