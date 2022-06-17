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
        IntStream.range(0,100).parallel().forEach(s-> {var test = synchronized(this){ data.add(s);
            return test;};
        });
        System.out.println(data.size());
    }

    synchronized static List<Integer> dataAdd(List<Integer> data, Integer i){
        data.add(i);
        return  data;
    }
}
