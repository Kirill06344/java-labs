package tasks.translator;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import tasks.translator.exceptions.FileReadException;
import tasks.translator.exceptions.InvalidFileFormatException;

public class Dictionary {

    private final Map<String, String> dictionary;

    public Dictionary(File file) throws FileReadException, InvalidFileFormatException {
        dictionary = new HashMap<>();
        try(FileReader reader = new FileReader(file)) {
            Scanner in = new Scanner(reader);
            while(in.hasNextLine()) {
                String str = in.nextLine();
                String [] words = str.split("\\|");
                if (words.length != 2) {
                    throw new InvalidFileFormatException();
                }
                dictionary.put(words[0].trim(), words[1].trim());
            }
        } catch (IOException e) {
            throw new FileReadException(e.getMessage());
        }
    }

    public void printDictionary() {
        dictionary.forEach((key, value) -> System.out.println(key + " | " + value));
    }
}
