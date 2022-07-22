package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter1;

public class Question7 {
   private int numForks;

    public static void main(String[] args) {
        int numKnives=1;
        System.out.println("""
            "# forks = " + numForks +
            " # knives = " + numKnives +          
            "# cups = 0""".replace("numKnives" , String.valueOf(numKnives)));
    }
}
