import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        Constructor<Reflection> constructor = clazz.getConstructor();

        Reflection newInstance = constructor.newInstance();

        Arrays.stream(newInstance.getClass().getDeclaredFields())
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(e -> {
                    if (!Modifier.isPrivate(e.getModifiers())) {
                        System.out.printf("%s must be private!%n", e.getName());
                    }
                });

        Arrays.stream(newInstance.getClass().getDeclaredMethods()).filter(e -> e.getName().startsWith("get"))
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(e -> {
                    if (!Modifier.isPublic(e.getModifiers())) {
                        System.out.printf("%s have to be public!%n", e.getName());
                    }
                });

        Arrays.stream(newInstance.getClass().getDeclaredMethods()).filter(e -> e.getName().startsWith("set"))
                .sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
                .forEach(e -> {
                    if (!Modifier.isPrivate(e.getModifiers())) {
                        System.out.printf("%s have to be private!%n", e.getName());
                    }
                });
    }
}
