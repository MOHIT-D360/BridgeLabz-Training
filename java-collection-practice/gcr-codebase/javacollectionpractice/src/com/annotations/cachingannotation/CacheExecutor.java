package com.annotations.cachingannotation;
import java.lang.reflect.*;
import java.util.*;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class CacheExecutor {

    // Cache storage
    private static final Map<String, Object> cache = new HashMap<>();

    public static Object execute(Object obj, String methodName, Object... args)
            throws Exception {

        Class<?> clazz = obj.getClass();

        Method method = clazz.getMethod(methodName, int.class);

        // Check annotation
        if (method.isAnnotationPresent(CacheResult.class)) {

            // Cache key (method + arguments
            String cacheKey = methodName + args[0];

           
            if (cache.containsKey(cacheKey)) {
                System.out.println("Returning cached result...");
                return cache.get(cacheKey);
            }

            // Cache miss
            Object result = method.invoke(obj, args);
            cache.put(cacheKey, result);
            return result;
        }

    
        return method.invoke(obj, args);
    }
}
