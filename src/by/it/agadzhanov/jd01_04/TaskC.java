/**package by.it.agadzhanov.jd01_04;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line=scanner.nextLine();
        buildOneDimArray(line);

    }

    private static void buildOneDimArray(String line) {
        double[] array = InOut.getArray(line);
        InOut.printArray(array, "V", 5);

        double first = array[0];
        double last = array[array.length - 1];

        double[] sortedArray=mergeSort(array,0,array.length-1);
        InOut.printArray(sortedArray, "V", 4);

        for (int i = 0; i < array.length; i++) {
            if (first == sortedArray[i]) {
                System.out.printf("Index of first element=%d\n", i);
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (last == sortedArray[i]) {
                System.out.printf("Index of last element=%d\n", i);
                break;
            }
        }
    }

    private static double[] merge(double[] part1, double[] part2) {
        int totalLength = part1.length + part2.length;
        double[] mergedMas = new double[totalLength];
        int l=0;
        int r=0;
        int i=0;
        while (l+r<totalLength) {
            if (l<part1.length  || r>=part2.length && part1[l]<part2[r]) {
                mergedMas[i++]=part1[l++];
            }
            else mergedMas[i++]=part2[r++];


        }
        for (int i = 0; i < totalLength; i++) {
            for (int j = 0; j < part1.length; j++) {
                for (int k = 0; k < part2.length; k++) {
                    if (part1[j] < part2[k]) {
                        mergedMas[i] = part1[j];
                        j++;
                        i++;
                    }
                    else if (part2[k] < part1[j]) {
                        mergedMas[i] = part2[k];
                        k++;
                        i++;
                    }
                    else {
                        mergedMas[i] = part1[j];
                        j++;
                        i++;
                    }
                }
            }
        }
        return mergedMas;
    }

    private static double[] mergeSort(double[] array, int left, int right) {
        double[] sortedArray=new double[array.length];
        if (left < right) {
            int middle = (left + right) / 2;
            double[] arrayLeft=new double[middle-left+1];
            double[] arrayRight=new double[right-middle];
            for (int i = left; i <=middle ; i++) {
                arrayLeft[i-left]=array[i];
            }
            for (int j = middle+1; j <=right ; j++) {
                arrayRight[j-(middle+1)]=array[j];
            }
            sortedArray = merge(mergeSort(arrayLeft, left, middle), mergeSort(arrayRight, middle + 1, right));
        }
        return sortedArray;
    }
}
 */