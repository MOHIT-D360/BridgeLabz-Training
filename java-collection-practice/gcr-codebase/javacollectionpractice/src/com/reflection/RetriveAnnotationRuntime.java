package com.reflection;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

//  Apply annotation to class
@Author(name = "Mohit Dixit")
class Book {
    // class content
}

// 🔹 Main class
public class RetriveAnnotationRuntime {

    public static void main(String[] args) {

        try {
            // Load class
            Class<?> cls = Book.class;

            // Check annotation
            if (cls.isAnnotationPresent(Author.class)) {

                // Retrieve annotation
                Author author = cls.getAnnotation(Author.class);


                System.out.println("Author Name: " + author.name());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
