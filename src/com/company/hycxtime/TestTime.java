package com.company.hycxtime;

import com.sun.tools.classfile.Synthetic_attribute;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestTime {
   /*
    public static void main(String[] args){
        Date date = new Date();
        System.out.println(date.toString());
    }*/

/*
    public static void main(String[] args){
       Date dNow = new Date();
       SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
       System.out.println("当前时间为：" + ft.format(dNow));
    }
*/
    /*
    public static void main(String[] args){
        Date date = new Date();
        System.out.printf("全部日期和时间信息：%tc%n",date);
        System.out.printf("年-月-日格式：%tF%n",date);
        System.out.printf("月/日/年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        System.out.printf("HH：MM：SS格式（24时制）：%tT%n",date);
        System.out.printf("HH：MM格式（24时制）：%tR",date);
    }*/
    /*
    public static void main(String[] args){
        try{
            System.out.println(new Date() + "\n");
            Thread.sleep(1000*3);
            System.out.println(new Date() + "\n");
        }catch(Exception e){
            System.out.println("Got an expection!");
        }
    }*/
    /*
    public static void main(String[] args){
        try{
            long start = System.currentTimeMillis();
            System.out.println(new Date() + "\n");

            Thread.sleep(5*60*10);

            System.out.println(new Date() +"\n");
            long end = System.currentTimeMillis();

            long diff = end - start;
            System.out.println("Difference is:" + diff);
        }catch(Exception e){
            System.out.println("Got an exception!");
        }
    }*/
    public static void main(String[] args){
        String months[] = new String[]{
                "Jan", "Feb", "Mar", "Apr",
                "May", "Jun", "Jul", "Aug",
                "Sep", "Oct", "Nov", "Dec"
        };
        int year;
        GregorianCalendar gcalendar = new GregorianCalendar();

        System.out.println("Date:");
        System.out.println(months[gcalendar.get(Calendar.MONTH)]);
        System.out.println(""+gcalendar.get(Calendar.DATE) + "");
        System.out.println(year = gcalendar.get(Calendar.YEAR));

        System.out.println("Time:");
        System.out.println(gcalendar.get(Calendar.HOUR) + ":");
        System.out.println(gcalendar.get(Calendar.MINUTE) + ":");
        System.out.println(gcalendar.get(Calendar.SECOND));

        if (gcalendar.isLeapYear(year)){
            System.out.println("当前年份是闰年");
        }else{
            System.out.println("当前年份是平年");
        }
    }


}
