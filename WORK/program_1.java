/*
Необходимо написать алгоритм, считающий сумму всех чисел
от 1 до N. Согласно свойствам линейной сложности,
количество итераций цикла будет линейно изменяться
относительно изменения размера N.
*/

public class Main {
    public static void main(String[] args) {

        int n = 5000;

        long start1 = System.nanoTime();
        simpleNumbers(n);
        long end1 = System.nanoTime();
        long start2 = System.nanoTime();
        simpleNumbers2(n);
        long end2 = System.nanoTime();
        long start3 = System.nanoTime();
        simpleNumbers3(n);
        long end3 = System.nanoTime();

        System.out.println((end1 - start1) + " ns");
        System.out.println((end2 - start2) + " ns");
        System.out.println((end3 - start3) + " ns");


    }

    public static void simpleNumbers(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isSimple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void simpleNumbers2(int n) {
        for (int i = 2; i <= n; i++) {
            boolean isSimple = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void simpleNumbers3(int n) {
        int[] simpleNumbers = new int[n / 2];
        simpleNumbers[0] = 2;
        int lastIndex = 0;
        for (int i = 2; i <= n; i++) {
            boolean isSimple = true;
            for (int j = 0; simpleNumbers[j] * simpleNumbers[j] <= i; j++) {
                if (i % simpleNumbers[j] == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) {
                System.out.print(i + " ");
                lastIndex++;
                simpleNumbers[lastIndex] = i;
            }
        }
        System.out.println();
    }