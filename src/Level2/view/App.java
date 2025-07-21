package Level2.view;

import Level2.utils.Input;

public class App {
    public static void run() {
        byte numberByte = Input.readByte("How old are you?");
        int numberInt = Input.readInt("How many brothers you have?");
        float numberFloat = Input.readFloat("How much does your cell phone cost?");
        double numberDouble = Input.readDouble("What was your average in school?");
        char c = Input.readChar("Put a character(Not possible meta characters):");
        String input = Input.readString("Put a phrase without digits:");
        boolean response = Input.readYesOrNo("You are a good person? (y / n)");
    }
}
