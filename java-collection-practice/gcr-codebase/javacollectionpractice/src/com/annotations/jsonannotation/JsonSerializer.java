package com.annotations.jsonannotation;
import java.lang.reflect.Field;

public class JsonSerializer {

    public static String toJson(Object obj) {

        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();

        boolean first = true;

        for (Field field : fields) {

            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);

                JsonField jsonField = field.getAnnotation(JsonField.class);
                String jsonKey = jsonField.name();

                try {
                    Object value = field.get(obj);

                    if (!first) {
                        json.append(", ");
                    }

                    json.append("\"").append(jsonKey).append("\": ");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    first = false;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}

