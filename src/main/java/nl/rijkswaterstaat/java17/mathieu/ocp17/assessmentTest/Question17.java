package nl.rijkswaterstaat.java17.mathieu.ocp17.assessmentTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Question17 {
    Path path1 = Path.of("Howdy");
    public static void main(String[] args) throws IOException {
        var q17= new Question17();
        Path path2 = null;
//        Files.mismatch(q17.path1, path2);

        path2 = Path.of("Hello");
        Files.mismatch(q17.path1, path2);
    }
}
