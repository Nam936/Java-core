package Array;

import java.util.Scanner;

public class Cau1 {

    public static void ChuanHoaChuoi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        //xoa khoang trang
//        name = name.trim();
//        name = name.replaceAll("\\s+", " ");
        String temp[] = name.split(" ");
       String rs = " ";
        for (int i = 0; i < temp.length; i++){
             rs += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1).toLowerCase();
            if (i < temp.length - 1)
                rs += " ";
        }
        System.out.println(rs);
    }
    public static void main(String[] args) {
        ChuanHoaChuoi();
    }
}
