package com.example.patternMatchingForInstanceof;

import com.example.patternMatchingForInstanceof.withDisplayName.DisplayNamed;
import com.example.patternMatchingForInstanceof.withNameShapes.Named;

public class ShapeDisplayNameResolver {

    public String resolveShape(Shape shape) {
        // TODO: implement here with pattern matching for instanceof usage
        // return display name of shape

        switch (shape) {
            case DisplayNamed displayNamed -> {
                return displayNamed.getDisplayName();
            }
            case Named named -> {
                return "This is " + named.getName() + " name!";
            }
            default -> throw new IllegalStateException("Unexpected value!");
        }
    }
}

// TIP: shape can be DisplayNamed or Named
// if shape is DisplayNamed use getDisplayName method
// if shape is Named use getName method and format it to expected display string
