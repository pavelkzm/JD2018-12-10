package by.it.zagurskaya.jd01_05;
import static java.lang.Math.*;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

public class TaskA {
    public static void maim (String[] arg ){
        step1();
        step2();
        step3();
    }

    private static void step1() {
        double x=0.3;
        double a=756.13;
       // double part1=Math.cos(Math.pow((x*x+ Math.PI/6),5));
        double part1=cos(pow((x*x+ Math.PI/6),5));
        double part2=sqrt(x*pow(a,3));
        double part3=log(abs((a-1.12*x)/4));
        double z=part1-part2-part3 ;
        System.out.println(z+"z");
    }
    private static void step2() {
    }
    private static void step3() {
    }
}
