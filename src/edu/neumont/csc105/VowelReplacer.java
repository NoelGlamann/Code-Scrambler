package edu.neumont.csc105;

import java.util.ArrayList;

public class VowelReplacer implements IStringEncryptable{
    private final String name = "Vowel Replacer";

    public String getName() {
        return name;
    }
    @Override
    public String encrypt(String s) {
        String newString="";
        ArrayList<Character> chars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }
        ArrayList<Character> changed = new ArrayList<>();
        for (char ch : chars){
            switch (ch){
                case 'a':
                    changed.add('e');
                    break;
                case 'e':
                    changed.add('i');
                    break;
                case 'i':
                    changed.add('o');
                    break;
                case 'o':
                    changed.add('u');
                    break;
                case 'u':
                    changed.add('a');
                    break;
                default:
                    changed.add(ch);
            }
        }
        for (char ch: changed){
            newString += ch;
        }
        return newString;
    }

    @Override
    public String decrypt(String s) {
        String newString="";
        ArrayList<Character> chars = new ArrayList<>();
        for (char ch : s.toCharArray()) {
            chars.add(ch);
        }
        ArrayList<Character> changed = new ArrayList<>();
        for (char ch : chars){
            switch (ch){
                case 'a':
                    changed.add('u');
                    break;
                case 'e':
                    changed.add('a');
                    break;
                case 'i':
                    changed.add('e');
                    break;
                case 'o':
                    changed.add('i');
                    break;
                case 'u':
                    changed.add('o');
                    break;
                default:
                    changed.add(ch);
            }
        }
        for (char ch: changed){
            newString += ch;
        }
        return newString;
    }
}
