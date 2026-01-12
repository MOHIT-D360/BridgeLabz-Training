package com.algoritmruntimeanalysis;

public class StringConcate {

    public static void main(String[] args){
    int n = 100000;
    
    String s = "";
    long startString = System.nanoTime();
    for(int i=0;i<s.length();i++){
        s = s+ "a";
    }
    long endString = System.nanoTime();
    System.out.println("String append time  :"+(endString-startString));
    System.out.println("-------------------------------");

    StringBuffer sf = new StringBuffer();
    long startStringBuffer = System.nanoTime();
    for(int i=0;i<s.length();i++){
        sf = sf.append("a");
    }
    long endStringBuffer = System.nanoTime();
     System.out.println("StringBuffer append time  :"+(endStringBuffer-startStringBuffer));
    System.out.println("-------------------------------");

     StringBuilder sb = new StringBuilder();
    long startStringBuilder = System.nanoTime();
    for(int i=0;i<s.length();i++){
        sb = sb.append("a");
    }
    long endStringBuilder = System.nanoTime();
     System.out.println("StringBuilder append time  :"+(endStringBuilder-startStringBuilder));
    System.out.println("-------------------------------");
}

}
