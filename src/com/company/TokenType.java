package com.company;

import java.util.regex.Pattern;

public enum TokenType {
    NUMBER("[0-9]*[.,]?[0-9]+([eE][-+]?[0-9]+)?"),
    ID("[a-zA-Z_][a-zA-Z0-9]*"),
    SEMICOLON(";"),
    IS(":="),
    PRINT("print"),
    ADD("\\+"),
    SUB("-"),
    MUL("\\*"),
    DIV("/"),
    LPAR("\\("),
    RPAR("\\)"),
    SPACE("[ \t\r\n]+");
    Pattern pattern;

    TokenType(String regexp){
        pattern = Pattern.compile(regexp);
    }

}
