package com.company;

public class Main {


    public static void main(String[] args) {

        // Создание! Создание! Создание! Создание! Создание! Создание! Создание! Создание! Создание! Создание!

        //        Создание строки.
        String str1 = "Hello world";

        // Создание строки из полученных символов
        char ch3 = str1.charAt(0);
        char ch4 = str1.charAt(1);
        char ch5 = str1.charAt(2);
        char ch6 = str1.charAt(3);
        char ch7 = str1.charAt(4);

        String demoStr1 = ch3 + "" + ch4 + "" + ch5 + "" + ch6 + "" + ch7;
        String demoStr2 = String.valueOf(ch3) + String.valueOf(ch4);

        System.out.println(ch3 + "" + ch4 + "" + ch5 + "" + ch6 + "" + ch7);
        System.out.println(demoStr1);
        System.out.println("demoStr2 = " + demoStr2);


        // Создание массива строк.
        String[] numbers = {"Один", "Два", "Три", "Четыре"};

        //  Можно создать пустой объект класса String
        String str2 = new String();
        // или
        String str3 = "";


        // Создать строку через массив символов
        char[] chars1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n'};

        String str4 = new String(chars1);
        System.out.println(str4); // abcdefghijklmn

        String str5 = new String(chars1, 0, 4);   //    ( имя массива , начало , колличество символов)
        System.out.println(str5);   // abcd

        //Можно создать объект класса String из объекта классов StringBuffer и StringBuilder
        // при помощи следующих конструкторов:

    /*    String(StringBuffer объект_StrBuf)
        String(StringBuilder объект_StrBuild)*/

        // Операторы + и += для String

        String name = "Viktor";
        String surname = "Familia";
        String nickname = "Wiktor";

        int num1 = 1000;

        String fullName1 = name + surname + nickname;
        String fullName2 = name + " " + surname + " " + nickname;
        String fullName3 = name + " " + surname + " " + nickname + num1;
        System.out.println(fullName1); //ViktorFamiliaWiktor
        System.out.println(fullName2); //Viktor Familia Wiktor
        System.out.println(fullName3); //Viktor Familia Wiktor1000


        //Доступ к строковуму ресурсу (R.string. имя ресурса)
        //String str5 = getResources().getString(R.string.barsik);


        //Возвращает длину строки
        // public int length()

        String str17 = "WIktor";
        System.out.println(str17.length());  // 6


        //Методы! Методы! Методы! Методы! Методы! Методы! Методы! Методы! Методы! Методы! Методы! Методы! Методы!


        //Создаёт новую последовательность/строку с символами из данной строки начиная с позиции start
        // до конца строки/заканчивая символом с позиции end.
        // Новая строка содержит символы от start до end - 1, поэтому берём на один символ больше.
        // public String substring(int start) и другие перегруженные версии.

        String str20 = "Viktor";
        String str21 = str20.substring(1, 4);
        String str21c = str20.substring(0, 2);
        System.out.println(str21); // ikt
        System.out.println("String str21c = " + str21c); // Vi
        String str21b = str20.substring(2);
        System.out.println("String str21b = " + str21b); // ktor
        String str21d = str20.substring(2, str20.length() - 1);
        System.out.println("String str21d = " + str21d); //  String str21d = kto

        //public CharSequence subSequence (int start, int end)
        //Аналогичен методу substring(), но может использоваться для CharSequence.


        //Для извлечения нескольких символов используйте getChars()
        String str6 = "ABCDEF";
        char ch1 = str6.charAt(2);
        System.out.println(ch1);  // C
        //textView.setText(Character.toString(myChar)); ---------- для AndroidStudio


        //Возвращает Unicode-символ в заданном индексе
        String str7 = "1234567";
        int myChar = str7.codePointAt(3);
        System.out.println(myChar); // 52
        //Возвращает Unicode-символ, который предшествует данному индексу
        int myChar2 = str7.codePointBefore(4);
        System.out.println(myChar2); // 52
        //Вычисляет количество Unicode-символов между позициями start и end
        int myChar3 = str7.codePointCount(0, 4);
        System.out.println(myChar3); // 4


        //      public int compareTo(String string)
        //        Сравнивает указанную строку, используя значения символов Unicode и вычисляет,
        //                какая из строк меньше, равна или больше следующей. Может использоваться при сортировке.
        //        Регистр учитывается. Если строки совпадают, то возвращается 0, если меньше нуля,
        //        то вызывающая строка меньше строки string, если больше нуля, то вызывающая строка больше строки string.
        //                Слова с большим регистром стоят выше слова с нижним регистром.

        String str8 = "Виктор";
        if (str8.compareTo("виктор") == 0) {
            System.out.println("Строки равны");
        } else {
            System.out.println("Строки не равны, Возвращено " + str8.compareTo("виктор")); //Строки не равны, Возвращ -32
        }
        // public int compareToIgnoreCase (String string)
        //Сравнивает указанную строку, используя значения символов Unicode, без учета регистра.
        if (str8.compareToIgnoreCase("виктор") == 0) {
            System.out.println("Строки равны");  //   Строки равны, без учета регистра.
        } else {
            System.out.println("Строки не равны, Возвращено " + str8.compareTo("виктор"));
        }
        //public String concat (String string)
        //Объединяет строку с указанной строкой. Возвращается новая строка, которая содержит объединение двух строк.
        String str9 = "Vik";
        String str10 = str9.concat("tor");
        System.out.println(str10); //  Viktor
        //Метод выполняет ту же функцию, что и оператор + и можно было написать Vik + tor.


        // public boolean contains (CharSequence cs)
        //Определяет, содержит ли строка последовательность символов в CharSequence

        String str11 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (str11.contains("CDE")) {
            System.out.println("Строка содержит последовательность символов CDE"); // return TRUE
        }

        //        public boolean contentEquals(CharSequence cs)
        //        Сравнивает CharSequence с этой строкой.

        //Без примера.


        //        public boolean contentEquals(StringBuffer strbuf)
        //        Сравнивает StringBuffer с этой строкой

        //Без примера.

        //        public static String copyValueOf (char[] data, int start, int length)
        //        Создаёт новую строку, содержащую указанные символы из массива Data начиная с позиции start
        //          (нумерация начинается с нуля) длинной length.


        //Без примера.

        //        public static String copyValueOf(char[] data)
        //        Создаёт новую строку, содержащую символы из указанного массива. Изменение массива после создания
        //          строки не изменяет созданную строку.

        //Без примера.


        // public boolean endsWith(String suffix)
        // Проверяет, заканчивается ли строка символами suffix.
        String str12 = "Wiktor";
        String str13 = "tor";
        if (str12.endsWith(str13))
            System.out.println("Строка заканчивается на " + str13);  //Строка заканчивается на tor
        else System.out.println("Строка не заканчивается на " + str13);


        //public boolean equals (Object string)
        //        Сравнивает указанный объект и строку и возвращает true, если сравниваемые строки равны,
        // т.е. содержит те же символы и в том же порядке с учётом регистра.
        String str14 = "Viktor";
        String str15 = "viktor";
        if (str14.equals(str15)) {
            System.out.println("Строки совпадают");
        } else System.out.println("Строки не совпадают"); // Строки не совпадают


        //public boolean equalsIgnoreCase(String string)
        //Сравнивает указанную строку с исходной строкой без учёта регистра и возвращает true,
        // если они равны. Диапазон A-Z считается равным диапазону a-z.
        if (str14.equalsIgnoreCase(str15)) {
            System.out.println("Строки совпадают");  //Строки совпадают
        } else System.out.println("Строки не совпадают");


        //Форматирование строк! Разобрать!!!Форматирование строк! Разобрать!!!Форматирование строк!
        //Форматирование строк! Разобрать!!!Форматирование строк! Разобрать!!!Форматирование строк!
        //Форматирование строк! Разобрать!!!Форматирование строк! Разобрать!!!Форматирование строк!
        //Форматирование строк! Разобрать!!!Форматирование строк! Разобрать!!!Форматирование строк!
        //Форматирование строк! Разобрать!!!Форматирование строк! Разобрать!!!Форматирование строк!


/*        public static String format(Locale locale, String format, Object... args)
        Возвращает отформатированную строку, используя прилагаемый формат и аргументы,
         локализованных в данной области. Например дату или время


// выводим число типа float с двумя знаками после запятой
        String.format("%.2f", floatValue);
        Склеиваем два слова, которые выводятся с новой строки. При этом второе слово выводится в верхнем регистре.


        String str1 = "Кот";
        String str2 = "васька";
        String strResult = String.format("%s\n%S", str1, str2);
// выводим результат в TextView
        infoTextView.setText(strResult);


        Конвертируем число в восьмеричную систему.

                String str1 = "8";
        int inInt = Integer.parseInt(str1); // конвертируем строку в число
        String strResult = String.format("(Восьмеричное значение): %o\n", inInt);

        infoTextView.setText(strResult);
        По аналогии выводим в шестнадцатеричной системе


        String str1 = "255";
        int inInt = Integer.parseInt(str1);
        String strResult = String.format("(Шестнадцатеричное значение): %x\n", inInt);
// число 255 будет выведено как ff
        infoTextView.setText(strResult);
        Для верхнего регистра используйте %X, тогда вместо ff будет FF.

        Для десятичной системы используйте %d.

                Дату тоже можно выводить по разному.


                Date now = new Date();
        Locale locale = Locale.getDefault();
        infoTextView.setText(
                String.format(locale, "%tD\n", now) + // (MM/DD/YY)
                        String.format(locale, "%tF\n", now) + // (YYYY-MM-DD)
                        String.format(locale, "%tr\n", now) + // Full 12-hour time
                        String.format(locale, "%tz\n", now) + // Time zone GMT offset
                        String.format(locale, "%tZ\n", now)); // Localized time zone bbreviation
        Допустим, при выводе double получается 3.0. Как вывести 3, т.е. без нуля. И с учетом того,
        что например 3.1 должно выводиться как 3.1. Округление здесь не поможет.


        public static String fmt(double d) {
            if (d == (long) d) {
                return String.format("%d", (long) d);
            } else {
                return String.format("%s", d);
            }
        }*/


        //Проверяет, является ли строка пустой
        // public boolean isEmpty ()
        String str16 = "";
        if (str16.isEmpty()) {
            System.out.println("Пусто");  // Пусто
        }
        //Данный метод появился в API 9 (Android 2.1). Для старых устройств используйте String.length() == 0


        //Меняет символ или последовательность символов target на replacement.
        String str18 = "WIktor";
        String str19 = str18.replace("WIk", "Vick");
        System.out.println(str19); // Vicktor


        //Разбивает строку на массив из слов. Например,
        // есть строка Васька Рыжик Мурзик Барсик и мы хотим получить массив имён котов:
        //public String[] split (String regularExpression) и другие перегруженные версии

        String catNames = "Васька Рыжик Мурзик Барсик";
        String aCats[] = catNames.split(" ");  // по пробелу

 /*       Получим:

        aCats[0] = Васька
        aCats[1] = Рыжик
        aCats[2] = Мурзик
        aCats[3] = Барсик          */

        //Также можно использовать регулярное выражение \\s+, чтобы учитывать
        // любые типы пробелов, включая двойные и более пробелы подряд.
        //String[] words = someString.split("\\s+");

        //Удаляет пробелы в начале и в конце строки.
        // public String trim()
        String str22 = "    Viktor    !     ";
        String str23 = str22.trim();
        System.out.println(str23); //"Viktor    !"
        // или
        String str24 = "    Viktor    !     ".trim();


        //public int indexOf (int ch, int fromIndex)
        //Ищет индекс символа сh, начиная с позиции fromIndex
        String demoString = "Wikkktor";
        demoString.indexOf(0);
        System.out.println("indexOf(0) = " + demoString.indexOf('k'));

//        public int indexOf(int ch) — возвращает индекс в данной строке первого вхождения указанного символа или -1,
        // если символ не встречается.
//        public int indexOf(int ch, int fromIndex) — возвращает индекс в данной строке первого вхождения
        // указанного символа, начиная поиск по указанному индексу, или значение -1, если символ не встречается.
//        int indexOf(String str) — возвращает индекс в данной строке первого вхождения указанной подстроки.
        // Если эта подстрока не встречается, возвращается -1.
//        int indexOf(String str, int fromIndex) — возвращает индекс в данной строке первого вхождения
        // указанной подстроки, начиная с указанного индекса. Если не встречается, возвращается -1.


        /*String testString = "котёнок";
        // вернёт -1, так как после 5 символа буквы ё нет
        infoTextView.setText(String.valueOf(testString.indexOf('ё', 4)));*/



        //разделить строку на слова
            //String Str = new String("Разделяем эту строку на слова");
/*
            for (String retval : Str.split(" ")) {
                System.out.println(retval);
            }*/


    }
}
