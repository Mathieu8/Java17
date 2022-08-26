package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter2;

import java.util.stream.IntStream;

public class Question21 {
    public static void main(String[] args) {
//        int f =8;
//        int b =~f;
//        int p =-f;
//        var s =b==p?5:10;
//        System.out.println(b+","+p+"," +--s);
        new Question21().forloop();
    }

    private void forloop() {
        IntStream.range(Short.MIN_VALUE, Short.MAX_VALUE)
            .mapToObj(i-> new Data(i,(short) i))
            .forEach(map -> System.out.println(map.i + " " + ~map.b));
    }

    class Data{
        int i;
        short b;
        Data(int i, short b){
            this.i=i;
            this.b=b;
        }
    }
}
