package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Dinglemouse {

    public static void main(String[] args) {
//        System.out.println(whatTimeIsIt(24.1685d));
        System.out.println(whatTimeIsIt(92.9989d));

    }

    public static String whatTimeIsIt(final double angle) {
        if (angle == 0d || angle == 360d) {
            return "12:00";
        }

        int TEST_ANGLE = 90;
        int ANGLE_HOUR = 3;

        BigDecimal hourD = new BigDecimal(angle * ANGLE_HOUR / TEST_ANGLE);

        BigDecimal hour = new BigDecimal(hourD.intValue());
        if (hour.intValue() == 0) {
            hour = new BigDecimal(12);
            hourD = hourD.add(new BigDecimal(12));
        }
        BigDecimal minD = hourD.subtract(hour);
        BigDecimal min = minD.multiply(new BigDecimal(60)).setScale(2, RoundingMode.HALF_DOWN);

        // Your code here
        return String.format("%02d:%02d", hour.intValue(), min.intValue());
    }
}
