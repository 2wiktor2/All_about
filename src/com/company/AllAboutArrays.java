package com.company;

public class AllAboutArrays {
    //  1.Создание массивов!
    //  2.Длина массива.
    //  3.Работа с массивами.
    // 4.Цикл foreach.
    // 5.Передача массива в метод.
    // 6. Возврат массива из метода.
    // 7.Методы для массива.

    // Пример : вывод четных и нечетных элементов массива
    //Пример : вывод элементов массива с четным и нечетным индексом


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

        //второй вариант с использованием цикла улучшенный for
        int total = 0;
        for (int element : myArray3) {
            total += element;
        }


        // Нахождение среди элементов массива максимальный элемент массива
        int max1 = 0;
        for (int i = 0; i < myArray3.length; i++) {
            if (max1 < myArray3[i]) max1 = myArray3[i];
        }
        System.out.println("Максимальное значение = " + max1); // Максимальное значение = 99


        // Второй вариант.
/*
        // Нахождение максимального элемента в массиве myArray из 4 элементов типа double.
        double[] myArray = {11, 5.8, 11.1, 10.9};

        // Переменной max задаем минимальное double-значение.
        double max = Double.MIN_VALUE;

        // Перебираем все элементы массива.
        for (int i = 0; i < myArray.length; i++) {
            // Переменной max с помощью метода Math.max() присваиваем максимальное значение
            // путем выбора наибольшего из двух значений ("старого" значения max и значения элемента).
            max = Math.max(max, myArray[i]);
        }

        // Выводим на экран наибольшее число массива myArray.
        System.out.println("Максимальный элемент в массиве myArray: " + max);
    }*/


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

        System.out.println("");

        for (String season : myStrArray2) {
            System.out.print(season + ", ");  // Зима, Весна, Лето, Осень,

        }
        System.out.println();

        // 5. Передача массива в метод.
/*
        public static void printArray(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }*/
        //printArray(new int[]{3, 1, 2, 6, 4, 2});

        //6. Возврат массива из метода.

        //        Метод может также возвращать массив. Например, метод, показанный ниже,
        // возвращает массив, который является реверсирование другого массива:

/*        public static int[] reverse(int[] list) {
            int[] result = new int[list.length];

            for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
                result[j] = list[i];
            }
            return result;
        }*/

        // 7.Методы для массива.


/*  №	Описание
        1	public static int binarySearch(Object[] a, Object key)
        Ищет заданный массив объектов (byte, int, double, и т.д.) для указанного значения, используя
        алгоритм двоичного поиска. Массив должен быть отсортирован до выполнения этого вызова.
         Это возвращает индекс ключа поиска, если он содержится в списке; в противном случае (-(точка вставки + 1).

        2	public static boolean equals(long[] a, long[] a2)
        Возвращает значение true, если два указанных массивах равны друг другу. Два массива считаются равными,
         если оба массива содержат одинаковое количество элементов, и все соответствующие пары элементов
          в двух массивах равны. Такой же метод может быть использован всеми другими примитивными типами
          данных (byte, short, int и т.д.).

        3	public static void fill(int[] a, int val)
        Присваивает определенное значение int к каждому элементу указанного целочисленного массива.
         Такой же метод может быть использован всеми другими примитивными типами данных (byte, short, int и т.д.).

        4	public static void sort(Object[] a)
        Этот метод сортировки сортирует указанный массив объектов в порядке возрастания,
         в соответствии с естественным порядком его элементов. Такой же метод может быть использован всеми
          другими примитивными типами данных (byte, short, int и т.д.).
  */


        // Пример : вывод четных и нечетных элементов массива

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] arr2 = {1, 45, 64, 77, 5, 434, 665, 7775, 44, 598};
        System.out.println("Четные значения - ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");  //2 4 6 8 10 12 14
            }
        }
        System.out.println();
        System.out.println("arr2 - " + arr2.length);
        System.out.println("arr - " + arr.length);
        // или

        for (int zzz : arr2) {
            if (zzz%2==0){
                System.out.print(zzz + " ");
            }
        }


        //Пример : вывод элементов массива с четным и нечетным индексом
        for (int i =0 ; i<arr.length; i++){

        }



    }
}
