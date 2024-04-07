public class AstonTest3  {

    public static void main(String[] args) {

        // 3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10].
        // Необходимо написать программу, которая выведет в консоль все чётные числа.

        int[] m = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i : m) {
            boolean chet = i % 2 == 0;
            if (chet) {
                System.out.println(i);
            }
        }

    }

}

