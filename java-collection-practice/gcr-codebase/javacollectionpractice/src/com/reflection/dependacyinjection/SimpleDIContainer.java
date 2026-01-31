package com.reflection.dependacyinjection;

import java.lang.reflect.Field;

class SimpleDIContainer {

    public static <T> T createObject(Class<T> clazz) {

        try {
            // Create main object
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Scan fields
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {

                if (field.isAnnotationPresent(Inject.class)) {

                    // Create dependency object
                    Object dependency =
                            field.getType()
                                 .getDeclaredConstructor()
                                 .newInstance();

                    // Inject dependency
                    field.setAccessible(true);
                    field.set(obj, dependency);
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
