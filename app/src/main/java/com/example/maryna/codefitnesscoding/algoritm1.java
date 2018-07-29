package com.example.maryna.codefitnesscoding;

import java.util.ArrayList;
import java.util.List;

public class algoritm1 {

     List<String> fizzBuzz(int n){
        List<String> result = new ArrayList<>(); // [}
        for(int i=1; i<=n; i++){
            //result.add(i + ""); // -> "1"
            if (i % 3 == 0 && i % 5 == 0){
                result.add("FizzBuzz");
            }else if (i % 5 == 0){
                result.add("Buzz");
            }else if (i % 3 == 0){
                result.add("Fizz");
            }
        }
     return result;
    }
}
