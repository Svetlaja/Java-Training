package by.epam.learn.collectionsStringsMain;

import java.util.*;
import java.io.*;

public class StringsMain {
    public static void main(String[] args) throws java.io.IOException {
        List<String> lines = new ArrayList<>();
        String inputFileName = "C:\\data\\inputstrings.txt";
        String inversedFileName = "C:\\data\\inversedstrings.txt";
        FileWriter writer = new FileWriter(inputFileName, false);
        System.out.print("Enter 5 strings: ");
        System.out.print("\n");
        for (int i = 0 ; i <= 4; i++) {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader bis = new BufferedReader(is);
            String strings = bis.readLine();
            writer.write(strings);
            writer.append('\n');
            writer.flush();
        }
        FileReader file = new FileReader(inputFileName);
        try (BufferedReader reader = new BufferedReader(file);
             FileWriter reversedWriter = new FileWriter(inversedFileName, false)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
                String reverse = new StringBuilder(line).reverse().toString();
                System.out.println(reverse);
                reversedWriter.write(reverse);
                reversedWriter.append('\n');
            }
            System.out.println(lines);
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}