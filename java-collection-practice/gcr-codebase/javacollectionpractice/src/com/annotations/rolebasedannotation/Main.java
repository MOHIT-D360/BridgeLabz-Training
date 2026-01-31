package com.annotations.rolebasedannotation;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        ServiceAllowed s = new ServiceAllowed();
        Method[] methods = s.getClass().getDeclaredMethods();

        for (Method m : methods) {

            if (m.isAnnotationPresent(RoleAllowed.class)) {

                RoleAllowed roleAllowed = m.getAnnotation(RoleAllowed.class);
                String allowedRole = roleAllowed.value();

                System.out.println("Trying to access: " + m.getName());

                try {
                    if (Security.currentRole.equals(allowedRole)) {
                        m.invoke(s);
                    } else {
                        System.out.println("Access Denied!");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("---------------------");
            }
        }
    }
}
