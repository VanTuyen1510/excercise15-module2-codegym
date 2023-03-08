package ss14_excercise_insertion_sort.excercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            int k = i - 1;
            for (; k >= 0 && array[k] > currentElement; k--) {
                array[k + 1] = array[k];
            }
            array[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " values :");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "\t");
        }
        sort(array);
        System.out.println("The newly sorted array is: :" + Arrays.toString(array));

    }

}
