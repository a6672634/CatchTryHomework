package org.itstep.qa.runner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RunnerMassiv {
    public static void main(String[] args) {
        // Организовать ввод с клавиатуры массива элементов заданного
        // типа (целых чи1сел).
        // Проверку корректности ввода реализовать через обработку исключений.
        // (Можно отслеживать InputMismatchException).
        //В случае если пользователь ввел некорректное значение,
        // заполнять соответствующую ячейку массива значением по умолчанию
                  Scanner sc = new Scanner(System.in);
            int[] array = new int[10];
            System.out.println("Введите любое значение");
            for (int i = 0; i < array.length; i++) {
                try {
                    array[i] = sc.nextInt();
                } catch (InputMismatchException ex) {

                    array[i] = 0;
                    sc.next();
                }
            }
            for (int i = 0; i < array.length; i++)
                System.out.print(array[i] + " ");
        }
    }

