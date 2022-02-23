package Array;

import java.util.Scanner;

public class Cau2 {
    public static void Array() {
        int n;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);


        int array[] = new int[n];
        System.out.println("Nhập các phần tử mảng: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t ");
        }
        System.out.println("");
        System.out.print("Mảng sau khi tăng các phần tử lên 1 đơn vị: ");
        for (int i = 0; i < array.length; i ++){
            if (array[i] % 2 == 0){
                array[i] ++;
            }
            System.out.print(array[i] + "\t");
        }

    }

    public static void main(String[] args) {
        Array();
    }
}
