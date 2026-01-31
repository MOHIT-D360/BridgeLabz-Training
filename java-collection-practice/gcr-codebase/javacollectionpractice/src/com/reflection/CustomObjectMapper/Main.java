package com.reflection.CustomObjectMapper;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, Object> data = new HashMap<>();
        data.put("name", "Mohit");
        data.put("age", 22);
        data.put("email", "mohit@gmail.com");

        User user = ObjectMapperUtil.toObject(User.class, data);
        user.display();
    }
}
