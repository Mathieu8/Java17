package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter2;

public class OrderOfOperations {
    public static void main(String[] args) {
        int i = 1;
        int n = i+++-~--i;
        int m = ~i;
        System.out.println(n + "  " + m);

        int value =3 ;// stored as 0011
        int complement = ~value; // stored as 1100
        System.out.println(value + " " + complement);

        int a = 0;
        System.out.println("Bitwise complement of " +
            a + " : " + ~a);
    }
}
