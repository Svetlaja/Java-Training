package by.epam.learn.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

import static by.epam.learn.io.CountFilesClass.*;
import static by.epam.learn.io.GetFolderFiles.GetFilesList;

public class DirectoryContentMain {
    public static void main(String[] args) throws IOException {
        String filePath = "./src/FolderInfo.txt";
        String filePathGot = new File(filePath).getPath();
        String folderPath = "./src";
        String info = "The folder's content of the 'tree' structure is written down the file " +
                "FolderInfo.doc and looks like below: " + "\n";
        if (new File(folderPath).exists() && new File(folderPath).isDirectory()) {
            File[] list = new File(folderPath).listFiles();
            String outputFolder = GetFilesList(Objects.requireNonNull(list), 0);
            int fileCount = Objects.requireNonNull(new File(folderPath).list()).length;
            String numberOfItems = "\n" + "Number of items in the current directory: "
                    + fileCount + ", including: " + countFilesInDirectory(new File(folderPath))
                    + " files and " + countSubdirectories(new File(folderPath)) + " subdirectories" + "\n";
            String totalFiles = "Total number of files in the current directory, including subdirectories: " +
                    countTotalFilesInDirectory(new File(folderPath)) + "\n";
            String averageNumberOfFiles = "Average number of files in the current directory: " +
                    (countTotalFilesInDirectory(new File(folderPath)) + countFilesInDirectory(new File(folderPath))) / 2 + "\n";
            try (FileWriter fileOutput = new FileWriter(filePathGot, StandardCharsets.UTF_8, false)) {
                fileOutput.write(info + outputFolder);
                fileOutput.write( numberOfItems);
                fileOutput.write(totalFiles);
                fileOutput.write(averageNumberOfFiles);
                fileOutput.flush();
            }
        }
    }
}
