package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter2;

public class ApplyingUnaryOperators {
    public static void main(String[] args) {

        long value =10;
        long complement = ~value;
        System.out.println(value);
        System.out.println(complement);

        System.out.println(-1*value -1);
        System.out.println(-1*complement -1);

        long longValue = Long.MAX_VALUE;
        float floatValue = longValue;
        double doubleValue = longValue;

        System.out.println(floatValue);
        System.out.println(doubleValue);

        short w = 14;
        float x = 13;
        double y =30.1;

        var z = w*x/y;
        System.out.println(z);
    }
}
