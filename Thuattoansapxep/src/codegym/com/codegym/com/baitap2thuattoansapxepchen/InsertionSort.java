package codegym.com.codegym.com.baitap2thuattoansapxepchen;

public class InsertionSort {
    static int[] list = {1,3,2,6,9,8};

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currenElement = list[i];
            int j;
            for (j = i - 1; j >= 0 && list[j] > currenElement; j--) {
                list[j + 1] = list[j];
            }
            list[j + 1] = currenElement;
        }

    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
