package com.example.stringMethods;

import java.util.List;
import java.util.stream.Stream;

public class StringService {

    List<String> getOnlyNotBlankStrings(List<String> input) {
        // TODO: implement here

        return input.stream().filter(s -> !s.isBlank()).toList();
    }

    List<String> getStrippedTextLines(String text) {
        // TODO: implement here
        // split text to lines and strip
        return Stream.of(text.split("[\n\r]")).map(String::strip).toList();
    }

    List<String> extendFoundStringByRepeatSomeTimes(List<String> list, String searchedText, int nTimesRepeat) {
        // TODO: implement here
        // search for searchedText in a list. Change this string by repeat n times if found
        return list.stream().map(s -> s.equals(searchedText) ? s.repeat(nTimesRepeat) : s).toList();
    }
}
