package Praktikum01;

import java.util.Scanner;

/*
Buatlah program untuk menentukan nilai MIN dan MAX jika inputnya terdiri dari 
5 variabel a, b, c, d, dan e yang diinput melalui console

 */
public class no07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Deklarasi array
    int[] data = new int[5];

    // Input nilai variabel
    System.out.println("Masukkan 5 nilai variabel:");
    for (int i = 0; i < data.length; i++) {
      System.out.print("nilai ke-" + (i + 1) + ": ");
      data[i] = scanner.nextInt();
    }

    // Mencari nilai MIN dan MAX
    int min = data[0];
    int max = data[0];
    for (int i = 1; i < data.length; i++) {
      if (data[i] < min) {
        min = data[i];
      } else if (data[i] > max) {
        max = data[i];
      }
    }

    // Menampilkan hasil
    System.out.println("Nilai MIN: " + min);
    System.out.println("Nilai MAX: " + max);

    scanner.close();

    }
}
