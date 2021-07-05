package by.epam.learn.io;

import java.io.File;
import java.util.Objects;

public class CountFilesClass {
    /**
     * method countFilesInDirectory()- Counts files in a directory
     * method countTotalFilesInDirectory()- Counts total files in a directory
     * method countSubdirectories()- Counts subdirectories in a directory
     *
     * @param directory the directory to start in
     * @return the total number of files/subdirectories
     */
    public static int countTotalFilesInDirectory(File directory) {
        int totalCount = 0;
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile()) {
                totalCount++;
            }
            if (file.isDirectory()) {
                totalCount += countTotalFilesInDirectory(file);
            }
        }
        return totalCount;
    }

    public static int countFilesInDirectory(File directory) {
        int countFiles = 0;
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isFile()) {
                countFiles++;
            }
        }
        return countFiles;
    }

    public static int countSubdirectories(File directory) {
        int countSubdir = 0;
        for (File file : Objects.requireNonNull(directory.listFiles())) {
            if (file.isDirectory()) {
                countSubdir++;
            }
        }
        return countSubdir;
    }
}