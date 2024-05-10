package proj;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class Operations {

    public static int _min(int[] numbers) {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    public static int _max(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    public static int _sum(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static int _mult(int[] numbers) {
        int mult = 1;
        for (int number : numbers) {
            mult *= number;
        }
        return mult;
    }

    public static void main(String[] args) {
        File file = new File("numbers.txt");
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            scanner.close();

            String[] numbers = line.split(" ");

            int[] intNumbers = new int[numbers.length];
            for (int i = 0; i < numbers.length; i++) {
                intNumbers[i] = Integer.parseInt(numbers[i]);
            }

            System.out.println("Минимальное: " + _min(intNumbers));
            System.out.println("Максимальное: " + _max(intNumbers));
            System.out.println("Сумма: " + _sum(intNumbers));
            System.out.println("Произведение: " + _mult(intNumbers));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

