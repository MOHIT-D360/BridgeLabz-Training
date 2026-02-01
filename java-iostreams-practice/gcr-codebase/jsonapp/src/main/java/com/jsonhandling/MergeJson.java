package com.jsonhandling;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.File;

public class MergeJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

           
            JsonNode json1 = mapper.readTree(new File("json1.json"));
            JsonNode json2 = mapper.readTree(new File("json2.json"));

            
            ObjectNode merged = (ObjectNode) json1;

            
            merged.setAll((ObjectNode) json2);

           
            System.out.println(
                mapper.writerWithDefaultPrettyPrinter()
                      .writeValueAsString(merged)
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
