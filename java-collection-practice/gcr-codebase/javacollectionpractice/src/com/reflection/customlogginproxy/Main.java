package com.reflection.customlogginproxy;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        // Create dynamic proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(
                Greeting.class.getClassLoader(),
                new Class<?>[]{Greeting.class},
                new LoggingHandler(original)
        );

        // Call method via proxy
        proxy.sayHello("Mohit");
    }
}
