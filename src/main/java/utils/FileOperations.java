package utils;

import java.io.File;

public class FileOperations {
    public void cleanTempFiles() {
        String[] TempDirectory = {"C:\\Windows\\Temp", "C:\\Users\\TerrorX\\AppData\\Local\\Temp"};

        for (String dir : TempDirectory) {
            File directory = new File(dir);

            if (directory.exists() && directory.isDirectory()) {
                File[] files = directory.listFiles();
                if (files != null) {
                    for (File file : files) {
                        if (file.isFile()) {
                            file.delete();
                        }
                    }
                }
            }
        }

    }
}
