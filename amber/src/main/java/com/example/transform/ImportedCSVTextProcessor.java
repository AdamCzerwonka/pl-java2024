package com.example.transform;

public class ImportedCSVTextProcessor {

    String process(String line) {
        // TODO: implement here
        // 1. replace "," with space
        // 2. remove "none"
        // 3. remove white spaces from start and end
        // 4. add "-done" at the end
        // 5. to uppercase

        line = line.replace(",", " ");
        line = line.replace("none", "");
        line = line.trim();
        line += "-done";
        line = line.toUpperCase();

        return line;
    }
}
