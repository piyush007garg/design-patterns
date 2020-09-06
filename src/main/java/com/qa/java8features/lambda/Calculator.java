package com.qa.java8features.lambda;

public class Calculator {
    public static void main(String[] args) {

        MathsOpeartion add  = (a, b) -> a+b;
        MathsOpeartion mul  = (a,b) -> a*b;
        MathsOpeartion sub  = (a,b) -> b-a;
        MathsOpeartion div  = (a,b) -> b/a;

      System.out.println(Calcualte(add,5,10));

    }

    public static int Calcualte(MathsOpeartion mathsOpeartion,int a,int b){
        return mathsOpeartion.calculate(a,b);

    }

}

