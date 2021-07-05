package by.epam.learn.io;

import java.io.File;
import java.io.IOException;

import static by.epam.learn.io.CountFilesClass.*;
import static by.epam.learn.io.GetFolderFiles.RecursivePrint;
import static java.util.Objects.requireNonNull;

public class DirectoryContentMain {
    public static void main(String[] args) throws IOException {

        File dir = new File("C:\\data\\Java-Training");

        Runtime.getRuntime().exec("cmd /C start /b |tree/F " +
                "C:\\data\\Java-Training > C:\\data\\Java-Training\\src\\DirectoryInfo.doc");

        if (dir.exists() && dir.isDirectory()) {
            File[] arr = dir.listFiles();
            System.out.println("The folder's content of the 'tree' structure is written down the file " +
                    "DirectoryInfo.doc and looks like below: " + "\n");
            RecursivePrint(arr != null ? arr : new File[0], 0);// Calling recursive method
            int fileCount = requireNonNull(dir.list()).length;
            System.out.println("\n" + "Number of items in the current directory: " +
                    fileCount + ", including: " + countFilesInDirectory(dir) + " files and " +
                    countSubdirectories(dir) + " subdirectories" + "\n");
            System.out.println("Total number of files in the current directory, including subdirectories: " +
                    countTotalFilesInDirectory(dir) + "\n");
            System.out.println("Average number of files in the current directory: " +
                    (countTotalFilesInDirectory(dir) + countFilesInDirectory(dir)) / 2 + "\n");
        }
    }
}