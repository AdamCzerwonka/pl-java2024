package com.example.streamToList;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {

    List<Integer> getEvenNumbers(List<Integer> allNumbers) {
        // TODO: implement here
        // return only even numbers from input list
        // 1. transform list to Stream
        // 2. filter by Stream::filter method
        // 3. collect to list

        return allNumbers.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
    }
}