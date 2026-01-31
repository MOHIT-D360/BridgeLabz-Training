package com.reflection;

import java.lang.reflect.Field;

class Configuration {

    private static String API_KEY = "OLD_KEY_123";
}

public class APIKeyModifier {

    public static void main(String[] args) {

        try {
            // Class reference
            Class<?> cls = Configuration.class;

            // Access private static field
            Field field = cls.getDeclaredField("API_KEY");

            // 🔥 Bypass private access
            field.setAccessible(true);

            // Get original value (static → null)
            System.out.println("Original API_KEY: " + field.get(null));

            // Modify value
            field.set(null, "NEW_KEY_999");

           
            System.out.println("Updated API_KEY: " + field.get(null));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
