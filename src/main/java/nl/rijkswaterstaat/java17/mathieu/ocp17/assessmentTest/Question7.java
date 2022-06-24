package nl.rijkswaterstaat.java17.mathieu.ocp17.assessmentTest;

import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {
        int[] array = {6,1,2,5,9,7,3,8};
var q7 = new Question7();
q7.test(array);
        q7.test(array);
        q7.test(array);
        q7.test(array);
        q7.test(array);
        q7.test(array);
        q7.test(array);
        Arrays.sort(array);
        q7.test(array);
q7.test(array);
q7.test(array);
q7.test(array);
q7.test(array);
q7.test(array);
q7.test(array);
q7.test(array);
    }

    private void test(int[] array){
        System.out.println("B" + Arrays.binarySearch(array,9));
//        System.out.println("C"+Arrays.compare(array, new int[]{6,9,8}));
//        System.out.println("M"+Arrays.mismatch(array, new int[]{6,9,8}));
    }
}
