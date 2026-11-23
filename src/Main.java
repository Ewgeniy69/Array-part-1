public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание курса");

        System.out.println("Task 1");

        int[] array = new int[]{1, 2, 3};

        double[] array2 = {1.57, 7.654, 9.986};

        int[] array3 = new int[5];
        array3[0] = 5;
        array3[1] = 10;
        array3[2] = 15;
        array3[3] = 20;
        array3[4] = 25;

        System.out.println("Task 2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length - 1; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println(array2[2]);
        for (int i = 0; i < array3.length - 1; i++) {
            System.out.print(array3[i] + ", ");
        }
        System.out.println(array3[4]);

        System.out.println("Task 3");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i > 0) {
                System.out.print(", ");
            }

        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Task 4");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]++;
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println("Задачи от ИИ");
        System.out.println("---1");
        int[] aI = {5, 10, 15, 20, 25};
        int sum = 0;
        for (int a : aI) {
            sum = sum + a;
        }
        System.out.println(sum);

        System.out.println("---2");
        int[] aI2 = {3, 5, 7, 9, 4};
        int max = aI2[0];
        for (int i : aI2) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
        System.out.println("---3");
        int[] aI3 = {4, 8, 15, 16, 23, 42};
        sum = 0;
        for (int i : aI3) {
            sum += i;
        }
        sum = sum / aI3.length;
        System.out.println("Среднее значение массива - " + sum);
        System.out.println("---4");
        aI = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i : aI) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Всего четных чисел в массиве - " + count);
        System.out.println("---5");
        aI = new int[]{-5, 3, -2, 7, 0, -1, 4};
        for (int i : aI) {
            if (i > 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("---6");
        aI = new int[]{1, 2, 3, 4, 5};
        for (int i = 0; i < aI.length / 2; i++) {
            int temp = aI[i];
            aI[i] = aI[aI.length - 1 - i];
            aI[aI.length - 1 - i] = temp;
        }
        for (int i : aI) {
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.println("---7 SWAP");
        int a = 20;
        int b = 30;
        int box = a;
        a = b;
        b = box;
        System.out.println("A - " + a + " B - " + b);

        System.out.println("---8 SWAP");
        aI = new int[]{5, 10, 15, 20};
        box = aI[0];
        aI[0] = aI[3];
        aI[3] = box;
        for (int i : aI) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---9 SWAP");
        aI = new int[]{1, 2, 3, 4, 5, 6};
        for (int i = 0; i < aI.length - 1; i += 2) {
            box = aI[i];
            aI[i] = aI[i + 1];
            aI[i + 1] = box;
        }
        for (int i : aI) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("---10 SWAP");

        aI = new int[]{10, 20, 30, 40, 50, 60};
        for (int i = 0; i < aI.length / 2; i++) {
            box = aI[i];
            aI[i] = aI[aI.length - 1 - i];
            aI[aI.length - 1 - i] = box;
        }
        for (int i:aI) {
            System.out.print (i + " ");

        }
        System.out.println();
        System.out.println("---Цикл For-each # 1");
        aI = new int[]{1, 2, 3, 4, 5, 6};
        for (int i : aI) {
            System.out.println(i);
        }

        System.out.println("---Цикл For-each # 2");
        aI = new int[]{9, 3, 5, 7, 1};
        sum = 0;
        for (int i : aI) {
            sum +=i;
        }
        System.out.println(sum);

        System.out.println("---Цикл For-each # 3");
        aI = new int[]{2, 10, 11, 12, 4, 9, 14, 3, 7};
        count = 0;
        for (int i : aI) {
            if (i % 2 == 0) {
                count ++;
            }
        }
        System.out.println(count);

        System.out.println("---Цикл For-each # 4");
        aI = new int[]{3, 7, 5, 1, 9, 8};
        max = aI[0];
        for (int i : aI) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);

        System.out.println("---Цикл For-each # 5");
        aI = new int[]{-3, 7, -5, -1, -9, 8, 0};
        for (int i : aI) {
            if (i > 0) {
                System.out.print(i + " ");
            }
        }




    }


}