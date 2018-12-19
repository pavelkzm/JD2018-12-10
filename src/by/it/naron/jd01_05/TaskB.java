package by.it.naron.jd01_05;
import static java.lang.Math.*;

public class TaskB {
    public static void main(String[] args) {
        step1();
        step2();
    }
    private static void step1(){
        double sum = 0;
        for (double a = 0; a <=2 ; a+=0.2) {
            for (int x = 1; x <=6; x++) {
                sum+= (pow(7,a)-cos(x));
            }
            System.out.printf("При a = %.2f Сумма = %f\n",a,sum);
        }
    }

    private static void step2(){

    }



}
