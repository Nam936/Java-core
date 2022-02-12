package MyPackage;

import java.util.Scanner;

public class right_triangle {
    public static void main(String[] args){
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh a: ");
        a = scanner.nextInt();
        System.out.println("Nhập chiều dài cạnh b: ");
        b = scanner.nextInt();

        int c = (int) Math.sqrt((int) (Math.pow(a ,2) + Math.pow(b, 2)));
        System.out.println("Cạnh huyền của tam giác vuông là: " + c + " cm" );
    }
}
