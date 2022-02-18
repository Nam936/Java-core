package ControlFlow;

import java.util.Scanner;

public class Cau1 {

    public static void main(String[] args) {
        String str = "hello every one";

        char kytu = (char) str.charAt(1);
        System.out.print("Ky tu can dem so lan xuat hien: " + kytu + "\n");
        int count = 0;
        int vi = 0;
        for (int i = 0; i < str.length(); i++ ) {
            if (kytu == str.charAt(i)) {
                str.indexOf(i);
                count++;
            }
//            for (int j = 0; j < i; j++ ) {
//                if (kytu == str.charAt(i)) {
//                    int vitri = (int) str.indexOf(i);
//                    vi++;
//                }
//
//            }
        }
        System.out.println("So lan xuat hien " + kytu + ": " + count + " lần");
        System.out.println("Tại vị trí: " + vi + "\n");
    }
}
