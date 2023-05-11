package StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "src/StreamsFilesAndDirectoriesExercises/Resources/Exercises Resources";
        File file = new File(path);

        int size = 0;

        File[] fileList = file.listFiles();

        for (int i = 0; i < fileList.length; i++) {
            size += fileList[i].length();
        }
        System.out.println("Folder size: "+size);
    }
}
