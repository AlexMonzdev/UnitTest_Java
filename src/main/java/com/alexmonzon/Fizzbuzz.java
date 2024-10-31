package com.alexmonzon;

public class Fizzbuzz {

    public String checkNumber(int number) {
        for (int i = 1; i <= number ; i++) {
            if(number%3 == 0 && number%5 != 0){
                return "Fizz";
            }
            if(number%5 == 0 && number%3 !=0){
                return "Buzz";
            }
            if(number%5 == 0 && number%3 == 0){
                return "FizzBuzz";
            }
            if(number%5 != 0 && number%3 != 0){
                return String.valueOf(number);
            }
        }
        return null;
    }
}
