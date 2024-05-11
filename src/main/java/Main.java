
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static int _mult(int[] numbers) {
        int mult = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            mult *= numbers[i];
        }
        return mult;
    }

    public static int _min(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }

    public static int _sum(int[] numbers) {
        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    public static int _max(int[] numbers) {
        return Arrays.stream(numbers).max().getAsInt();
    }




    public static void main(String[] args) {
        String fileName = "numbers.txt";
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader BR = new BufferedReader(reader);
            String line = BR.readLine();
            String[] numbersStr = line.split(" ");
            int[] numbers = new int[numbersStr.length];
            for (int i = 0; i < numbersStr.length; i++) {
                try {
                    numbers[i] = Integer.parseInt(numbersStr[i]);
                } catch (NumberFormatException err) {
                    System.out.println("Error" + err.getMessage());
                    System.exit(0);
                }
            }
            System.out.println(_min(numbers));
            System.out.println(_max(numbers));
            System.out.println(_sum(numbers));
            System.out.println(_mult(numbers));
        } catch (IOException err) {
            System.out.println("Error " + err.getMessage());
            System.exit(0);
        }
    }
}