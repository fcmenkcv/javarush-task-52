package com.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/*
Площадь круга
*/

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        double pi = 3.14;
        double res = pi * radius * radius;

        System.out.println((int)(res));
    }
}
