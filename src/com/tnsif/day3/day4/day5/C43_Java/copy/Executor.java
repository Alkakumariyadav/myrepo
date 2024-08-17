package com.tnsif.day3.day4.day5.C43_Java.copy;

class Base {
    int varDefault;
    protected int varProtected;
    public int varPublic;

    void methodDefault() {
        System.out.println("Default method: varDefault = " + varDefault);
    }

    protected void methodProtected() {
        System.out.println("Protected method: varProtected = " + varProtected);
    }

    public void methodPublic() {
        System.out.println("Public method: varPublic = " + varPublic);
    }
}

public class Executor {

    public static void main(String[] args) {
        Base b1 = new Base();
        b1.methodDefault();
        b1.methodProtected();
        b1.methodPublic();

        b1.varDefault = 11;
        b1.methodDefault();

        b1.varProtected = 31;
        b1.methodProtected();

        b1.varPublic = 41;
        b1.methodPublic();

        System.out.println(b1 instanceof Base);
    }
}
