package myfirstpackage;

public class MySecondClass {
    private int value1, value2;

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

    public MySecondClass() {
        value2 = value1 = 0;
    }

    public MySecondClass(int value1, int value2) {
        this();
        this.value1 = value1;
        this.value2 = value2;
    }

    public int function() {
        return(value1 - value2);
    }
}