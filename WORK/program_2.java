/*
Написать алгоритм поиска простых чисел (делятся только на себя и
на 1) в диапазоне от 1 до N. В алгоритме будет использоваться
вложенный for, что явно говорит о квадратичной сложности, на этом
стоит акцентировать внимание
*/

public class Main {
    public static void main(String[] args) {

public static int sum(int n) {
        int sum = 1;
        for (int i = 2; i <= n; i++)
            sum += i;
        return sum;
    }

    public static int sum2(int n) {
        if (n <= 1)
            return 1;
        return n + sum2(n - 1);
    }

    public static int sum3(int n) {
        return n * (n + 1) / 2;
    }


}
