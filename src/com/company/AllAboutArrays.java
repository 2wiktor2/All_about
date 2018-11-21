package com.company;

public class AllAboutArrays {
    //  1.Создание массивов!
    //  2.Длина массива.
    //  3.Работа с массивами.
    // 4.Цикл foreach


    public static void main(String[] args) {

        //dataType[] myList;   ---  объявление переменной для ссылки на массив.


        // 1.Создание массивов!


        int[] myArray0;
        myArray0 = new int[8]; // Создание массива длиной 8, с пустыми ячейками.

        // или

        int[] myArray1 = new int[10];  // Создание массива длиной 10, с пустыми ячейками.
        String[] myStrArray1 = new String[4];

        // или

        int[] myArray2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] myStrArray2 = {"Зима", "Весна", "Лето", "Осень"};
        // Отсчет индексов ведется от 0; то есть они начинают от 0 и до arrayRefVar.length-1.
        int[] myArray3 = new int[10];
        myArray3[0] = 5;
        myArray3[1] = 51;
        myArray3[2] = 15;
        myArray3[3] = 1;
        myArray3[4] = 99;
        myArray3[5] = 7;
        myArray3[6] = 82;
        myArray3[7] = 15;
        myArray3[8] = 22;
        myArray3[9] = 8;


        // 2.Длина массива


        int x = myArray2.length;
        System.out.println("Длина массива через переменную x = " + x); // Длина массива через переменную x = 10
        System.out.println("Длина массива напрямую = " + myStrArray2.length); // Длина массива напрямую = 4


        // 3.Работа с массивами.


        // Вывести на экран все элементы массива
        String allNumbersInString = "";
        for (int i = 0; i < myArray2.length; i++) {
            System.out.print(myArray2[i] + ", "); // 1 2 3 4 5 6 7 8 9 10
            // или
            allNumbersInString = allNumbersInString + myArray2[i];

        }
        System.out.println("");
        System.out.println(allNumbersInString); //  12345678910

        //Сумма элементов массива
        int totalSumm1 = 0;
        for (int i = 0; i < myArray2.length; i++) {
            totalSumm1 += myArray2[i];  //   =  totalSumm =totalSumm + myArray2[i]
            System.out.print(totalSumm1 + " ");
        }
        System.out.println(totalSumm1);

        // Нахождение среди элементов массива наибольшего
        int max1 = 0;
        for (int i = 0; i < myArray3.length; i++) {
            if (max1 < myArray3[i]) max1 = myArray3[i];
        }
        System.out.println("Максимальное значение = " + max1); // Максимальное значение = 99

        // 4.Цикл foreach
    /*              for(объявление : выражение)
                  {
                  Операторы
                  }                                                         */

        System.out.println("Перебор массива в цикле улучшенный for: ");
        for (int x1 : myArray2) {
            System.out.print(x1 + ", ");  //Перебор массива в цикле улучшенный for:   1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
        }
        System.out.println("");

        for (int x2 : myArray3) {
            System.out.print(x2 + ", "); //5, 51, 15, 1, 99, 7, 82, 15, 22, 8,
        }


    }
}
