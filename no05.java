package Praktikum01;

import java.util.Scanner;

/*
Buatlah program untuk menampilkan sejumlah n baris String “INFORMATIKA” 
dengan nilai variabel n diinput melalui console window
 */
public class no05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan n : ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("INFORMATIKA");
        }

    }
}
