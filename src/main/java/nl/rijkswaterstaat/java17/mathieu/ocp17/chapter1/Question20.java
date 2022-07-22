package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter1;

public class Question20 {
String color;
long age;
public void Question20(){
    color = "blue";
    age =1200;

}

    public static void main(String[] args) {
        var p = new Question20();
        var q = new Question20();
        p.color="green";
        p.age=1400;
        p=q;
        System.out.println("q1="+q.color);
        System.out.println("q2="+q.age);
        System.out.println("p1="+p.color);
        System.out.println("p2="+p.age);
    }
}
