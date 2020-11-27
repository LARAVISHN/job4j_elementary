package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {

        int[] res = new int[left.length + right.length];

        int i = 0, j = 0;
        for (int k = 0; k < res.length; k++) {

            if (i > left.length - 1) {
                int a = right[j];
                res[k] = a;
                j++;
            } else if (j > right.length - 1) {
                int a = left[i];
                res[k] = a;
                i++;
            } else if (left[i] < right[j]) {
                int a = left[i];
                res[k] = a;
                i++;
            } else {
                int b = right[j];
                res[k] = b;
                j++;
            }
        }


        return res;
    }
}
