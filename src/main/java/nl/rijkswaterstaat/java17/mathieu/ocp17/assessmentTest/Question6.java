package nl.rijkswaterstaat.java17.mathieu.ocp17.assessmentTest;

import java.util.Locale;
import java.util.ResourceBundle;

public class Question6 {
    public static void main(String[] args) {
        Locale fr = new Locale("fr");
        Locale.setDefault(new Locale("en", "US"));
        var b = ResourceBundle.getBundle("penguin", fr);
        System.out.println(b.getString("name"));
        System.out.println(b.getString("age"));
    }
}
