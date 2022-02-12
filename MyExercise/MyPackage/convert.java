package MyPackage;

import java.util.Objects;
import java.util.Scanner;

public class convert {
    public static void main(String[] args ){

        String a= String.valueOf(new char[]{'c'});
        String string = new String();
        double c;
        double f;
        System.out.println("Chọn c để chuyển từ độ c sang độ f");
        System.out.println("Chọn f để chuyển từ độ f sang độ c");
        System.out.println("-----------------------------------");
        System.out.println("Xin mời chọn kiểu chuyển đổi: ");
        Scanner scanner = new Scanner(System.in);

        a = scanner.next();
       if (Objects.equals(a, "c")){
//           Scanner scanner = new Scanner(System.in);
           System.out.println("Nhập độ c: ");
           c = scanner.nextDouble();
            f = (double) ( 9 / 5 ) * c + 32;
           System.out.println(c + " độ c = " + f + " độ f");
       }
        if (Objects.equals(a, "f")){
            System.out.println("Nhập độ f: ");
            f = scanner.nextDouble();
             c = (double) (5 / 9) * (f - 32);
            System.out.println(f + " độ f = " + c + " độ c");
        }

    }
}
