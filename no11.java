package Praktikum01;

import java.util.Scanner;

public class no11 {

    /*
Buatlah program Java untuk menampilkan bilangan bulat diantara dua 
bilangan bulat m dan n secara ascending (tidak termasuk bilangan m dan n, 
nilai m tidak harus lebih kecil dari n). Input program adalah bilangan bulat m 
dan n. outputnya adalah barisan bilangan yang dipisahkan menggunakan 
<,><spasi>. Contoh IO sebagai berikut:
17
2
3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("m : ");
        int m = input.nextInt();
        System.out.print("n : ");
        int n = input.nextInt();

        int start = m;
        int finish = n;
        if (n < m) {
            start = n;
            finish = m;
        }

        for (int i = start + 1; i < finish; i++) {
            if (i < finish - 1) {
                System.out.print(i + ", ");
            } else {
                System.out.print(i);
            }
        }
        System.out.println("");
    }
}
