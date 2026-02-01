package com.jsonhandling;

import com.fasterxml.jackson.databind.*;
import com.networknt.schema.*;
import java.io.File;
import java.util.Set;

public class EmailValidation {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON data & schema
        JsonNode jsonData = mapper.readTree(new File("user.json"));
        JsonNode jsonSchema = mapper.readTree(new File("schema.json"));

       
        JsonSchemaFactory factory =
            JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);
        JsonSchema schema = factory.getSchema(jsonSchema);

      
        Set<ValidationMessage> errors = schema.validate(jsonData);

        if (errors.isEmpty()) {
            System.out.println(" Email is valid");
        } else {
            System.out.println(" Invalid email");
            for (ValidationMessage msg : errors) {
                System.out.println(msg.getMessage());
            }
        }
    }
}
