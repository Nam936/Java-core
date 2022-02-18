package ControlFlow;

import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {

        String chuoi;
        char kytu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            kytu = chuoi.charAt(chuoi.length() - i - 1);
            if (chuoi.charAt(i) == kytu) {
                System.out.println("Chuỗi này là chuỗi đảo nghịc.");
                break;
            } else {
                System.out.println("Chuỗi này không là chuỗi đảo nghịch.");
                break;
            }
        }
    }
}
