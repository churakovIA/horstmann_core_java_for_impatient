package ch4.inheritance;

import java.lang.reflect.Field;

/**
 * Write the “Hello, World” program, using reflection to look up the out field of
 * java.lang.System and using invoke to call the println method.
 */
public class Task11 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("java.lang.System");
        Field field = clazz.getDeclaredField("out");
        field.getType().getMethod("println", String.class)
                .invoke(field.get(null), "Hello, World");
    }
}
