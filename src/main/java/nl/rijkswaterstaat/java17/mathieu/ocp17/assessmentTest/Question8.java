package nl.rijkswaterstaat.java17.mathieu.ocp17.assessmentTest;

import java.util.Comparator;
import java.util.function.Predicate;

public class Question8 {
    static Predicate r;

    public static void main(String[] args) {
        a();
        b();
        c();
        d();
        e();
        f();
        g();
    }

    private static void a() {
//        BinaryPredicate<Integer, Integer> x = r.negate();
//        BinaryPredicate<Integer, Integer> y = ()-> System.out.println();
//        BinaryPredicate<Integer, Integer> z = (a,b) -> a-b;
    }

    private static void b() {
//        Comparable<Integer>
//        x = r.negate();
//        Comparable<Integer>
//        y = ()-> System.out.println();
//        Comparable<Integer>
//        z = (a,b) -> a-b;
    }

    private static void c() {
//        Comparator<Integer>
//        y = ()-> System.out.println();
        Comparator<Integer>
            z = (a, b) -> a - b;
//        Comparator<Integer>
//            x = r.negate();
    }

    private static void d() {
//        Consumer<Integer>
//        y = ()-> System.out.println();
//        Consumer<Integer>
//        z = (a,b) -> a-b;
//        Consumer<Integer>
//            x = r.negate();
    }

    private static void e() {
//            Predicate<Integer>
//                y = () -> System.out.println();
//            Predicate<Integer>
//                z = (a, b) -> a - b;
        Predicate<Integer>
            x = r.negate();
    }

    private static void f() {
//        Runnable
//        x = r.negate();
        Runnable
            y = () -> System.out.println();
//            Runnable
//        z = (a,b) -> a-b;
    }

    private static void g() {
//            Runnable<Integer>
//                x = r.negate();
//            Runnable<Integer>
//                y = () -> System.out.println();
//            Runnable<Integer>
//                z = (a, b) -> a - b;
    }
}
