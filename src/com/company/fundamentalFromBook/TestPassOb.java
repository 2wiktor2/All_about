package com.company.fundamentalFromBook;

public class TestPassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(1, 2);

        System.out.println("ob1 == ob2 : "+ ob1.equals(ob2));
        System.out.println("ob1 == ob3 : "+ ob1.equals(ob3));


        Test ob4 = new Test(3);
        Test ob5;

        ob5 = ob4.incrByTen();
        System.out.println("ob4.a = "+ ob4.a);
        System.out.println("ob5.a = "+ ob5.a);

        ob5 = ob5.incrByTen();
        System.out.println("После второго увеличения ob5.a = "+ ob5.a);

    }
}
