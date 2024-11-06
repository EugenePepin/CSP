//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int size = 10;  // Розмір масиву
        int[] array = generateRandomArray(size);

        // Виведення масиву
        System.out.print("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Виклик методів
        int negativeCount = countNegativeElements(array);
        int sumAfterMinAbs = sumAfterMinAbsElement(array);

        // Виведення результатів
        if (negativeCount == 0){
            System.out.println("В масиві відсутні від'ємні елементи)");
        }
        else {
            System.out.println("Кількість від'ємних елементів: " + negativeCount);
        }
        System.out.println("Кількість від'ємних елементів: " + negativeCount);
        System.out.println("Сума елементів після мінімального за модулем елемента: " + sumAfterMinAbs);
    }
        // генерація випадкового масиву
        public static int[] generateRandomArray(int size) {
            int[] array = new int[size];
            Random random = new Random();


            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(201) - 100;
            }

            return array;
        }
  //визначення к-сті від'ємних елементів
    public static int countNegativeElements(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num < 0) {
                count++;
            }
        }
        return count;
    }

   //визначення суми від'ємних елементів
    public static int sumAfterMinAbsElement(int[] array) {

        int minAbsIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (Math.abs(array[i]) < Math.abs(array[minAbsIndex])) {
                minAbsIndex = i;
            }
        }


        int sum = 0;
        for (int i = minAbsIndex + 1; i < array.length; i++) {
            sum += array[i];
        }

        return sum;
    }
    }