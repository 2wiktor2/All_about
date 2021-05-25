package com.company.multyTreading.threadAndRunnable;

public class MultiTreadingThreadAndRunnable {

    static boolean isFive = false;


    public static void main(String[] args) {

        // Первым делом создаем новый поток. (Thread timer = new Thread();)
        // В который нужно передать объект типа Runnable. Передать экземпляр класса который реализует интерфейс Runnable.
        Thread timer = new Thread();

        // создать отдельный класс который реализует интерфейс Runnable. Создать ибъект этого класса и передать в new Thread(); в качестве параметра
        // Создать обект класса RunnableTimer и передатьего в thread
        RunnableTimer runnableTimer = new RunnableTimer();
        Thread timer2 = new Thread(runnableTimer);
        timer2.start();

        // Короткий вариант. Анонимный класс передается в качестве параметра
        Thread timer3 = new Thread(new Runnable() {
            @Override
            public void run() {
                // Пусть метод выводит число 1 сто раз
/*                for (int i =0; i<100; i++){
                    System.out.println(1);
                }*/


                //Таймер
/*                try {
                    for (int i = 0; i < 100; i++) {
                        System.out.println(i);
                        Thread.sleep(1000);
                    }
                } catch (Exception e){

                }*/

                //Бесконечный таймер
/*                try {
                    int i= 0;
                    while (true){
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (Exception e){

                }*/

            }
        });
        timer3.start();

        // Задача: остановить первый второй таймер когда первый досчитает до 5
        // Завись в виде лямбды!!!!!!!!!!!!!!!!!!
        Thread timer4 = new Thread(() -> {
            try {
                int i = 0;
                while (true) {
                    if (i == 5) {
                        isFive = true;
                    }
                    System.out.println(i);
                    i++;
                    Thread.sleep(1000);
                }
            } catch (Exception e) {

            }

        });
        timer4.start();

        Thread timer5 = new Thread(() -> {
            try {
                int i = 0;
                while (!isFive) {
                    System.out.println(i + "121312");
                    i++;
                    Thread.sleep(1000);
                }
            } catch (Exception e) {

            }

        });
        timer5.start();
    }
}
