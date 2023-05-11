package StreamsFilesAndDirectories.Serialize;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cube cube = new Cube("green",15.3,12.4,3);

        FileOutputStream fileOutputStream = new FileOutputStream("cube.ser");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(cube);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("cube.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Cube cube1 = (Cube) objectInputStream.readObject();

        System.out.println(cube1.color+" "+ cube1.depth+" "+cube1.height+" "+cube1.width);

        System.out.println(cube.color+" "+ cube.depth+" "+cube.height+" "+cube.width);
    }
}
