package com.regular_expression;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodsString {

    public boolean matches(String regex) {
        return Pattern.matches(regex, ""+this);
    }
    public String replaceFirst(String regex, String replacement) {
        // Метод, заменяющий первое найденное соответствие
        return Pattern.compile(regex).matcher(""+this).replaceFirst(replacement);
    }
    public String replaceAll(String regex, String replacement) {
        //  Метод, заменяющий все найденные соответствия:
        return Pattern.compile(regex).matcher(""+this).replaceAll(replacement);
    }
    public String replace(CharSequence target, CharSequence replacement) {
        //  Заменяет все найденные последовательности символов(массивы) target на replacement
        return Pattern.compile(target.toString(), Pattern.LITERAL).matcher(""+this).
                replaceAll(Matcher.quoteReplacement(replacement.toString()));
    }
}