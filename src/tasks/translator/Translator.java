package tasks.translator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import tasks.translator.exceptions.FileReadException;
import tasks.translator.exceptions.InvalidFileFormatException;

public class Translator {

    private Dictionary dictionary;

    public Translator(File file) {
        setDictionary(file);
    }

    public void translate(File file) {
        if (dictionary == null) {
            System.out.println("Load dictionary with setDictionary(File file)!!");
            return;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(file));) {
            String line;
            while ((line = reader.readLine()) != null) {

            }

        } catch (IOException e) {

        }


    }


    private void setDictionary(File file) {
        try {
            dictionary = new Dictionary(file);
        } catch (FileReadException | InvalidFileFormatException e) {
            System.out.println(e.getMessage());
            System.out.println("Translator won't work, fix errors and try to load your dictionary again!");
            dictionary = null;
        }
    }

}
