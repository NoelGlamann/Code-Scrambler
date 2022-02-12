package edu.neumont.csc105;

public class Doubler implements IStringEncryptable{
    private final String name = "Doubler";

    public String getName() {
        return name;
    }

    @Override
    public String encrypt(String s) {
        return s+s;
    }

    @Override
    public String decrypt(String s) {
        int halfLength = s.length()/2;
        return s.substring(0, halfLength);
    }
}
