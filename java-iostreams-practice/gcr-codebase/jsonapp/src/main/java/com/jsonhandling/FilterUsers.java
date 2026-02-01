package com.jsonhandling;

import com.fasterxml.jackson.databind.*;
import java.io.File;

public class FilterUsers {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();


            JsonNode rootNode = mapper.readTree(new File("users.json"));

            // Loop through users
            for (JsonNode user : rootNode) {

                int age = user.path("age").asInt();

                if (age > 25) {
                    System.out.println(
                        mapper.writerWithDefaultPrettyPrinter()
                              .writeValueAsString(user)
                    );
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
