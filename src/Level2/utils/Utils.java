package Level2.utils;

import Level2.exceptions.InputEmpty;
import Level2.exceptions.InputErrorResponse;
import Level2.exceptions.InputHaveDigits;
import Level2.exceptions.InputHaveMetaChars;

public class Utils {
    public static void checkInputIfIsEmpty(String input) throws InputEmpty {
        if (input.isEmpty())
            throw new InputEmpty("The input cannot be empty.");
    }

    public static void checkChar(String input) throws InputHaveMetaChars {
        if (input.length() != 1)
            throw new IllegalArgumentException("Only one character is allowed.");
        char c = input.charAt(0);
        String metaCharacters = "@#!$%^*-():;?/.,~+";
        if (metaCharacters.indexOf(c) != -1)
            throw new InputHaveMetaChars("Cannot be a metacharacter.");
        return ;
    }

    public static void checkStringDigits(String input) throws InputHaveDigits {
        String digits = "0123456789";
        for (char c : digits.toCharArray())
            if (input.indexOf(c) != -1)
                throw new InputHaveDigits("The string must no have digits.");
        return ;
    }

    public static void checkStringResponse(String input) throws InputErrorResponse {
        if (input.length() != 1)
            throw new IllegalArgumentException("Only one character is allowed.");
        if (!input.equals("y") && !input.equals("n"))
            throw new InputErrorResponse("Must be a char like <y> or <n>.");
        return;
    }
}
