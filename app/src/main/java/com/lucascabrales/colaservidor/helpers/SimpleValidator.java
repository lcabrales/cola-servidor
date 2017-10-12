package com.lucascabrales.colaservidor.helpers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by lucascabrales on 10/12/17.
 */

public class SimpleValidator {
    public static final String NOT_EMPTY = "^(?=\\s*\\S).*$";

    public static boolean validate(String patternText, String textToValidate) {
        Pattern pattern = Pattern.compile(patternText);
        Matcher matcher = pattern.matcher(textToValidate);
        return matcher.matches();
    }
}