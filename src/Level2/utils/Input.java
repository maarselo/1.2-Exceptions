package Level2.utils;

import java.util.Scanner;
import java.util.InputMismatchException;
import Level2.exceptions.*;

public class Input {
    private static Scanner keyboard = new Scanner(System.in);

    public static byte readByte(String message) {
        byte number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextByte();
                keyboard.nextLine();break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.");
                keyboard.nextLine();
            }
        }
        return (number);
    }
    public static int readInt(String message) {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextInt();
                keyboard.nextLine(); break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.");
                keyboard.nextLine();
            }
        }
        return (number);
    }
    public static float readFloat(String message) {
        float number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextFloat();
                keyboard.nextLine(); break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input.");
                keyboard.nextLine();
            }
        }
        return (number);
    }
    public static double readDouble(String message) {
        double number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextDouble();
                keyboard.nextLine(); break;
            } catch (InputMismatchException e ) {
                System.out.println("Invalid Input.");
                keyboard.nextLine();
            }
        }
        return (number);
    }


    public static char readChar(String message) {
        char    c;
        while (true) {
            try {
                System.out.println(message);
                String input = keyboard.nextLine();
                Checker.checkChar(input);
                c = input.charAt(0);
                break;
            } catch (InputHaveMetaCharsException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return (c);
    }
    public static String readString(String message) {
        String    input;
        while (true) {
            try {
                System.out.println(message);
                input = keyboard.nextLine();
                Checker.checkInputIfIsEmpty(input);
                Checker.checkStringDigits(input);
                break;
            } catch (InputHaveDigitsException | InputEmptyException e) {
                System.out.println(e.getMessage());
            }
        }
        return (input);
    }

    public static Boolean readYesOrNo(String message) {
        String    input;
        while (true) {
            try {
                System.out.println(message);
                input = keyboard.nextLine().trim().toLowerCase();
                Checker.checkInputIfIsEmpty(input);
                Checker.checkStringResponse(input);
                return (input.equals("s"));
            } catch (InputErrorResponseException | InputEmptyException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
