package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter2;

public class Question17 {
    public static void main(String[] args) {
        int taken =1;
        int sold = 3;
        System.out.println(sold += 1+taken++);
        System.out.println("taken " + (taken *= 2));
        System.out.println("sold "+(sold += (long)1));

    }
}
