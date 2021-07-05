package by.epam.learn.io;

import java.io.File;

import static java.util.Objects.requireNonNull;

public class GetFolderFiles {
    public static void RecursivePrint(File[] arr, int level) {
        for (File f : arr) {// for-each loop for main directory files
            for (int i = 0; i < level; i++)// tabs for internal levels
                System.out.print("\t");
            if (f.isFile())
                System.out.println("-" + f.getName());
            else if (f.isDirectory()) {
                System.out.println("+[" + f.getName() + "]");
                RecursivePrint(requireNonNull(f.listFiles()), level + 1);// recursion for sub-directories
            }
        }
    }
}