package com.annotations.cachingannotation;

public class Main {

    public static void main(String[] args) throws Exception {

        Service service = new Service();

        System.out.println(CacheExecutor.execute(service, "square", 5));
        System.out.println(CacheExecutor.execute(service, "square", 5)); // cached
        System.out.println(CacheExecutor.execute(service, "square", 6));
        System.out.println(CacheExecutor.execute(service, "square", 6)); // cached
    }
}
