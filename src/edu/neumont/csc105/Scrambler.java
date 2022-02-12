package edu.neumont.csc105;

import java.io.IOException;

public class Scrambler {
    public static void main(String[] args) throws IOException {
        EncryptionController ec = new EncryptionController();
        ec.run();
    }
}
