import java.util.Scanner;

public class Cau1 {
    public static void hinhvuong(){

        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước hình vuông: ");
        a = scanner.nextInt();
        System.out.println("Hình vuông có kích thước: " + a+"x"+a);
        for(int i = 1 ; i <= a; i++){
            for (int j = 1; j <= a; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
    public static void tamgiavuong(){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kích thước tam giác vuông: ");
        a = scanner.nextInt();

        for(int i = 1 ; i <= a; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Cau1.hinhvuong();
        Cau1.tamgiavuong();
}
}
