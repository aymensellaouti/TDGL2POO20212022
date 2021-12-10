package com.aymen;

public class B extends A {
    private String d;
    public B(int a, int b, String c, String d) {
        super(a, b, c);
        this.d = d;
    }

    @Override
    public void decritToi() {
        System.out.println(a + ", " + b + ", " + c +", " + d);
    }
}
