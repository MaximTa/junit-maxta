package com.geekbrains.junit.maxta;

public class MainApp {
    public static void main(String[] args) {

        final int[] result = process(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(result);
    }

    public static int[] process(int[] arrIn) {
        int[] afterFourArr = new int[2];
        if (arrIn.length == 0) {

            return arrIn;
        }
        for (int i = arrIn.length - 3; i >= 0; i--) {
            if (arrIn[i] == 4) {
                System.arraycopy(arrIn, (i + 1), afterFourArr, 0, 2);
                return afterFourArr;
            }
        }
        throw new RuntimeException("В массиве нет ни одной 4-ки");
    }
}