import myfirstpackage.*;

class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass(1, 2);

        System.out.println(o.function());

        for (int i = 1; i <= 8; i++) {
 	        for (int j = 1; j <= 8; j++) {
     	        o.setValue1(i);
     	        o.setValue2(j);
     	        System.out.print(o.function());
     	        System.out.print(" ");
 	        }
 	        System.out.println();
        }
    }
}