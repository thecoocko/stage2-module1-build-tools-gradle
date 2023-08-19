package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        try {
            return Double.valueOf(str) > 0 ? true : false;
        }
        catch (Exception e){
            return false;
        }

    }
}
