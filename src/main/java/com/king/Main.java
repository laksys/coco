package com.king;

public class Main {
    public String getMessage(String str){
        StringBuffer sb = new StringBuffer();
        if( str == null || str.length() == 0)
            sb.append("Please provide a name");
        else
            sb.append("Hello " + str + "!");

        return sb.toString();
    }
}
