package Level2.model;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    private static Scanner keyboard = new Scanner(System.in);

    public static byte readByte(String message) {
        byte number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextByte(); break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        return (number);
    }
    public static int readInt(String message) {
        int number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextInt(); break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        return (number);
    }
    public static float readFloat(String message) {
        float number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextFloat(); break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        return (number);
    }
    public static double readDouble(String message) {
        double number;
        while (true) {
            try {
                System.out.println(message);
                number = keyboard.nextDouble(); break;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        }
        return (number);
    }


}
