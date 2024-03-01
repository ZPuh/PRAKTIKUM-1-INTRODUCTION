package Praktikum01;

import java.util.Scanner;

public class no12 {

    /*
Buatlah program Java untuk menampilkan penjumlahan bilangan bulat 
diantara dua bilangan bulat m dan n secara ascending (tidak termasuk 
bilangan m dan n, nilai m tidak harus lebih kecil dari n). Input program adalah 
bilangan bulat m dan n. outputnya adalah barisan bilangan yang dipisahkan 
menggunakan simbol “+” kemudian sebelum hasil penjumlahan ditampilkan 
terlebih dahulu dituliskan symbol “=” baru kemudian hasil penjumlahannya.
Contoh Input Output sebagai berikut:
7
2
3 + 4 + 5 + 6 = 18
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("m : ");
        int m = input.nextInt();
        System.out.print("n : ");
        int n = input.nextInt();

        int start = m;
        int finish = n;
        int sum = 0;
        if (n < m) {
            start = n;
            finish = m;
        }


        for (int i = start + 1; i < finish; i++) {
            sum += i;
            if (i < finish - 1) {
                System.out.print(i + " + ");
            } else {
                System.out.println(i + " = " + sum);

            }
        }
    }

}
