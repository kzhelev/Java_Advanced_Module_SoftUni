package StreamsFilesAndDirectories;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        String path = "src/StreamsFilesAndDirectories/Resources/Files-and-Streams";

        File file = new File(path);

        String[] fileNames = file.list();

        for (int i = 0; i < fileNames.length; i++) {
            String newPath = path+"/"+fileNames[i];
            file = new File(newPath);
            if (file.isFile()) {
                System.out.println(fileNames[i]+": ["+file.length()+"]");
            }
        }

    }
}
