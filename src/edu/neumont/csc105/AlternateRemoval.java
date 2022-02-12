package edu.neumont.csc105;

import java.util.ArrayList;

public class AlternateRemoval implements IStringEncryptable{
    private final String name = "Alternate Removal";

    private ArrayList<Character> charToHold = new ArrayList<>();

    public String getName() {
        return name;
    }

    @Override
    public String encrypt(String s) {
        charToHold.clear();
        String newString = "";
        ArrayList<Character> chars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }
        for (int i=1; i <chars.size(); i+=1 ){
            charToHold.add(chars.get(i));
            chars.remove(i);
        }
        for (char ch: chars){
            newString += ch;
        }
        return newString;
    }

    @Override
    public String decrypt(String s) {
        String newString = "";
        ArrayList<Character> chars = new ArrayList<>();
        ArrayList<Character> newStringArray = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }
        for (int i = 0; i<chars.size(); i++){
            if (i>=charToHold.size()){
                newStringArray.add(chars.get(i));
            }else {
                newStringArray.add(chars.get(i));
                newStringArray.add(charToHold.get(i));
            }
        }
        for (char ch:newStringArray){
            newString += ch;
        }
        return newString;
    }
}
