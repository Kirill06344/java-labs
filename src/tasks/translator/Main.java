package tasks.translator;

import java.io.File;

import tasks.translator.exceptions.FileReadException;
import tasks.translator.exceptions.InvalidFileFormatException;

public class Main {

    public static void main(String[] args) {
        File file = new File("dictionary.txt");
        try {
            Dictionary dictionary = new Dictionary(file);
            dictionary.printDictionary();
        } catch (FileReadException | InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }

}
