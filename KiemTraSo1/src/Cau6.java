import java.util.Scanner;
import java.util.regex.Matcher;
public class Cau6 {

    public static void email(){
    boolean temp;
    Scanner sc = new Scanner(System.in);

    do {
        String email = "\\w+@\\w+[.]\\w+";
        System.out.print("Nhập lại email của bạn(email@address.com): ");
        String input = sc.next();
        temp = input.matches(email);
        if (!temp) System.out.println("email không hợp lệ!");
    } while (!temp);
    System.out.println("email hợp lệ");
}

    public static void phonenumber(){
        boolean temp;
        Scanner sc = new Scanner(System.in);
        do {
            String phone = "(\\d{2})?\\d{2}\\d{7}";
            System.out.print("Nhập lại số điện thoại của bạn(xxx-xx-xxxxxxx): ");
            String input = sc.next();
            temp = input.matches(phone);
            if (!temp) System.out.println("số điện thoại không hợp lệ!");
        } while (!temp);
        System.out.println("số điện thoại hợp lệ");
    }

    public static void main(String[] args) {
        email();
        phonenumber();

    }
}
