import java.util.Scanner;

public class Cau5 {
    public static void Matrix1() {
        int col, row;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        row = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        col = scanner.nextInt();

        int[][] A = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                A[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Mảng vừa nhập: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }

//        int temp = 0;
        System.out.print("Các phần tử nằm trên đường chéo chính của mảng: ");
        for (int i = 0; i < row ; i++) {
            System.out.print(+A[i][i]+"\t");
        }
    }
//public static void Matrix2(){
//    int col2, row2;
//
//    Scanner scanner = new Scanner(System.in);
//
//    System.out.println("Nhập vào số dòng của mảng: ");
//    row2 = scanner.nextInt();
//    System.out.println("Nhập vào số cột của mảng: ");
//    col2 = scanner.nextInt();
//
//    int[][] A = new int[row2][col2];
//    for (int i = 0; i < row2; i++) {
//        for (int j = 0; j < col2; j++) {
//            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
//            A[i][j] = scanner.nextInt();
//        }
//    }
//    System.out.println("Mảng vừa nhập: ");
//    for (int i = 0; i < row2; i++) {
//        for (int j = 0; j < col2; j++) {
//            System.out.print(A[i][j] + "\t");
//        }
//        System.out.println("\n");
//    }
//
//}
//public static void SumMatrix( ){
//
//    for(int i=0;i<;i++)
//    {
//        for(int j=0;j<col2;j++)
//        {
//            s[i][j]=row1[i][j]+row2[i][j];
//        }
//    }
//
//}
    public static void main (String[]args){

        Matrix1();
//        Matrix2();

    }


}