package Level2.view;

import Level2.utils.Entrada;

public class App {
    public static void run() {
        byte numberByte = Entrada.readByte("How old are you?");
        int numberInt = Entrada.readInt("How many brothers you have?");
        float numberFloat = Entrada.readFloat("How much does your cell phone cost?");
        double numberDouble = Entrada.readDouble("What was your average in school?");
        char c = Entrada.readChar("Put a character(Not possible meta characters):");
        String input = Entrada.readString("Put a phrase without digits:");
        boolean response = Entrada.readYesOrNo("You are a good person? (y / n)");
    }
}
