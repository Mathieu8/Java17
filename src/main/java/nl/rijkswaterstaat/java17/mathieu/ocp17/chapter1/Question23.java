package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter1;

public class Question23 {
        int Depth =1;
    float temp = 50.0f;
    public void flow(){
        for( int i=0;i<1;i++){
            int Depth =2;
                Depth++;
                temp--;
        }
        System.out.println(Depth);
        System.out.println(temp);
    }

    public static void main(String[] args) {
        new Question23().flow();
    }

}
