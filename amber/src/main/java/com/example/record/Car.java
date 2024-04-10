package com.example.record;

// TODO: implement here
// change this class to record
// throw IllegalArgumentException when capacity in negative while creating
public record Car(String make, int capacity) {

    public Car {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity should be positive");
        }
    }
}
