package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter1;

public class Question21 {
    int count;
    {
        System.out.println(count+"-");
    }
    {
        count++;
    }
    public Question21(){
        count =4;
        System.out.println(2+"-");
    }

    public static void main(String[] args) {
        System.out.println(7+"-");
        var q = new Question21();
        System.out.println(q.count+"-");
    }
}
