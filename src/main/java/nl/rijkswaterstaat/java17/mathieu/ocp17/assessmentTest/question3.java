package nl.rijkswaterstaat.java17.mathieu.ocp17.assessmentTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class question3 {
    public static void main(String[] args) {
        question3 question3 = new question3();
        question3.question();

    }

   void question(){
        List<Integer> data = new ArrayList<>();
        IntStream.range(0,100).parallel().forEach(s->  data.add(s));
        System.out.println(data.size());
    }
}
