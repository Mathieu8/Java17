package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter1;

public class Question15 {
    //a) calling System.gc() is guaranteed to free up memory
    //b) gc runs of a set schedule
    //c) gc allows the jvm to reclaim memory
    // d) gc runs when your program has used up half the available memory
    //e) an object may be eligible for gc but never removed from the heap
    //f)an object is eligble for gc once no reference to it are accesible in the program
    //g) final

    public static void main(String[] args) {
        String test = "test";
    }
}
