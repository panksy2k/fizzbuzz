package com.mthree.fizzbuzz.function;

import java.util.function.IntFunction;

public class FizzBuzzFunction implements IntFunction<String> {

    @Override
    public String apply(int aNumber) {
        if(aNumber % 15 == 0) {
            return "FizzBuzz";
        } else if(aNumber % 5 == 0) {
            return "Buzz";
        } else if(aNumber % 3 == 0) {
            return "Fizz";
        }

        return String.valueOf(aNumber);
    }
}
