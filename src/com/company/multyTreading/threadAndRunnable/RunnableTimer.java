package com.company.multyTreading.threadAndRunnable;

public class RunnableTimer implements Runnable {
    @Override
    public void run() {
        // Здесь указывается то действие которое должно выполняться в другом потоке
        // Пусть метод выводит число 1 сто раз
        for (int i = 0; i < 100; i++) {
            System.out.println(1);
        }
    }
}
