package edu.neumont.csc105;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EncryptionController {
    private EncryptionInterface ei = new EncryptionInterface();
    private List<IStringEncryptable> encrytablesToPerform = new ArrayList<>();
    private String s;

    public void run() throws IOException {
        while(true){
            ei.displayGenerateMenu();
            int selection = ei.getUserInputAsInt(1,8);
            switch (selection) {
                case 1 -> {
                    addEncryptableToList();
                }
                case 2 -> {
                    if (encrytablesToPerform.isEmpty()){
                        System.out.println("You have not added any encryptables to the list.");
                    } else {
                        for (int i = 0; i < encrytablesToPerform.size(); i++) {
                            IStringEncryptable e = encrytablesToPerform.get(i);
                            System.out.println("- " + e.getName());
                        }
                    }
                }
                case 3 -> {
                    encrytablesToPerform.clear();
                }
                case 4 -> {
                    s = ei.addNewString();
                }
                case 5 -> {
                    try{
                        for (IStringEncryptable e: encrytablesToPerform){
                            s = e.encrypt(s);
                            System.out.println(e.getName() + " - " + s);

                        }
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case 6 -> {
                    try{
                        for (int i = encrytablesToPerform.size(); i>0; i--){
                            int index = i-1;
                            s = encrytablesToPerform.get(index).decrypt(s);
                            System.out.println("Reverse " + encrytablesToPerform.get(index).getName() + " - " + s);
                        }
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }
                case 7 -> {
                    System.out.println(s);
                }
                case 8 -> {
                    return;
                }
                default -> {
                    throw new IllegalArgumentException("unknown menu item\n");
                }
            }
        }
    }
    private void addEncryptableToList() throws IOException {
        ei.displayEncryptableMenu();
        int selection = ei.getUserInputAsInt(1,5);
        switch (selection) {
            case 1 -> {
                IStringEncryptable doubler = new Doubler();
                encrytablesToPerform.add(doubler);
            }
            case 2 -> {
                IStringEncryptable cutter = new Cutter();
                encrytablesToPerform.add(cutter);
            }
            case 3 -> {
                IStringEncryptable vowelReplacer = new VowelReplacer();
                encrytablesToPerform.add(vowelReplacer);
            }
            case 4 -> {
                IStringEncryptable alternateRemoval = new AlternateRemoval();
                encrytablesToPerform.add(alternateRemoval);
            }
            case 5 -> {
                return;
            }
        }
    }
}
