package BaiVeNha;

import java.util.Locale;
import java.util.Scanner;

public class BMICalcu {
    public static void main(String[] args){
        double weight;
        double height;
        double BMI;
        Locale vn = new Locale("vi", "vn");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn: ");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao của bạn: ");
        height = scanner.nextDouble();

        BMI = Math.ceil (weight / (height*height));
        System.out.println("Chỉ số BMI của bạn là: " + BMI);

    }
}
