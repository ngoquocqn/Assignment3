package assignment3;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu trong mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Nhap phan tu thu " +(i+1) +": ");
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
        
        double TBC = (double)sum / n;
        
        System.out.println("Tong cac phan tu: " + sum);
        System.out.println("Trung binh cong cac phan tu: " + TBC);
        
    }
}
