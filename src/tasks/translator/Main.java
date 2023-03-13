package tasks.translator;

import java.io.File;
import java.io.FileReader;

import tasks.translator.exceptions.FileReadException;
import tasks.translator.exceptions.InvalidFileFormatException;

public class Main {

    public static void main(String[] args) {
        File file = new File("dictionary.txt");
        Translator translator = new Translator(file);



    }

}
