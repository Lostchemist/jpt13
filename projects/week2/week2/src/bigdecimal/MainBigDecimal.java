package bigdecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MainBigDecimal {


    public static void main(String[] args) {
        BigDecimal eqResult = calculateEquation(new BigDecimal(10)).setScale(2, RoundingMode.CEILING);
        System.out.println(eqResult);
        System.out.println("prueba");

    }


    public static BigDecimal calculateEquation(BigDecimal x) {
        BigDecimal twoPointThree = new BigDecimal(2.3);
        BigDecimal onePointFive = new BigDecimal(1.5);
        BigDecimal pointEight = new BigDecimal(0.8);


        BigDecimal leftSide = x.multiply(twoPointThree).add(onePointFive);
        BigDecimal rightSide = x.subtract(pointEight);

        BigDecimal result = leftSide.divide(rightSide);

        return result;
    }
}
