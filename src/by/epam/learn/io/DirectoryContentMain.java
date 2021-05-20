package by.epam.learn.io;

import java.io.*;
import static by.epam.learn.io.CountFilesClass.*;
import static by.epam.learn.io.GetFolderFiles.RecursivePrint;

public class DirectoryContentMain {
    public static void main(String[] args) throws IOException {
        File dir = new File("C:\\data\\Java-Training");
        Runtime.getRuntime().exec("cmd /C start /b |tree/F " +
                "C:\\data\\Java-Training > C:\\data\\Java-Training\\src\\FolderInfo.doc");
        if (dir.exists() && dir.isDirectory()) {
            File[] arr = dir.listFiles();
            System.out.println("The folder's content of the 'tree' structure is written down the file " +
                    "FolderInfo.doc and looks like below: " + "\n");
            RecursivePrint(arr, 0);// Calling recursive method
            int fileCount = dir.list().length;
            System.out.println("\n"+"Number of items in the current directory: " +
                    fileCount + ", including: "+countFilesInDirectory(dir) + " files and " +
                    countSubdirectories(dir)+ " subdirectories" + "\n" );
            System.out.println("Total number of files in the current directory, including subdirectories: "+
                    countTotalFilesInDirectory(dir)+"\n");
        }
    }
}