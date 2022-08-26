package nl.rijkswaterstaat.java17.mathieu.ocp17.chapter2;

public class Primitives {
    public static void main(String[] args) {
        long reptile = 192_301_398_193_810_323L;
        Primitives p = new Primitives();
//        System.out.println(p.add(Integer.MAX_VALUE, -2147483647));
//        System.out.println(p.add(Integer.MAX_VALUE, 10000));
//        System.out.println(p.add(Integer.MIN_VALUE, -10000));
//        System.out.println(p.add(Integer.MIN_VALUE, 10000));
//        int five = 5;
//        System.out.println(five/=4);
        for(int i=0;i<10;i++){
            boolean open = true || i<4;
            System.out.println(open);
        }
    }

    int add(int a, int b){
        int temp = a+b;
        if(b>0){
            if(temp>a)
                return temp;
            else
                return Integer.MAX_VALUE;
        } else {
            if(temp <a)
                return temp;
            else return Integer.MIN_VALUE;
        }
    }

    int min(int a, int b){
        return add(a,-b);
    }

//    int multiply(int a, int b){
//        int temp = a*b;
//        if(b>1){
//            if(temp )
//        }
//    }
}
