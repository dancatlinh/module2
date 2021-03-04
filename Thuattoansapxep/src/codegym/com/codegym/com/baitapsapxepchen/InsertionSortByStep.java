package codegym.com.codegym.com.baitapsapxepchen;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSortByStep(list);
    }

    public static void insertionSortByStep(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currenElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currenElement; j--) {
                list[j + 1] = list[j];
            }
            System.out.println("Insert the current element into  list[j+1]");
            list[j + 1] = currenElement;
        }
    }
}
