package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] name) {
        String s = "";
    	for (int i=0;i<name.length; i++) {
        	s = s + name[i];
        }
    	return s;
    }

}
