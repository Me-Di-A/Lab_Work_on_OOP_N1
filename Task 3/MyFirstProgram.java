class MyFirstClass {
    public static void main(String[] s) {
        MySecondClass o = new MySecondClass();
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

class MySecondClass {
    private int value1, value2;

    public static void main(String[] s) {
        MySecondClass myObject = new MySecondClass(1, 2);

 	    System.out.println(myObject.function());
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    MySecondClass() {
        value2 = value1 = 0;
    }

    MySecondClass(int value1, int value2) {
        this();
        this.value1 = value1;
        this.value2 = value2;
    }

    public int function() {
        return(value1 - value2);
    }
}