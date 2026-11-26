import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Практика на уроке");
        int[] weights = {59, 60, 67, 54, 90, 0};
        int[] weightsCopy = {59, 60, 67, 54, 90, 0};
        boolean arraysAreEqual = true;
        arraysAreEqual = weights.length == weightsCopy.length;
        if (arraysAreEqual) {
            for (int i = 0; i < weights.length; i++) {
                if (weights[i] != weightsCopy[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Arrays ok");
        } else {
            System.out.println("Arrays not OK");
        }
        int maxWeight = -1;
        for (int i : weights) {
            if (i > maxWeight) {
                maxWeight = i;
            }
        }
        System.out.println(maxWeight);
        for (int i = 0; i < weights.length - 1 && weights[i + 1] != 0; i++) {
            System.out.print(weights[i + 1] - weights[i]);
            if (i < weights.length - 2) {
                System.out.print(",");
            }
            Arrays.sort(weights);
        }
        System.out.println();
        System.out.println(Arrays.toString(weights));
        int[] arrays = new int[10];
        Arrays.fill(arrays, 1);
        for (int i : arrays) {
            System.out.print(arrays[i]);
        }


        System.out.println();
        System.out.println("Домашнее задание из курса!!!");
        System.out.println("Task # 1");

        int[] pay = new int[]{40, 20, 60, 3};
        int sum = 0;
        for (int number : pay) {
            sum += number;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " руб.");

        System.out.println("Task # 2");

        int max = pay[0];
        int min = pay[0];
        for (int number : pay) {
            if (number > max) {
                max = number;
            }
            if (number <= min) {
                min = number;
            }
        }
        System.out.println("Минимальная трата за месяц составила " + min + " руб. Максимальная трата за месяц составила " + max + " руб.");

        System.out.println("Task # 3");
        sum = 0;
        for (int number : pay) {
            sum += number;
        }
        double average = (double) sum / pay.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " руб.");
//Код для SWAP с добавлением новой переменной внутри цикла
        System.out.println("Task # 4");
        char[] reverseFulName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < reverseFulName.length / 2; i++) {
            int j = reverseFulName.length - 1 - i;
            char temp = reverseFulName[i];
            reverseFulName[i] = reverseFulName[j];
            reverseFulName[j] = temp;
        }
        for (int elm: reverseFulName) {
            System.out.print(elm);
        }
        System.out.println();
//Более простой код для SWAP
        System.out.println("Еще одно решение задачи № 4");
        char[] reverseFulName1 = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int left = 0;
        int right = reverseFulName1.length-1;
        while (left < right) {
            char temp = reverseFulName1[left];
            reverseFulName1[left] = reverseFulName1[right];
            reverseFulName1[right] = temp;
            left++;
            right--;
        }
        for (char name: reverseFulName1) {
            System.out.print(name);
        }
        System.out.println();
//Пишу код для массива без разворота, а просто обратный вывод
        int[] practice = new int[]{1, 2, 3, 4, 5};
        for (int i = practice.length - 1; i >= 0; i--)
            System.out.print(practice[i]);

    }
}





