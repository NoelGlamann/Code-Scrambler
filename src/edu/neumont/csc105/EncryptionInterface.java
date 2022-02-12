package edu.neumont.csc105;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EncryptionInterface {
    private BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void displayGenerateMenu(){
        System.out.println("\n\nWhat would you like to do?\r\n" +
                "\t1 - Add Encryptable to list\r\n" +
                "\t2 - View list of Encryptables\r\n" +
                "\t3 - Clear list of Encryptables\r\n" +
                "\t4 - Enter String to be Encrypted/Decrypted\r\n" +
                "\t5 - Encrypt entered string\r\n" +
                "\t6 - Decrypt entered string\r\n" +
                "\t7 - View string in current state\r\n" +
                "\t8 - Exit\r\n");
    }
    public void displayEncryptableMenu(){
        System.out.println("\n\nWhich would you like to add?\r\n" +
                "\t1 - Doubler\r\n" +
                "\t2 - Cutter\r\n" +
                "\t3 - Vowel Replacer\r\n" +
                "\t4 - Alternate Removal\r\n" +
                "\t5 - Back\r\n");
    }
    public String addNewString() throws IOException {
        System.out.print("Enter new string: ");
        return in.readLine();
    }
    public int getUserInputAsInt(int min, int max) throws IOException {
        float value = getUserInputAsFloat(min, max);

        return (int) value;
    }
    public float getUserInputAsFloat(float min, float max) throws IOException {
        float input = 0;
        do {
            String line = in.readLine();
            try {
                input = Float.parseFloat(line);
                if (input < min || input > max) {
                    throw new NumberFormatException("out of range");
                }
                break;
            } catch (NumberFormatException ex) {
                System.out.println("Input invalid. " +
                        "You must enter a number between " + min + " and " + max);
            }
        } while (true);
        return input;
    }
}
