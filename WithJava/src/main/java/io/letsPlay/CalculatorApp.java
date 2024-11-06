package io.letsPlay;


import java.util.function.BiFunction;

public class CalculatorApp
{
    public static void main( String[] args ) {
        calc(10,10, (a,b)-> a+b);
        calc(10,10, (a,b)-> a-b);
        calc(10,10, (a,b)-> a*b);
        calc(10,10, (a,b)-> a/b);

        calc(10,10, Integer::sum);

    }

    private static void calc(Integer a, Integer b, BiFunction<Integer, Integer, Integer> calculate){
        System.out.println(calculate.apply(a,b));
    }

}
