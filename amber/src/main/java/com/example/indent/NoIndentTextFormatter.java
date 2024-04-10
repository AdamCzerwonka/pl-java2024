package com.example.indent;

public class NoIndentTextFormatter {

    String noIndentText(String text) {
        // TODO: implement here
        // remove indent
        // return text without indent

        return text.replaceAll("^\\s+", "").replaceAll("\\n\\s+", "\n");
    }
}
