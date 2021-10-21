package by.epam.learn.io;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class GetFolderFiles {
    public static String GetFilesList(File[] list, int level) throws IOException {
        StringBuilder output = new StringBuilder();
        for (File f : list) {
            for (int i = 0; i < level; i++)
                output.append("\t");
            if (f.isFile())
                output.append("\b").append("|   *").append(f.toPath().getFileName()).append("\n");
            else if (f.isDirectory()) {
                output.append("|---").append(f.toPath().getFileName()).append("\n")
                        .append(GetFilesList(Objects.requireNonNull(f.listFiles()), level + 1));
            }
        }
        return output.toString();
    }
}
