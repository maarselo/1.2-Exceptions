package Level3.utils;

import Level3.view.TextMenu;
import Level3.exceptions.EmptyString;
import Level3.exceptions.ExceptionIncorrectName;
import Level3.exceptions.OutOfRange;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner keyboard = new Scanner(System.in);

    public static int showMenu () {
        int option;
        System.out.println(TextMenu.menu);
        while (true) {
            option = keyboard.nextInt();
            keyboard.nextLine();
            if (0 <= option && option <= 5)
                return (option);
            System.out.println("Invalid number.");
        }
    }

    public static int readInt(String message, int max) {
        while (true) {
            try  {
                System.out.println(message);
                int number = keyboard.nextInt();
                checkRanges(number, max);
                return (number);
            } catch (InputMismatchException | OutOfRange e) {
                keyboard.nextLine();
                System.out.println(e.getMessage());
            }
        }
    }

    public static String readstring(String message) {
        String input;
        while (true) {
            try {
                System.out.println(message);
                input = keyboard.nextLine();
                checkString(input);
                return (input) ;
            } catch (EmptyString | ExceptionIncorrectName e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void checkRanges(int number, int max) throws OutOfRange {
        if (0 >= number || number > max)
            throw new OutOfRange("Number cannot be more than the max, and less than the min");
        return;
    }

    public static void checkString(String input) throws EmptyString, ExceptionIncorrectName {
        if (input.isEmpty())
            throw new EmptyString("The string cannot be empty.");
        String digits = "0123456789";
        for (char d : digits.toCharArray()) {
            if (input.indexOf(d) != -1)
                throw new ExceptionIncorrectName("The name cannot contains numbers.");
        }
    }
}
