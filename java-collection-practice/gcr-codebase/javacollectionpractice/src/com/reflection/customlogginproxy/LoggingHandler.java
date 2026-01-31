package com.reflection.customlogginproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class LoggingHandler implements InvocationHandler {

    private Object target;

    public LoggingHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy,
                         Method method,
                         Object[] args) throws Throwable {

        // 🔹 Logging before method execution
        System.out.println("Calling method: " + method.getName());

        // Actual method call
        return method.invoke(target, args);
    }
}
