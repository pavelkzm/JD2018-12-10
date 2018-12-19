package by.it.skosirskiy.jd01_04;


import java.util.Scanner;

public class TaskB {
    public static void main (String[] args) {
        System.out.println("Введите количество сотрудников");
        Scanner scanner= new Scanner(System.in);
        int kol_chel = scanner.nextInt();
        float itogo = 0;
        float srednee=0;
        Scanner scanner2= new Scanner(System.in);
        int [][] arrayZp= new int[kol_chel][4];

        Scanner sc= new Scanner(System.in);

        System.out.println("Введите фамилии");
        String []arr= new String[kol_chel];
        for (int i = 0; i < kol_chel; i++) {
            arr[i]= sc.next();
        }


        for (int i = 0; i < kol_chel; i++) {
            System.out.printf("%15s %15s \n", "Введите заплату ", arr[i]);
            for (int j = 0; j <4 ; j++) {
                arrayZp[i][j]=scanner2.nextInt();
            }
        }

        System.out.println("-------------------------------------------------------------------------------------------------");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-10s%n", "Фамилия", "Квартал1", "Квартал2","Квартал3","Квартал4", "Итого");

        for (int i = 0; i < kol_chel; i++) {
            int buf=0;
            System.out.printf("\n%-10s", arr[i]);
            for (int j = 0; j < 4; j++) {

                System.out.printf("%-10d ", arrayZp[i][j]);
                buf=buf+arrayZp[i][j];
            }
            System.out.printf("%-10d ", buf);
        }

        for (int i = 0; i < kol_chel; i++) {

            for (int j = 0; j <4 ; j++) {

                itogo=itogo+arrayZp[i][j];
            }

        }
        System.out.println();
        System.out.println("-------------------------------------------------------------------------------------------------");
        srednee=itogo/(kol_chel*4);
        System.out.printf("\n %-10s %7.0f \n %-10s %5.3f", "итого:",  itogo, "среднее", srednee);
    //System.out.printf("\n itogo: %7d \n srednee: %5.4f", itogo, srednee);



    }



}

