package assignment3;

import java.util.Random;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1; // Tạo số ngẫu nhiên trong khoảng [1-100]
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap 'yes' de tiep tuc hoac bat ky phim nao khac de dung: ");
            String check = sc.nextLine();

            if (check.equalsIgnoreCase("yes")) {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
                //break;
            } else {
                if (n % 2 == 0) {
                    System.out.println(n + " la so chan");
                } else {
                    System.out.println(n + " la so le");
                }
                break;
            }
        }
    }
}
