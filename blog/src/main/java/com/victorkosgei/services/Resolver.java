package com.victorkosgei.services;

public class Resolver {

    public static String resolve(String filename) {
        return "WEB-INF/" + filename + ".jsp";
    }
}
