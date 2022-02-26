import java.util.Random;
import java.util.Scanner;

public class Cau3 {
    public  static void check() {
        Random random = new Random();
        int number = random.nextInt(100);
        System.out.println("Số ngẫu nhiên: " + number);

        if (number >= 2){
            int squareRoot = (int) Math.sqrt(number);
            for (int i = 2; i <= squareRoot; i++) {
                if (number % i == 0) {
                    System.out.println("");
                }
            }
            System.out.println(number + " là số nguyên tố");
        }
        else {
            System.out.println(number + "không phải là số nguyên tố");
        }

    }
    public static void main(String[] args) {
        Cau3.check();
    }
}
