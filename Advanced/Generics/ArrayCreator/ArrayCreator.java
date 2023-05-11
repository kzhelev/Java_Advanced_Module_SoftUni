package Generics.ArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(Class<?> clazz, int length, T defaultValue) {

        T[] tItems = (T[]) Array.newInstance(clazz, length);

        for (int i = 0; i < length; i++) {
            tItems[i] = defaultValue;
        }
        return tItems;
    }

    public static <T> T[] create(int length, T defaultValue) {

        T[] tItems =(T[]) Array.newInstance(defaultValue.getClass(),length);

        for (int i = 0; i < length; i++) {
            tItems[i] = defaultValue;
        }
        return tItems;
    }

}
