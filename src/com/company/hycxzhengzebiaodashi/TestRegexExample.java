package com.company.hycxzhengzebiaodashi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class TestRegexExample {
    /*public static void main(String[] args){
        String content = "I am noob" + "from runoob.com.";
        String pattern = ".*runoob.*";
        boolean isMacth = Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了'runnob' 子字符串？" + isMacth);
    }*/

    public static void main(String[] args){
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(\\D*)(\\d+)(.*)";
        Pattern r  = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if(m.find()){
            System.out.println("Found value:" + m.group(0));
            System.out.println("Found value:" + m.group(1));
            System.out.println("Found value:" + m.group(2));
            System.out.println("Found value:" + m.group(3));
        }else{
            System.out.println("NO MATCH");
        }

    }
}
