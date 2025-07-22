package Level2.utils;

import Level2.exceptions.InputEmptyException;
import Level2.exceptions.InputErrorResponseException;
import Level2.exceptions.InputHaveDigitsException;
import Level2.exceptions.InputHaveMetaCharsException;

public class Checker {
    public static void checkInputIfIsEmpty(String input) throws InputEmptyException {
        if (input.isEmpty())
            throw new InputEmptyException("The input cannot be empty.");
    }

    public static void checkChar(String input) throws InputHaveMetaCharsException {
        if (input.length() != 1)
            throw new IllegalArgumentException("Only one character is allowed.");
        char c = input.charAt(0);
        String metaCharacters = "@#!$%^*-():;?/.,~+";
        if (metaCharacters.indexOf(c) != -1)
            throw new InputHaveMetaCharsException("Cannot be a metacharacter.");
    }

    public static void checkStringDigits(String input) throws InputHaveDigitsException {
        String digits = "0123456789";
        for (char c : digits.toCharArray())
            if (input.indexOf(c) != -1)
                throw new InputHaveDigitsException("The string must no have digits.");
    }

    public static void checkStringResponse(String input) throws InputErrorResponseException {
        if (input.length() != 1)
            throw new IllegalArgumentException("Only one character is allowed.");
        if (!input.equals("y") && !input.equals("n"))
            throw new InputErrorResponseException("Must be a char like <y> or <n>.");
    }
}
