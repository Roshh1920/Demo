package com.encap;

public class MyProgram
{

    public MyProgram() {
        this(10);
        System.out.println("Default");
    }
    public MyProgram(int x,int y) {
        System.out.println("Params 2 - "+x+ "  "+y);
    }
    public MyProgram(int x) {
        this(10,20);
        System.out.println("Param 1 " +x);
    }

    public static void main(String[] args) {
            MyProgram mp=new MyProgram();

    }
}
