package com.company.fundamentalFromBook;

public class Test {
    int a, b;
    int c;


    // конструктор
    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test (int i){
        a=i;
    }

/*    Метод может возвращать любой тип данных, в том числе созданные типы классов.
            Так, в приведенном ниже примере программы метод icrByTen() возвращает
    объект, в котором значение переменной а на 10 больше значения этой переменной
    в вызывающем объекте.*/

Test incrByTen(){
    Test temp  = new Test(a+10);
    return temp;
}



    // возвратить логическое значение true, если в качестве
    //параметра о указан вызывающий объект

    boolean equals (Test obj){
        if (obj.a ==a && obj.b ==b) return true;
        else return false;
    }
}
