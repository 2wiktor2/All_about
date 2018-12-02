package com.company;

public class MultidimensionalArray {
    public static void main(String[] args) {

        //Объявление двухмерного массива
        int twoD[][] = new int[4][5];


        // Инициализация

        int m[][] = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5}
        };

        // трехмерный массив
        int threeD[][][] = new int[3][5][7];


        // Элементы массива нумеруются слева направо и сверху вниз, и выводятся значения:

        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                twoD[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 5; j++) {
                System.out.print(twoD[i][j] + "  ");

            }
            System.out.println();
        }

        // резервирование памяти для второго измерения массива вручную
        int twoD2[][] = new int[4][];
        twoD2[0] = new int[5];
        twoD2[1] = new int[5];
        twoD2[2] = new int[5];
        twoD2[3] = new int[5];

        // резервирование памяти для второго измерения массива вручную для массива с разной размерностью второго измерения
        int twoD3[][] = new int[4][];
        twoD3[0] = new int[1];
        twoD3[1] = new int[2];
        twoD3[2] = new int[3];
        twoD3[3] = new int[4];
    }
}