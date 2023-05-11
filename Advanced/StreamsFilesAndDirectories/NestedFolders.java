package StreamsFilesAndDirectories;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NestedFolders {
    public static void main(String[] args) {
        String path = "src/StreamsFilesAndDirectories/Resources/Files-and-Streams";

        File file = new File(path);

        File[] fileNames = file.listFiles();

        List<File> nestedFoldersAndFiles = new ArrayList<>();
        nestedFoldersAndFiles.add(file);

        int folderCounter = 0;

        for (int i = 0; i < nestedFoldersAndFiles.size(); i++) {
            file = nestedFoldersAndFiles.get(i);
            if (file.isDirectory()) {
                folderCounter ++;
                System.out.println(file.getName());
                fileNames = file.listFiles();
                if (fileNames != null) {
                    Collections.addAll(nestedFoldersAndFiles, fileNames);
                }
            }
        }

        System.out.println(folderCounter+" folders");



    }
}
