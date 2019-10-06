package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String text = "25*x:=(5,1+6)*1.5e-1";
        Lexer l = new Lexer(text);
        List<Token> tokenList = l.lex();

        for (Token t : tokenList)
            System.out.println(t.type + " " + t.text);
    }
}
