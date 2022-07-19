package thirdExercise;

import java.util.Random;

/*
* 1. Создать массив интов, заполнить его значениями Integer.MIN_VALUE.
Поменять какие-то значения в массиве.
Посчитать сколько элементов массива не равны Integer.MIN_VALUE.
Таким образом получим сколько элементов менялось от первоначального.

* 2. Составить массив из значимых годов Республики Татартсан (любые 20),
*  добавить их в массив в рандомном порядке, написать метод, принимающий массив годов (интов) и
*  возвращающий их в отсортированном порядке. Сортировку реализовать методом bubble sort
* (пузырьковая сортировка).

* Для тех кто осилил второе задание.
3. Написать метод, который на вход принимает отсортированный массив годов (из 2-го задания) и
* произвольный год, возвращает boolean значение, которое означает наличие или отсутствие даты
* в переданном массиве. Читаем и используем binary search (бинарный поиск).
* */


public class ThirdHomeworks {

    public static void firstExercise(){
        final Random random = new Random();
        int[] arrayOfInt = new int[10];
        int countNotMIN = 0;

        for (int i = 0; i < arrayOfInt.length; i++) {
            arrayOfInt[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < arrayOfInt.length; i += random.nextInt(5)) {
            arrayOfInt[i] = random.nextInt();
        }

        for (int i = 0; i < arrayOfInt.length; i++) {
            if (arrayOfInt[i] != Integer.MIN_VALUE) {
                countNotMIN++;
            }
        }
        System.out.println("Количество измененных значений массива равно " + countNotMIN);
    }

    public static void secondExercise(){
        final Random random = new Random();
        int[] significantYearsTatarstan = new int[20];
        int firstMentionYear = 1222;
        int currentYear = 2022;

        for (int i = 0; i < significantYearsTatarstan.length; i++) {
            significantYearsTatarstan[i] = firstMentionYear + random.nextInt(currentYear - firstMentionYear + 1);
        }
        significantYearsTatarstan = bubbleSort(significantYearsTatarstan);

        for (int i : significantYearsTatarstan) {
            System.out.println(i);
        }
    }
    public static int[] bubbleSort(int[] arrayToSort) {
        for (int i = 0; i < arrayToSort.length; i++) {
            int currentMin = arrayToSort[i];
            int indexOfMin = i;

            for (int j = i; j < arrayToSort.length; j++) {

                if (arrayToSort[j] <= currentMin) {
                    currentMin = arrayToSort[j];
                    indexOfMin = j;
                }
            }
            int tmpChangeValue = arrayToSort[indexOfMin];
            arrayToSort[indexOfMin] = arrayToSort[i];
            arrayToSort[i] = tmpChangeValue;
        }

        return arrayToSort;
    }

    // 3d exercise
    public static boolean isDesiredYearInArray(int[] masOfYear, int desiredYear) {

        if (masOfYear.length == 0) {
            return false;
        }

        int left = 0;
        int right = masOfYear.length - 1;
        for (int i = 0; left <= right; i++) {
            int midIndex = left + (right - left) / 2;
            if (masOfYear[midIndex] < desiredYear) {
                left = midIndex + 1;
            }
            else if (masOfYear[midIndex] > desiredYear){
                right = midIndex - 1;
            }
            else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
    }
}
