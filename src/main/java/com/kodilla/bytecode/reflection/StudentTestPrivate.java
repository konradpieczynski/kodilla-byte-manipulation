package com.kodilla.bytecode.reflection;

        import java.lang.reflect.Field;
        import java.lang.reflect.InvocationTargetException;
        import java.lang.reflect.Method;

public class StudentTestPrivate {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException,
            NoSuchMethodException, InvocationTargetException {
        Student student = new Student("A100");
        Field indexField = student.getClass().getDeclaredField("indexNumber");
        indexField.setAccessible(true);
        indexField.set(student,"B200");
        System.out.println(student.getIndexNumber());
    }
}