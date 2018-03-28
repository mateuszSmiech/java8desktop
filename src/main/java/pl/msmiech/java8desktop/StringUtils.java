package pl.msmiech.java8desktop;

public class StringUtils {

    public static double toDouble(String number) {
        return Double.parseDouble(number.replace(',', '.'));
    }
}
