package com.aurea;

public class HelloWorld {

    // UWF_UNWRITTEN_PUBLIC_OR_PROTECTED_FIELD
    // MS malicious code
    public static Integer a;

    public static void main(String[] args) {
        System.out.println("Hello World!" + a);
    }
}
