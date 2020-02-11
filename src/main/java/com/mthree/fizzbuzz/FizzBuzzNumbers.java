package com.mthree.fizzbuzz;

import com.mthree.fizzbuzz.function.FizzBuzzFunction;

import java.util.function.Function;
import java.util.stream.IntStream;

public class FizzBuzzNumbers {
    private static final FizzBuzzFunction f1 = new FizzBuzzFunction();
    public static final Function<Integer, String> f2 = n -> n < 0? "INVALID" : n % 15 == 0? "FizzBuzz" : n % 3 == 0? "Fizz" : n % 5 == 0? "Buzz" : n.toString();

    public static void printFizzBuzzNumber() {
        /*IntStream.rangeClosed(1, 100)
                .mapToObj(f1)
                .forEach(System.out::println);
        */

        IntStream.rangeClosed(1, 100)
                .mapToObj(Integer::valueOf)
                .map(f2)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        printFizzBuzzNumber();
    }
}
