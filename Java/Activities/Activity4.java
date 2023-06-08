package activities;

import java.util.Arrays;

class Activity4 {
    static void ascSort(int a[]) {
        int size = a.length, i;

        for (i = 1; i < size; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && key < a[j]) {
                a[j + 1] = a[j];
                --j;
            }
            a[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] data = { 99, 35, 13, 154, 3000,0,-1 };
        ascSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}
