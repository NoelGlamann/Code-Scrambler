package edu.neumont.csc105;

public class Cutter implements IStringEncryptable{
    private final String name = "Cutter";

    public String getName() {
        return name;
    }
    @Override
    public String encrypt(String s) {
        int halfLength = (s.length()+1)/2;
        return cutterCrypt(s, halfLength);
    }

    @Override
    public String decrypt(String s) {
        int halfLength = (s.length())/2;
        return cutterCrypt(s, halfLength);
    }

    private String cutterCrypt(String s, int halfLength){
        int length = s.length();
        return s.substring(halfLength, length) + s.substring(0, halfLength);
    }

}
