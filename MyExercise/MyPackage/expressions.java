package MyPackage;

import java.util.Scanner;

public class expressions {
    public static void main(String[] args){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhâp a: ");
        a = scanner.nextInt();
        System.out.println("nhâp b: ");
        b = scanner.nextInt();

            int resulsum = a + b;
        System.out.println("Tổng hai số: " + resulsum);
        System.out.println("-----------------------------------");
            int resultSub = a - b;
        System.out.println("Hiệu hai số: " + resultSub);
        System.out.println("-----------------------------------");
            int resultMultip = a * b;
        System.out.println("Tích hai số: " + resultMultip);
        System.out.println("-----------------------------------");
            int resultDivi = a / b;
        System.out.println("Thương hai số: " + resultDivi);
        System.out.println("-----------------------------------");
            int resultexpon = (int) Math.pow(a,b);
        System.out.println("Lũy thừa hai số: " + resultexpon);


    }
}
