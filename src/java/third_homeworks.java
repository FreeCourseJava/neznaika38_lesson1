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


public class third_homeworks {


    // 2nd exercise
    public static int[] BubbleSort(int mas[]) {
        for (int i = 0; i < mas.length; i++) {
            int currentMin = mas[i];
            int indexOfMin = i;

            for (int j = i; j < mas.length; j++) {

                if (mas[j] <= currentMin) {
                    currentMin = mas[j];
                    indexOfMin = j;
                }
            }
            int tmpChangeValue = mas[indexOfMin];
            mas[indexOfMin] = mas[i];
            mas[i] = tmpChangeValue;
        }

        return mas;
    }

    // 3d exercise
    public static boolean IsDesiredYearInMas(int masOfYear[], int desiredYear){

        int left = 0;
        int right = masOfYear.length - 1;
        for ( int i = 0 ; left <= right; i++) {
                int midIndex = left + (right - left) / 2;
            if (masOfYear[midIndex] < desiredYear)
                right = midIndex + 1;
            else if (masOfYear[midIndex] > desiredYear)
                right = midIndex - 1;
            else
                return true; // key found
        }
        return false;

    }

    public static void main(String[] args) {
        
        final Random random = new Random();
        
    // 1st exercise

        int mas_int[] = new int[10];
        int countNotMIN = 0;

        for (int i = 0; i < mas_int.length; i++ ) {
            mas_int[i] = Integer.MIN_VALUE;
        }

        for (int i = 0; i < mas_int.length; i+= random.nextInt(5) ) {
            mas_int[i] = random.nextInt();
        }

        for (int i = 0; i < mas_int.length; i++)
            if (mas_int[i] != Integer.MIN_VALUE)
                countNotMIN++;
        System.out.println("Количество измененных значений массива равно " + countNotMIN);

    // 2nd exercise
        int significantYearsTatarstan[] = new int[20];
        int firstMentionYear = 1222;
        int currentYear = 2022;
        
        for (int i = 0; i < significantYearsTatarstan.length; i++ ) {
            significantYearsTatarstan[i] = firstMentionYear + random.nextInt(currentYear - firstMentionYear + 1);
        }
        significantYearsTatarstan = BubbleSort(significantYearsTatarstan);

        for (int i : significantYearsTatarstan) {
            System.out.println(i);
        }
    }


}
