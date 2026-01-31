package com.reflection.CustomObjectMapper;

import java.lang.reflect.Field;
import java.util.Map;

class ObjectMapperUtil {

    public static <T> T toObject(Class<T> clazz,
                                 Map<String, Object> properties) {

        try {
            // Create object dynamically
            T obj = clazz.getDeclaredConstructor().newInstance();

            // Get all fields
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {

                String fieldName = field.getName();

                if (properties.containsKey(fieldName)) {

                    field.setAccessible(true); // private fields allow

                    Object value = properties.get(fieldName);

                    field.set(obj, value);
                }
            }

            return obj;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
